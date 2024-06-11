/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BodyDoublerOO;

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
public class AddSessionGUITest {
    private AddSessionGUI instance;
    
    public AddSessionGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new AddSessionGUI();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createSession method, of class AddSessionGUI.
     */
    @Test
    public void testCreateSession() {
        System.out.println("createSession");
        AddSessionGUI instance = new AddSessionGUI();
        
        instance.getDayJComboB().setSelectedItem("01");
        instance.getMonthJComboB().setSelectedItem("01");
        instance.getTimeJComboB().setSelectedItem("00:00");
        instance.getRoomJComboB().setSelectedItem("WZ404");
        instance.getMaxPartJComboB().setSelectedItem("6");
        
        instance.createSession();
        
    }


    
}
