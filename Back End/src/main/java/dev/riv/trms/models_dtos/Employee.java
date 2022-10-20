package dev.riv.trms.models_dtos;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employees")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "empId")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId", nullable = false)
    private int empID;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(unique = true, name = "userName")
    @NotNull
    private String userName;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "password")
    private String department;

    @Column(name = "deptRole")
    private String deptRole;

    @Column(name = "trBalance")
    private double trBalance;


    //<><><><><>---------------------<><><><><>
    //<><><><><>-----Constructor-----<><><><><>
    //<><><><><>---------------------<><><><><>

//    public Employee() {}
//
//    public Employee(int empID, String firstName, String lastName, String email, String password, String deptName, String deptRole, double trBalance) {
//        this.empID = empID;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.password = password;
//        this.department = deptName;
//        this.deptRole = deptRole;
//        this.trBalance = trBalance;
//    }


    //<><><><><>-----------------------------<><><><><>
    //<><><><><>-----Getters and Setters-----<><><><><>
    //<><><><><>-----------------------------<><><><><>


//    public int getEmpID() {return empID;}
//
//    public void setEmpID(int empID) {this.empID = empID;}
//
//    public String getFirstName() {return firstName;}
//
//    public void setFirstName(String firstName) {this.firstName = firstName;}
//
//    public String getLastName() {return lastName;}
//
//    public void setLastName(String lastName) {this.lastName = lastName;}
//
//    public String getEmail() {return email;}
//
//    public void setEmail(String email) {this.email = email;}
//
//    public String getPassword() {return password;}
//
//    public void setPassword(String password) {this.password = password;}
//
//    public String getDepartment() {return department;}
//
//    public void setDepartment(String department) {this.department = department;}
//
//    public String getDeptRole() {return deptRole;}
//
//    public void setDeptRole(String deptRole) {this.deptRole = deptRole;}
//
//    public double getTrBalance() {return trBalance;}
//
//    public void setTrBalance(double trBalance) {this.trBalance = trBalance;}
}
