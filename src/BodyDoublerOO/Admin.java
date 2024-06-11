/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *test again again
 * @author zalit
 */
public class Admin extends Person {

    private String role;
    private String department;
    
//    public Admin(){
//    }

    public Admin(String userID, String password, String firstName, String lastName,
            String email, String role, String department) {
        super(userID, password, firstName, lastName, email);
        this.role = role;
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
