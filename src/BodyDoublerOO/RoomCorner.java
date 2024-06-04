
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zalit
 */
public class RoomCorner extends javax.swing.JFrame {

    /**
     * Creates new form RoomCorner
     */
    RoomManager rm = new RoomManager();

    public RoomCorner() {
        initComponents();

        populateTable();
        populateRoomComboBox();
    }

    public void createRoom() {
        //RoomManager rm = new RoomManager();
        String roomName = roomTF.getText();

        if (roomName.isEmpty()) {
            errorLabel.setText("Please enter a valid room");
        } else {
            errorLabel.setText(" ");
            String roomID = rm.generateNextID();
            rm.room = new Room(roomID, roomName);
            rm.addEntry();

        }

    }

    public void deleteRoom() {
        //RoomManager rm = new RoomManager();
        String roomID = (String) roomComboBox.getSelectedItem();
        rm.deleteEntry("ROOM", "ROOMID", roomID);
    }

    private void populateTable() {
        List<Room> rooms = rm.readAll();
        DefaultTableModel model = (DefaultTableModel) roomsTable.getModel();
        model.setRowCount(0);

        if (rooms != null) {
            for (Room room : rooms) {
                model.addRow(new Object[]{
                    room.getRoomID(),
                    room.getRoomName()
                });
            }
        }
    }

    public void populateRoomComboBox() {
        List<String> roomIDs = rm.IDList("ROOM", "ROOMID");
        roomComboBox.removeAllItems(); //to prevent duplicates
        for (String id : roomIDs) {
            roomComboBox.addItem(id);
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

        roomLabel = new javax.swing.JLabel();
        welcomeLabel1 = new javax.swing.JLabel();
        roomTF = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        roomLabel1 = new javax.swing.JLabel();
        addButton1 = new javax.swing.JButton();
        roomComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsTable = new javax.swing.JTable();
        returnButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        returnLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(504, 406));

        roomLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        roomLabel.setText("Room name:");
        roomLabel.setToolTipText("");

        welcomeLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        welcomeLabel1.setText("Welcome to Room Corner");
        welcomeLabel1.setToolTipText("");

        roomTF.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        roomTF.setToolTipText("");

        addButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        roomLabel1.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        roomLabel1.setText("Choose room:");
        roomLabel1.setToolTipText("");

        addButton1.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        addButton1.setText("Delete");
        addButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButton1MouseClicked(evt);
            }
        });

        roomComboBox.setFont(new java.awt.Font("Georgia", 0, 16)); // NOI18N
        roomComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROM001", "ROM002" }));
        roomComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomComboBoxActionPerformed(evt);
            }
        });

        roomsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Room ID", "Room Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(roomsTable);

        returnButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        returnButton.setText("Return");
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        exitButton.setText("Exit App");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        returnLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        returnLabel.setText("Return to Admin Corner:");

        errorLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(exitButton)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(returnLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(returnButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(roomLabel)
                                    .addComponent(roomLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(roomTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(addButton))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(welcomeLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(87, 87, 87))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomLabel)
                    .addComponent(roomTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomLabel1)
                    .addComponent(addButton1)
                    .addComponent(roomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnLabel)
                    .addComponent(returnButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomComboBoxActionPerformed
        //action to delete a session
    }//GEN-LAST:event_roomComboBoxActionPerformed

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        createRoom();
        populateTable();
        populateRoomComboBox();
    }//GEN-LAST:event_addButtonMouseClicked

    private void addButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButton1MouseClicked
        deleteRoom();
        populateTable();
        populateRoomComboBox();
    }//GEN-LAST:event_addButton1MouseClicked

    private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
        dispose();
    }//GEN-LAST:event_returnButtonMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitButtonMouseClicked

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
            java.util.logging.Logger.getLogger(RoomCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomCorner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomCorner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton addButton1;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JComboBox<String> roomComboBox;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JLabel roomLabel1;
    private javax.swing.JTextField roomTF;
    private javax.swing.JTable roomsTable;
    private javax.swing.JLabel welcomeLabel1;
    // End of variables declaration//GEN-END:variables
}
