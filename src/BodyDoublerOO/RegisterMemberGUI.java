/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

import javax.swing.JOptionPane;

/**
 *
 * @author GVE Rouse
 */
public class RegisterMemberGUI extends javax.swing.JFrame {

    /**
     * Creates new form RegisterUserGUI
     */
    public RegisterMemberGUI() {
        initComponents();
        passwordPanel.setVisible(false);
        homeButton.setToolTipText("Return to Main Page");
        exitButton.setToolTipText("Quit Program");
        createMemberButton.setToolTipText("Create a new account");
    }

    public void createMember() {
        
        MemberManager mm = new MemberManager();
        boolean isValidInt = true;
        boolean allGood = false;

        String firstNameIn = firstName.getText();
        String lastNameIn = lastName.getText();
        String emailIn = email.getText();
        String passwordIn = new String(password.getPassword());
        String ageIn = age.getText();
        String studentIDIn = studentID.getText();
        String degreeProgramIn = (String) degreeJComboBox.getSelectedItem();
        int intAge = 0;
        int intStudentID = 0;

        if (!mm.checkInput(firstNameIn) || !mm.checkInput(lastNameIn) || !mm.checkInput(emailIn)
                || !mm.checkInput(passwordIn) || !mm.checkInput(ageIn) || !mm.checkInput(studentIDIn)
                || !mm.checkInput(passwordIn)) {
            //errorLabel.setText("Please fill out all fields. If not applicable please enter 'n/a'.");
            JOptionPane.showMessageDialog(this, "Please fill out all fields. If not applicable please enter 'n/a'.", "Invalid Entry", JOptionPane.PLAIN_MESSAGE);
        }

        try {
            intAge = Integer.parseInt(ageIn);
            intStudentID = Integer.parseInt(studentIDIn);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a vaild number.", "Invalid Number Entry", JOptionPane.PLAIN_MESSAGE);
            isValidInt = false;
        }
        
        if (!mm.checkLength(passwordIn)){
            JOptionPane.showMessageDialog(this, "Please enter an 8 character password.", "Invalid Password Entry", JOptionPane.PLAIN_MESSAGE);
        }

        if (mm.checkInput(firstNameIn) && mm.checkInput(lastNameIn) && mm.checkInput(emailIn)
                && mm.checkInput(passwordIn) && mm.checkInput(ageIn) && mm.checkInput(studentIDIn)
                && mm.checkInput(passwordIn) && mm.checkLength(passwordIn) && isValidInt) {
            allGood = true;
        }

        if (allGood) {
            String memberID = mm.generateNextID();
            mm.member = new Member(memberID, passwordIn, firstNameIn, lastNameIn, emailIn, intAge, intStudentID, degreeProgramIn);
            mm.addEntry();
            newIDJL.setText(memberID);
            newPW.setText(passwordIn);
            passwordPanel.setVisible(true);
        }
    }

