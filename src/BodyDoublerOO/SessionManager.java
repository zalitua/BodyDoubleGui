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
public class SessionManager extends TableManager implements Table{

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
        updateDB(entry);
    }

    public List<Session> readAll() {

        List<Session> sessions = new ArrayList<>();
        ResultSet rs = queryDB("SELECT * FROM SESSION");
        try {
            while (rs.next()) {
                String sessionID = rs.getString("SESSIONID");
                String date = rs.getString("DATE");
                String time = rs.getString("TIME");
                String room = rs.getString("ROOM");
                int maxPeople = rs.getInt("MAXPEOPLE");
                int actualPeople = rs.getInt("ACTUALPEOPLE");
                Session session1 = new Session(sessionID, date, time, room, actualPeople, maxPeople);
                sessions.add(session1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            closeResources(null, rs);
        }
        return sessions;
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
                session = new Session(sessionID, date, time, room, actualPeople, maxPeople);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SessionManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeResources(null, rs);
        }
        return session;
    }
}
