/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GVE Rouse
 */
public class MemberCorner extends javax.swing.JFrame {

    /**
     * Creates new form AdminCorner
     */
    SessionManager sM = new SessionManager();

    public MemberCorner() {
        initComponents();
        populateTable();
        populateSessionComboBox();
        //joinSession();
    }

    //gets all the Session objects from the SESSION table in the database 
    //and display them in a JTable in the GUI
    private void populateTable() {
        List<Session> session = sM.readAll();
        DefaultTableModel model = (DefaultTableModel) sessionJTable.getModel();
        model.setRowCount(0);

        if (session != null) {
            for (Session sessions : session) {
                model.addRow(new Object[]{
                    sessions.getSessionID(),
                    sessions.getDateOfSession(),
                    sessions.getTimeOfSession(),
                    sessions.getLocationOfSession(),
                    sessions.getNoOfPeople(),
                    sessions.getMaxNoOfPeople()
                });
            }
        }
    }

    //gets a list of session IDs from the SESSION table and uses the elements of that 
    //list as the elements of the combo box
    private void populateSessionComboBox() {
        List<String> sessionIDs = sM.IDList("SESSION", "SESSIONID");
        sessionIDJComboB.removeAllItems(); //to prevent duplicates
        for (String id : sessionIDs) {
            sessionIDJComboB.addItem(id);
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
        returnLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        exitButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(802, 380));

        welcomeL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        welcomeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeL.setText("Welcome to the Member Corner");

        memberInstuctJL.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        memberInstuctJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberInstuctJL.setText("Select the session you want to join or leave and click the button\n");

        sessionsJLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        sessionsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sessionsJLabel.setText("Session ID:");

        sessionIDJComboB.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        sessionIDJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SES007", "SES008", "SES006" }));
        sessionIDJComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionIDJComboBActionPerformed(evt);
            }
        });

        joinButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
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
                "Session ID", "Date", "Time", "Location", "Current Number of People", "Max People"
            }
        ));
        jScrollPane2.setViewportView(sessionJTable);

        adminSessionJScroll.setViewportView(jScrollPane2);

        leaveButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        leaveButton.setText("Leave Session");
        leaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveButtonActionPerformed(evt);
            }
        });

        returnLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        returnLabel.setText("Return to Main Page:");

        returnButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        returnButton.setText("Return");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });

        exitButton1.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        exitButton1.setText("Exit App");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(memberInstuctJL, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(returnLabel)
                        .addGap(18, 18, 18)
                        .addComponent(returnButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminSessionJScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(welcomeL))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(sessionsJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(joinButton)
                        .addGap(18, 18, 18)
                        .addComponent(leaveButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeL)
                .addGap(37, 37, 37)
                .addComponent(adminSessionJScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(memberInstuctJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessionsJLabel)
                    .addComponent(joinButton)
                    .addComponent(leaveButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnButton)
                    .addComponent(returnLabel)
                    .addComponent(exitButton1))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sessionIDJComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionIDJComboBActionPerformed
        // TODO add your handling code here:
        //action to delete a session
    }//GEN-LAST:event_sessionIDJComboBActionPerformed

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        // TODO add your handling code here:
        joinSession();
        populateTable();
    }//GEN-LAST:event_joinButtonActionPerformed

    private void leaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveButtonActionPerformed
        leaveSession();
        populateTable();
    }//GEN-LAST:event_leaveButtonActionPerformed

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        dispose();
    }//GEN-LAST:event_returnButtonMouseClicked

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
    private javax.swing.JButton exitButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton joinButton;
    private javax.swing.JButton leaveButton;
    private javax.swing.JLabel memberInstuctJL;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JComboBox<String> sessionIDJComboB;
    private javax.swing.JTable sessionJTable;
    private javax.swing.JLabel sessionsJLabel;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables

    //join a Session and increment the number people in the Session if the max number of 
    //people has not been reached. edit the entry in SESSION table
    private void joinSession() {
        String selectedSessionID = (String) sessionIDJComboB.getSelectedItem(); // Get selected session ID
        if (selectedSessionID != null) { // Check if a session is selected
            Session session = sM.getSession(selectedSessionID);
            if (session.getMaxNoOfPeople() > session.getNoOfPeople()) {
                String updateSessionDB = "UPDATE SESSION SET ACTUALPEOPLE = ACTUALPEOPLE + 1 WHERE SESSIONID = '" + selectedSessionID + "'";
                System.out.println("Executing query: " + updateSessionDB); // Debug print
                sM.updateDB(updateSessionDB);
                JOptionPane.showMessageDialog(this, "You've joined the session!", "Joined Session", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "This session is fully booked, please try another one", "Fully Booked", JOptionPane.ERROR_MESSAGE);
            }

        }

    }
    
    //decrease by one the number of people in a Session if there is more than one person in the Session
    //and update the SESSION table
    private void leaveSession() {
        String selectedSessionID = (String) sessionIDJComboB.getSelectedItem(); // Get selected session ID
        if (selectedSessionID != null) { // Check if a session is selected
            Session session = sM.getSession(selectedSessionID);// grab session details
            if (session.getNoOfPeople() > 0) {
                String updateSessionDB = "UPDATE SESSION SET ACTUALPEOPLE = ACTUALPEOPLE - 1 WHERE SESSIONID = '" + selectedSessionID + "'";
                System.out.println("Executing query: " + updateSessionDB); // Debug print
                sM.updateDB(updateSessionDB);
                JOptionPane.showMessageDialog(this, "You have been withdrawn from the session", "Successfully Left Session", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "This session is already empty", "Session Empty", JOptionPane.WARNING_MESSAGE);
            }

        }

    }
}
