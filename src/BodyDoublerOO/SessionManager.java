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
public class SessionManager extends TableManager {

//    public static void main(String[] args) {
//        SessionManager sess = new SessionManager();
//        Session nwAdd = new Session("SES001", "05/06/24", "10 am", "WZ404", "2", "5");
//        sess.session = nwAdd;
//        sess.addEntry();
//    }
    public Session session;

    public SessionManager() {
        this.session = new Session("", "", "", "", 0, 0);
    }

    @Override
    public void addEntry() {

        String entry = "INSERT INTO SESSION VALUES ('" + session.getSessionID() + "' ,'"
                + session.getDateOfSession() + "' ,'" + session.getTimeOfSession() + "' ,'"
                + session.getLocationOfSession() + "' ," + session.getMaxNoOfPeople()
                + " ," + session.getNoOfPeople() + ")";
        //this.dbManager.updateDB(entry);
        updateDB(entry);
        System.out.println("Entry made!");
    }

//    public void deleteEntry(String sessionID) {
//        String entry = "DELETE FROM SESSION WHERE SESSIONID = '" + sessionID + "'";
//        // this.dbManager.updateDB(entry);
//        executeUpdate(entry);
//    }
    public List<Session> readAll() {

        List<Session> sessions = new ArrayList<>();
        ResultSet rs = queryDB("SELECT * FROM SESSION");

        if (rs == null) {
            System.out.println("No results!");
            return sessions;
        }
        try {
            while (rs.next()) {
                String sessionID = rs.getString("SESSIONID");
                String date = rs.getString("DATE");
                String time = rs.getString("TIME");
                String room = rs.getString("ROOM");
                int maxPeople = rs.getInt("MAXPEOPLE");
                int actualPeople = rs.getInt("ACTUALPEOPLE");
                Session session1 = new Session(sessionID, date, time, room, maxPeople, actualPeople);
                sessions.add(session1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sessions;
    }

    public void displayAll() {
        List<Session> sessions = readAll();
        for (Session session : sessions) {
            System.out.println(session.toString());
        }
    }

    @Override
    public String generateNextID() {
        Sequencer seq = new Sequencer();
        String num = seq.generateNextNumber("SESSION", "SESSIONID");
        return "SES" + num;
    }

    public Session getSession(String sessionID) {
        Session session = null;
        ResultSet rs = queryDB("SELECT * FROM SESSION WHERE SESSIONID = '" + sessionID + "'");
        try {
            if (rs.next()) {
                String date = rs.getString("DATE");
                String time = rs.getString("TIME");
                String room = rs.getString("ROOM");
                int maxPeople = rs.getInt("MAXPEOPLE");
                int actualPeople = rs.getInt("ACTUALPEOPLE");

                session = new Session(sessionID, date, time, room, maxPeople, actualPeople);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
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

        return session;
    }

}
