
package Swing;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
public class Calculator extends javax.swing.JFrame {
    double value1,value2,result;
    int op;
    public Calculator() {
      initComponents();
      txtresult.setText("0");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtresult = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        bnt4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btndot = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnpercent = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnequal = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnsum = new javax.swing.JButton();
        btnsub = new javax.swing.JButton();
        btnaddsub = new javax.swing.JButton();
        btnmultiple = new javax.swing.JButton();
        btndivison = new javax.swing.JButton();
        powerx = new javax.swing.JButton();
        xpowery = new javax.swing.JButton();
        btnpie = new javax.swing.JButton();
        sqrtx = new javax.swing.JButton();
        xaqrty = new javax.swing.JButton();
        btnsin = new javax.swing.JButton();
        btncos = new javax.swing.JButton();
        btn1onx = new javax.swing.JButton();
        btntan = new javax.swing.JButton();
        btnfax = new javax.swing.JButton();
        cbdark = new javax.swing.JCheckBox();
        cblight = new javax.swing.JCheckBox();
        lbcalculator = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(643, 415));
        getContentPane().setLayout(null);

        txtresult.setEditable(false);
        txtresult.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtresult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultActionPerformed(evt);
            }
        });
        getContentPane().add(txtresult);
        txtresult.setBounds(50, 60, 480, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("CALCULATOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 10, 170, 30);

        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnclear.setText("C");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        getContentPane().add(btnclear);
        btnclear.setBounds(60, 120, 70, 40);

        btn7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(60, 170, 70, 40);

        btn0.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(60, 320, 70, 40);

        bnt4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bnt4.setText("4");
        bnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt4ActionPerformed(evt);
            }
        });
        getContentPane().add(bnt4);
        bnt4.setBounds(60, 220, 70, 40);

        btn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(60, 270, 70, 40);

        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btndelete.setText("DEL");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(140, 120, 70, 40);

        btn8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(140, 170, 70, 40);

        btndot.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btndot.setText(".");
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        getContentPane().add(btndot);
        btndot.setBounds(140, 320, 70, 40);

        btn5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(140, 220, 70, 40);

        btn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(140, 270, 70, 40);

        btnpercent.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnpercent.setText("%");
        btnpercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpercentActionPerformed(evt);
            }
        });
        getContentPane().add(btnpercent);
        btnpercent.setBounds(220, 120, 70, 40);

        btn9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(220, 170, 70, 40);

        btnequal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnequal.setText("=");
        btnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnequalActionPerformed(evt);
            }
        });
        getContentPane().add(btnequal);
        btnequal.setBounds(220, 320, 70, 40);

        btn6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(220, 220, 70, 40);

        btn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(220, 270, 70, 40);

        btnsum.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsum.setText("+");
        btnsum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumActionPerformed(evt);
            }
        });
        getContentPane().add(btnsum);
        btnsum.setBounds(300, 120, 70, 40);

        btnsub.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsub.setText("-");
        btnsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubActionPerformed(evt);
            }
        });
        getContentPane().add(btnsub);
        btnsub.setBounds(300, 170, 70, 40);

        btnaddsub.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnaddsub.setText("+/-");
        btnaddsub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddsubActionPerformed(evt);
            }
        });
        getContentPane().add(btnaddsub);
        btnaddsub.setBounds(300, 320, 70, 40);

        btnmultiple.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnmultiple.setText("X");
        btnmultiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultipleActionPerformed(evt);
            }
        });
        getContentPane().add(btnmultiple);
        btnmultiple.setBounds(300, 220, 70, 40);

        btndivison.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btndivison.setText("/");
        btndivison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisonActionPerformed(evt);
            }
        });
        getContentPane().add(btndivison);
        btndivison.setBounds(300, 270, 70, 40);

        powerx.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        powerx.setIcon(new javax.swing.ImageIcon("D:\\MyFile\\Picture\\Icon\\x poer 2.jpg")); // NOI18N
        powerx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerxActionPerformed(evt);
            }
        });
        getContentPane().add(powerx);
        powerx.setBounds(380, 120, 70, 40);

        xpowery.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        xpowery.setIcon(new javax.swing.ImageIcon("D:\\MyFile\\Picture\\Icon\\x power y.jpg")); // NOI18N
        xpowery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xpoweryActionPerformed(evt);
            }
        });
        getContentPane().add(xpowery);
        xpowery.setBounds(380, 170, 70, 40);

        btnpie.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnpie.setIcon(new javax.swing.ImageIcon("D:\\MyFile\\Picture\\Icon\\pi.jpg")); // NOI18N
        btnpie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpieActionPerformed(evt);
            }
        });
        getContentPane().add(btnpie);
        btnpie.setBounds(380, 320, 70, 40);

        sqrtx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sqrtx.setIcon(new javax.swing.ImageIcon("D:\\MyFile\\Picture\\Icon\\root x.jpg")); // NOI18N
        sqrtx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtxActionPerformed(evt);
            }
        });
        getContentPane().add(sqrtx);
        sqrtx.setBounds(380, 220, 70, 40);

        xaqrty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        xaqrty.setIcon(new javax.swing.ImageIcon("D:\\MyFile\\Picture\\Icon\\x root x.jpg")); // NOI18N
        xaqrty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xaqrtyActionPerformed(evt);
            }
        });
        getContentPane().add(xaqrty);
        xaqrty.setBounds(380, 270, 70, 40);

        btnsin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsin.setText("Sin");
        btnsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsinActionPerformed(evt);
            }
        });
        getContentPane().add(btnsin);
        btnsin.setBounds(460, 120, 70, 40);

        btncos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btncos.setText("Cos");
        btncos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncosActionPerformed(evt);
            }
        });
        getContentPane().add(btncos);
        btncos.setBounds(460, 170, 70, 40);

        btn1onx.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn1onx.setText("1/X");
        btn1onx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1onxActionPerformed(evt);
            }
        });
        getContentPane().add(btn1onx);
        btn1onx.setBounds(460, 320, 70, 40);

        btntan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btntan.setText("Tan");
        btntan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntanActionPerformed(evt);
            }
        });
        getContentPane().add(btntan);
        btntan.setBounds(460, 220, 70, 40);

        btnfax.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnfax.setText("X!");
        btnfax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfaxActionPerformed(evt);
            }
        });
        getContentPane().add(btnfax);
        btnfax.setBounds(460, 270, 70, 40);

        buttonGroup1.add(cbdark);
        cbdark.setForeground(new java.awt.Color(0, 0, 0));
        cbdark.setText("Dark");
        cbdark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdarkActionPerformed(evt);
            }
        });
        getContentPane().add(cbdark);
        cbdark.setBounds(540, 320, 70, 40);

        buttonGroup1.add(cblight);
        cblight.setForeground(new java.awt.Color(0, 0, 0));
        cblight.setText("Light");
        cblight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblightActionPerformed(evt);
            }
        });
        getContentPane().add(cblight);
        cblight.setBounds(540, 280, 50, 40);

        lbcalculator.setBackground(new java.awt.Color(255, 255, 255));
        lbcalculator.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbcalculator.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbcalculator);
        lbcalculator.setBounds(290, 10, 240, 40);

        p1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(p1);
        p1.setBounds(0, 0, 660, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   void SetNumber(String x)
   {
       if(txtresult.getText().equals("0"))
       {
           txtresult.setText(x);
       }
       else
       {
           txtresult.setText(txtresult.getText()+x);
       }
   }
   void Calculator()
   {
       switch(op)
       {
           case 1:{// Sum
               value2 = Double.parseDouble(txtresult.getText());
               result = value1+value2;
                lbcalculator.setText(lbcalculator.getText()+txtresult.getText()+" = ");
               txtresult.setText(String.valueOf(result));
              
               
           }break;
            case 2:{// Sum
               value2 = Double.parseDouble(txtresult.getText());
               result = value1-value2;
                lbcalculator.setText(lbcalculator.getText()+txtresult.getText()+" = ");
               txtresult.setText(String.valueOf(result));
              
               
           }break;
                  
         
            case 3:{// X^Y
               value2 = Double.parseDouble(txtresult.getText());
               result = pow(value1,value2);
                lbcalculator.setText(lbcalculator.getText()+txtresult.getText()+" = ");
               txtresult.setText(String.valueOf(result));
              
               
           }break;
           case 4:{// X sqrt Y
               value2 = Double.parseDouble(txtresult.getText());
               result = pow(value1,1/value2);
               lbcalculator.setText(lbcalculator.getText()+txtresult.getText()+" = ");
               txtresult.setText(String.valueOf(result));
              
               
           }break;
       }
   }
    
    
    private void txtresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtresultActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        SetNumber("1");
       
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void cblightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblightActionPerformed
    
     
    }//GEN-LAST:event_cblightActionPerformed

    private void cbdarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdarkActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_cbdarkActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        SetNumber("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        SetNumber("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        SetNumber("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void bnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt4ActionPerformed
        // TODO add your handling code here:
        SetNumber("4");
       
       
    }//GEN-LAST:event_bnt4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        SetNumber("5");
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    SetNumber("6");
       
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        SetNumber("2");
       
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
      SetNumber("3");
      
     
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         SetNumber("0");
     
    }//GEN-LAST:event_btn0ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        String dot = txtresult.getText();
        if(dot.contains(".")==true)
        {
            
        }
        else
        {
            txtresult.setText(txtresult.getText()+".");
        }
    }//GEN-LAST:event_btndotActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
      txtresult.setText("0");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       String r = txtresult.getText();
       r = r.substring(0, r.length()-1);
        txtresult.setText(r);
       if(r.equals(""))
       {
           txtresult.setText("0");
       }
      
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnpercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpercentActionPerformed
        
    }//GEN-LAST:event_btnpercentActionPerformed

    private void btnaddsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddsubActionPerformed
     String addsub = txtresult.getText();
     if(addsub.contains("-")==true)
     {
         addsub= addsub.replace("-","");
           txtresult.setText(addsub);
     }
     else
     {
          txtresult.setText("-"+addsub);
     }
   
       
    }//GEN-LAST:event_btnaddsubActionPerformed

    private void btnsumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumActionPerformed
      value1 = Double.parseDouble(txtresult.getText());
      lbcalculator.setText(txtresult.getText()+" + ");
      txtresult.setText("0");
      op=1;
      
    }//GEN-LAST:event_btnsumActionPerformed

    private void btnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnequalActionPerformed
      Calculator();
        
    }//GEN-LAST:event_btnequalActionPerformed

    private void btnsubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubActionPerformed
      value1 = Double.parseDouble(txtresult.getText());
      lbcalculator.setText(txtresult.getText()+" - ");
      txtresult.setText("0");
      op=2;
       
    }//GEN-LAST:event_btnsubActionPerformed

    private void btnmultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultipleActionPerformed
  
      
    }//GEN-LAST:event_btnmultipleActionPerformed

    private void btndivisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisonActionPerformed
     
       
    }//GEN-LAST:event_btndivisonActionPerformed

    private void xpoweryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xpoweryActionPerformed

      value1 = Double.parseDouble(txtresult.getText());
      lbcalculator.setText(txtresult.getText()+" ^ ");
      txtresult.setText("0");
      op=3;
       
    }//GEN-LAST:event_xpoweryActionPerformed

    private void powerxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerxActionPerformed
      value1 = Double.parseDouble(txtresult.getText());
      result = pow(value1,2);
      lbcalculator.setText("Pow("+value1+",2) = ");
      txtresult.setText(String.valueOf(result));
    }//GEN-LAST:event_powerxActionPerformed

    private void sqrtxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtxActionPerformed
       
     
    }//GEN-LAST:event_sqrtxActionPerformed

    private void xaqrtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xaqrtyActionPerformed
      value1 = Double.parseDouble(txtresult.getText());
      lbcalculator.setText(txtresult.getText()+" Sqrt( ");
      txtresult.setText("0");
      op=4;
    }//GEN-LAST:event_xaqrtyActionPerformed

    private void btnsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsinActionPerformed
      value1 = Double.parseDouble(txtresult.getText());
      result = sin(value1);
      lbcalculator.setText("Sin("+value1+") = ");
      txtresult.setText(String.valueOf(result));
    }//GEN-LAST:event_btnsinActionPerformed

    private void btncosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncosActionPerformed
       
    }//GEN-LAST:event_btncosActionPerformed

    private void btntanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntanActionPerformed
         
        
    }//GEN-LAST:event_btntanActionPerformed

    private void btnfaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfaxActionPerformed
    value1 = Double.parseDouble(txtresult.getText());
    int fax=1;
  
    for(int i=1;i<=value1;i++)
    {
        fax= fax*i;
    }
    lbcalculator.setText(String.valueOf(value1)+"! = ");
    txtresult.setText(String.valueOf(fax));
         
    }//GEN-LAST:event_btnfaxActionPerformed

    private void btnpieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpieActionPerformed
        SetNumber("3.14");
       
        
    }//GEN-LAST:event_btnpieActionPerformed

    private void btn1onxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1onxActionPerformed
     value1 = Double.parseDouble(txtresult.getText());
     result= 1/value1;
     lbcalculator.setText("1/"+value1+" = ");
     txtresult.setText(String.valueOf(result));
       
       
       
    }//GEN-LAST:event_btn1onxActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt4;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn1onx;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnaddsub;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btncos;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndivison;
    private javax.swing.JButton btndot;
    private javax.swing.JButton btnequal;
    private javax.swing.JButton btnfax;
    private javax.swing.JButton btnmultiple;
    private javax.swing.JButton btnpercent;
    private javax.swing.JButton btnpie;
    private javax.swing.JButton btnsin;
    private javax.swing.JButton btnsub;
    private javax.swing.JButton btnsum;
    private javax.swing.JButton btntan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbdark;
    private javax.swing.JCheckBox cblight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel lbcalculator;
    private javax.swing.JPanel p1;
    private javax.swing.JButton powerx;
    private javax.swing.JButton sqrtx;
    private javax.swing.JTextField txtresult;
    private javax.swing.JButton xaqrty;
    private javax.swing.JButton xpowery;
    // End of variables declaration//GEN-END:variables

   
}
