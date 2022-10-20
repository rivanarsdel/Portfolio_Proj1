package dev.riv.trms.application.controllers;

import dev.riv.trms.application.services.EmpMessageService;
import dev.riv.trms.models_dtos.EmpMessage;
import dev.riv.trms.models_dtos.EmpMessageDTO;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empMessages")
@CrossOrigin(value = "http://localhost:5000", allowCredentials = "*", allowedHeaders = "*")
public class EmpMessageController {

    private final EmpMessageService mesSer;
    private ModelMapper modMap;

    public EmpMessageController(EmpMessageService mesSer) { this.mesSer = mesSer; }

    //<><><><><>-----| CRUD |-----<><><><><>\\
    @GetMapping
    public ResponseEntity<List<EmpMessage>> getAllEmpMessages() {
        return ResponseEntity.ok(mesSer.findAll());
    }

    @GetMapping("/{mesId}")
    public ResponseEntity<EmpMessage> getEmpMessageById(@PathVariable("mesId") int mesId) {
        Optional<EmpMessage> mesObj = mesSer.findById(mesId);
        return mesObj.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{mesId}")
    public ResponseEntity<EmpMessage> upsertEmpMessage(@RequestBody EmpMessageDTO empDto) {
        EmpMessage mesObj = modMap.map(empDto, EmpMessage.class);
        return ResponseEntity.ok(mesSer.save(mesObj));
    }

    @DeleteMapping("/{mesId}")
    public ResponseEntity<EmpMessage> deleteEmpMessage(@PathVariable("mesId") int mesId) {
        Optional<EmpMessage> optional = mesSer.findById(mesId);
        if (!optional.isPresent()) { return ResponseEntity.notFound().build(); }
        mesSer.deleteById(mesId);
        return ResponseEntity.ok(optional.get());
    }

    //<><><><><>-----| Other |-----<><><><><>\\
}
