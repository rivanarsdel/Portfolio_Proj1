package dev.riv.trms.application.controllers;

import dev.riv.trms.application.services.TrEventService;
import dev.riv.trms.models_dtos.TrEvent;
import dev.riv.trms.models_dtos.TrEventDTO;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trEvents")
@CrossOrigin(value = "http://localhost:5000", allowCredentials = "*", allowedHeaders = "*")
public class TrEventController {

    private final TrEventService empSer;
    private ModelMapper modMap;

    public TrEventController(TrEventService empSer) { this.empSer = empSer; }

    //<><><><><>-----| CRUD |-----<><><><><>\\
    @GetMapping
    public ResponseEntity<List<TrEvent>> getAllTrEvents() {
        return ResponseEntity.ok(empSer.findAll());
    }

    @GetMapping("/{treId}")
    public ResponseEntity<TrEvent> getTrEventById(@PathVariable("treId") int treId) {
        Optional<TrEvent> treObj = empSer.findById(treId);
        return treObj.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{treId}")
    public ResponseEntity<TrEvent> upsertTrEvent(@RequestBody TrEventDTO empDto) {
        TrEvent treObj = modMap.map(empDto, TrEvent.class);
        return ResponseEntity.ok(empSer.save(treObj));
    }

    @DeleteMapping("/{treId}")
    public ResponseEntity<TrEvent> deleteTrEvent(@PathVariable("treId") int treId) {
        Optional<TrEvent> optional = empSer.findById(treId);
        if (!optional.isPresent()) { return ResponseEntity.notFound().build(); }
        empSer.deleteById(treId);
        return ResponseEntity.ok(optional.get());
    }

    //<><><><><>-----| Other |-----<><><><><>\\
}
