package dev.riv.trms.application.services;

import dev.riv.trms.application.repositories.EmpMessageRepo;
import dev.riv.trms.models_dtos.EmpMessage;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpMessageService {

    private final EmpMessageRepo mesRep;

    public EmpMessageService(EmpMessageRepo mesRep) { this.mesRep = mesRep; }

    //<><><><><>-----| CRUD |-----<><><><><>\\

    public EmpMessage save(EmpMessage trForm) { return this.mesRep.save(trForm); }
    public List<EmpMessage> saveAll(List<EmpMessage> trForms) { return this.mesRep.saveAll(trForms); }

    public Optional<EmpMessage> findById(int trfId) { return this.mesRep.findById(trfId); }
    public List<EmpMessage> findAll() { return this.mesRep.findAll(); }

    public void deleteById(int trfId) { this.mesRep.deleteById(trfId);}
}
