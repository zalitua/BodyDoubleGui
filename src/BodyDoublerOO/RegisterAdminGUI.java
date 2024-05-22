/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

/**
 *
 * @author GVE Rouse
 */
public class RegisterAdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegisterGUI
     */
    public RegisterAdminGUI() {
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


        createAccountJButton = new javax.swing.JButton();
        roleJL = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox<>();
        departmentJComboBox = new javax.swing.JComboBox<>();
        departmentJL = new javax.swing.JLabel();
        emailJL = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        pWJL = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        fNameJL = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lNameJL = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        welcomeAdminJL = new javax.swing.JLabel();
        adminInstructJL = new javax.swing.JLabel();
        yourEmailJL1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        recordInfoJL = new javax.swing.JLabel();
        doneButton = new javax.swing.JButton();
        yourPWJL = new javax.swing.JLabel();
        yourIDJL = new javax.swing.JLabel();
        newIDJL = new javax.swing.JLabel();
        newPWJL = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 420));


        createAccountJButton.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        createAccountJButton.setText("Create Account");
        createAccountJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountJButtonMouseClicked(evt);
            }
        });

        roleJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        roleJL.setText("Role:");

        roleJComboBox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Staff", "Other" }));

        departmentJComboBox.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        departmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty", "Estates", "AUTSA" }));
        departmentJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentJComboBoxActionPerformed(evt);
            }
        });

        departmentJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        departmentJL.setText("Department:");

        emailJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        emailJL.setText("Email address:");

        email.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        email.setText("exampleemail@autuni.ac.nz");

        pWJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        pWJL.setText("Please enter a password:");

        password.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N

        fNameJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        fNameJL.setText("First name:");

        firstName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        firstName.setText("First name");

        lNameJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lNameJL.setText("Last name:");

        lastName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lastName.setText("Last name");
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });


        welcomeAdminJL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        welcomeAdminJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeAdminJL.setText("Welcome to Admin Registration");

        adminInstructJL.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        adminInstructJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        adminInstructJL.setText("To create your admin account please fill in the boxes below:");

        yourEmailJL1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        recordInfoJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        recordInfoJL.setText("Please record your user ID and password.");

        doneButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        doneButton.setText("Done");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        yourPWJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        yourPWJL.setText("Your password is:");

        yourIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        yourIDJL.setText("Your user ID is:");

        newIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        newIDJL.setText("default");

        newPWJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        newPWJL.setText("default");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(recordInfoJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(doneButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(yourIDJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newIDJL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yourPWJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newPWJL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yourIDJL)
                    .addComponent(yourPWJL)
                    .addComponent(newIDJL)
                    .addComponent(newPWJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordInfoJL)
                    .addComponent(doneButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adminInstructJL, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(roleJL, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(departmentJL, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pWJL, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(password))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(108, 108, 108)
                                    .addComponent(departmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(emailJL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lNameJL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(fNameJL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(384, 384, 384)
                                .addComponent(yourEmailJL1)))
                        .addGap(126, 126, 126))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomeAdminJL, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(createAccountJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()

                .addComponent(welcomeAdminJL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminInstructJL)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameJL)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameJL)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleJL)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departmentJL)
                    .addComponent(departmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pWJL)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createAccountJButton)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(yourEmailJL1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void departmentJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentJComboBoxActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void createAccountJButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountJButtonMouseClicked
        // TODO add your handling code here:
        String firstNameIn = firstName.getText();
        String lastNameIn = lastName.getText();
        String emailIn = email.getText();
        String passwordIn = password.getText();
        String roleIn = (String) roleJComboBox.getSelectedItem();
        String departmentIn = (String) departmentJComboBox.getSelectedItem();
        AdminManager am = new AdminManager();
        String adminID = am.generateNextID();
        am.admin = new Admin(adminID, passwordIn, firstNameIn, lastNameIn, emailIn, roleIn, departmentIn);
        am.addEntry();
        
    }//GEN-LAST:event_createAccountJButtonMouseClicked

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doneButtonActionPerformed


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
            java.util.logging.Logger.getLogger(RegisterAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JLabel adminInstructJL;
    private javax.swing.JButton createAccountJButton;
    private javax.swing.JComboBox<String> departmentJComboBox;
    private javax.swing.JLabel departmentJL;
    private javax.swing.JButton doneButton;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailJL;
    private javax.swing.JLabel fNameJL;
    private javax.swing.JTextField firstName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lNameJL;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel newIDJL;
    private javax.swing.JLabel newPWJL;
    private javax.swing.JLabel pWJL;
    private javax.swing.JTextField password;
    private javax.swing.JLabel recordInfoJL;
    private javax.swing.JComboBox<String> roleJComboBox;
    private javax.swing.JLabel roleJL;
    private javax.swing.JLabel welcomeAdminJL;
    private javax.swing.JLabel yourEmailJL1;
    private javax.swing.JLabel yourIDJL;
    private javax.swing.JLabel yourPWJL;

    // End of variables declaration//GEN-END:variables
}
