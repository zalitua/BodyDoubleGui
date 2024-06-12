/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**Defines specific methods that are generically used by any manager class that extends
 * TableManager
 * @author zalit
 */
abstract class TableManager extends DBManager implements Table{
    
    //validates input from text fields in GUIs
    @Override
    public boolean checkInput(String input) {
        return !input.isEmpty();
    }
    
    //validates input length of a password in GUIs
    @Override
    public boolean checkLength(String input) {
        return input.length() == 8;
    }
    
    //removes an entry from a table based on the inputID paramater
    @Override
    public void deleteEntry(String table, String column, String inputID) {
        String entry = "DELETE FROM " + table + " WHERE " + column + " = '" + inputID + "'";
        updateDB(entry);
    }
    
    //get a list of IDs from a id column of a table
    //this is used to populate combo boxes with IDs is SessionManager and RoomManager
    @Override
    public List<String> IDList(String table, String column) {
        List<String> list = new ArrayList<>();
        ResultSet rs = queryDB("SELECT " + column + " FROM " + table);
        try {
            while (rs.next()) {
                list.add(rs.getString(column));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            closeResources(null, rs);
        }
        return list;
    }
}
