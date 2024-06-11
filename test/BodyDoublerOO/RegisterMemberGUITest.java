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
public class RegisterMemberGUITest {
    
    private RegisterMemberGUI instance;
    public RegisterMemberGUITest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new RegisterMemberGUI();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createMember method, of class RegisterMemberGUI.
     */
    @Test
    public void testCreateMember() {
        System.out.println("createMember");
        RegisterMemberGUI instance = new RegisterMemberGUI();
        
        instance.getFirstName().setText("testerA");
        instance.getLastName().setText("testerB");
        instance.getEmail().setText("test@testing.com");
        instance.getPassword().setText("test1234");
        instance.getDegreeJComboBox().setSelectedItem("BCIS");
        instance.getAge().setText("21");
        instance.getStudentID().setText("12345678");
        
        
        instance.createMember();
        
    }

 

    
    
    
}
