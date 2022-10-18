package services;

import models.TrEvent;

import java.util.List;

public interface TrEventService {

    TrEvent addTrEvent(TrEvent treObj);
    TrEvent getTrEvent(TrEvent treObj);
    List<TrEvent> getAllTrEvents();
    TrEvent updateTrEvent(TrEvent treObj);
    TrEvent deleteTrEvent(TrEvent treObj);

}
