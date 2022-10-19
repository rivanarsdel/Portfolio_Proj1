package com.revature.trms.models_dtos;

public class Employee {

    private int empID;
    private String firstName;
    private String lastName;
    private String email; //Unique, not null
    private String password;
    private String department;
    private String deptRole;
    private double trBalance;


    //<><><><><>---------------------<><><><><>
    //<><><><><>-----Constructor-----<><><><><>
    //<><><><><>---------------------<><><><><>

    public Employee() {}

    public Employee(int empID, String firstName, String lastName, String email, String password, String deptName, String deptRole, double trBalance) {
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.department = deptName;
        this.deptRole = deptRole;
        this.trBalance = trBalance;
    }


    //<><><><><>-----------------------------<><><><><>
    //<><><><><>-----Getters and Setters-----<><><><><>
    //<><><><><>-----------------------------<><><><><>


    public int getEmpID() {return empID;}

    public void setEmpID(int empID) {this.empID = empID;}

    public String getFirstName() {return firstName;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPassword() {return password;}

    public void setPassword(String password) {this.password = password;}

    public String getDepartment() {return department;}

    public void setDepartment(String department) {this.department = department;}

    public String getDeptRole() {return deptRole;}

    public void setDeptRole(String deptRole) {this.deptRole = deptRole;}

    public double getTrBalance() {return trBalance;}

    public void setTrBalance(double trBalance) {this.trBalance = trBalance;}
}
