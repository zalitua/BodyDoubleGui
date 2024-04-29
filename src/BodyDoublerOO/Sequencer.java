/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author zalit
 */
public class Sequencer  {
    
    public String getNextNumber (String path){
        int number = 000;
        String nextNumber = "";
        SortedSet<String> idSet = new TreeSet<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] id = line.split(",");
                idSet.add(id[0]);
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
        number = Integer.parseInt(idSet.last().substring(3));
        number++;
        nextNumber = String.format("%03d",number);
        return nextNumber;
    }
}
