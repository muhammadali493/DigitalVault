import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SearchPassword extends javax.swing.JFrame {

    /**
     * Creates new form SearchPassword
     */
    public SearchPassword() {
        initComponents();
        setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        SearchPassTitleLabel = new javax.swing.JLabel();
        EnterNameLabel_SearchPassPage = new javax.swing.JLabel();
        SiteNameTxtField_SearchPassPage = new javax.swing.JTextField();
        UsernameLabel_SearchPassPage = new javax.swing.JLabel();
        UsernameTxtField_SearchPassPage = new javax.swing.JTextField();
        SearchButton_SearchPassPage = new javax.swing.JButton();
        BackButton_SearchPassPage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(85, 162, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 151, 78));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchPassTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        SearchPassTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        SearchPassTitleLabel.setText("Search Password");
        jPanel2.add(SearchPassTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 33, -1, 40));

        EnterNameLabel_SearchPassPage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EnterNameLabel_SearchPassPage.setForeground(new java.awt.Color(255, 255, 255));
        EnterNameLabel_SearchPassPage.setText("Enter Site Name");
        jPanel2.add(EnterNameLabel_SearchPassPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 106, 110, 35));
        jPanel2.add(SiteNameTxtField_SearchPassPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 148, 240, 35));

        UsernameLabel_SearchPassPage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        UsernameLabel_SearchPassPage.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel_SearchPassPage.setText("Enter Username");
        jPanel2.add(UsernameLabel_SearchPassPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 201, -1, 35));
        jPanel2.add(UsernameTxtField_SearchPassPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 243, 240, 35));

        SearchButton_SearchPassPage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SearchButton_SearchPassPage.setText("Search");
        SearchButton_SearchPassPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButton_SearchPassPageActionPerformed(evt);
            }
        });
        jPanel2.add(SearchButton_SearchPassPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 311, 100, 35));

        BackButton_SearchPassPage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BackButton_SearchPassPage.setText("Back");
        BackButton_SearchPassPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton_SearchPassPageActionPerformed(evt);
            }
        });
        jPanel2.add(BackButton_SearchPassPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 311, 80, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vault-update-1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -120, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 350, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vault-update-1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -160, 1200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    JFrame frame = new JFrame();
    String WebName, User, pass, link, note, strength;
    private void SearchButton_SearchPassPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButton_SearchPassPageActionPerformed
        // TODO add your handling code here:
        //Set Condition for two accounts on the same site
        //If found --> SetVisible UpdatePassPanel
        String nameOfSite = SiteNameTxtField_SearchPassPage.getText();
        String userName = UsernameTxtField_SearchPassPage.getText();

        if (evt.getSource() == BackButton_SearchPassPage) {
            this.setVisible(false);
            Dashboard d = new Dashboard(Dashboard.UserId);//Check if creates problem
            d.setVisible(true);
        }
        if (evt.getSource() == SearchButton_SearchPassPage) {
            //if found -->
            try {
//                test = 3;
                if (nameOfSite.isEmpty()) { //checking if 
                    JOptionPane.showMessageDialog(null, "Please enter the Name of Site.");
                } else if (userName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter the Username.");
                } else {
                    Konnect kk = new Konnect();
                    String str = "select * from credentials where SiteName = '" + nameOfSite+ "' and UserId = '" + Dashboard.UserId + "' and username = '" + userName + "'";
                    ResultSet r = kk.stm.executeQuery(str);

                    if (r.next()) {
                        /*......Getting all values in result set......*/
                        
                        /*.....fetching all login details ......*/
                        System.out.println("in while...");
                        WebName = r.getString("SiteName");
                        User = r.getString("Username");
                        pass = r.getString("Password");
                        strength = PasswordStrength.passwordStrength(pass);
                        link = r.getString("URL");
                        note = r.getString("Note");
                        String arr[] = {WebName, User, pass, link, note, strength};

                        /*.......Opening Update Password page ......*/
                        UpdatePassword page = new UpdatePassword(arr);
                        this.setVisible(false);
                        page.setVisible(true);

                        //JOptionPane.showMessageDialog(null, "Your password is: "+r.getString("Password"));
                        /*....*/
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn't find any credentials with given username: ");
                    }
                }

            } catch (Exception exp) {
                System.out.println("Exception: " + exp.getMessage());
            }
        }
    }//GEN-LAST:event_SearchButton_SearchPassPageActionPerformed

    private void BackButton_SearchPassPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton_SearchPassPageActionPerformed
        // TODO add your handling code here:
        Dashboard mainPage = new Dashboard(Dashboard.UserId);//Check for it
        setVisible(false);
        mainPage.setVisible(true);

    }//GEN-LAST:event_BackButton_SearchPassPageActionPerformed

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
            java.util.logging.Logger.getLogger(SearchPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton_SearchPassPage;
    private javax.swing.JLabel EnterNameLabel_SearchPassPage;
    private javax.swing.JButton SearchButton_SearchPassPage;
    private javax.swing.JLabel SearchPassTitleLabel;
    private javax.swing.JTextField SiteNameTxtField_SearchPassPage;
    private javax.swing.JLabel UsernameLabel_SearchPassPage;
    private javax.swing.JTextField UsernameTxtField_SearchPassPage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
