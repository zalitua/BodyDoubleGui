/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.util.List;

/**defines methods that must be included in manager classes that implements this
 * interface, such as AdimnManager or SessionManager
 * @author zalit
 */
public interface Table {
    void addEntry();
    boolean checkInput(String input);
    boolean checkLength(String input);
    String generateNextID();
    void deleteEntry(String table, String column, String inputID);
    List<String> IDList(String table, String column);
}
