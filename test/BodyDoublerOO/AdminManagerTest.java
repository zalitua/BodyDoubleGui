/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package BodyDoublerOO;

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
public class AdminManagerTest {
    
    public AdminManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addEntry method, of class AdminManager.
     */
    @Test
    public void testAddEntry() {
        System.out.println("addEntry");
        AdminManager instance = new AdminManager();
        instance.addEntry();
        
    }

    

    /**
     * Test of generateNextID method, of class AdminManager.
     */
    @Test
    public void testGenerateNextID() {
        System.out.println("generateNextID");
        AdminManager instance = new AdminManager();
        String expResult = "ADM017";
        String result = instance.generateNextID();
        assertEquals(expResult, result);
        
    }
    
}
