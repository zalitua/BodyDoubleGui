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
public class SessionManager {
    
    private final DBManager dbManager;
    public Session session;

    public SessionManager() {
        this.session = new Session("", "", "", "", "", "");
        this.dbManager = new DBManager();
    }
    
    public void addEntry() {

        String entry = "INSERT INTO SESSION VALUES ('" + session.getSessionID() + "' ,'"
                + session.getDateOfSession() + "' ,'" + session.getTimeOfSession() + "' ,'"
                + session.getLocationOfSession() + "' ,'" + session.getMaxNoOfPeople()
                + "' ,'" + session.getNoOfPeople() + "')";
        this.dbManager.updateDB(entry);
        System.out.println("Entry made!");
    }

    public List<Session> readAll() {

        List<Session> sessions = new ArrayList<>();
        ResultSet rs = this.dbManager.queryDB("SELECT * FROM SESSION");
        try {
            while (rs.next()) {
                String sessionID = rs.getString("SESSIONID");
                String date = rs.getString("DATE");
                String time = rs.getString("TIME");
                String room = rs.getString("ROOM");
                String maxPeople = rs.getString("MAXPEOPLE");
                String actualPeople = rs.getString("ACTUALPEOPLE");
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
    
    public String generateNextID(){
        Sequencer seq = new Sequencer();
        String num = seq.generateNextNumber("SESSION", "SESSIONID");
        return "SES" + num;
    }

}
