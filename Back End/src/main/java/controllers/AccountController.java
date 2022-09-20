package controllers;

import services.AccountService;
import com.google.gson.Gson;
import models.Account;
import io.javalin.http.Handler;

import java.util.List;

public class AccountController {

    AccountService accSer;
    Gson gson = new Gson();
    public AccountController(AccountService accSer) { this.accSer = accSer; }

    public Handler addAccount = ctx -> {
        Account accObj = gson.fromJson(ctx.body(), Account.class);
        accObj = accSer.addAccount(accObj);
        ctx.result((accObj != null) ? gson.toJson(accObj) : "{}");
        if(accObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler getAccount = ctx -> {

        if(!ctx.body().equals("{}")) {
            //<><><><><>-----Single Getter, if ctx.body() exists-----<><><><><>
            Account accObj = gson.fromJson(ctx.body(), Account.class);
            accObj = accSer.getAccount(accObj);
            ctx.result((accObj != null) ? gson.toJson(accObj) : "{}");
            if (accObj != null) ctx.status(200); else ctx.status(404);

        } else {
            //<><><><><>-----Get All, if ctx.body() does not exist-----<><><><><>
            List<Account> locList = accSer.getAllAccounts();
            ctx.result((locList != null) ? gson.toJson(locList) : "{}");
            if(locList != null) {ctx.status(200); } else { ctx.status(404); }
        }
    };

    public Handler updateAccount = ctx -> {
        Account accObj = gson.fromJson(ctx.body(), Account.class);
        accObj = accSer.updateAccount(accObj);
        ctx.result((accObj != null) ? gson.toJson(accObj) : "{}");
        if(accObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler deleteAccount = ctx -> {
        Account accObj = gson.fromJson(ctx.body(), Account.class);
        accObj = accSer.deleteAccount(accObj);
        ctx.result((accObj != null) ? gson.toJson(accObj) : "{}");
        if(accObj != null) {ctx.status(204); } else { ctx.status(404); }
    };


    //<><><><><>--------------------------<><><><><>
    //<><><><><>-----Helper Functions-----<><><><><>
    //<><><><><>--------------------------<><><><><>

    public Handler crudById = ctx -> {

    };
}
