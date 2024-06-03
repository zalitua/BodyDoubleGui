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

/**
 *
 * @author zalit
 */
abstract class TableManager {
    public final DBManager dbManager;
    
    public TableManager(){
        this.dbManager = new DBManager();
    }
    
    public abstract void addEntry();
    
    public void deleteEntry(String table, String column, String inputID) {
        String entry = "DELETE FROM " + table + " WHERE " + column + " = '" + inputID + "'";
        this.dbManager.updateDB(entry);
    }
    
    public List<String> IDList(String table, String column) {
        List<String> list = new ArrayList<>();
        ResultSet rs = this.dbManager.queryDB("SELECT " + column + " FROM " + table);

        try {
            while (rs.next()) {
                list.add(rs.getString(column));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoomManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public abstract String generateNextID();
    
}
