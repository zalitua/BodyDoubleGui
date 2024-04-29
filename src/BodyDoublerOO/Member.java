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

    private String studentID;
    private String age;
    private String degreeProgram;

    public Member(String userID, String password, String firstName,
            String lastName, String email, String age, String studentID, String degreeProgram) {
        super(userID,  password, firstName, lastName, email);
        this.age = age;
        this.studentID = studentID;
        this.degreeProgram = degreeProgram;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studetID) {
        this.studentID = studetID;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }
    
    @Override
    public String toString(){
        return "User ID: " + this.getUserID() + "\nFirst name: " + this.getFirstName() + "\nLast name: " + this.getLastName() 
                + "\nEmail: " + this.getEmail() + "\nAge: " + this.getAge() + "\nStudentID: " + this.getStudentID() + "\nDegre Program: " + this.getDegreeProgram();
    }
    
    public String toStringToFile() {
        return this.getUserID() + "," + this.getPassword() + "," + this.getFirstName()+ "," + this.getLastName()
                 + "," + this.getEmail() + "," + this.getAge()+ "," + this.getStudentID()+ "," + this.getDegreeProgram();
        
    }
    
    public void writeMemberToFile(Member member) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("./nbproject/files/members.txt", true));
            bw.append(member.toStringToFile());
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("Sorry, there was a problem writing to the file.");
        } 
    }
}
