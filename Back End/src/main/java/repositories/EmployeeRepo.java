package repositories;

import models.Employee;

import java.util.List;

public interface EmployeeRepo {

    Employee addEmployee(Employee empObj);
    Employee getEmployee(Employee empObj);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee empObj);
    Employee deleteEmployee(Employee empObj);

}
