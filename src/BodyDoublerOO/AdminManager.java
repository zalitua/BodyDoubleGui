/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zalit
 */
public class AdminManager extends TableManager {

    public Admin admin;

    public AdminManager() {
        admin = new Admin("", "", "", "", "", "", "");
    }

    @Override
    public void addEntry() {

        String entry = "INSERT INTO ADMIN VALUES ('" + admin.getUserID() + "' ,'"
                + admin.getPassword() + "' ,'" + admin.getFirstName() + "' ,'"
                + admin.getLastName() + "' ,'" + admin.getEmail() + "' ,'"
                + admin.getRole() + "' ,'" + admin.getDepartment() + "')";
        updateDB(entry);
        System.out.println("Entry made!");
    }

    public List<Admin> readAll() {

        List<Admin> admins = new ArrayList<>();
        ResultSet rs = queryDB("SELECT * FROM ADMIN");
        try {
            while (rs.next()) {
                String adminID = rs.getString("ADMINID");
                String password = rs.getString("PASSWORD");
                String firstName = rs.getString("FIRSTNAME");
                String lastName = rs.getString("LASTNAME");
                String email = rs.getString("EMAIL");
                String role = rs.getString("ROLE");
                String department = rs.getString("DEPARTMENT");
                Admin admin1 = new Admin(adminID, password, firstName, lastName, email, role, department);
                admins.add(admin1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admins;
    }

    public void displayAll() {
        List<Admin> admins = readAll();
        for (Admin admin : admins) {
            System.out.println(admin.toString());
        }
    }
    
    @Override
    public String generateNextID(){
        Sequencer seq = new Sequencer();
        String num = seq.generateNextNumber("ADMIN", "ADMINID");
        return "ADM" + num;
    }
}


