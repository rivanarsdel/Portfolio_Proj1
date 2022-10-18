package controllers;

import models.TrForm;
import services.TrFormService;
import com.google.gson.Gson;
import io.javalin.http.Handler;

import java.util.List;

public class TrFormController {

    TrFormService trfSer;
    Gson gson = new Gson();
    public TrFormController(TrFormService trfSer) { this.trfSer = trfSer; }

    public Handler addTrForm = ctx -> {
        TrForm trfObj = gson.fromJson(ctx.body(), TrForm.class);
        trfSer.addTrForm(trfObj);
        trfObj = trfSer.getTrForm(trfObj);
        ctx.result((trfObj != null) ? gson.toJson(trfObj) : "{}");
        if(trfObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler getTrForm = ctx -> {

        if(!ctx.body().equals("{}")) {
            // Single Getter, if ctx.body() exists
            TrForm trfObj = gson.fromJson(ctx.body(), TrForm.class);
            trfObj = trfSer.getTrForm(trfObj);
            ctx.result((trfObj != null) ? gson.toJson(trfObj) : "{}");
            if (trfObj != null) ctx.status(200); else ctx.status(404);

        } else {
            // Get All, if ctx.body() does not exist
            List<TrForm> locList = trfSer.getAllTrForms();
            ctx.result((locList != null) ? gson.toJson(locList) : "{}");
            if(locList != null) {ctx.status(200); } else { ctx.status(404); }
        }
    };

    public Handler updateTrForm = ctx -> {
        TrForm trfObj = gson.fromJson(ctx.body(), TrForm.class);
        trfObj = trfSer.updateTrForm(trfObj);
        ctx.result((trfObj != null) ? gson.toJson(trfObj) : "{}");
        if(trfObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler deleteTrForm = ctx -> {
        TrForm trfObj = gson.fromJson(ctx.body(), TrForm.class);
        trfObj = trfSer.deleteTrForm(trfObj);
        ctx.result((trfObj != null) ? gson.toJson(trfObj) : "{}");
        if(trfObj != null) {ctx.status(204); } else { ctx.status(404); }
    };


    //<><><><><>--------------------------<><><><><>
    //<><><><><>-----Helper Functions-----<><><><><>
    //<><><><><>--------------------------<><><><><>

    public Handler crudById = ctx -> {

    };
}
