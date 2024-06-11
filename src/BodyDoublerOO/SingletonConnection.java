/*SingletonConnection class is uses the singleton 

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**uses the Singleton pattern to create a single connection to the database
 *
 * @author zalit
 */
public final class SingletonConnection {

    private static final String USER_NAME = "zali"; //your DB username
    private static final String PASSWORD = "zali"; //your DB password
    private static final String URL = "jdbc:derby:DoubleDb_Ebd; create=true";  //url of the DB host

    private static Connection connInstance;

    // private constructor
    private SingletonConnection() {
        // Prevent instantiation
    }
    
    public static synchronized Connection getConnection() {
        if (connInstance == null) {
            try {
                connInstance = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
                System.out.println(URL + "   CONNECTED....");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return connInstance;
    }

    public void closeConnections() {
        if (connInstance != null) {
            try {
                connInstance.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    @Override //override clone method to prevent clonning
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}


