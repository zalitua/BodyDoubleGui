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
 * @author GVE Rouse
 */
public class RegisterSession {

    public void registerSession() {
        Scanner scan = new Scanner(System.in);
        String path = "./nbproject/files/roombooking.txt";
        ReadFile rf = new ReadFile();
        String noOfPeople = "0";
        
        Sequencer seq = new Sequencer();
        String nextNumber = seq.getNextNumber(path);
        String sessonID = "SES" + nextNumber;
        
        ArrayList<Room> list = rf.readRoomFile("./nbproject/files/rooms.txt");
        for (Room room : list){
            System.out.print(room.getRoom() + " ");
        }
        System.out.println("");
        
        String room = "";
        while (room.isEmpty()) {
            System.out.println("Please enter the room you would like to create a session for ");
            room = scan.nextLine().trim();
            if(room.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (room.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        String date = "";
        while (date.isEmpty()) {
            System.out.println("Please enter the date you would like to create a session for ");
            date = scan.nextLine().trim();
           if(date.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (date.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        String time = "";
        while (time.isEmpty()) {
            System.out.println("Please enter the time you would like to create a session for ");
            time = scan.nextLine().trim();
            
            if(time.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (time.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }
        
        String maxNoOfPeople = "";
        while (maxNoOfPeople.isEmpty()) {
            System.out.println("What is the max number of people able to book this room?");
            maxNoOfPeople = scan.nextLine().trim();
            if(maxNoOfPeople.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (maxNoOfPeople.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        Session session = new Session(sessonID, date, time, room,
                noOfPeople, maxNoOfPeople);
        Session.writeRoomBooking(session);
        
        System.out.println("Your session was added!");
        ArrayList<Session> list2 = rf.readSessionFile(path);
        displaySessions(list2);
    }

    public void displaySessions(ArrayList<Session> list) {
        for (Session session : list) {
            System.out.println(session.toString());
        }
    }

    public void removeSession() {
        String path = "./nbproject/files/roombooking.txt";
        ArrayList<Session> list = new ArrayList<>();
        ReadFile rf = new ReadFile();
        list = rf.readSessionFile(path);
        displaySessions(list);
        Scanner scan = new Scanner(System.in);
        String userIn = "";

        while (userIn.isEmpty()) {
            System.out.println("Please enter the session Id of the session you would like to delete: ");
            userIn = scan.nextLine().trim();
            if(userIn.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (userIn.isEmpty()) {
                System.out.println("That is not a valid session ID, please try again");
            }
        }

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("./nbproject/files/roombooking.txt"));
            bw.append("");
            bw.close();
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem writing to the file.");
        }

        for (Session session : list) {
            if (!userIn.trim().equalsIgnoreCase(session.getSessionID())) {
                Session.writeRoomBooking(session);
            }
        }
        
        System.out.println("Your session was deleted!");
        ArrayList<Session> list2 = rf.readSessionFile(path);
        displaySessions(list2);
    }
}
