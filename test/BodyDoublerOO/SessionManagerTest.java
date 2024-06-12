/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BodyDoublerOO;

import com.sun.jdi.connect.spi.Connection;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author GVE Rouse
 */
public class SessionManagerTest {

    private Connection connection;
    private SessionManager sessionManager;

    public SessionManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        sessionManager = new SessionManager();

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSession method, of class SessionManager.
     */
    @Test
    public void testGetSession() {
        SessionManager instance = new SessionManager();
        String sessionID = "SES015";
        Session result = sessionManager.getSession(sessionID);
        assertNotNull(result);
        assertEquals("SES015", result.getSessionID());
        assertEquals("1/1/2024", result.getDateOfSession());
        assertEquals("7:45 am", result.getTimeOfSession());
        assertEquals("WZ303", result.getLocationOfSession());
        assertEquals(2, result.getMaxNoOfPeople());
        assertEquals(1, result.getNoOfPeople());
    }

    @Test
    public void testDeleteEntry() {
        
        System.out.println("deleteEntry");
        String table = "SESSION";
        String column = "SESSIONID";
        String inputID = "SES019"; //does delete a real session, so new / currrent ID from DB 
        SessionManager instance = new SessionManager();
        instance.deleteEntry(table, column, inputID);
        

       //check that session has been deleted
       
       
       List<String> list = instance.IDList(table, column);
       boolean isIDPresent = list.contains(inputID);
       
       assertFalse("Deleted session still exists", isIDPresent);
    }
}

