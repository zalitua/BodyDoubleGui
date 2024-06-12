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
public class TableManagerTest {
    
    public TableManagerTest() {
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
     * Test of checkInput method, of class TableManager.
     */
    @Test
    public void testCheckInput() {
        System.out.println("checkInput");
        String input = "";
        TableManager instance = new TableManagerImpl();
        boolean expResult = false;
        boolean result = instance.checkInput(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkLength method, of class TableManager.
     */
    @Test
    public void testCheckLength() {
        System.out.println("checkLength");
        String input = "";
        TableManager instance = new TableManagerImpl();
        boolean expResult = false;
        boolean result = instance.checkLength(input);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEntry method, of class TableManager.
     */
    @Test
    public void testDeleteEntry() {
        System.out.println("deleteEntry");
        String table = "";
        String column = "";
        String inputID = "";
        TableManager instance = new TableManagerImpl();
        instance.deleteEntry(table, column, inputID);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IDList method, of class TableManager.
     */
    @Test
    public void testIDList() {
        System.out.println("IDList");
        String table = "";
        String column = "";
        TableManager instance = new TableManagerImpl();
        List<String> expResult = null;
        List<String> result = instance.IDList(table, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TableManagerImpl extends TableManager {
    }
    
}
