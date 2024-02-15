
package Swing;
import java.awt.Image;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
public class Student_Register extends javax.swing.JFrame{
    float price[]={69.00f,89.00f,99.00f,89.00f,99.00f};
    SimpleDateFormat d = new SimpleDateFormat("dd/MMM/yyyy");
    DecimalFormat df = new DecimalFormat("0.00");
    DefaultTableModel model;
    public Student_Register() {
       initComponents();
       txtprice.setText(String.valueOf(df.format(price[0]))+"$");
       model = (DefaultTableModel) tbtable.getModel();
     
    }
    private String imgPath=null;
    private ImageIcon resizeImage(String imagePath,byte[] pic){
        ImageIcon myImage;
        if(imagePath!=null){
            myImage = new ImageIcon(imagePath);
        }else{
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img1 =img.getScaledInstance(lbimage.getWidth(), lbimage.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img1);
        return image;
    }
    void Clear()
    {
        txtid.setText("");
        txtname.setText("");
        buttonGroup1.clearSelection();
        cbcourse.setSelectedItem(0);
        txtprice.setText("");
        cbroom.setSelectedItem(0);
        cbtime.setSelectedItem(0);
        jdate.setDate(null);
        txtimage.setText("");
        lbimage.setIcon(null);
        
        
        
    }
    void GetData()
    {
        model.setRowCount(0);
        for(int i=0;i<Student_List.list.size();i++)
        {
             Object row[]={
             Student_List.list.get(i).getId(),
             Student_List.list.get(i).getName(),
             Student_List.list.get(i).getGender(),
             Student_List.list.get(i).getCourse(),
             Student_List.list.get(i).getPrice(),
             Student_List.list.get(i).getRoom(),
             Student_List.list.get(i).getTime(),
             Student_List.list.get(i).getDate(),
             Student_List.list.get(i).getImage(),
            
            
            
            };
            model.addRow(row);
            
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        cbcourse = new javax.swing.JComboBox<>();
        cbtime = new javax.swing.JComboBox<>();
        cbroom = new javax.swing.JComboBox<>();
        cbsearch = new javax.swing.JComboBox<>();
        cbsort = new javax.swing.JComboBox<>();
        btnimage = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        txtimage = new javax.swing.JTextField();
        btnexite = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lbimage = new javax.swing.JLabel();
        btnupdate1 = new javax.swing.JButton();
        jdate = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbtable = new rojeru_san.complementos.RSTableMetro();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1371, 603));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Date");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(740, 250, 40, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 70, 40, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 130, 50, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(430, 190, 60, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Course");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 250, 60, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(740, 70, 40, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Room");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(740, 130, 60, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("Time");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(740, 190, 40, 30);

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
        txtsearch.setBounds(880, 300, 140, 40);
        getContentPane().add(txtid);
        txtid.setBounds(490, 70, 190, 40);

        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });
        getContentPane().add(txtprice);
        txtprice.setBounds(820, 70, 190, 40);

        buttonGroup1.add(rbmale);
        rbmale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbmale.setForeground(new java.awt.Color(102, 51, 255));
        rbmale.setText("Male");
        getContentPane().add(rbmale);
        rbmale.setBounds(520, 200, 70, 22);

        buttonGroup1.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbfemale.setForeground(new java.awt.Color(102, 51, 255));
        rbfemale.setText("Female");
        getContentPane().add(rbfemale);
        rbfemale.setBounds(600, 200, 80, 22);

        cbcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C/C++", "Java/Spring Boot", "C#/.Net Programing", "Flutter/Dart", "PHP/Laravel" }));
        cbcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcourseActionPerformed(evt);
            }
        });
        getContentPane().add(cbcourse);
        cbcourse.setBounds(500, 250, 190, 40);

        cbtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00-2:00 PM", "2:00-3:00 PM", "3:00-4:00 PM", "4:00-5:00 PM", "5:00-6:00 PM", " ", " " }));
        getContentPane().add(cbtime);
        cbtime.setBounds(820, 190, 190, 40);

        cbroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ETEC 1001", "ETEC 1002", "ETEC 1003", "ETEC 1004" }));
        getContentPane().add(cbroom);
        cbroom.setBounds(820, 130, 190, 40);

        cbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search Option....", "Search By ID", "Search By Name...", " " }));
        cbsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsearchActionPerformed(evt);
            }
        });
        getContentPane().add(cbsearch);
        cbsearch.setBounds(1040, 300, 150, 40);

        cbsort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort Option....", "Sort By ID", "Sort By Name...", " " }));
        cbsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsortActionPerformed(evt);
            }
        });
        cbsort.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cbsortKeyReleased(evt);
            }
        });
        getContentPane().add(cbsort);
        cbsort.setBounds(1210, 300, 110, 40);

        btnimage.setText("Image");
        btnimage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimageActionPerformed(evt);
            }
        });
        getContentPane().add(btnimage);
        btnimage.setBounds(1220, 250, 100, 40);

        btnsave.setBackground(new java.awt.Color(153, 51, 255));
        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 0, 0));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(430, 300, 100, 40);

        btndelete.setBackground(new java.awt.Color(204, 204, 255));
        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 102, 51));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(650, 300, 110, 40);
        getContentPane().add(txtname);
        txtname.setBounds(490, 130, 190, 40);
        getContentPane().add(txtimage);
        txtimage.setBounds(1040, 250, 160, 40);

        btnexite.setBackground(new java.awt.Color(0, 102, 102));
        btnexite.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnexite.setForeground(new java.awt.Color(51, 0, 51));
        btnexite.setText("Exit");
        btnexite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnexite);
        btnexite.setBounds(770, 300, 100, 40);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(190, 96, 0, 220);

        lbimage.setBackground(new java.awt.Color(255, 102, 102));
        lbimage.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lbimage);
        lbimage.setBounds(1070, 70, 180, 160);

        btnupdate1.setBackground(new java.awt.Color(255, 204, 255));
        btnupdate1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnupdate1.setForeground(new java.awt.Color(51, 51, 0));
        btnupdate1.setText("Update");
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate1);
        btnupdate1.setBounds(540, 300, 100, 40);
        getContentPane().add(jdate);
        jdate.setBounds(820, 250, 190, 40);

        tbtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Course", "Price", "Room", "Time", "Date", "Image"
            }
        ));
        tbtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbtable);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(430, 350, 910, 200);

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 255, 204));
        jLabel9.setText("Studetn     Register");
        kGradientPanel1.add(jLabel9);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1360, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\NU NEA\\Pictures\\Energy_Drink\\student2.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 40, 420, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexiteActionPerformed

       
    }//GEN-LAST:event_btnexiteActionPerformed

    private void btnimageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimageActionPerformed
       JFileChooser file = new JFileChooser();
           file.setCurrentDirectory(new File(System.getProperty("user.home")));
           FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg","png");
           file.addChoosableFileFilter(filter);
           int result=file.showSaveDialog(null);
           if(result==JFileChooser.APPROVE_OPTION){
            File selectFile=file.getSelectedFile();
            String path=selectFile.getAbsolutePath();
            txtimage.setText(path);
            lbimage.setIcon(resizeImage(path,null));
            String imgPath = path;
        }else{
            System.out.println(" No file Selected...");
        }        
        
    }//GEN-LAST:event_btnimageActionPerformed

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
    String course = cbcourse.getSelectedItem().toString();
    String p = txtprice.getText();
    p = p.replace("$","");
    float price = Float.parseFloat(p);
    String room = cbroom.getSelectedItem().toString();
    String time = cbtime.getSelectedItem().toString();
    String date = d.format(jdate.getDate());
    String image = txtimage.getText();
    Student_List stu = new Student_List(id, name, gender, course, price, room, time, date, image);
    Student_List.list.add(stu);
    GetData();
    Clear();

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      int index = tbtable.getSelectedRow();
      Student_List.list.remove(index);
      GetData();
      Clear();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
    
       
    }//GEN-LAST:event_txtsearchKeyReleased

    private void cbsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsortActionPerformed
        int index = cbsort.getSelectedIndex();
        switch(index)
        {
            case 1:{// ID
                 model.setRowCount(0);
                    Collections.sort(Student_List.list, Comparator.comparing(Student_List::getId));
                    GetData();
            }break;
            case 2:{// Name
                 model.setRowCount(0);
                 Collections.sort(Student_List.list, Comparator.comparing(Student_List::getName));
                 GetData();
            }break;
        }
    }//GEN-LAST:event_cbsortActionPerformed
    
    private void cbcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcourseActionPerformed
         txtprice.setText(String.valueOf(df.format(price[cbcourse.getSelectedIndex()]))+"$");
    }//GEN-LAST:event_cbcourseActionPerformed

    private void cbsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsearchActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
       int index = tbtable.getSelectedRow();
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
       String course = cbcourse.getSelectedItem().toString();
       String p = txtprice.getText();
       p = p.replace("$","");
       float price = Float.parseFloat(p);
       String room = cbroom.getSelectedItem().toString();
       String time = cbtime.getSelectedItem().toString();
       String date = d.format(jdate.getDate());
       String image = txtimage.getText();
       Student_List stu = new Student_List(id, name, gender, course, price, room, time, date, image);
       Student_List.list.set(index,stu);
       GetData();
       Clear();
    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed

    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void tbtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbtableMouseClicked
       int row = tbtable.getSelectedRow();
       txtid.setText(model.getValueAt(row, 0).toString());
       txtname.setText(model.getValueAt(row, 1).toString());
       String gender= model.getValueAt(row, 2).toString();
       if(gender.equals("Male"))
       {
          rbmale.setSelected(true);
       }
       else
       {
           rbfemale.setSelected(true);
       }
       cbcourse.setSelectedItem(model.getValueAt(row, 3));
       txtprice.setText(model.getValueAt(row, 4).toString());
       cbroom.setSelectedItem(model.getValueAt(row, 5));
       cbtime.setSelectedItem(model.getValueAt(row, 6));
        try {
            Date date = d.parse(model.getValueAt(row, 7).toString());
            jdate.setDate(date);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        txtimage.setText(model.getValueAt(row, 8).toString());
        lbimage.setIcon(resizeImage(model.getValueAt(row, 8).toString(), null));
    }//GEN-LAST:event_tbtableMouseClicked

    private void cbsortKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbsortKeyReleased
      
    }//GEN-LAST:event_cbsortKeyReleased

    
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
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Student_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexite;
    private javax.swing.JButton btnimage;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbcourse;
    private javax.swing.JComboBox<String> cbroom;
    private javax.swing.JComboBox<String> cbsearch;
    private javax.swing.JComboBox<String> cbsort;
    private javax.swing.JComboBox<String> cbtime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdate;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbimage;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private rojeru_san.complementos.RSTableMetro tbtable;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtimage;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
