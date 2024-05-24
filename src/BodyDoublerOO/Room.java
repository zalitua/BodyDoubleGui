/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author zalit
 */
public class Room {

    Scanner scan = new Scanner(System.in);
    String roomID;
    String roomName;
    String path = "./nbproject/files/rooms.txt";

    public Room(String roomID, String roomName) {
        this.roomID = roomID;
        this.roomName = roomName;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
   

    @Override
    public String toString() {
        return this.getRoomName();
    }

//    public void removeRoom(String room) {
//        ReadFile rf = new ReadFile();
//        ArrayList<Room> list = rf.readRoomFile(path);
//        BufferedWriter bw = null;
//        //clear file
//        try {
//            bw = new BufferedWriter(new FileWriter("./nbproject/files/rooms.txt"));
//            bw.append("");
//            bw.close();
//        } catch (IOException e) {
//            System.out.println("Sorry, there was a problem writing to the file.");
//        }
//        for (Room room1 : list) {
//            if (!room.equalsIgnoreCase(room1.getRoom())) {
//                writeToFile(room1);
//            }
//        }
//    }
//
//    public void addRoom(String room) {
//        this.setRoom(room);
//        writeToFile(this);
//    }

    public void displayRooms() {
        ReadFile rf = new ReadFile();
        ArrayList<Room> list = rf.readRoomFile(path);

        for (Room room : list) {
            System.out.print(room.toString() + ", ");
        }
        System.out.println("");
    }

    public void writeToFile(Room room) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("./nbproject/files/rooms.txt", true));
            bw.append(room.toString());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem writing to the file.");
        }
    }

//    public void manageRooms() {
//        displayRooms();
//        System.out.println("Would you like to add or remove a room?(add/remove)");
//        String input = scan.nextLine();
//        if (input.equalsIgnoreCase("x")) {
//            System.exit(0);
//        } else if (input.equalsIgnoreCase("add")) {
//            System.out.println("Please enter the room name:");
//            String room = scan.nextLine();
//            addRoom(room);
//        } else if (input.equalsIgnoreCase("remove")) {
//            System.out.println("What room would you like to remove? ");
//            String room = scan.nextLine();
//            removeRoom(room);
//        } else {
//            System.out.println("That's not a valid answer.");
//        }
//    }

}
