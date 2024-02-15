
package Swing;
import javax.swing.table.DefaultTableModel;
public class Staff extends javax.swing.JFrame {
    DefaultTableModel model;
    public Staff() {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
        rbmale.setSelected(true);
    }
    void Clear()
    {
        txtid.setText("");
        txtname.setText("");
        buttonGroup1.clearSelection();
        cbposition.setSelectedItem(0);
        txtsalary.setText("");
        txtaddress.setText("");
        txtphone.setText("");
        
    }
    
    void GetData()
    {
         model.setRowCount(0);
        for(int i=0;i<StaffList.list.size();i++)
        {
            Object obj[]={
                StaffList.list.get(i).getId(),
                StaffList.list.get(i).getName(),
                StaffList.list.get(i).getGender(),
                StaffList.list.get(i).getPosition(),
                StaffList.list.get(i).getSalary(),
                StaffList.list.get(i).getAddress(),
                StaffList.list.get(i).getPhone()
            };
            
            model.addRow(obj);
            
            
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtsalary = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        cbposition = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1066, 542));
        setMinimumSize(new java.awt.Dimension(1066, 542));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Staff Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 20, 300, 70);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 120, 80, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Name :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 180, 80, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 230, 80, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Position :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 280, 80, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Salary :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 330, 80, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Phone :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 380, 80, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 440, 80, 30);
        getContentPane().add(txtaddress);
        txtaddress.setBounds(150, 440, 190, 40);
        getContentPane().add(txtid);
        txtid.setBounds(150, 120, 190, 40);
        getContentPane().add(txtname);
        txtname.setBounds(150, 180, 190, 40);
        getContentPane().add(txtsalary);
        txtsalary.setBounds(150, 330, 190, 40);
        getContentPane().add(txtphone);
        txtphone.setBounds(150, 380, 190, 40);

        buttonGroup1.add(rbmale);
        rbmale.setText("Male");
        getContentPane().add(rbmale);
        rbmale.setBounds(150, 240, 60, 30);

        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");
        getContentPane().add(rbfemale);
        rbfemale.setBounds(220, 240, 80, 30);

        cbposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java Developer", "C# Developer", "Flutter Developer", "Web Developer", "Mobile Developer" }));
        getContentPane().add(cbposition);
        cbposition.setBounds(150, 282, 190, 40);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Position", "Salary", "Phone", "Address"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 120, 660, 310);

        btnexit.setBackground(new java.awt.Color(102, 51, 255));
        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(204, 204, 204));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(920, 450, 100, 40);

        btnsave.setBackground(new java.awt.Color(102, 51, 255));
        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(204, 204, 204));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(390, 450, 100, 40);

        btnupdate.setBackground(new java.awt.Color(102, 51, 255));
        btnupdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(204, 204, 204));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(510, 450, 100, 40);

        btndelete.setBackground(new java.awt.Color(102, 51, 255));
        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(204, 204, 204));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(640, 450, 100, 40);

        btnreset.setBackground(new java.awt.Color(102, 51, 255));
        btnreset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnreset.setForeground(new java.awt.Color(204, 204, 204));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset);
        btnreset.setBounds(780, 450, 100, 40);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       int id = Integer.parseInt(txtid.getText());
       String name = txtname.getText();
       String gender;
       if(rbmale.isSelected())
       {
           gender="Male";
       }
       else
       {
           gender="Female";
                   
       }
       String position = cbposition.getSelectedItem().toString();
       float salary = Float.parseFloat(txtsalary.getText());
       String address = txtaddress.getText();
       String phone = txtphone.getText();
       
        StaffList stlist = new StaffList(id, name, gender, position, address, salary, phone);
        StaffList.list.add(stlist);
        
//        StaffList.list.add(new StaffList(id, name, gender, position, address, salary, phone));
        GetData();
        Clear();
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
       int row = tbtable.getSelectedRow();
       txtid.setText(model.getValueAt(row, 0).toString());
       txtname.setText(model.getValueAt(row, 1).toString());
       String gender = model.getValueAt(row, 2).toString();
       
       if(gender.equals("Male"))
       {
           rbmale.setSelected(true);
       }
       else
       {
           rbfemale.setSelected(true);
       }
       cbposition.setSelectedItem(model.getValueAt(row, 3));
       txtsalary.setText(model.getValueAt(row, 4).toString());
       txtphone.setText(model.getValueAt(row, 5).toString());
       txtaddress.setText(model.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       int id = Integer.parseInt(txtid.getText());
       String name = txtname.getText();
       String gender;
       if(rbmale.isSelected())
       {
           gender="Male";
       }
       else
       {
           gender="Female";
                   
       }
       String position = cbposition.getSelectedItem().toString();
       float salary = Float.parseFloat(txtsalary.getText());
       String address = txtaddress.getText();
       String phone = txtphone.getText();
       StaffList st = new StaffList(id, name, gender, position, address, salary, phone);
       int index = tbtable.getSelectedRow();
       StaffList.list.set(index, st);
       GetData();
       Clear();
       
       
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         int index = tbtable.getSelectedRow();
         StaffList.list.remove(index);
         GetData();
         Clear();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
          StaffList.list.clear();
          GetData();
          Clear();
    }//GEN-LAST:event_btnresetActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
      dispose();
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Staff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Staff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbposition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtsalary;
    // End of variables declaration//GEN-END:variables
}
