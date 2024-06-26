/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BodyDoublerOO;

/**defines and creates an Session object
 *
 * @author GVE Rouse
 */
public class Session {

    private String dateOfSession;
    private String timeOfSession;
    private String locationOfSession;
    private String sessionID;
    private int noOfPeople;
    private int maxNoOfPeople;
    
    public Session(String sessionID, String dateOfSession, String timeOfSession, String locationOfSession, int noOfPeople, int maxNoOfPeople) {
        
        this.sessionID = sessionID;
        this.dateOfSession = dateOfSession;
        this.timeOfSession = timeOfSession;
        this.locationOfSession = locationOfSession;
        this.noOfPeople = noOfPeople;
        this.maxNoOfPeople = maxNoOfPeople;
    }

    public String getDateOfSession() {
        return dateOfSession;
    }

    public void setDateOfSession(String dateOfSession) {
        this.dateOfSession = dateOfSession;
    }

    public String getTimeOfSession() {
        return timeOfSession;
    }

    public void setTimeOfSession(String timeOfSession) {
        this.timeOfSession = timeOfSession;
    }

    public String getLocationOfSession() {
        return locationOfSession;
    }

    public void setLocationOfSession(String locationOfSession) {
        this.locationOfSession = locationOfSession;
    }

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String sessionID) {
        this.sessionID = sessionID;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public int getMaxNoOfPeople() {
        return maxNoOfPeople;
    }

    public void setMaxNoOfPeople(int maxNoOfPeople) {
        this.maxNoOfPeople = maxNoOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }
}

