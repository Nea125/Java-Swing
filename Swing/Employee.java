
package Swing;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Employee extends javax.swing.JFrame {
    SimpleDateFormat d = new SimpleDateFormat("dd/MMM/yyyy");
    DecimalFormat df = new DecimalFormat("0.00");
    DefaultTableModel model;
    //hh:mm:ss
    public Employee() 
    {
        initComponents();
        model = (DefaultTableModel) tbtable.getModel();
      
    }
    void GetData()
    {
        model.setRowCount(0);
        for(int i=0;i<EList.list.size();i++)
        {
            Object row[]={
              EList.list.get(i).getId(),
              EList.list.get(i).getName(),
              EList.list.get(i).getGender(),
              EList.list.get(i).getPossition(),
              df.format(EList.list.get(i).getSalary())+"$",
              EList.list.get(i).getDob(), 
            
            };
            model.addRow(row);
        }
    }
    void Clear()
    {
        txtid.setText("");
        txtname.setText("");
        buttonGroup1.clearSelection();
        cbposition.setSelectedItem(0);
        jdate.setDate(null);
        txtsalary.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtsearch = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        cbmale = new javax.swing.JCheckBox();
        cbfemale = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbtable = new javax.swing.JTable();
        btnexit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        bntremove = new javax.swing.JButton();
        txtsalary = new javax.swing.JTextField();
        cbsearch = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbposition = new javax.swing.JComboBox<>();
        jdate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Euclid Fraktur", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("ID :");

        jLabel4.setFont(new java.awt.Font("Euclid Fraktur", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Name :");

        jLabel5.setFont(new java.awt.Font("Euclid Fraktur", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Gender :");

        jLabel6.setFont(new java.awt.Font("Euclid Fraktur", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Position : ");

        jLabel7.setFont(new java.awt.Font("Euclid Fraktur", 3, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Salary :");

        jLabel8.setFont(new java.awt.Font("Euclid Fraktur", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("DOB :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1197, 547));
        getContentPane().setLayout(null);

        txtsearch.setBackground(new java.awt.Color(51, 51, 51));
        txtsearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(255, 255, 255));
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtsearchMouseReleased(evt);
            }
        });
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch);
        txtsearch.setBounds(840, 230, 120, 40);

        txtid.setBackground(new java.awt.Color(51, 51, 51));
        txtid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtid);
        txtid.setBounds(540, 70, 210, 40);

        txtname.setBackground(new java.awt.Color(51, 51, 51));
        txtname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtname);
        txtname.setBounds(540, 120, 210, 40);

        buttonGroup1.add(cbmale);
        cbmale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbmale.setText("Male");
        getContentPane().add(cbmale);
        cbmale.setBounds(540, 180, 61, 29);

        buttonGroup1.add(cbfemale);
        cbfemale.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbfemale.setText("Female");
        getContentPane().add(cbfemale);
        cbfemale.setBounds(640, 180, 79, 29);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Position", "Salary", "DOB"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbtable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 280, 770, 220);

        btnexit.setBackground(new java.awt.Color(51, 51, 255));
        btnexit.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(204, 204, 0));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit);
        btnexit.setBounds(750, 230, 80, 40);

        btnsave.setBackground(new java.awt.Color(102, 255, 102));
        btnsave.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(0, 51, 51));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(420, 230, 80, 40);

        btnupdate.setBackground(new java.awt.Color(153, 51, 255));
        btnupdate.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(0, 102, 102));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate);
        btnupdate.setBounds(520, 230, 90, 40);

        bntremove.setBackground(new java.awt.Color(51, 255, 204));
        bntremove.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        bntremove.setForeground(new java.awt.Color(255, 51, 51));
        bntremove.setText("Remove");
        bntremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntremoveActionPerformed(evt);
            }
        });
        getContentPane().add(bntremove);
        bntremove.setBounds(630, 230, 100, 40);

        txtsalary.setBackground(new java.awt.Color(51, 51, 51));
        txtsalary.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtsalary.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtsalary);
        txtsalary.setBounds(990, 120, 180, 40);

        cbsearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search Bar....", "Search By ID", "Search By Name" }));
        cbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsearchActionPerformed(evt);
            }
        });
        getContentPane().add(cbsearch);
        cbsearch.setBounds(990, 230, 180, 40);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DOB");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(840, 180, 120, 30);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ID");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel16);
        jLabel16.setBounds(420, 70, 90, 30);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Gender");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 255, 204)));
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(420, 180, 90, 30);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Position");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 102)));
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(840, 60, 120, 31);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Salary");
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel19);
        jLabel19.setBounds(840, 120, 120, 30);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Name");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 255)));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(420, 120, 90, 30);

        cbposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobile Developer", "Web Developer", "Flutter Developer", "C# Developer", "Java Developer" }));
        getContentPane().add(cbposition);
        cbposition.setBounds(990, 60, 180, 40);

        jdate.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jdate);
        jdate.setBounds(990, 170, 180, 40);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Employee Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 10, 435, 48);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\staff.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 80, 360, 360);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\E.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-10, 0, 1210, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender;
        gender = (cbmale.isSelected())?"Male":"Female";
        String pos = cbposition.getSelectedItem().toString();
        float salary = Float.parseFloat(txtsalary.getText());
        String date =  d.format(jdate.getDate());
        EList emp = new EList(id, name, gender, pos, salary, date);
        EList.list.add(emp);
        GetData();
        Clear();
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        
       dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
        int row = tbtable.getSelectedRow();
        txtid.setText(model.getValueAt(row, 0).toString());
        txtname.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equals("Male"))
        {
            cbmale.setSelected(true);
        }
        else
        {
            cbfemale.setSelected(true);
        }
        cbposition.setSelectedItem(model.getValueAt(row, 3));
        String salary = model.getValueAt(row, 4).toString();
        salary = salary.replace("$","");
        txtsalary.setText(salary);
        //txtsalary.setText(model.getValueAt(row, 4).toString());
        try {
            Date date= d.parse(model.getValueAt(row, 5).toString());
            jdate.setDate(date);
            
        }
        catch (Exception e) {
            JOptionPane.showConfirmDialog(null,e);
        }
        
        
    }//GEN-LAST:event_tbtableMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int id = Integer.parseInt(txtid.getText());
        String name = txtname.getText();
        String gender;
        gender = (cbmale.isSelected())?"Male":"Female";
        String pos = cbposition.getSelectedItem().toString();
        float salary = Float.parseFloat(txtsalary.getText());
        String date =  d.format(jdate.getDate());
        EList emp = new EList(id, name, gender, pos, salary, date);
        int index = tbtable.getSelectedRow();
        EList.list.set(index, emp);
        GetData();
        Clear();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void bntremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntremoveActionPerformed
        int index = tbtable.getSelectedRow();
        EList.list.remove(index);
        GetData();
        Clear();
    }//GEN-LAST:event_bntremoveActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtsearchActionPerformed

    private void txtsearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchMouseReleased

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
     int index = cbsearch.getSelectedIndex();
     boolean Isid=false;
     boolean Isname = false;
     switch(index)
     {
         case 1:{// search by ID
             int sid = Integer.parseInt(txtsearch.getText());
             for(int i=0;i<EList.list.size();i++)
             {
                
                 if(sid==EList.list.get(i).getId())
                 {
                       model.setRowCount(0);
                      
                        Object row[]={
                        EList.list.get(i).getId(),
                        EList.list.get(i).getName(),
                        EList.list.get(i).getGender(),
                        EList.list.get(i).getPossition(),
                        df.format(EList.list.get(i).getSalary())+"$",
                        EList.list.get(i).getDob(), 

                      };
                      Isid=true;
                      model.addRow(row);
                 }
                 
                 if(Isid==false || txtsearch.equals(""))
                 {
                     GetData();
                 }
                
             }  
         }break;
         case 2:{// search by name
              String sname = txtsearch.getText();
             for(int i=0;i<EList.list.size();i++)
             {
                
                 if(sname.equals(EList.list.get(i).getName()))
                 {
                       model.setRowCount(0);
                      
                        Object row[]={
                        EList.list.get(i).getId(),
                        EList.list.get(i).getName(),
                        EList.list.get(i).getGender(),
                        EList.list.get(i).getPossition(),
                        df.format(EList.list.get(i).getSalary())+"$",
                        EList.list.get(i).getDob(), 

                      };
                      Isname=true;
                      model.addRow(row);
                 }
                 
                 if(Isname==false || txtsearch.equals(""))
                 {
                     GetData();
                 }
                
             }
             
         }break;
     }
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void cbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsearchActionPerformed
      
    }//GEN-LAST:event_cbsearchActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            @Override
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntremove;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbfemale;
    private javax.swing.JCheckBox cbmale;
    private javax.swing.JComboBox<String> cbposition;
    private javax.swing.JComboBox<String> cbsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdate;
    private javax.swing.JTable tbtable;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsalary;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}




































