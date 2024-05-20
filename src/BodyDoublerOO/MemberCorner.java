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
public class MemberCorner extends javax.swing.JFrame {

    /**
     * Creates new form AdminCorner
     */
    public MemberCorner() {
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
        memberInstuctJL = new javax.swing.JLabel();
        sessionsJLabel = new javax.swing.JLabel();
        sessionIDJComboB = new javax.swing.JComboBox<>();
        joinButton = new javax.swing.JButton();
        adminSessionJScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sessionJTable = new javax.swing.JTable();
        leaveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeL.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        welcomeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeL.setText("Welcome to the Memer Corner");

        memberInstuctJL.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        memberInstuctJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberInstuctJL.setText("Select the session you want to join or leave and click the button\n");

        sessionsJLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sessionsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sessionsJLabel.setText("Session ID");

        sessionIDJComboB.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sessionIDJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SES007", "SES008", "SES006" }));
        sessionIDJComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionIDJComboBActionPerformed(evt);
            }
        });

        joinButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        joinButton.setText("Join Session");
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        sessionJTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sessionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Session ID", "Date", "Time", "Location", "Max people", "Current Number of People"
            }
        ));
        jScrollPane2.setViewportView(sessionJTable);

        adminSessionJScroll.setViewportView(jScrollPane2);

        leaveButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        leaveButton.setText("Leave Session");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminSessionJScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(memberInstuctJL, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(sessionsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(joinButton)
                        .addGap(20, 20, 20)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminSessionJScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(memberInstuctJL)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessionsJLabel))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joinButton)
                    .addComponent(leaveButton))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sessionIDJComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionIDJComboBActionPerformed
        // TODO add your handling code here:
        //action to delete a session
    }//GEN-LAST:event_sessionIDJComboBActionPerformed

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joinButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MemberCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberCorner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane adminSessionJScroll;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton joinButton;
    private javax.swing.JButton leaveButton;
    private javax.swing.JLabel memberInstuctJL;
    private javax.swing.JComboBox<String> sessionIDJComboB;
    private javax.swing.JTable sessionJTable;
    private javax.swing.JLabel sessionsJLabel;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables
}
