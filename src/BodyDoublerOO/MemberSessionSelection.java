/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

/**
 *
 * @author GVE Rouse
 */
public class MemberSessionSelection extends javax.swing.JFrame {

    /**
     * Creates new form MemberSessionSelection
     */
    public MemberSessionSelection() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeMemberJL = new javax.swing.JLabel();
        sessionsJScrollP = new javax.swing.JScrollPane();
        sessionsJTextArea = new javax.swing.JTextArea();
        mainPannel = new javax.swing.JPanel();
        sessionIDJL = new javax.swing.JLabel();
        sessionIDJComboBox = new javax.swing.JComboBox<>();
        joinSessionJButton = new javax.swing.JButton();
        leaveSessionJButton = new javax.swing.JButton();
        memberInstructionJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeMemberJL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        welcomeMemberJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeMemberJL.setText("Welcome to the Member's area");

        sessionsJTextArea.setColumns(20);
        sessionsJTextArea.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sessionsJTextArea.setRows(5);
        sessionsJTextArea.setText("Session will go here");
        sessionsJScrollP.setViewportView(sessionsJTextArea);

        sessionIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sessionIDJL.setText("Session ID: ");

        sessionIDJComboBox.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        sessionIDJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SES001", "SES002", "SES003" }));

        joinSessionJButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        joinSessionJButton.setText("Join Session");

        leaveSessionJButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        leaveSessionJButton.setText("Leave session");
        leaveSessionJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaveSessionJButtonActionPerformed(evt);
            }
        });

        memberInstructionJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        memberInstructionJL.setText("Start by selecting the session ID of the session you would like to choose.\nIf you would like to join that session, click the 'join session' button\nIf you would like to withdraw from that session, click the 'Leave session' button.");
        memberInstructionJL.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        memberInstructionJL.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout mainPannelLayout = new javax.swing.GroupLayout(mainPannel);
        mainPannel.setLayout(mainPannelLayout);
        mainPannelLayout.setHorizontalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPannelLayout.createSequentialGroup()
                        .addComponent(sessionIDJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sessionIDJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(joinSessionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(leaveSessionJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPannelLayout.createSequentialGroup()
                        .addComponent(memberInstructionJL, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        mainPannelLayout.setVerticalGroup(
            mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memberInstructionJL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(mainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leaveSessionJButton)
                    .addComponent(joinSessionJButton)
                    .addComponent(sessionIDJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sessionIDJL))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeMemberJL, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sessionsJScrollP)
            .addComponent(mainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomeMemberJL)
                .addGap(18, 18, 18)
                .addComponent(sessionsJScrollP, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void leaveSessionJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaveSessionJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaveSessionJButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MemberSessionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberSessionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberSessionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberSessionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberSessionSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton joinSessionJButton;
    private javax.swing.JButton leaveSessionJButton;
    private javax.swing.JPanel mainPannel;
    private javax.swing.JLabel memberInstructionJL;
    private javax.swing.JComboBox<String> sessionIDJComboBox;
    private javax.swing.JLabel sessionIDJL;
    private javax.swing.JScrollPane sessionsJScrollP;
    private javax.swing.JTextArea sessionsJTextArea;
    private javax.swing.JLabel welcomeMemberJL;
    // End of variables declaration//GEN-END:variables
}
