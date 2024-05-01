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
 *test again
 * @author zalit
 */
public class Admin extends Person {

    private String role;
    private String department;

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

    @Override
    public String toString() {
        return "User ID: " + this.getUserID() + "\nFirst name: " + this.getFirstName() + "\nLast name: " + this.getLastName()
                + "\nEmail: " + this.getEmail() + "\nRole: " + this.getRole() + "\nDepartment: " + this.getDepartment();
    }

    public String toStringToFile() {
        return this.getUserID() + "," + this.getPassword() + "," + this.getFirstName() + "," + this.getLastName()
                + "," + this.getEmail() + "," + this.getRole() + "," + this.getDepartment();

    }

    public void displayAdmins() {
        String path = "./nbproject/files/admins.txt";
        ReadFile rf = new ReadFile();
        ArrayList<Admin> list = rf.readAdminFile(path);
        for (Admin admin : list) {
            System.out.println(admin.toStringToFile());
        }
    }

    public void writeToFile(Admin admin) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("./nbproject/files/admins.txt", true));
            bw.append(admin.toStringToFile());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem writing to the file.");
        }
    }
}
