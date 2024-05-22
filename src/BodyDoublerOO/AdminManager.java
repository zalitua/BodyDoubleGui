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
public class AdminManager {

    private final DBManager dbManager;
    private final Connection conn;
    private Statement statement;
    public Admin admin;

    public AdminManager() {
        admin = new Admin("", "", "", "", "", "", "");
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addEntry() {

        String entry = "INSERT INTO ADMIN VALUES ('" + admin.getUserID() + "' ,'"
                + admin.getPassword() + "' ,'" + admin.getFirstName() + "' ,'"
                + admin.getLastName() + "' ,'" + admin.getEmail() + "' ,'"
                + admin.getRole() + "' ,'" + admin.getDepartment() + "')";
//        String entry = "INSERT INTO ADMIN VALUES ('" + admin.userID + "' ,'" 
//                + admin.password + "' ,'" + admin.firstName + "' ,'" 
//                + admin.lastName + "' ,'" + admin.email + "' ,'" 
//                + admin.getRole() + "' ,'" + admin.getDepartment() + "')";
        this.dbManager.updateDB(entry);
        System.out.println("Entry made!");
    }

    public List<Admin> readAll() {

        List<Admin> admins = new ArrayList<>();
        ResultSet rs = this.dbManager.queryDB("SELECT * FROM ADMIN");
        try {
            while (rs.next()) {
                String adminID = rs.getString("ADMINID");
                String password = rs.getString("PASSWORD");
                String firstName = rs.getString("FIRSTNAME");
                String lastName = rs.getString("LASTNAME");
                String email = rs.getString("EMAIL");
                String role = rs.getString("ROLE");
                String department = rs.getString("DEPARTMENT");
                Admin admin = new Admin(adminID, password, firstName, lastName, email, role, department);
                admins.add(admin);
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
    
    public String generateNextID(){
        String num = generateNextNumber();
        return "ADM" + num;
    }

    public String generateNextNumber() {
        int number = 000;
        String nextNumber = "";
        SortedSet<String> idSet = new TreeSet<>();
        ResultSet rs = this.dbManager.queryDB("SELECT ADMINID FROM ADMIN");

        try {
            while (rs.next()) {
                String entry = rs.getString("ADMINID");
                idSet.add(entry);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (idSet.isEmpty()) {
            nextNumber = "001";
        } else {
            number = Integer.parseInt(idSet.last().substring(3));
            number++;
            nextNumber = String.format("%03d", number);
        }
        return nextNumber;
    }

}
