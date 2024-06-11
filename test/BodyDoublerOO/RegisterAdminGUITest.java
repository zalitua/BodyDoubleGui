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
public class RegisterAdminGUITest {
    
    private RegisterAdminGUI instance;
    
    
    public RegisterAdminGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance =new RegisterAdminGUI();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createAdmin method, of class RegisterAdminGUI.
     */
    @Test
    public void testCreateAdmin() {
        System.out.println("createAdmin");
        RegisterAdminGUI instance = new RegisterAdminGUI();
        
        
        
        
// Set the input fields with valid data
        instance.getFirstName().setText("testerA");
        instance.getLastName().setText("testerB");
        instance.getEmail().setText("test@testing.com");
        instance.getPassword().setText("test1234");
        instance.getRoleJComboBox().setSelectedItem("Staff");
        instance.getDepartmentJComboBox().setSelectedItem("Faculty");
        
        instance.createAdmin();
        //assertNotNull(instance.)
        //assertTrue(instance.passwordPanel.isVisible());
        
        //fail("createAdmin test failed");
    }

    /**
     * Test of showPasswordPanel method, of class RegisterAdminGUI.
     */
//    @Test
//    public void testShowPasswordPanel() {
//        System.out.println("showPasswordPanel");
//        RegisterAdminGUI instance = new RegisterAdminGUI();
//        instance.showPasswordPanel();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class RegisterAdminGUI.
     */

    
}