    public void showPasswordPanel() {
        passwordPanel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructJL = new javax.swing.JLabel();
        firstNameJL = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lNameJL = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        memberEmailJL = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        enterPWJL = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        askAgeJL = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        studentIDJL = new javax.swing.JLabel();
        degreeJL = new javax.swing.JLabel();
        degreeJComboBox = new javax.swing.JComboBox<>();
        createMemberButton = new javax.swing.JButton();
        memberRegWelcomJL = new javax.swing.JLabel();
        studentID = new javax.swing.JTextField();
        passwordPanel = new javax.swing.JPanel();
        recordInfoJL = new javax.swing.JLabel();
        yourPWJL = new javax.swing.JLabel();
        yourIDJL = new javax.swing.JLabel();
        newIDJL = new javax.swing.JLabel();
        newPWJL = new javax.swing.JLabel();
        departmentJL1 = new javax.swing.JLabel();
        roleJL1 = new javax.swing.JLabel();
        roleJComboBox1 = new javax.swing.JComboBox<>();
        departmentJComboBox1 = new javax.swing.JComboBox<>();
        createAccountJButton1 = new javax.swing.JButton();
        newPW = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        instructJL.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        instructJL.setText("To create your account please fill in the follwoing infomation:");

        firstNameJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        firstNameJL.setText("First name:");

        firstName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        lNameJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lNameJL.setText("Last name: ");

        lastName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        memberEmailJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        memberEmailJL.setText("Email address: ");

        email.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        enterPWJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        enterPWJL.setText("Please enter a password:");

        password.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        askAgeJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        askAgeJL.setText("Age:");

        age.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        studentIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        studentIDJL.setText("Student ID number:");

        degreeJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        degreeJL.setText("Please select your degree program:");

        degreeJComboBox.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        degreeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCIS", "BFA", "BBIM", "BCA", "BA", "Other", " " }));

        createMemberButton.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        createMemberButton.setText("Create Account ");
        createMemberButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createMemberButtonMouseClicked(evt);
            }
        });

        memberRegWelcomJL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        memberRegWelcomJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberRegWelcomJL.setText("Welcome to the Member Registration");

        studentID.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        recordInfoJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        recordInfoJL.setText("Please record your user ID and password.");

        yourPWJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        yourPWJL.setText("Your password is:");

        yourIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        yourIDJL.setText("Your user ID is:");

        newIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        newIDJL.setText("default");

        newPWJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        departmentJL1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        departmentJL1.setText("Department:");

        roleJL1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        roleJL1.setText("Role:");

        roleJComboBox1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        roleJComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Staff", "Other" }));

        departmentJComboBox1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        departmentJComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty", "Estates", "AUTSA" }));

        createAccountJButton1.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        createAccountJButton1.setText("Create Account");

        newPW.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        newPW.setText("default");

        javax.swing.GroupLayout passwordPanelLayout = new javax.swing.GroupLayout(passwordPanel);
        passwordPanel.setLayout(passwordPanelLayout);
        passwordPanelLayout.setHorizontalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(recordInfoJL)
                    .addGroup(passwordPanelLayout.createSequentialGroup()
                        .addComponent(yourIDJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newIDJL, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yourPWJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newPW)
                        .addGap(28, 28, 28)
                        .addComponent(newPWJL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passwordPanelLayout.setVerticalGroup(
            passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(passwordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourIDJL)
                    .addComponent(yourPWJL)
                    .addComponent(newIDJL)
                    .addComponent(newPWJL)
                    .addComponent(newPW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recordInfoJL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exitButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        exitButton.setText("Exit App");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        homeButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        homeButton.setText("Home Page");
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
        });
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(memberRegWelcomJL, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNameJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lNameJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(askAgeJL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(studentIDJL, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memberEmailJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(createMemberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(degreeJL, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(degreeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(enterPWJL, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(password)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(instructJL, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(homeButton)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memberRegWelcomJL)
                .addGap(18, 18, 18)
                .addComponent(instructJL)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameJL)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberEmailJL)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(askAgeJL)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentIDJL)
                    .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degreeJL)
                    .addComponent(degreeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterPWJL)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createMemberButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)

                    .addComponent(homeButton))
                .addContainerGap(106, Short.MAX_VALUE))

        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void createMemberButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createMemberButtonMouseClicked
        createMember();

    }//GEN-LAST:event_createMemberButtonMouseClicked

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_homeButtonMouseClicked

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterMemberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterMemberGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JLabel askAgeJL;
    private javax.swing.JButton createAccountJButton1;
    private javax.swing.JButton createMemberButton;
    private javax.swing.JComboBox<String> degreeJComboBox;
    private javax.swing.JLabel degreeJL;
    private javax.swing.JComboBox<String> departmentJComboBox1;
    private javax.swing.JLabel departmentJL1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel enterPWJL;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel firstNameJL;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel instructJL;
    private javax.swing.JLabel lNameJL;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel memberEmailJL;
    private javax.swing.JLabel memberRegWelcomJL;
    private javax.swing.JLabel newIDJL;
    private javax.swing.JLabel newPW;
    private javax.swing.JLabel newPWJL;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel passwordPanel;
    private javax.swing.JLabel recordInfoJL;
    private javax.swing.JComboBox<String> roleJComboBox1;
    private javax.swing.JLabel roleJL1;
    private javax.swing.JTextField studentID;
    private javax.swing.JLabel studentIDJL;
    private javax.swing.JLabel yourIDJL;
    private javax.swing.JLabel yourPWJL;
    // End of variables declaration//GEN-END:variables
}
