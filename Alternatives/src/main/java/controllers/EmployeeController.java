package controllers;

import models.Employee;
import services.EmployeeService;
import com.google.gson.Gson;
import io.javalin.http.Handler;

import java.util.List;

public class EmployeeController {

    EmployeeService empSer;
    Gson gson = new Gson();
    public EmployeeController(EmployeeService empSer) { this.empSer = empSer; }

    public Handler addEmployee = ctx -> {
        Employee empObj = gson.fromJson(ctx.body(), Employee.class);
        empSer.addEmployee(empObj);
        empObj = empSer.getEmployee(empObj);
        ctx.result((empObj != null) ? gson.toJson(empObj) : "{}");
        if(empObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler getEmployee = ctx -> {

        if(!ctx.body().equals("{}")) {
            // Single Getter, if ctx.body() exists
            Employee empObj = gson.fromJson(ctx.body(), Employee.class);
            empObj = empSer.getEmployee(empObj);
            ctx.result((empObj != null) ? gson.toJson(empObj) : "{}");
            if (empObj != null) ctx.status(200); else ctx.status(404);

        } else {
            // Get All, if ctx.body() does not exist
            List<Employee> locList = empSer.getAllEmployees();
            ctx.result((locList != null) ? gson.toJson(locList) : "{}");
            if(locList != null) {ctx.status(200); } else { ctx.status(404); }
        }
    };

    public Handler updateEmployee = ctx -> {
        Employee empObj = gson.fromJson(ctx.body(), Employee.class);
        empObj = empSer.updateEmployee(empObj);
        ctx.result((empObj != null) ? gson.toJson(empObj) : "{}");
        if(empObj != null) {ctx.status(201); } else { ctx.status(404); }
    };

    public Handler deleteEmployee = ctx -> {
        Employee empObj = gson.fromJson(ctx.body(), Employee.class);
        empObj = empSer.deleteEmployee(empObj);
        ctx.result((empObj != null) ? gson.toJson(empObj) : "{}");
        if(empObj != null) {ctx.status(204); } else { ctx.status(404); }
    };


    //<><><><><>--------------------------<><><><><>
    //<><><><><>-----Helper Functions-----<><><><><>
    //<><><><><>--------------------------<><><><><>

    public Handler crudById = ctx -> {

    };
}
