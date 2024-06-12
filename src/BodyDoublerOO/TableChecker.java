/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**code to check what tables are in database, what columns are in tables
 * and print out table data. only used for debugging.
 * @author zalit
 */
public class TableChecker {
    
    Connection connInstance;
    
    public TableChecker(){
        this.connInstance = SingletonConnection.getConnection();
    }
    
    public void showTables() {
         
        ResultSet rs = null;
        try {
            DatabaseMetaData metaDataForDatabaseConnection = connInstance.getMetaData();
            rs = metaDataForDatabaseConnection.getTables(null, null, null, new String[]{"TABLE"});

            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        } catch (SQLException e) {
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
        }
    }

    public void showColumns(String table) {
        ResultSet rs = null;
        try {
            DatabaseMetaData metaDataForDatabaseConnection = connInstance.getMetaData();
            rs = metaDataForDatabaseConnection.getColumns(null, null, table, null);
while (rs.next()) {
                String columnName = rs.getString("COLUMN_NAME");
                String columnSize = rs.getString("COLUMN_SIZE");
                String datatype = rs.getString("DATA_TYPE");
                String isNullable = rs.getString("IS_NULLABLE");
                String isAutoIncrement = rs.getString("IS_AUTOINCREMENT");
                System.out.println(columnName + "\n" + columnSize + "\n" + datatype + "\n" + isNullable + "\n" + isAutoIncrement + "\n");
            }
        } catch (SQLException e) {
        }finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
        }
    }
    
    public void printSqlTable(String selectQuery) {
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = connInstance.createStatement();
            rs = statement.executeQuery(selectQuery);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Print rows
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i));
                    if (i < columnCount) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } catch (SQLException e) {
        } 
    }
}
