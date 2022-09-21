package repositories;

import models.Employee;

import java.util.List;

public interface EmployeeRepo {

    Employee addEmployee(Employee accObj);
    Employee getEmployee(Employee accObj);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee accObj);
    Employee deleteEmployee(Employee accObj);

}
