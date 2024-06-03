/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author zalit
 */
public final class DBManagerAlt {

    private static final String USER_NAME = "zali"; //your DB username
    private static final String PASSWORD = "zali"; //your DB password
    private static final String URL = "jdbc:derby:DoubleDb_Ebd; create=true";  //url of the DB host

    private static Connection connInstance;

   //private constructor
    private DBManagerAlt() {
    }

    public static void main(String[] args) {
        Connection connect1 = DBManagerAlt.getConnection();
        Connection connect2 = DBManagerAlt.getConnection();
        System.out.println(connect1);
        System.out.println(connect2);
        //dbManager.showTables();
    }

    public static synchronized Connection getConnection() {
        if (connInstance == null) {
            try {
                connInstance = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + "   CONNECTED....");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return connInstance;
    }
    
    @Override //override clone method to prevent clonning
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    //Establish connection
    public void establishConnection() {
        //Establish a connection to Database
        if (connInstance == null) {
            try {
                connInstance = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            } catch (SQLException ex) {
                Logger.getLogger(DBManagerAlt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void closeConnections() {
        if (connInstance != null) {
            try {
                connInstance.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public ResultSet queryDB(String sql) {

        //Connection connection = this.connInstance;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = getConnection().createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }

    public void updateDB(String sql) {

        //Connection connection = this.conn;
        Statement statement = null;
        try {
            statement = getConnection().createStatement();
            statement.executeUpdate(sql);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            //return 0;
        }
        //ResultSet resultSet = null;

//        try {
//            statement = connection.createStatement();
//            statement.executeUpdate(sql);
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
        
        finally{
            closeResources(statement, null);
        }
    }

    public void showTables() {
        Connection connection = this.connInstance;

        try {

            //Establish Connection Through Embedded Or Local Install
            DatabaseMetaData metaDataForDatabaseConnection = connection.getMetaData();
            ResultSet resultSetForTableNames = metaDataForDatabaseConnection.getTables(null, null, null, new String[]{"TABLE"});

            while (resultSetForTableNames.next()) {
                System.out.println(resultSetForTableNames.getString(3));
            }

            //Close Resources As Necessary
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showColumns(String table) {
        Connection connection = this.connInstance;

        try {

            //Establish Connection Through Embedded Or Local Install
            DatabaseMetaData metaDataForDatabaseConnection = connection.getMetaData();
            ResultSet columns = metaDataForDatabaseConnection.getColumns(null, null, table, null);

            while (columns.next()) {
                String columnName = columns.getString("COLUMN_NAME");
                String columnSize = columns.getString("COLUMN_SIZE");
                String datatype = columns.getString("DATA_TYPE");
                String isNullable = columns.getString("IS_NULLABLE");
                String isAutoIncrement = columns.getString("IS_AUTOINCREMENT");
                System.out.println(columnName + "\n" + columnSize + "\n" + datatype + "\n" + isNullable + "\n" + isAutoIncrement + "\n");
            }

            //Close Resources As Necessary
        } catch (SQLException e) {
        }
    }
    
    public void printSqlTable(String selectQuery) {
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connInstance.createStatement();
            resultSet = statement.executeQuery(selectQuery);
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Print rows
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i));
                    if (i < columnCount) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private void closeResources(Statement statement, ResultSet resultSet) {
        try
        {
            if(resultSet!=null) resultSet.close();
            if(statement!= null) statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBManagerAlt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
