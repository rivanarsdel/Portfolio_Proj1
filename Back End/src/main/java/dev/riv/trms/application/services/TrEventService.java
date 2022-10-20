package dev.riv.trms.application.services;

import dev.riv.trms.application.repositories.TrEventRepo;
import dev.riv.trms.models_dtos.TrEvent;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrEventService {

    private final TrEventRepo treRep;

    public TrEventService(TrEventRepo treRep) { this.treRep = treRep; }

    //<><><><><>-----| CRUD |-----<><><><><>\\

    public TrEvent save(TrEvent trForm) { return this.treRep.save(trForm); }
    public List<TrEvent> saveAll(List<TrEvent> trForms) { return this.treRep.saveAll(trForms); }

    public Optional<TrEvent> findById(int treId) { return this.treRep.findById(treId); }
    public List<TrEvent> findAll() { return this.treRep.findAll(); }

    public void deleteById(int treId) { this.treRep.deleteById(treId);}
}
