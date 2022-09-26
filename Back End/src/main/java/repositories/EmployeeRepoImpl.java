package repositories;

import models.Employee;
import utilities.JDBCConnection;
import utilities.HelperMethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl extends HelperMethods implements EmployeeRepo {

    public static Connection locConn = JDBCConnection.getConnection();

    @Override
    public Employee addEmployee(Employee empObj) {
        //todo finish implementation

        String sqlQuery = "INSERT INTO Employees VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?);";
        int counter = 1; // Tracks parameter index, mark '?'

        try{
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);

            ps.setString(counter, empObj.getFirstName()); counter++;
            ps.setString(counter, empObj.getLastName()); counter++;
            ps.setString(counter, empObj.getEmail()); counter++;
            ps.setString(counter, empObj.getPassword()); counter++;
            ps.setString(counter, empObj.getDepartment()); counter++;
            ps.setString(counter, empObj.getDeptRole()); counter++;
            ps.setDouble(counter, empObj.getTrBalance());

            ResultSet resSet = ps.executeQuery();

            if(resSet.next()) {
                return buildEmployee(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Employee getEmployee(Employee empObj) {

        String sqlQuery = "SELECT * FROM Employees WHERE email = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, empObj.getEmail());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildEmployee(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }


    @Override
    public List<Employee> getAllEmployees() {

        String sqlQuery = "SELECT * FROM Employees;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ResultSet resSet = ps.executeQuery();
            List<Employee> locList = new ArrayList<>();
            while(resSet.next()) {
                locList.add(buildEmployee(resSet));
            }
            return locList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee updateEmployee(Employee empObj) {

        String sqlQuery =
                "UPDATE Employees SET " +
                        "empId = ?, " +
                        "firstName = ?, " +
                        "lastName = ?, " +
                        "email = ?, " +
                        "password = ?, " +
                        "department = ?, " +
                        "deptRole = ?, " +
                        "trBalance = ?, " +
                        "WHERE email = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setInt(1, empObj.getEmpID());
            ps.setString(2, empObj.getFirstName());
            ps.setString(3, empObj.getLastName());
            ps.setString(4, empObj.getEmail());
            ps.setString(5, empObj.getPassword());
            ps.setString(6, empObj.getDepartment());
            ps.setString(7, empObj.getDeptRole());
            ps.setDouble(8, empObj.getTrBalance());

            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildEmployee(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Employee deleteEmployee(Employee empObj) {

        String sqlQuery = "DELETE * FROM Employees WHERE empEmail = ?;";

        try {
            PreparedStatement ps = locConn.prepareStatement(sqlQuery);
            ps.setString(1, empObj.getEmail());
            ResultSet resSet = ps.executeQuery();
            if(resSet.next()) {
                return buildEmployee(resSet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
