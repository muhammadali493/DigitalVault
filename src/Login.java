
import javax.swing.*;
import java.sql.*;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        //To display login page in center of screen

        this.setLocationRelativeTo(null);
        //setting Icons
        //usernameIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("Icons/Password_icon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DigVaultTitle_LoginPage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LoginTitle = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UserIdTextField = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        LoginPasswordField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();
        showPasswordCheckBox_loginpage = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DigVaultTitle_LoginPage.setFont(new java.awt.Font("Segoe UI Black", 1, 28)); // NOI18N
        DigVaultTitle_LoginPage.setForeground(new java.awt.Color(255, 255, 255));
        DigVaultTitle_LoginPage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DigVaultTitle_LoginPage.setText("DIGITAL VAULT");
        jPanel1.add(DigVaultTitle_LoginPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 240, 48));

        jPanel2.setBackground(new java.awt.Color(121, 147, 114));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 51), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        LoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginTitle.setText("LOGIN");
        jPanel2.add(LoginTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 121, 48));

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setText("User Id");
        jPanel2.add(UsernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 95, 115, 30));

        UserIdTextField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        UserIdTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        UserIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(UserIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 132, 300, 37));

        PasswordLabel.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");
        jPanel2.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 188, 115, 30));

        LoginPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        LoginPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        LoginPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPasswordFieldActionPerformed(evt);
            }
        });
        jPanel2.add(LoginPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 231, 300, 37));

        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel2.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 300, 38));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create an account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 428, 130, 26));

        RegisterButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        RegisterButton.setText("SIGN UP");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 425, 130, 35));

        showPasswordCheckBox_loginpage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        showPasswordCheckBox_loginpage.setForeground(new java.awt.Color(255, 255, 255));
        showPasswordCheckBox_loginpage.setText("Show Password");
        showPasswordCheckBox_loginpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBox_loginpageActionPerformed(evt);
            }
        });
        jPanel2.add(showPasswordCheckBox_loginpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 311, -1, 24));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vault-update-1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 390, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vault-update-1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -230, 1200, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 951, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String UserId, pass;
    int id;
    private void LoginPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginPasswordFieldActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:

        try {
            Konnect k = new Konnect();
            String checkID = UserIdTextField.getText();
            //UserId = UserIdTextField.getText();
            pass = LoginPasswordField.getText();
            //Query for matching details
            //if (UserId.isEmpty()){
            if (checkID.isEmpty())/*||(pass.isEmpty()))*/ {
                throw new NoInputException("Please Enter User Id.");
                //JOptionPane.showMessageDialog(null,"Please enter Username.");
            } else if (pass.isEmpty()) {
//                JOptionPane.showMessageDialog(null,"Please enter Password.");
                throw new NoInputException("Please Enter the Password.");
            } else {
                //    id = Integer.parseInt(UserId);
                id = Integer.parseInt(UserIdTextField.getText());
                String q = "select * from login where userId = '" + id + "' and password = '" + pass + "'";
                ResultSet rs = k.stm.executeQuery(q);
                //System.out.println(" Values in rs: "+rs);
                if (rs.next()) {
                    /*.....Will open dashboard*/
                    //Open dashboard if login details are correct
                    Dashboard d = new Dashboard(id);
                    d.setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login. Please try again.");
                    //this.setVisible(false);
                    UserIdTextField.setText("");
                    LoginPasswordField.setText("");
                }
            }

        } catch (NoInputException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Id.");
            UserIdTextField.setText("");
            LoginPasswordField.setText("");
        } catch (Exception e) {
            //print msg
            System.out.println(e);
            System.out.println("Exception " + e.getMessage());
        }


    }//GEN-LAST:event_LoginButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        // TODO add your handling code here:
        SignUp rp = new SignUp();
        setVisible(false);  //set this current window as false
        rp.setVisible(true);
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void showPasswordCheckBox_loginpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBox_loginpageActionPerformed
        // TODO add your handling code here:
        if (showPasswordCheckBox_loginpage.isSelected()) {
            LoginPasswordField.setEchoChar((char) 0);
        } else {
            LoginPasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordCheckBox_loginpageActionPerformed

    private void UserIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdTextFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_UserIdTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DigVaultTitle_LoginPage;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPasswordField LoginPasswordField;
    private javax.swing.JLabel LoginTitle;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JTextField UserIdTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox showPasswordCheckBox_loginpage;
    // End of variables declaration//GEN-END:variables
}
