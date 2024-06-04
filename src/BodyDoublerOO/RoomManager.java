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
public class RoomManager extends TableManager {

    //private final DBManager dbManager;
    public Room room;

    public RoomManager() {
        this.room = new Room("", "");
    }

    @Override
    public void addEntry() {

        String entry = "INSERT INTO ROOM VALUES ('" + room.getRoomID() + "' ,'" + room.getRoomName() + "')";
        updateDB(entry);
        System.out.println("Entry made!");
    }

    

    public List<Room> readAll() {

        List<Room> rooms = new ArrayList<>();
        ResultSet rs = queryDB("SELECT * FROM ROOM");
        
        if (rs == null){
            System.out.println("No results!");
            return rooms;
        }
        try {
            while (rs.next()) {
                String roomID = rs.getString("ROOMID");
                String roomName = rs.getString("ROOMNAME");
                Room room1 = new Room(roomID, roomName);
                rooms.add(room1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Ensure the ResultSet and other resources are closed
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return rooms;
    }

    public void displayAll() {
        List<Room> rooms = readAll();
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }

    @Override
    public String generateNextID() {
        Sequencer seq = new Sequencer();
        String num = seq.generateNextNumber("ROOM", "ROOMID");
        return "ROM" + num;
    }
    
    

}
