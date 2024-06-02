/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BodyDoublerOO;

/**
 *
 * @author GVE Rouse
 */
public class MemberRegisterGUI extends javax.swing.JFrame {

    /**
     * Creates new form MemberRegisterGUI
     */
    public MemberRegisterGUI() {
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

        mainJP = new javax.swing.JPanel();
        memberWelcomeJL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fNameJL = new javax.swing.JLabel();
        fNameJTextF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lNameJTextF = new javax.swing.JTextField();
        emailJL = new javax.swing.JLabel();
        emailJTextF = new javax.swing.JTextField();
        passWJL = new javax.swing.JLabel();
        userPWJTextF = new javax.swing.JTextField();
        ageJL = new javax.swing.JLabel();
        userAgeJTextF = new javax.swing.JTextField();
        sudentIDJL = new javax.swing.JLabel();
        studentIDJTextF = new javax.swing.JTextField();
        degreeJL = new javax.swing.JLabel();
        degreeJComboBox = new javax.swing.JComboBox<>();
        creatMemberJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        memberWelcomeJL.setFont(new java.awt.Font("Georgia", 1, 22)); // NOI18N
        memberWelcomeJL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        memberWelcomeJL.setText("Welcome to Member Registration");

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("To create your account, please answer the questions below");

        fNameJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        fNameJL.setText("First name:");

        fNameJTextF.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        fNameJTextF.setText("first name");
        fNameJTextF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameJTextFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Last name:");

        lNameJTextF.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        lNameJTextF.setText("last name");
        lNameJTextF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameJTextFActionPerformed(evt);
            }
        });

        emailJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        emailJL.setText("Email:");

        emailJTextF.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        emailJTextF.setText("emailexample@autuni.ac.nz");

        passWJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        passWJL.setText("Create a password:");

        userPWJTextF.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        ageJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ageJL.setText("Age:");

        userAgeJTextF.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        sudentIDJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        sudentIDJL.setText("Student ID:");

        studentIDJTextF.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N

        degreeJL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        degreeJL.setText("Please select your degree program:");

        degreeJComboBox.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        degreeJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCIS", "BFA", "BBIM", "BA", "BCA", "Other" }));

        creatMemberJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        creatMemberJButton.setText("Create Account");

        javax.swing.GroupLayout mainJPLayout = new javax.swing.GroupLayout(mainJP);
        mainJP.setLayout(mainJPLayout);
        mainJPLayout.setHorizontalGroup(
            mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(memberWelcomeJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainJPLayout.createSequentialGroup()
                        .addComponent(degreeJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainJPLayout.createSequentialGroup()
                        .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(degreeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainJPLayout.createSequentialGroup()
                                .addComponent(ageJL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(userAgeJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(sudentIDJL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(studentIDJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(mainJPLayout.createSequentialGroup()
                .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(passWJL, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userPWJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainJPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainJPLayout.createSequentialGroup()
                                .addComponent(fNameJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fNameJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainJPLayout.createSequentialGroup()
                                .addComponent(emailJL, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addComponent(lNameJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainJPLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(creatMemberJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainJPLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        mainJPLayout.setVerticalGroup(
            mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainJPLayout.createSequentialGroup()
                .addComponent(memberWelcomeJL)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameJL)
                    .addComponent(fNameJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lNameJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailJL)
                    .addComponent(emailJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passWJL)
                    .addComponent(userPWJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ageJL)
                    .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userAgeJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sudentIDJL)
                        .addComponent(studentIDJTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(mainJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degreeJL)
                    .addComponent(degreeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(creatMemberJButton)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fNameJTextFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameJTextFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameJTextFActionPerformed

    private void lNameJTextFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNameJTextFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNameJTextFActionPerformed

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
            java.util.logging.Logger.getLogger(MemberRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberRegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberRegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageJL;
    private javax.swing.JButton creatMemberJButton;
    private javax.swing.JComboBox<String> degreeJComboBox;
    private javax.swing.JLabel degreeJL;
    private javax.swing.JLabel emailJL;
    private javax.swing.JTextField emailJTextF;
    private javax.swing.JLabel fNameJL;
    private javax.swing.JTextField fNameJTextF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField lNameJTextF;
    private javax.swing.JPanel mainJP;
    private javax.swing.JLabel memberWelcomeJL;
    private javax.swing.JLabel passWJL;
    private javax.swing.JTextField studentIDJTextF;
    private javax.swing.JLabel sudentIDJL;
    private javax.swing.JTextField userAgeJTextF;
    private javax.swing.JTextField userPWJTextF;
    // End of variables declaration//GEN-END:variables
}