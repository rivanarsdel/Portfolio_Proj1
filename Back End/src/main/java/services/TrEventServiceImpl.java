package services;

import models.TrEvent;
import repositories.TrEventRepoImpl;

import java.util.List;

public class TrEventServiceImpl implements TrEventService {

    private final TrEventRepoImpl treRep;

    public TrEventServiceImpl(TrEventRepoImpl treRep) {this.treRep = treRep;}

    @Override
    public TrEvent addTrEvent(TrEvent treObj) {
        return treRep.addTrEvent(treObj);
    }

    @Override
    public TrEvent getTrEvent(TrEvent treObj) {
        return treRep.getTrEvent(treObj);
    }

    @Override
    public List<TrEvent> getAllTrEvents() {return treRep.getAllTrEvents();}

    @Override
    public TrEvent updateTrEvent(TrEvent treObj) {
        return treRep.updateTrEvent(treObj);
    }

    @Override
    public TrEvent deleteTrEvent(TrEvent treObj) {
        return treRep.deleteTrEvent(treObj);
    }
}
