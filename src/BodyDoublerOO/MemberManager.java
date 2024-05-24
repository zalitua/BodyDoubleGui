/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zalit
 */
public class MemberManager {
    private final DBManager dbManager;
    public Member member;

    public MemberManager() {
        this.member = new Member("", "", "", "", "", "", "", "");
        this.dbManager = new DBManager();
    }

    public void addEntry() {

        String entry = "INSERT INTO ADMIN VALUES ('" + member.getUserID() + "' ,'"
                + member.getPassword() + "' ,'" + member.getFirstName() + "' ,'"
                + member.getLastName() + "' ,'" + member.getEmail() + "' ,'"
                + member.getAge() + "' ,'" + member.getStudentID() + "' ,'" + member.getDegreeProgram() + "')";
        this.dbManager.updateDB(entry);
        System.out.println("Entry made!");
    }

    public List<Member> readAll() {

        List<Member> members = new ArrayList<>();
        ResultSet rs = this.dbManager.queryDB("SELECT * FROM ADMIN");
        try {
            while (rs.next()) {
                String memberID = rs.getString("MEMBERID");
                String password = rs.getString("PASSWORD");
                String firstName = rs.getString("FIRSTNAME");
                String lastName = rs.getString("LASTNAME");
                String email = rs.getString("EMAIL");
                String age = rs.getString("AGE");
                String studentID = rs.getString("STUDENTID");
                String degreesProgram = rs.getString("DEGREESPROGRAM");
                Member member1 = new Member(memberID, password, firstName, lastName, email, age, studentID, degreesProgram);
                members.add(member1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return members;
    }
    
    public String generateNextID(){
        Sequencer seq = new Sequencer();
        String num = seq.generateNextNumber("MEMBER", "MEMBERID");
        return "MEM" + num;
    }
}
