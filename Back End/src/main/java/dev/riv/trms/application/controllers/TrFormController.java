package dev.riv.trms.application.controllers;

import dev.riv.trms.application.services.TrFormService;
import dev.riv.trms.models_dtos.TrForm;
import dev.riv.trms.models_dtos.TrFormDTO;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trForms")
@CrossOrigin(value = "http://localhost:5000", allowCredentials = "*", allowedHeaders = "*")
public class TrFormController {

    private final TrFormService trfSer;
    private ModelMapper modMap;

    public TrFormController(TrFormService trfSer) { this.trfSer = trfSer; }

    //<><><><><>-----| CRUD |-----<><><><><>\\
    @GetMapping
    public ResponseEntity<List<TrForm>> getAllTrForms() {
        return ResponseEntity.ok(trfSer.findAll());
    }

    @GetMapping("/{trfId}")
    public ResponseEntity<TrForm> getTrFormById(@PathVariable("trfId") int trfId) {
        Optional<TrForm> trfObj = trfSer.findById(trfId);
        return trfObj.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{trfId}")
    public ResponseEntity<TrForm> uspertTrForm(@RequestBody TrFormDTO trfDto) {
        TrForm trfObj = modMap.map(trfDto, TrForm.class);
        return ResponseEntity.ok(trfSer.save(trfObj));
    }

    @DeleteMapping("/{trfId}")
    public ResponseEntity<TrForm> deleteTrForm(@PathVariable("trfId") int trfId) {
        Optional<TrForm> optional = trfSer.findById(trfId);
        if (!optional.isPresent()) { return ResponseEntity.notFound().build(); }
        trfSer.deleteById(trfId);
        return ResponseEntity.ok(optional.get());
    }

    //<><><><><>-----| Other |-----<><><><><>\\
}
