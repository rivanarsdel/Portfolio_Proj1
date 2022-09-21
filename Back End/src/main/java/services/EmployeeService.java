package services;

import models.Employee;

import java.util.List;

public interface EmployeeService {

    Employee addEmployee(Employee empObj);
    Employee getEmployee(Employee empObj);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Employee empObj);
    Employee deleteEmployee(Employee empObj);

}
