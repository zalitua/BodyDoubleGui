/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**generates the next number to be used by any classes that have an ID field
 *
 * @author zalit
 */
public class Sequencer extends DBManager {

    public Sequencer() {
    }
    
    //reads the ID field of a given table, truncates the character values,
    //creates an ordered set of the numeric portions of the IDs and  
    //returns the next sequencial number after the last set element
    public String generateNextNumber(String table, String column) {
        int number = 000;
        String nextNumber = "";
        SortedSet<String> idSet = new TreeSet<>();
        ResultSet rs = queryDB("SELECT " + column + " FROM " + table);
        try {
            while (rs.next()) {
                String entry = rs.getString(column);
                idSet.add(entry);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sequencer.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResources(null, rs);
        }

        if (idSet.isEmpty()) {
            nextNumber = "001";
        } else {
            number = Integer.parseInt(idSet.last().substring(3));
            number++;
            nextNumber = String.format("%03d", number);
        }
        return nextNumber;
    }
}
