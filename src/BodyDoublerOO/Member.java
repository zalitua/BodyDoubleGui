/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * test
 *
 * @author zalit
 */
public class Member extends Person {

    private int studentID;
    private int age;
    private String degreeProgram;

    public Member(String userID, String password, String firstName,
            String lastName, String email, int age, int studentID, String degreeProgram) {
        super(userID,  password, firstName, lastName, email);
        this.age = age;
        this.studentID = studentID;
        this.degreeProgram = degreeProgram;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studetID) {
        this.studentID = studetID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }
    
    @Override
    //for testing
    public String toString(){
        return "User ID: " + this.getUserID() + "\nFirst name: " + this.getFirstName() + "\nLast name: " + this.getLastName() 
                + "\nEmail: " + this.getEmail() + "\nAge: " + this.getAge() + "\nStudentID: " + this.getStudentID() + "\nDegre Program: " + this.getDegreeProgram();
    }
}
