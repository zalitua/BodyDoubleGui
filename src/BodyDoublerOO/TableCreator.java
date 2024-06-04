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
public class TableCreator extends TableManager{

    private final Connection conn;
    private Statement statement;
    
   

    public TableCreator() {
        conn = DBManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(TableCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createAdminTable() {

        this.checkExists("ADMIN");
        updateDB("CREATE TABLE ADMIN (ADMINID VARCHAR(6), "
                + "PASSWORD VARCHAR(8), FIRSTNAME VARCHAR(20), LASTNAME VARCHAR(20), "
                + "EMAIL VARCHAR(40), ROLE VARCHAR(20), DEPARTMENT VARCHAR(30))");
        System.out.println("Admin table created!");
    }

    public void createMemberTable() {

        this.checkExists("MEMBER");
        updateDB("CREATE TABLE MEMBER (MEMBERID VARCHAR(6), "
                + "PASSWORD VARCHAR(8), FIRSTNAME VARCHAR(20), LASTNAME VARCHAR(20), "
                + "EMAIL VARCHAR(40), STUDENTID INT, DEGREEPROGRAM VARCHAR(4), AGE INT)");
        System.out.println("Memeber table created");
    }

    public void createSessionTable() {

        this.checkExists("SESSION");
        updateDB("CREATE TABLE SESSION (SESSIONID VARCHAR(6), "
                + "DATE VARCHAR(20), TIME VARCHAR(20), ROOM VARCHAR(20), "
                + "MAXPEOPLE INT, ACTUALPEOPLE INT)");
        System.out.println("Session table created");
    }

    public void createRoomTable() {

        this.checkExists("ROOM");
        updateDB("CREATE TABLE ROOM (ROOMID VARCHAR(6), ROOMNAME VARCHAR(20))");
        System.out.println("Room table created");
    }

    public void checkExists(String table) {
        if (this.conn != null) {
            try {
                DatabaseMetaData dbmd = this.conn.getMetaData();
                String[] types = {"TABLE"};
                statement = this.conn.createStatement();
                try (ResultSet rs = dbmd.getTables(null, null, null, types)) {
                    while (rs.next()) {
                        String tableName = rs.getString("TABLE_NAME");
                        System.out.println(tableName);
                        if (tableName.equalsIgnoreCase(table)) {
                            statement.executeUpdate("DROP TABLE " + table);
                            System.out.println("Table " + table + " has been deleted. ");
                            break;
                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(TableCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
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
