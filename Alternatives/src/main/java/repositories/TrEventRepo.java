package repositories;

import models.TrEvent;

import java.util.List;

public interface TrEventRepo {

    TrEvent addTrEvent(TrEvent trfObj);
    TrEvent getTrEvent(TrEvent trfObj);
    List<TrEvent> getAllTrEvents();
    TrEvent updateTrEvent(TrEvent trfObj);
    TrEvent deleteTrEvent(TrEvent trfObj);

}
