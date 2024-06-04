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

    private static DBManagerAlt instance;
    private static Connection connInstance;

    // private constructor
    private DBManagerAlt() {
        // Prevent instantiation
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
    
//    public Connection getConnection() {
//        return connInstance;
//    }

    public void closeConnections() {
        if (connInstance != null) {
            try {
                connInstance.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    @Override //override clone method to prevent clonning
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    //code to check tables and data
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

}


