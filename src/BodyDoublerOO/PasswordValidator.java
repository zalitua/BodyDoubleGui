/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author zalit
 */
public class PasswordValidator {

//    public void writePasswordEntry(String userID, String password) {
//        BufferedWriter bw = null;
//        try {
//            bw = new BufferedWriter(new FileWriter("./nbproject/files/passwords.txt", true));
//            bw.append(userID + "," + password);
//            bw.newLine();
//            bw.close();
//        } catch (IOException e) {
//            System.out.println("Sorry, there was a problem writing to the file.");
//        }
//    }

    public HashMap<String, String> readPasswordList() {
        HashMap<String, String> map = new HashMap<>();
        String path = "./nbproject/files/passwords.txt";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String userID = parts[0];
                String password = parts[1];
                map.put(userID, password);
            }
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem reading the file.");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("Sorry, there was a problem reading the file.");
                }
            }
        }
        return map;
    }

    public boolean enterPassword() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your user ID: ");
        String userID = scan.nextLine().toUpperCase();
        if (userID.equalsIgnoreCase("x")){
                System.exit(0);
            }
        System.out.println("Please enter your password: ");
        String password = scan.nextLine();
        if (password.equalsIgnoreCase("x")){
                System.exit(0);
            }
        HashMap<String, String> pwdList = readPasswordList();
        String pwd = pwdList.get(userID);
        return password.equalsIgnoreCase(pwd);
    }
}
