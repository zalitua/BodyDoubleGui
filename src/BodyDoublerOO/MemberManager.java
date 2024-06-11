/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zalit
 */
public class MemberManager extends TableManager {

    public Member member;

    public MemberManager() {
        this.member = new Member("", "", "", "", "", 0, 0, "");
    }

    public static void main(String[] args) {
        MemberManager mm = new MemberManager();
        mm.member = new Member("MEM000", "password", "John", "Candy", "john@candy.com", 25, 24342534, "BCIS");
        mm.addEntry();
    }

    @Override
    public void addEntry() {

        String entry = "INSERT INTO MEMBER VALUES ('" + member.getUserID() + "' ,'"
                + member.getPassword() + "' ,'" + member.getFirstName() + "' ,'"
                + member.getLastName() + "' ,'" + member.getEmail() + "' ,"
                + member.getStudentID() + " ,'" + member.getDegreeProgram() + "' ," + member.getAge() + ")";
        updateDB(entry);
        System.out.println("Entry made!");
    }

    public List<Member> readAll() {

        List<Member> members = new ArrayList<>();
        ResultSet rs = queryDB("SELECT * FROM ADMIN");
        try {
            while (rs.next()) {
                String memberID = rs.getString("MEMBERID");
                String password = rs.getString("PASSWORD");
                String firstName = rs.getString("FIRSTNAME");
                String lastName = rs.getString("LASTNAME");
                String email = rs.getString("EMAIL");
                int age = rs.getInt("AGE");
                int studentID = rs.getInt("STUDENTID");
                String degreeProgram = rs.getString("DEGREEPROGRAM");
                Member member1 = new Member(memberID, password, firstName, lastName, email, age, studentID, degreeProgram);
                members.add(member1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close resources
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return members;
    }

    @Override
    public String generateNextID() {
        Sequencer seq = new Sequencer();
        String num = seq.generateNextNumber("MEMBER", "MEMBERID");
        return "MEM" + num;
    }
}
