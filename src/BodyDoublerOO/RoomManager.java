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

/**manages methods relating to the ROOM table
 *
 * @author zalit
 */
public class RoomManager extends TableManager {

    public Room room;

    public RoomManager() {
        this.room = new Room("", "");
    }

    //add an entry to ROOM table based on a Room object
    @Override
    public void addEntry() {
        String entry = "INSERT INTO ROOM VALUES ('" + room.getRoomID() + "' ,'" + room.getRoomName() + "')";
        updateDB(entry);
    }

    //get all entries from ROOM table, create an Room object from each entry, 
    //create a list of those Room objects and return the list.
    public List<Room> readAll() {
        List<Room> rooms = new ArrayList<>();
        ResultSet rs = queryDB("SELECT * FROM ROOM");
        try {
            while (rs.next()) {
                String roomID = rs.getString("ROOMID");
                String roomName = rs.getString("ROOMNAME");
                Room room1 = new Room(roomID, roomName);
                rooms.add(room1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            closeResources(null, rs);
        }
        return rooms;
    }

    //generates and returns the next sequencial room ID
    @Override
    public String generateNextID() {
        Sequencer seq = new Sequencer();
        String num = seq.generateNextNumber("ROOM", "ROOMID");
        return "ROM" + num;
    }
    
    

}
