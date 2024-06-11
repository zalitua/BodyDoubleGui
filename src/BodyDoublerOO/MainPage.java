/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

import javax.swing.JOptionPane;

/**
 *
 * @author zalit
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        exitButton.setToolTipText("Exit the program");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void logIn(){
        PasswordManager pm = new PasswordManager();
        String IDIn = IDTextField.getText();
        String pwdIn = PwdTextField.getText();
        
        if (!pm.checkInput(IDIn) || !pm.checkInput(pwdIn)){
            JOptionPane.showMessageDialog(this, "All fields must be filled in", "Invalid Entry", JOptionPane.PLAIN_MESSAGE);
        }
        System.out.println(IDIn + " "+ pwdIn + " " + IDIn.substring(0, 3));
        if (pm.validatePassword(IDIn, pwdIn)){
            if (IDIn.substring(0, 3).equalsIgnoreCase("adm")){
                new AdminCorner().setVisible(true);
            }
            if (IDIn.substring(0, 3).equalsIgnoreCase("mem")){
                new MemberCorner().setVisible(true);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid user ID or password. Please try again.", "Invalid Entry", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userButtonGroup = new javax.swing.ButtonGroup();
        welcomeLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainTextArea = new javax.swing.JTextArea();
        LogInLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        PwdLabel = new javax.swing.JLabel();
        IDTextField = new javax.swing.JTextField();
        PwdTextField = new javax.swing.JTextField();
        registerLabel = new javax.swing.JLabel();
        LogInButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        selectLabel = new javax.swing.JLabel();
        adminRadioButton = new javax.swing.JRadioButton();
        memberRadioButton = new javax.swing.JRadioButton();

        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Connection Maker");
        setBackground(new java.awt.Color(153, 255, 204));
        setFocusCycleRoot(false);
        setPreferredSize(new java.awt.Dimension(640, 450));

        welcomeLabel.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        welcomeLabel.setText("Welcome to Connection Maker!");

        mainTextArea.setEditable(false);
        mainTextArea.setColumns(20);
        mainTextArea.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        mainTextArea.setLineWrap(true);
        mainTextArea.setRows(3);
        mainTextArea.setText("The purpose of Connection Maker is to help people connect that are interested in body doubling. Body doubling is often popular with neurodivergent people and involves two or more people getting together to study. It can help with motivation and maintaining focus.");
        mainTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(mainTextArea);

        LogInLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        LogInLabel.setText("Returning users, please log in:");

        IDLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        IDLabel.setText("User ID:");

        PwdLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        PwdLabel.setText("Password:");

        IDTextField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        IDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTextFieldActionPerformed(evt);
            }
        });

        PwdTextField.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        registerLabel.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        registerLabel.setText("If you are a new user please register:");

        LogInButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        LogInButton.setText("Log in");
        LogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInButtonMouseClicked(evt);
            }
        });
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        registerButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        registerButton.setText("Register");
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonMouseClicked(evt);
            }
        });

        selectLabel.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        selectLabel.setText("Please select:");

        userButtonGroup.add(adminRadioButton);
        adminRadioButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        adminRadioButton.setText("Administrator");

        userButtonGroup.add(memberRadioButton);
        memberRadioButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        memberRadioButton.setText("Member");

        exitButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        exitButton.setText("Exit App");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        exitButton.setText("Exit App");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adminRadioButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memberRadioButton)
                                .addGap(79, 79, 79)
                                .addComponent(registerButton))
                            .addComponent(selectLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)

                                .addComponent(welcomeLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(registerLabel)))

                        .addGap(0, 141, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(idErrorL, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(registerLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(exitButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(PwdLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(LogInButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PwdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(LogInLabel)
                        .addGap(35, 35, 35)))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()

                        .addComponent(adminRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(memberRadioButton))
                    .addComponent(registerButton))
                .addGap(14, 14, 14)
                .addComponent(exitButton)
                .addContainerGap(71, Short.MAX_VALUE))

        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTextFieldActionPerformed

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void registerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMouseClicked
        // TODO add your handling code here:
        if (adminRadioButton.isSelected() == true){
            new RegisterAdminGUI().setVisible(true);
        }
        else if (memberRadioButton.isSelected() == true){
            new RegisterMemberGUI().setVisible(true);
        }
        
        
//        this.setVisible(true);
//        new RegisterAdminGUI().setVisible(true);
    }//GEN-LAST:event_registerButtonMouseClicked

    private void LogInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInButtonMouseClicked
        logIn();
    }//GEN-LAST:event_LogInButtonMouseClicked


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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JButton LogInButton;
    private javax.swing.JLabel LogInLabel;
    private javax.swing.JLabel PwdLabel;
    private javax.swing.JTextField PwdTextField;
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.JButton exitButton;

    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mainTextArea;
    private javax.swing.JRadioButton memberRadioButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registerLabel;
    private javax.swing.JLabel selectLabel;
    private javax.swing.ButtonGroup userButtonGroup;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
