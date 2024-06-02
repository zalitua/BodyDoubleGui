/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author GVE Rouse
 */
public class EditSessionGUI extends javax.swing.JFrame {

    /**
     * Creates new form EditSessionGUI
     */
    
    SessionManager sm = new SessionManager();
    
    public EditSessionGUI() {
        initComponents();
        
        populateTable();
        populateRoomComboBox();
        populateSessionComboBox();
    }
    
    public void createSession(){
        
        String date = (String) dayJComboB.getSelectedItem() + "/" + monthJComboB.getSelectedItem() + "/2024";
        String time = (String) timeJComboB.getSelectedItem();
        String room = (String) roomJComboB.getSelectedItem();
        int maxP = Integer.parseInt((String) maxPartJComboB.getSelectedItem());
        String sessionID = sm.generateNextID();
        sm.session = new Session(sessionID, date, time, room, 0, maxP);
        sm.addEntry();
    }
    
    public void deleteSession(){
        String sessionID = (String) sessionComboBox.getSelectedItem();
        sm.deleteEntry(sessionID);
    }
    
    private void populateTable() {
        List<Session> session = sm.readAll();
        DefaultTableModel model = (DefaultTableModel) sessionTable.getModel();
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
    
    public void populateRoomComboBox() {
        RoomManager rm = new RoomManager();
        List<String> roomNames = rm.roomList("ROOMNAME");
        roomJComboB.removeAllItems(); //to prevent duplicates
        for (String name : roomNames) {
            roomJComboB.addItem(name);
        }
    }
    
    public void populateSessionComboBox() {
        List<String> sessionIDs = sm.getSessionIDs();
        sessionComboBox.removeAllItems(); //to prevent duplicates
        for (String id : sessionIDs) {
            sessionComboBox.addItem(id);
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

        welcomeEditJL = new javax.swing.JLabel();
        sessionJScrollP = new javax.swing.JScrollPane();
        sessionTable = new javax.swing.JTable();
        dateJL = new javax.swing.JLabel();
        dayJL = new javax.swing.JLabel();
        dayJComboB = new javax.swing.JComboBox<>();
        monthJL = new javax.swing.JLabel();
        monthJComboB = new javax.swing.JComboBox<>();
        timeJL = new javax.swing.JLabel();
        timeJComboB = new javax.swing.JComboBox<>();
        roomJL = new javax.swing.JLabel();
        roomJComboB = new javax.swing.JComboBox<>();
        maxPartJL = new javax.swing.JLabel();
        maxPartJComboB = new javax.swing.JComboBox<>();
        editIDJL = new javax.swing.JLabel();
        sessionComboBox = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        sessionIDJL1 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(780, 420));

        welcomeEditJL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        welcomeEditJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeEditJL.setText("Edit Session");

        sessionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Session ID", "Date", "Time", "Location", "Max People", "Current People"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sessionTable.setPreferredSize(new java.awt.Dimension(350, 80));
        sessionJScrollP.setViewportView(sessionTable);

        dateJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dateJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateJL.setText("Date:");

        dayJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dayJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayJL.setText("Day:");

        dayJComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dayJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        monthJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        monthJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthJL.setText("Month:");

        monthJComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        monthJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthJComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthJComboBActionPerformed(evt);
            }
        });

        timeJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        timeJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeJL.setText("Time:");

        timeJComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        timeJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7:00 am", "7:15 am", "7:30 am", "7:45 am", "8:00 am", "8:15 am", "8:30 am", "8:45 am", "9:00 am", "9:15 am", "9:30 am", "9:45 am", "10:00 am", "10:15 am", "10:30 am", "10:45 am", "11:00 am", "11:15 am", "11:30 am", "11:45 am", "12:00 pm", "12:15 pm", "12:30 pm", "12:45 pm", "1:00 pm", "1:15 pm", "1:30 pm", "1:45 pm", "2:00 pm", "2:15 pm", "2:30 pm", "2:45 pm", "3:00 pm", "3:15 pm", "3:30 pm", "3:45 pm", "4:00 pm", "4:15 pm", "4:30 pm", "4:45 pm", "5:00 pm", "5:15 pm", "5:30 pm", "5:45 pm", "6:00 pm", "6:15 pm", "6:30 pm", "6:45 pm", "7:00 pm", "7:15 pm", "7:30 pm", "7:45 pm", "8:00 pm", "8:15 pm", "8:30 pm", "8:45 pm", "9:00 pm", " " }));

        roomJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        roomJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roomJL.setText("Room:");

        roomJComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        roomJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WZ401", "WZ402", "WZ403", "WZ405" }));

        maxPartJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        maxPartJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxPartJL.setText("Max Partcipants:");

        maxPartJComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        maxPartJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));

        editIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        editIDJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editIDJL.setText("Choose session to edit or delete:");

        sessionComboBox.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sessionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SES001", "SES002", "SES003", "SES004" }));

        confirmButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        confirmButton.setText("Update");
        confirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        sessionIDJL1.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        sessionIDJL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sessionIDJL1.setText("Please enter the  the new session data:");

        deleteButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editIDJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(deleteButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(139, 139, 139)
                                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(dayJL)
                                                .addGap(26, 26, 26)
                                                .addComponent(dayJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(dateJL, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(monthJL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(monthJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(74, 74, 74)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(maxPartJL, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(maxPartJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(timeJL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(timeJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(roomJL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(roomJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(sessionIDJL1)))
                                .addGap(154, 154, 154))
                            .addComponent(sessionJScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(welcomeEditJL)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeEditJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(sessionJScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editIDJL)
                    .addComponent(sessionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sessionIDJL1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJL)
                    .addComponent(maxPartJL)
                    .addComponent(maxPartJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dayJL)
                        .addComponent(dayJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(timeJL)
                        .addComponent(timeJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(monthJL)
                        .addComponent(monthJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roomJL)
                        .addComponent(roomJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(confirmButton)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthJComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthJComboBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthJComboBActionPerformed

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        createSession();
        populateTable();
        populateSessionComboBox();
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        deleteSession();
        populateTable();
        populateSessionComboBox();
    }//GEN-LAST:event_deleteButtonMouseClicked

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
            java.util.logging.Logger.getLogger(EditSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSessionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel dateJL;
    private javax.swing.JComboBox<String> dayJComboB;
    private javax.swing.JLabel dayJL;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel editIDJL;
    private javax.swing.JComboBox<String> maxPartJComboB;
    private javax.swing.JLabel maxPartJL;
    private javax.swing.JComboBox<String> monthJComboB;
    private javax.swing.JLabel monthJL;
    private javax.swing.JComboBox<String> roomJComboB;
    private javax.swing.JLabel roomJL;
    private javax.swing.JComboBox<String> sessionComboBox;
    private javax.swing.JLabel sessionIDJL1;
    private javax.swing.JScrollPane sessionJScrollP;
    private javax.swing.JTable sessionTable;
    private javax.swing.JComboBox<String> timeJComboB;
    private javax.swing.JLabel timeJL;
    private javax.swing.JLabel welcomeEditJL;
    // End of variables declaration//GEN-END:variables
}