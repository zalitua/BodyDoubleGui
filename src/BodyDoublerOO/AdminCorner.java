/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GVE Rouse
 */
public class AdminCorner extends javax.swing.JFrame {

    /**
     * Creates new form AdminCorner
     */
    SessionManager sM = new SessionManager();

    public AdminCorner() {
        initComponents();

        populateTable();
        populateSessionComboBox();
    }

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

    public void populateSessionComboBox() {
        List<String> sessionIDs = sM.getSessionIDs();
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
        editDeleteInstructJLabel = new javax.swing.JLabel();
        sessionsJLabel = new javax.swing.JLabel();
        sessionIDJComboB = new javax.swing.JComboBox<>();
        editSessionButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        adminSessionJScroll = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        sessionJTable = new javax.swing.JTable();
        addRoomButton = new javax.swing.JButton();
        deleteRoomButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 440));

        welcomeL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        welcomeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeL.setText("Welcome to the Admin Corner");

        editDeleteInstructJLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        editDeleteInstructJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editDeleteInstructJLabel.setText("To delete or edit a session, pick the session ID and then click the buttion you want to apply");

        sessionsJLabel.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sessionsJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sessionsJLabel.setText("Session ID");

        sessionIDJComboB.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sessionIDJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SES007", "SES008", "SES006" }));
        sessionIDJComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sessionIDJComboBActionPerformed(evt);
            }
        });

        editSessionButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        editSessionButton.setText("Edit Session");
        editSessionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSessionButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        deleteButton.setText("Delete Session");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        sessionJTable.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sessionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Session ID", "Date", "Time", "Location", "People", "Max People"
            }
        ));
        jScrollPane2.setViewportView(sessionJTable);

        adminSessionJScroll.setViewportView(jScrollPane2);

        addRoomButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addRoomButton.setText("Add Room");

        deleteRoomButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        deleteRoomButton.setText("Delete Room");
        deleteRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRoomButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addButton.setText("Add Session");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adminSessionJScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sessionsJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(280, 280, 280))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editDeleteInstructJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(editSessionButton)
                        .addGap(42, 42, 42)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(addRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(deleteRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeL, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adminSessionJScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editDeleteInstructJLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sessionIDJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessionsJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editSessionButton)
                    .addComponent(deleteButton)
                    .addComponent(addButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRoomButton)
                    .addComponent(deleteRoomButton))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String sessionID = (String) sessionIDJComboB.getSelectedItem();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void sessionIDJComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sessionIDJComboBActionPerformed
        //action to delete a session

    }//GEN-LAST:event_sessionIDJComboBActionPerformed

    private void editSessionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSessionButtonActionPerformed
        // open to EditSessionGUI
        EditSessionGUI edit = new EditSessionGUI();
        edit.setVisible(true);
    }//GEN-LAST:event_editSessionButtonActionPerformed

    private void deleteRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRoomButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteRoomButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // open to AddEsssionGUI
        AddSessionGUI add = new AddSessionGUI();
        add.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

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
    private javax.swing.JButton addButton;
    private javax.swing.JButton addRoomButton;
    private javax.swing.JScrollPane adminSessionJScroll;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteRoomButton;
    private javax.swing.JLabel editDeleteInstructJLabel;
    private javax.swing.JButton editSessionButton;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> sessionIDJComboB;
    private javax.swing.JTable sessionJTable;
    private javax.swing.JLabel sessionsJLabel;
    private javax.swing.JLabel welcomeL;
    // End of variables declaration//GEN-END:variables
}
