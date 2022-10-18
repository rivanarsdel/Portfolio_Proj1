package services;

import models.Employee;
import repositories.EmployeeRepoImpl;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepoImpl empRep;

    public EmployeeServiceImpl(EmployeeRepoImpl empRep) {this.empRep = empRep;}

    @Override
    public Employee addEmployee(Employee empObj) {
        return empRep.addEmployee(empObj);
    }

    @Override
    public Employee getEmployee(Employee empObj) {
        return empRep.getEmployee(empObj);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRep.getAllEmployees();
    }

    @Override
    public Employee updateEmployee(Employee empObj) {
        return empRep.updateEmployee(empObj);
    }

    @Override
    public Employee deleteEmployee(Employee empObj) {
        return empRep.deleteEmployee(empObj);
    }
}
