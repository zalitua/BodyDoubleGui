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
public class UserBooksSession {
    
    public static void main(String[] args) {
        UserBooksSession ubs = new UserBooksSession();
        ubs.selectSession();
    }

    public void displaySessions(ArrayList<Session> list) {
        for (Session session : list) {
            System.out.println(session.toString());
        }
    }

    public void selectSession() {
        Scanner scan = new Scanner(System.in);
        String path = "./nbproject/files/roombooking.txt";
        ReadFile read = new ReadFile();
        ArrayList<Session> list = read.readSessionFile(path);
        displaySessions(list);
        String userIn = "";
        while (userIn.isEmpty()) {
            System.out.println("Please enter the Session Id of the session you would like to join? ");
            userIn = scan.nextLine().trim();
            if(userIn.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if(userIn.isEmpty()){
                System.out.println("That is not a valid session ID.");
            }
        }
        
        boolean found = false;
        for (Session session : list) {
            if (userIn.trim().equalsIgnoreCase(session.getSessionID())) {
                //number of people ++
                int i = Integer.parseInt(session.getNoOfPeople());
                i++;
                String str = String.valueOf(i);

                session.setNoOfPeople(str);
                Session newSession = new Session(session.getSessionID(), session.getDateOfSession(), session.getTimeOfSession(), session.getLocationOfSession(), session.getNoOfPeople(), session.getMaxNoOfPeople());
                list.remove(session);
                list.add(newSession);
                found = true;
                break;
            } 
        }
        if(found){
            System.out.println("You have been added to the session!");
        }
        else{
            System.out.println("That was not a valid session ID!");
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
            Session.writeRoomBooking(session);
        }
        ReadFile read2 = new ReadFile();
        ArrayList<Session> list2 = read2.readSessionFile(path);
        displaySessions(list2);
        System.out.println("You've joined the session!");
    }

    public void writeRoomBooking(Session session) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("./nbproject/files/roombooking.txt", true));
            bw.append(session.toStringToFile());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem writing to the file.");
        }
    }

    //user cancels their booking
    public void cancelSession() {
        Scanner scan = new Scanner(System.in);
        String path = "./nbproject/files/roombooking.txt";
        ArrayList<Session> list = new ArrayList<>();
        ReadFile read = new ReadFile();
        list = read.readSessionFile(path);
        displaySessions(list);
        String userIn = "";
        while (userIn.isEmpty()) {
            System.out.println("Please enter the session ID of the session you want to withdraw from?");
            userIn = scan.nextLine().trim();
            if(userIn.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (userIn.isEmpty()) {
                System.out.println("That is not a valid session ID.");
            }
        }

        for (Session session : list) {
            if (userIn.trim().equalsIgnoreCase(session.getSessionID())) {
                int i = Integer.parseInt(session.getNoOfPeople());
                if (i > 0) {
                    i--;
                } else {
                    System.out.println("That session is empty");
                }

                String str = String.valueOf(i);

                session.setNoOfPeople(str);
                Session newSession = new Session(session.getSessionID(), session.getDateOfSession(), session.getTimeOfSession(), session.getLocationOfSession(), session.getNoOfPeople(), session.getMaxNoOfPeople());
                list.remove(session);
                list.add(newSession);
                break;
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
            Session.writeRoomBooking(session);
        }
        ReadFile read2 = new ReadFile();
        ArrayList<Session> list2 = read2.readSessionFile(path);
        displaySessions(list2);
        System.out.println("You've withdrawn from the session!");
    }
}
