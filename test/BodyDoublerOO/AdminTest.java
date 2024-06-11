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
public class AdminTest {

    public AdminTest() {
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
     * Test of constructor, of class Admin.
     */
    @Test
    public void testAdminRegistration() {
        Admin admin = new Admin("robbanks", "adminpass", "Rob", "Banks", "banks@example.com", "Test", "Test");
        //boolean isRegistered = admin.register(); // Assuming register() returns a boolean
        //assertTrue(isRegistered);

       
        // Verify that each field is set correctly
        assertEquals("robbanks", admin.getUserID());
        assertEquals("adminpass", admin.getPassword());
        assertEquals("Rob", admin.getFirstName());
        assertEquals("Banks", admin.getLastName());
        assertEquals("banks@example.com", admin.getEmail());
        assertEquals("Test", admin.getRole());
        assertEquals("Test", admin.getDepartment());
    }

}
