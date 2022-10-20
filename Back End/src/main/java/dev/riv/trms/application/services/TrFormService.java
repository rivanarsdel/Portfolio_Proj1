package dev.riv.trms.application.services;

import dev.riv.trms.application.repositories.TrFormRepo;
import dev.riv.trms.models_dtos.TrForm;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrFormService {

    private final TrFormRepo trfRep;

    public TrFormService(TrFormRepo trfRep) { this.trfRep = trfRep; }

    //<><><><><>-----| CRUD |-----<><><><><>\\

    public TrForm save(TrForm trForm) { return this.trfRep.save(trForm); }
    public List<TrForm> saveAll(List<TrForm> trForms) { return this.trfRep.saveAll(trForms); }

    public Optional<TrForm> findById(int trfId) { return this.trfRep.findById(trfId); }
    public List<TrForm> findAll() { return this.trfRep.findAll(); }

    public void deleteById(int trfId) { this.trfRep.deleteById(trfId);}


}
