/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zalit
 */
public class PasswordManager extends TableManager {

    public PasswordManager() {
    }
    
    
    
    public static void main(String[] args) {
        PasswordManager pm = new PasswordManager();
        pm.passwordList();
    }

    public HashMap<String, String> passwordList() {

        HashMap<String, String> passwords = new HashMap<>();
        String query = "SELECT MEMBERID AS ID, PASSWORD FROM MEMBER "
                + "UNION SELECT ADMINID AS ID, PASSWORD FROM ADMIN";
        ResultSet rs = queryDB(query);
        try {
            while (rs.next()) {
                String userID = rs.getString("ID");
                String password = rs.getString("PASSWORD");
                passwords.put(userID, password);
                System.out.println("ID: " + userID + ", Password: " + password);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close resources
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("List retrieved");
        return passwords;
    }

    public boolean validatePassword(String userID, String password) {
        
        HashMap<String, String> passwords = passwordList();
        userID = userID.toUpperCase();
        String pwd = passwords.get(userID);
        if(password.equalsIgnoreCase(pwd)){
            System.out.println("match");
        }
        else{
            System.out.println("false");
        }
        return password.equalsIgnoreCase(pwd);
    }
    
    public void printPasswordList(){
        HashMap<String, String> passwords = passwordList();
        for (String userID : passwords.keySet()) {
            System.out.println("ID: " + userID + ", Password: " + passwords.get(userID));
        }
    }
    
    @Override
    public String generateNextID(){
        return null;
    }
    
    @Override
    public void addEntry(){
    }
}
