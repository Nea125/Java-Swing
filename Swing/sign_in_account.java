package Swing;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class sign_in_account extends javax.swing.JFrame {
    ImageIcon icon = new ImageIcon("C:\\Users\\NU NEA\\Pictures\\Saved Pictures\\C.png");
    ImageIcon icon1 = new ImageIcon("D:\\MyFile\\Picture\\Icon\\Error.png");
    public sign_in_account() {
        initComponents();
        //Account_List.list.add(new Account_List("DARA", "123"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btnlogin = new javax.swing.JButton();
        btnsignup = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(874, 393));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("HELLO AGAIN!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 30, 190, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("WELCOME TO OUR MEMBER");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 110, 260, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Don't have an acoutn");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 210, 180, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("SIGN IN YOUR ACCOUNT");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 30, 221, 21);

        jLabel9.setBackground(new java.awt.Color(255, 51, 51));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9.setText("User Name :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(490, 110, 110, 40);

        jLabel10.setBackground(new java.awt.Color(255, 51, 51));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 0, 0));
        jLabel10.setText("Password :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(500, 210, 110, 40);

        txtpassword.setBackground(new java.awt.Color(255, 153, 153));
        txtpassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(102, 102, 255)));
        getContentPane().add(txtpassword);
        txtpassword.setBounds(600, 210, 220, 30);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);

        btnlogin.setBackground(new java.awt.Color(204, 255, 204));
        btnlogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(102, 102, 102));
        btnlogin.setText("LOGIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel1.add(btnlogin);
        btnlogin.setBounds(590, 300, 230, 30);

        btnsignup.setBackground(new java.awt.Color(204, 204, 255));
        btnsignup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(102, 0, 0));
        btnsignup.setText("SIGN UP");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });
        jPanel1.add(btnsignup);
        btnsignup.setBounds(110, 300, 240, 30);

        txtusername.setBackground(new java.awt.Color(255, 153, 153));
        txtusername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 51, 51)));
        jPanel1.add(txtusername);
        txtusername.setBounds(600, 120, 220, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 880, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        String name = txtusername.getText();
        String password = String.valueOf(txtpassword.getPassword());
        boolean isusername = false;
        boolean ispassword = false;
        for(int i=0;i<Account_List.list.size();i++)
        {
            if(name.equals(Account_List.list.get(i).getUserName()))
            {
                isusername=true;
            }
            if(password.equals(Account_List.list.get(i).getPassword()))
            {
                ispassword=true;
            }
             // 5 no data
            if(txtusername.equals(null) && txtpassword.equals(null))
            {
                JOptionPane.showMessageDialog(null,"Pls Input Data..","Login", HEIGHT, icon1);
            }
            // 1 true username and password
            if(isusername==true && ispassword==true)
            {
                JOptionPane.showMessageDialog(null,"You Are Login..","Login", HEIGHT, icon);
                Student_Register.main(null);
                dispose();
            }
            // 2 wrong username  true password
            if(isusername==false && ispassword==true)
            {
                JOptionPane.showMessageDialog(null,"Invalid UserName..","Login", HEIGHT, icon1);
            }
            // 3 true username wrong password
            if(isusername==true && ispassword==false)
            {
                JOptionPane.showMessageDialog(null,"Invalid Password..","Login", HEIGHT, icon1);
            }
            // 4 wrong both
            if(isusername==false && ispassword==false)
            {
                JOptionPane.showMessageDialog(null,"Invalid Data..","Login", HEIGHT, icon1);
            }
           
        }
        
        
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
           // ----- 1-----
           //register_account.main(null);
           //dispose();
           //---- 2----
           register_account register = new register_account();
           register.setVisible(true);
           dispose(); 
    }//GEN-LAST:event_btnsignupActionPerformed

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
            java.util.logging.Logger.getLogger(sign_in_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_in_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_in_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_in_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new sign_in_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
