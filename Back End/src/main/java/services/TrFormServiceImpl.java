package services;

import models.TrForm;
import repositories.TrFormRepoImpl;

import java.util.List;

public class TrFormServiceImpl implements TrFormService {

    private final TrFormRepoImpl trfRep;

    public TrFormServiceImpl(TrFormRepoImpl trfRep) {this.trfRep = trfRep;}

    @Override
    public TrForm addTrForm(TrForm trfObj) {
        return trfRep.addTrForm(trfObj);
    }

    @Override
    public TrForm getTrForm(TrForm trfObj) {
        return trfRep.getTrForm(trfObj);
    }

    @Override
    public List<TrForm> getAllTrForms() {
        return trfRep.getAllTrForms();
    }

    @Override
    public TrForm updateTrForm(TrForm trfObj) {
        return trfRep.updateTrForm(trfObj);
    }

    @Override
    public TrForm deleteTrForm(TrForm trfObj) {
        return trfRep.deleteTrForm(trfObj);
    }
}
