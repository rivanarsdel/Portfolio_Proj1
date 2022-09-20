package mainApp;

import controllers.AccountController;
import io.javalin.Javalin;
import repositories.AccountRepoImpl;
import services.AccountServiceImpl;

public class main {

    public static void main(String[] args) {

        Javalin javApp = Javalin.create();

        establishRoutes(javApp);

        javApp.start();

    }

    public static void establishRoutes(Javalin javApp) {

        javApp.get("/test", ctx -> ctx.result("Test page \n Javalin is working."));

        setControllerRoutes(javApp);
    }

    public static void setControllerRoutes(Javalin javApp) {

        //<><><><><>-----Account Routes-----<><><><><>
        AccountRepoImpl accRep = new AccountRepoImpl();
        AccountServiceImpl accSer = new AccountServiceImpl(accRep);
        AccountController accCon = new AccountController(accSer);
        String accRoute = "/Accounts";

        javApp.post(accRoute, accCon.addAccount);
        javApp.get(accRoute, accCon.getAccount);
        javApp.put(accRoute, accCon.updateAccount);
        javApp.delete(accRoute, accCon.deleteAccount);

    }
}
