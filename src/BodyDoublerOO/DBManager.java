/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**creates a connection that will be used by classes that extend this class
 * and methods for querying and updating the database 
 * @author zalit
 */
abstract class DBManager {
    
    private final Connection connInstance;
    public DBManager(){
        this.connInstance = SingletonConnection.getConnection();
    }
    
    //returns a result set from a database query for a given sql statement
    public ResultSet queryDB(String sql) {
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
    
    //executes an update of a database for a given sql statement
    public void updateDB(String sql) {

        Statement statement = null;
        try {
            statement = connInstance.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            closeResources(statement, null);
        }
    }
    
    //provides a method to close a statement and a result set
    void closeResources(Statement stmt, ResultSet rs) {
        try
        {
            if(rs!=null) {
                rs.close();
            }
            if(stmt!= null) {
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
