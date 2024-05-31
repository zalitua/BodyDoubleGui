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
public class TableCreator {

    private final DBManager dbManager;
    private final Connection conn;
    private Statement statement;

    public static void main(String[] args) {
        TableCreator bd = new TableCreator();
//        bd.createAdminTable();
//        bd.createMemberTable();
        bd.createSessionTable();

        //bd.createRoomTable();
        
        //MemberManager mm = new MemberManager();
//        mm.member = new Member("MEM000","password","John","Candy","john@candy.com", 25, 24342534, "BCIS");
//        mm.addEntry();
        //mm.displayAll();
        
        //RoomManager rm =new RoomManager();
        //rm.room = new Room("ROM000", "WZ401");
        //rm.addEntry();
        //rm.displayAll();
    }

    public TableCreator() {
        dbManager = new DBManager();
        conn = dbManager.getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(TableCreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createAdminTable() {

        this.checkExists("ADMIN");
        this.dbManager.updateDB("CREATE TABLE ADMIN (ADMINID VARCHAR(6), "
                + "PASSWORD VARCHAR(8), FIRSTNAME VARCHAR(20), LASTNAME VARCHAR(20), "
                + "EMAIL VARCHAR(40), ROLE VARCHAR(20), DEPARTMENT VARCHAR(30))");
        System.out.println("Admin table created!");
    }

    public void createMemberTable() {

        this.checkExists("MEMBER");
        this.dbManager.updateDB("CREATE TABLE MEMBER (MEMBERID VARCHAR(6), "
                + "PASSWORD VARCHAR(8), FIRSTNAME VARCHAR(20), LASTNAME VARCHAR(20), "
                + "EMAIL VARCHAR(40), STUDENTID INT, DEGREEPROGRAM VARCHAR(4), AGE INT)");
        System.out.println("Memeber table created");
    }

    public void createSessionTable() {

        this.checkExists("SESSION");
        this.dbManager.updateDB("CREATE TABLE SESSION (SESSIONID VARCHAR(6), "
                + "DATE VARCHAR(20), TIME VARCHAR(20), ROOM VARCHAR(20), "
                + "MAXPEOPLE INT, ACTUALPEOPLE INT)");
        System.out.println("Session table created");
    }

    public void createRoomTable() {

        this.checkExists("ROOM");
        this.dbManager.updateDB("CREATE TABLE ROOM (ROOMID VARCHAR(6), ROOMNAME VARCHAR(20))");
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
                Logger.getLogger(TableCreator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void closeConnection() {
        this.dbManager.closeConnections();
    }
}
