/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zalit
 */
public class BodyDouble {
    private final DBManager dbManager;
    private final Connection conn;
    private Statement statement;
    
    public BodyDouble() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BodyDouble.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createAdminTable() {
        try {
            this.checkExists("ADMIN");
            this.statement = conn.createStatement();
            this.statement.executeUpdate("CREATE TABLE ADMIN (ADMINID VARCHAR(6), "
                    + "PASSWORD VARCHAR(8), FIRSTNAME VARCHAR(20), LASTNAME VARCHAR(20), "
                    + "EMAIL VARCHAR(40), ROLE VARCHAR(20), DEPARTMENT VARCHAR(30))");
            System.out.println("Admin table created!");
        } catch (SQLException ex) {
            Logger.getLogger(BodyDouble.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void createMemberTable() {
        
        this.checkExists("MEMBER");
        this.dbManager.updateDB("CREATE TABLE MEMBER (MEMBERID VARCHAR(6), "
                + "PASSWORD VARCHAR(8), FIRSTNAME VARCHAR(20), LASTNAME VARCHAR(20), "
                + "EMAIL VARCHAR(40), STUDENTID INT, DEGREESPROGRAM VARCHAR(4), AGE INT)");
        System.out.println("Memeber table created");
    }
    
    public void createSessionTable() {
        
        this.checkExists("SESSION");
        this.dbManager.updateDB("CREATE TABLE SESSION (SESSIONID VARCHAR(6), "
                + "DATE DATE, TIME TIME, ROOM VARCHAR(20), "
                + "MAXPEOPLE INT, ACTUALPEOPLE INT)");
        System.out.println("Session table created");
    }
    
    public void createRoomTable() {
        
        this.checkExists("ROOM");
        this.dbManager.updateDB("CREATE TABLE ROOM (ROOMID VARCHAR(6), ROOMNAME VARCHAR(20)");
        System.out.println("Room table created");
    }
    
    public void checkExists(String table) {
        if (this.conn != null) {
            try {
                DatabaseMetaData dbmd = this.conn.getMetaData();
                String[] types = {"TABLE"};
                statement = this.conn.createStatement();
                ResultSet rs = dbmd.getTables(null, null, null, types);
                
                while (rs.next()) {
                    String tableName = rs.getString("TABLE_NAME");
                    System.out.println(tableName);
                    if (tableName.equalsIgnoreCase(table)) {
                        statement.executeUpdate("DROP TABLE " + table);
                        System.out.println("Table " + table + " has been deleted. ");
                        break;
                    }
                }
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(BodyDouble.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void closeConnection(){
        this.dbManager.closeConnections();
    }
//    public ResultSet getWeekSpecial() {
//        ResultSet rs = null;
//        try {
//            rs = this.statement.executeQuery("SELECT TITLE, PRICE, DISCOUNT FROM BOOK, PROMOTION WHERE BOOK.CATEGORY=PROMOTION.CATEGORY");
//        } catch (SQLException ex) {
//            Logger.getLogger(BodyDouble.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return (rs);
//        
//    }
    
//    public void createWeekSpecialTable(ResultSet rs) {
//        
//        try {
//            this.checkExists("WEEKSPECIAL");
//            this.statement = conn.createStatement();
//            this.statement.executeUpdate("CREATE TABLE WEEKSPECIAL (TITLE VARCHAR(50), SPECIALPRICE FLOAT)");
//            System.out.println("Table WEEKSPECIAL created!");
//            while (rs.next()) {
//                String title = rs.getString("TITLE");
//                float price = rs.getFloat("PRICE");
//                int discount = rs.getInt("DISCOUNT");
//                float newPrice = price - (100 - discount) / 100;
//                this.statement.addBatch("INSERT INTO WEEKSPECIAL VALUES ('" + title + "', " + newPrice + ")");
//            }
//            this.statement.executeBatch();
//            System.out.println("Data inserted!");
//            rs.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(BodyDouble.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    
    
}
