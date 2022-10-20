package dev.riv.trms.models_dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class EmployeeDTO {

    private int empID;
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String password;
    private String department;
    private String deptRole;
    private double trBalance;
}