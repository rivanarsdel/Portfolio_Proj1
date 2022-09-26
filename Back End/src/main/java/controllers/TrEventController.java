package controllers;

import models.TrEvent;
import services.TrEventService;
import com.google.gson.Gson;
import io.javalin.http.Handler;

import java.util.List;

public class TrEventController {

    TrEventService treSer;
    Gson gson = new Gson();
    public TrEventController(TrEventService treSer) { this.treSer = treSer; }

    public Handler addTrEvent = ctx -> {
        TrEvent treObj = gson.fromJson(ctx.body(), TrEvent.class);
        treSer.addTrEvent(treObj);
        treObj = treSer.getTrEvent(treObj);
        ctx.result((treObj != null) ? gson.toJson(treObj) : "{}");
        if(treObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler getTrEvent = ctx -> {

        if(!ctx.body().equals("{}")) {
            // Single Getter, if ctx.body() exists
            TrEvent treObj = gson.fromJson(ctx.body(), TrEvent.class);
            treObj = treSer.getTrEvent(treObj);
            ctx.result((treObj != null) ? gson.toJson(treObj) : "{}");
            if (treObj != null) ctx.status(200); else ctx.status(404);

        } else {
            // Get All, if ctx.body() does not exist
            List<TrEvent> locList = treSer.getAllTrEvents();
            ctx.result((locList != null) ? gson.toJson(locList) : "{}");
            if(locList != null) {ctx.status(200); } else { ctx.status(404); }
        }
    };

    public Handler updateTrEvent = ctx -> {
        TrEvent treObj = gson.fromJson(ctx.body(), TrEvent.class);
        treObj = treSer.updateTrEvent(treObj);
        ctx.result((treObj != null) ? gson.toJson(treObj) : "{}");
        if(treObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler deleteTrEvent = ctx -> {
        TrEvent treObj = gson.fromJson(ctx.body(), TrEvent.class);
        treObj = treSer.deleteTrEvent(treObj);
        ctx.result((treObj != null) ? gson.toJson(treObj) : "{}");
        if(treObj != null) {ctx.status(204); } else { ctx.status(404); }
    };


    //<><><><><>--------------------------<><><><><>
    //<><><><><>-----Helper Functions-----<><><><><>
    //<><><><><>--------------------------<><><><><>

    public Handler crudById = ctx -> {

    };
}
