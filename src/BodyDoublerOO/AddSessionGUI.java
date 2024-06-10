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
public final class AddSessionGUI extends javax.swing.JFrame {

    /**
     * Creates new form EditSessionGUI
     */
    
    SessionManager sm = new SessionManager();
    
    public AddSessionGUI() {
        initComponents();
        
        populateTable();
        populateRoomComboBox();
    }
    
    void createSession(){
        
        String date = (String) dayJComboB.getSelectedItem() + "/" + monthJComboB.getSelectedItem() + "/2024";
        String time = (String) timeJComboB.getSelectedItem();
        String room = (String) roomJComboB.getSelectedItem();
        int maxP = Integer.parseInt((String) maxPartJComboB.getSelectedItem());
        String sessionID = sm.generateNextID();
        sm.session = new Session(sessionID, date, time, room, 0, maxP);
        sm.addEntry();
        JOptionPane.showConfirmDialog(this, "Session successfully created", "Session Created", JOptionPane.PLAIN_MESSAGE);
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
    
    private void populateRoomComboBox() {
        RoomManager rm = new RoomManager();
        List<String> roomNames = rm.IDList("ROOM", "ROOMNAME");
        roomJComboB.removeAllItems(); //to prevent duplicates
        for (String name : roomNames) {
            roomJComboB.addItem(name);
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
        monthJL = new javax.swing.JLabel();
        monthJComboB = new javax.swing.JComboBox<>();
        yearJL = new javax.swing.JLabel();
        yearComboB = new javax.swing.JComboBox<>();
        timeJL = new javax.swing.JLabel();
        timeJComboB = new javax.swing.JComboBox<>();
        roomJL = new javax.swing.JLabel();
        roomJComboB = new javax.swing.JComboBox<>();
        maxPartJL = new javax.swing.JLabel();
        maxPartJComboB = new javax.swing.JComboBox<>();
        confirmButton = new javax.swing.JButton();
        dayJComboB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        welcomeEditJL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        welcomeEditJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeEditJL.setText("Add Session");

        sessionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "0"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Time", "Location", "Max People", "Current People"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sessionJScrollP.setViewportView(sessionTable);

        dateJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dateJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateJL.setText("Date:");

        dayJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dayJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayJL.setText("Day:");

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

        yearJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        yearJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearJL.setText("Year:");

        yearComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        yearComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025" }));
        yearComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearComboBActionPerformed(evt);
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
        maxPartJL.setText("Max Partcipants");

        maxPartJComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        maxPartJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6" }));

        confirmButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        confirmButton.setText("Create Session");
        confirmButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });

        dayJComboB.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        dayJComboB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayJComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayJComboBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sessionJScrollP)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeEditJL, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(timeJL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dateJL, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(dayJL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(roomJL, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(maxPartJL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(maxPartJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dayJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(monthJL, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(monthJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(yearJL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(timeJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roomJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111)
                                        .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeEditJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sessionJScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJL)
                    .addComponent(dayJL)
                    .addComponent(monthJL)
                    .addComponent(monthJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearJL)
                    .addComponent(yearComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeJL)
                    .addComponent(timeJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roomJL)
                        .addComponent(roomJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(confirmButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxPartJL)
                    .addComponent(maxPartJComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthJComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthJComboBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthJComboBActionPerformed

    private void yearComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearComboBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearComboBActionPerformed


    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        createSession();
        populateTable();
        
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void dayJComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayJComboBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayJComboBActionPerformed


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
            java.util.logging.Logger.getLogger(AddSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSessionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddSessionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel dateJL;
    private javax.swing.JComboBox<String> dayJComboB;
    private javax.swing.JLabel dayJL;
    private javax.swing.JComboBox<String> maxPartJComboB;
    private javax.swing.JLabel maxPartJL;
    private javax.swing.JComboBox<String> monthJComboB;
    private javax.swing.JLabel monthJL;
    private javax.swing.JComboBox<String> roomJComboB;
    private javax.swing.JLabel roomJL;
    private javax.swing.JScrollPane sessionJScrollP;
    private javax.swing.JTable sessionTable;
    private javax.swing.JComboBox<String> timeJComboB;
    private javax.swing.JLabel timeJL;
    private javax.swing.JLabel welcomeEditJL;
    private javax.swing.JComboBox<String> yearComboB;
    private javax.swing.JLabel yearJL;
    // End of variables declaration//GEN-END:variables
}
