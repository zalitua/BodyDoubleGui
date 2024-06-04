/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zalit
 */
abstract class TableManager {
    //private final DBManagerAlt dbManager;
    private Connection connInstance;
    
    public TableManager(){
        this.connInstance = DBManagerAlt.getConnection();
    }
    
    public ResultSet queryDB(String sql) {

        //Connection connection = this.connInstance;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connInstance.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    public void updateDB(String sql) {

        //Connection connection = this.connInstance;
        Statement statement = null;
        try {
            statement = connInstance.createStatement();
            statement.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //return 0;
        }
        
        finally{
            closeResources(statement, null);
        }
    }
    
    void closeResources(Statement stmt, ResultSet rs) {
        try
        {
            if(rs!=null) rs.close();
            if(stmt!= null) stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBManagerAlt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public abstract void addEntry();
    
    public void deleteEntry(String table, String column, String inputID) {
        String entry = "DELETE FROM " + table + " WHERE " + column + " = '" + inputID + "'";
        updateDB(entry);
    }
    
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
        return list;
    }
    
    public abstract String generateNextID();
    
}
