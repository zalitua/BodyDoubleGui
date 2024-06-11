/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.util.List;

/**
 *
 * @author zalit
 */
public interface TableInterface {
    void addEntry();
    String generateNextID();
    List<String> IDList(String table, String column);
    void deleteEntry(String table, String column, String inputID);
}
