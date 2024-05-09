/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author GVE Rouse
 */
public class AdminCorner extends javax.swing.JFrame {

    /**
     * Creates new form AdminCorner
     */
    public AdminCorner() {
        initComponents();
    }
    
     public void registerSession() {
        Scanner scan = new Scanner(System.in);
        String path = "./nbproject/files/roombooking.txt";
        ReadFile rf = new ReadFile();
        String noOfPeople = "0";
        
        Sequencer seq = new Sequencer();
        String nextNumber = seq.getNextNumber(path);
        String sessonID = "SES" + nextNumber;
        
        ArrayList<Room> list = rf.readRoomFile("./nbproject/files/rooms.txt");
        for (Room room : list){
            System.out.print(room.getRoom() + " ");
        }
        System.out.println("");
        
        String room = "";
        while (room.isEmpty()) {
            System.out.println("Please enter the room you would like to create a session for ");
            room = scan.nextLine().trim();
            if(room.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (room.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        String date = "";
        while (date.isEmpty()) {
            System.out.println("Please enter the date you would like to create a session for ");
            date = scan.nextLine().trim();
           if(date.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (date.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        String time = "";
        while (time.isEmpty()) {
            System.out.println("Please enter the time you would like to create a session for ");
            time = scan.nextLine().trim();
            
            if(time.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (time.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }
        
        String maxNoOfPeople = "";
        while (maxNoOfPeople.isEmpty()) {
            System.out.println("What is the max number of people able to book this room?");
            maxNoOfPeople = scan.nextLine().trim();
            if(maxNoOfPeople.equalsIgnoreCase("x"))
            {
                System.exit(0);
            }
            if (maxNoOfPeople.isEmpty()) {
                System.out.println("That is invalid input");
            }
        }

        Session session = new Session(sessonID, date, time, room,
                noOfPeople, maxNoOfPeople);
        Session.writeRoomBooking(session);
    }

    public void displaySessions(ArrayList<Session> list) {
        for (Session session : list) {
            System.out.println(session.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sessionsJTextA = new javax.swing.JTextArea();
        instructjScrollPane = new javax.swing.JScrollPane();
        insturctjTextA = new javax.swing.JTextArea();
        southJPannel = new javax.swing.JPanel();
        dateJLabel = new javax.swing.JLabel();
        dayJlabel = new javax.swing.JLabel();
        timejLabel = new javax.swing.JLabel();
        monthjLabel = new javax.swing.JLabel();
        yearJlabel = new javax.swing.JLabel();
        chooseTimeJTextF = new javax.swing.JTextField();
        roomJTextF = new javax.swing.JTextField();
        maxPeopleJTextF = new javax.swing.JTextField();
        roomjLabel = new javax.swing.JLabel();
        peopleJLabel = new javax.swing.JLabel();
        dayJComboB = new javax.swing.JComboBox<>();
        monthJComboB = new javax.swing.JComboBox<>();
        yearJComboB = new javax.swing.JComboBox<>();
        timeJComboB = new javax.swing.JComboBox<>();
        roomJComboB = new javax.swing.JComboBox<>();
        peopleJComboB = new javax.swing.JComboBox<>();
        createButton = new javax.swing.JButton();
        sessionsJLabel = new javax.swing.JLabel();
        sessionIDJComboB = new javax.swing.JComboBox<>();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        mangeRoomsButton = new javax.swing.JButton();
        optionsjSeparator = new javax.swing.JSeparator();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeL.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        welcomeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeL.setText("Welcome to the Admin Corner");

        sessionsJTextA.setEditable(false);
        sessionsJTextA.setColumns(20);
        sessionsJTextA.setRows(5);
        sessionsJTextA.setText("Sessions will go here");
        jScrollPane1.setViewportView(sessionsJTextA);

        insturctjTextA.setEditable(false);
        insturctjTextA.setColumns(20);
        insturctjTextA.setRows(5);
        insturctjTextA.setText("instuctions will go here");
        instructjScrollPane.setViewportView(insturctjTextA);

        dateJLabel.setText("Date:");

        dayJlabel.setText("Day: ");

        timejLabel.setText("Time: ");

        monthjLabel.setText("Month:");

        yearJlabel.setText("Year: ");

        chooseTimeJTextF.setEditable(false);
        chooseTimeJTextF.setText("Choose a time");

        roomJTextF.setEditable(false);
        roomJTextF.setText("Choose a room");

        maxPeopleJTextF.setEditable(false);
        maxPeopleJTextF.setText("Max participants");

        roomjLabel.setText("Room:");

        peopleJLabel.setText("People:");

        dayJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        yearJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", " " }));

        timeJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 am", "7:15 am", "7:30 am", "7:45 am", "8:00 am", "8:15 am", "8:30 am", "8:45 am", "9:00 am", "9:15 am", "9:30 am", "9:45 am", "10:00 am", "10:15 am", "10:30 am", "10:45 am", "11:00 am", "11:15 am", "11:30 am", "11:45 am", "12:00 pm", "12:15 pm", "12:30 pm", "12:45 pm", "1:00 pm", "1:15 pm", "1:30 pm", "1:45 pm", "2:00 pm", "2:15 pm", "2:30 pm", "2:45 pm", "3:00 pm", "3:15 pm", "3:30 pm", "3:45 pm", "4:00 pm", "4:15 pm", "4:30 pm", "4:45 pm", "5:00 pm", "5:15 pm", "5:30 pm", "5:45 pm", "6:00 pm", "6:15 pm", "6:30 pm", "6:45 pm", "7:00 pm", "7:15 pm", "7:30 pm", "7:45 pm", "8:00 pm", "8:15 pm", "8:30 pm", "8:45 pm", "9:00 pm", " " }));

        roomJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WZ321", "WA301", "WS221", "WZ405" }));

        peopleJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));

        createButton.setText("Create Session");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        sessionsJLabel.setText("Session ID");

        sessionIDJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SES007", "SES008", "SES006" }));
        sessionIDJComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionIDJComboBActionPerformed(evt);
            }
        });

        editButton.setText("Edit Session");

        deleteButton.setText("Delete Session");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        mangeRoomsButton.setText("Manage Rooms");
        mangeRoomsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mangeRoomsButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh Sessions");
        refreshButton.setActionCommand("");

        javax.swing.GroupLayout southJPannelLayout = new javax.swing.GroupLayout(southJPannel);
        southJPannel.setLayout(southJPannelLayout);
        southJPannelLayout.setHorizontalGroup(
            southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southJPannelLayout.createSequentialGroup()
                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(southJPannelLayout.createSequentialGroup()
                            .addComponent(maxPeopleJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peopleJLabel))
                        .addGroup(southJPannelLayout.createSequentialGroup()
                            .addComponent(roomJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(timejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(roomjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(southJPannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(optionsjSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(southJPannelLayout.createSequentialGroup()
                        .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseTimeJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(southJPannelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dateJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sessionsJLabel))))
                        .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(southJPannelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(editButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mangeRoomsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(southJPannelLayout.createSequentialGroup()
                                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(southJPannelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dayJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(dayJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(monthJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, southJPannelLayout.createSequentialGroup()
                                        .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(southJPannelLayout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(roomJComboB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(southJPannelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(timeJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(85, 85, 85))
                                    .addGroup(southJPannelLayout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(peopleJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(southJPannelLayout.createSequentialGroup()
                                        .addComponent(yearJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yearJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(southJPannelLayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(southJPannelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        southJPannelLayout.setVerticalGroup(
            southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(southJPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionsJLabel)
                    .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(mangeRoomsButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(optionsjSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJLabel)
                    .addComponent(dayJlabel)
                    .addComponent(monthjLabel)
                    .addComponent(yearJlabel)
                    .addComponent(dayJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseTimeJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timejLabel)
                    .addComponent(timeJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomjLabel)
                    .addComponent(roomJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton))
                .addGap(18, 18, 18)
                .addGroup(southJPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxPeopleJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peopleJLabel)
                    .addComponent(peopleJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(createButton)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addComponent(instructjScrollPane)
            .addComponent(southJPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructjScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(southJPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void mangeRoomsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mangeRoomsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mangeRoomsButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
       String selectDay= (String) dayJComboB.getSelectedItem();
       String selectMonth = (String) monthJComboB.getSelectedItem();
       String selectYear =(String)yearJComboB.getSelectedItem();
       String selectTime =(String) timeJComboB.getSelectedItem();
       String noOfPeople ="0";
       String selectPeople= (String) peopleJComboB.getSelectedItem();
       
       String selectDate = selectDay+" "+selectYear+" "+selectYear;
        
        registerSession(); //calling method
    }//GEN-LAST:event_createButtonActionPerformed

    private void sessionIDJComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionIDJComboBActionPerformed
        // TODO add your handling code here:
        //action to delete a session
    }//GEN-LAST:event_sessionIDJComboBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCorner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chooseTimeJTextF;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel dateJLabel;
    private javax.swing.JComboBox<String> dayJComboB;
    private javax.swing.JLabel dayJlabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane instructjScrollPane;
    private javax.swing.JTextArea insturctjTextA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mangeRoomsButton;
    private javax.swing.JTextField maxPeopleJTextF;
    private javax.swing.JComboBox<String> monthJComboB;
    private javax.swing.JLabel monthjLabel;
    private javax.swing.JSeparator optionsjSeparator;
    private javax.swing.JComboBox<String> peopleJComboB;
    private javax.swing.JLabel peopleJLabel;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> roomJComboB;
    private javax.swing.JTextField roomJTextF;
    private javax.swing.JLabel roomjLabel;
    private javax.swing.JComboBox<String> sessionIDJComboB;
    private javax.swing.JLabel sessionsJLabel;
    private javax.swing.JTextArea sessionsJTextA;
    private javax.swing.JPanel southJPannel;
    private javax.swing.JComboBox<String> timeJComboB;
    private javax.swing.JLabel timejLabel;
    private javax.swing.JLabel welcomeL;
    private javax.swing.JComboBox<String> yearJComboB;
    private javax.swing.JLabel yearJlabel;
    // End of variables declaration//GEN-END:variables
}
