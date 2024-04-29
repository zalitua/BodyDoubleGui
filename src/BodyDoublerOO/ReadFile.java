
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author zalit
 */
public class ReadFile {

    public ArrayList<Admin> readAdminFile(String path) {
        ArrayList<Admin> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Admin admin = new Admin(data[0],data[1],data[2],data[3],data[4],data[5],data[6]);
                list.add(admin);
            }
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem reading the file.");
        } finally {
            if (br != null) { 
                try { 
                    br.close(); 
                } 
                catch (IOException e) { 
                    System.out.println("Sorry, there was a problem reading the file.");
                }
            } 
        }
        return list;
    }
    
    public ArrayList<Member> readMemeberFile(String path) {
        ArrayList<Member> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = null;
            
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Member member = new Member(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7]);
                list.add(member);
            }
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem reading the file.");
        } finally {
            if (br != null) { 
                try { 
                    br.close(); 
                } 
                catch (IOException e) { 
                    System.out.println("Sorry, there was a problem reading the file.");
                }
            } 
        }
        return list;
    }
    
    public ArrayList<Session> readSessionFile(String path) {
        ArrayList<Session> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                Session session = new Session(data[0],data[1],data[2],data[3],data[4],data[5]);
                list.add(session);
            }
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem reading the file.");
        } finally {
            if (br != null) { 
                try { 
                    br.close(); 
                } 
                catch (IOException e) { 
                    System.out.println("Sorry, there was a problem reading the file.");
                }
            } 
        }
        return list;
    }
    
    public ArrayList<Room> readRoomFile(String path) {
        ArrayList<Room> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = br.readLine()) != null) {
                Room room = new Room(line);
                list.add(room);
            }
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem reading the file.");
        } finally {
            if (br != null) { 
                try { 
                    br.close(); 
                } 
                catch (IOException e) { 
                    System.out.println("Sorry, there was a problem reading the file.");
                }
            } 
        }
        return list;
    }
}
