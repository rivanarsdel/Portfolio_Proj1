package dev.riv.trms.application.services;

import dev.riv.trms.application.repositories.EmployeeRepo;
import dev.riv.trms.models_dtos.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepo EmpRep;

    public EmployeeService(EmployeeRepo EmpRep) { this.EmpRep = EmpRep; }

    //<><><><><>-----| CRUD |-----<><><><><>\\

    public Employee save(Employee trForm) { return this.EmpRep.save(trForm); }
    public List<Employee> saveAll(List<Employee> trForms) { return this.EmpRep.saveAll(trForms); }

    public Optional<Employee> findById(int EmpId) { return this.EmpRep.findById(EmpId); }
    public List<Employee> findAll() { return this.EmpRep.findAll(); }

    public void deleteById(int EmpId) { this.EmpRep.deleteById(EmpId);}
}
