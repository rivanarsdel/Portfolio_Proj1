package dev.riv.trms.application.controllers;

import dev.riv.trms.application.services.EmployeeService;
import dev.riv.trms.models_dtos.Employee;
import dev.riv.trms.models_dtos.EmployeeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
@CrossOrigin(value = "http://localhost:5000", allowCredentials = "*", allowedHeaders = "*")
public class EmployeeController {

    private final EmployeeService empSer;
    private ModelMapper modMap;

    public EmployeeController(EmployeeService empSer) { this.empSer = empSer; }

    //<><><><><>-----| CRUD |-----<><><><><>\\
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return ResponseEntity.ok(empSer.findAll());
    }

    @GetMapping("/{empId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId") int empId) {
        Optional<Employee> empObj = empSer.findById(empId);
        return empObj.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{empId}")
    public ResponseEntity<Employee> upsertEmployee(@RequestBody EmployeeDTO empDto) {
        Employee empObj = modMap.map(empDto, Employee.class);
        return ResponseEntity.ok(empSer.save(empObj));
    }

    @DeleteMapping("/{empId}")
    public ResponseEntity<Employee> deleteEmployee(@PathVariable("empId") int empId) {
        Optional<Employee> optional = empSer.findById(empId);
        if (!optional.isPresent()) { return ResponseEntity.notFound().build(); }
        empSer.deleteById(empId);
        return ResponseEntity.ok(optional.get());
    }

    //<><><><><>-----| Other |-----<><><><><>\\
}
