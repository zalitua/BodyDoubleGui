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

/**validates passwords when users log in
 *
 * @author zalit
 */
public class PasswordManager extends DBManager {

    public PasswordManager() {
    }

    //queries the member and admin table and returns a hashmap of all
    //user IDs and passwords
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
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeResources(null, rs);
        }
        return passwords;
    }

    //takes the result from passwordList and checks if the input parameters
    //match an existing user ID and password and reurn the boolean result
    public boolean validatePassword(String userID, String password) {
        
        HashMap<String, String> passwords = passwordList();
        userID = userID.toUpperCase();
        String pwd = passwords.get(userID);
        return password.equalsIgnoreCase(pwd);
    }
    
    public boolean checkInput(String input) {
        return !input.isEmpty();
    }
    
    //debugging code
    public void printPasswordList(){
        HashMap<String, String> passwords = passwordList();
        for (String userID : passwords.keySet()) {
            System.out.println("ID: " + userID + ", Password: " + passwords.get(userID));
        }
    }
}
