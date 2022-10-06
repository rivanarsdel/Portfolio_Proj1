package utilitiesh2;

import com.google.gson.Gson;
import io.javalin.http.Handler;
import models.Employee;

import java.util.List;
public class DatabaseController {
    DatabaseInitializer datIni;

    public DatabaseController(DatabaseInitializer datIni) {
        this.datIni = datIni;
    }

    public Handler initiateDatabase = ctx -> {
        datIni.initiateDatabase();
    };
}
