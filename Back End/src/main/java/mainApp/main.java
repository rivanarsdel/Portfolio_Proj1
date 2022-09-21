package mainApp;

import controllers.EmployeeController;
import io.javalin.Javalin;
import repositories.EmployeeRepoImpl;
import services.EmployeeServiceImpl;

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

        //<><><><><>-----Employee Routes-----<><><><><>
        EmployeeRepoImpl empRep = new EmployeeRepoImpl();
        EmployeeServiceImpl empSer = new EmployeeServiceImpl(empRep);
        EmployeeController empCon = new EmployeeController(empSer);
        String empRoute = "/Accounts";

        javApp.post(empRoute, empCon.addEmployee);
        javApp.get(empRoute, empCon.getEmployee);
        javApp.put(empRoute, empCon.updateEmployee);
        javApp.delete(empRoute, empCon.deleteEmployee);

    }
}
