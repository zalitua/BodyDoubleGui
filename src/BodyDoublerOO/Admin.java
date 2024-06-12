/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

/**defines and creates an Admin object
 *
 * @author zalit
 */
public class Admin extends Person {

    private String role;
    private String department;
    //constructor incorporates fields from abstract class Person
    public Admin(String userID, String password, String firstName, String lastName,
            String email, String role, String department) {
        super(userID, password, firstName, lastName, email);
        this.role = role;
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
