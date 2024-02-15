
package Swing;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class register_account extends javax.swing.JFrame {
     ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    public register_account() {
        initComponents();
       // Account_List.list.clear();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnsignin = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        txtconfirmpassword = new javax.swing.JPasswordField();
        txtpassword = new javax.swing.JPasswordField();
        txtusername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(874, 449));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("HELLO AGAIN!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 30, 190, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Confirm Password :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 270, 170, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("WELCOME TO OUR MEMBER");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 110, 260, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("I am new member");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 230, 160, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("User Name :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(450, 140, 110, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Password :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(450, 210, 110, 40);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        btnsignin.setBackground(new java.awt.Color(204, 204, 255));
        btnsignin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsignin.setForeground(new java.awt.Color(102, 0, 0));
        btnsignin.setText("SIGN IN");
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignin);
        btnsignin.setBounds(131, 338, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 450);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("REGISTER YOUR ACCOUNT");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(121, 25, 260, 40);

        btnregister.setBackground(new java.awt.Color(102, 255, 102));
        btnregister.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnregister.setForeground(new java.awt.Color(102, 102, 102));
        btnregister.setText("REGISTER");
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnregister);
        btnregister.setBounds(200, 338, 120, 40);

        txtconfirmpassword.setBackground(new java.awt.Color(255, 204, 204));
        txtconfirmpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 102, 255)));
        jPanel2.add(txtconfirmpassword);
        txtconfirmpassword.setBounds(191, 257, 230, 40);

        txtpassword.setBackground(new java.awt.Color(255, 204, 204));
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(204, 0, 153)));
        jPanel2.add(txtpassword);
        txtpassword.setBounds(191, 199, 230, 40);

        txtusername.setBackground(new java.awt.Color(255, 204, 204));
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 51, 51)));
        jPanel2.add(txtusername);
        txtusername.setBounds(191, 131, 230, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(410, 0, 470, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
        sign_in_account.main(null);
        dispose();
    }//GEN-LAST:event_btnsigninActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
       String username = txtusername.getText();
       String password = String.valueOf(txtpassword.getPassword());
       String conpassword = String.valueOf(txtconfirmpassword.getPassword());
       if(password.equals(conpassword))
       {
           Account_List.list.add(new Account_List(username, password));
            JOptionPane.showMessageDialog(null,"Account is Created..","Login", HEIGHT, icon);
       }
    }//GEN-LAST:event_btnregisterActionPerformed

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
            java.util.logging.Logger.getLogger(register_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new register_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnsignin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtconfirmpassword;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
































