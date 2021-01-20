
package Calculator;
public class JavaCalculator extends javax.swing.JFrame {
    
    private double total1=0.0;
    private double total2=0.0;
    private char math_operator;
    
    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1=total1+Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }
    

    public JavaCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textDisplay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        buttonFive = new javax.swing.JButton();
        buttonTwo = new javax.swing.JButton();
        buttonThree = new javax.swing.JButton();
        buttonOne = new javax.swing.JButton();
        buttonEight = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();
        buttonNine = new javax.swing.JButton();
        buttonZero = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonSeven = new javax.swing.JButton();
        buttonMul = new javax.swing.JButton();
        buttonDiv = new javax.swing.JButton();
        buttonDot = new javax.swing.JButton();
        buttonEqual = new javax.swing.JButton();
        buttonSub = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        displayLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(255, 255, 255));

        buttonFive.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonFive.setText("5");
        buttonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiveActionPerformed(evt);
            }
        });

        buttonTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonTwo.setText("2");
        buttonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwoActionPerformed(evt);
            }
        });

        buttonThree.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonThree.setText("3");
        buttonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThreeActionPerformed(evt);
            }
        });

        buttonOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonOne.setText("1");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonEight.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonEight.setText("8");
        buttonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEightActionPerformed(evt);
            }
        });

        buttonSix.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonSix.setText("6");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        buttonNine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonNine.setText("9");
        buttonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNineActionPerformed(evt);
            }
        });

        buttonZero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonZero.setText("0");
        buttonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZeroActionPerformed(evt);
            }
        });

        buttonFour.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonFour.setText("4");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonSeven.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonSeven.setText("7");
        buttonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevenActionPerformed(evt);
            }
        });

        buttonMul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonMul.setText("*");
        buttonMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMulActionPerformed(evt);
            }
        });

        buttonDiv.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDiv.setText("/");
        buttonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivActionPerformed(evt);
            }
        });

        buttonDot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonDot.setText(".");
        buttonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDotActionPerformed(evt);
            }
        });

        buttonEqual.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonEqual.setText("=");
        buttonEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualActionPerformed(evt);
            }
        });

        buttonSub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonSub.setText("-");
        buttonSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubActionPerformed(evt);
            }
        });

        buttonAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonAdd.setText("+");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(0, 0, 153));
        clearButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(buttonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonThree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonOne, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonMul, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonNine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        displayLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        displayLabel.setText("DISPLAY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textDisplay))
                    .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(displayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiveActionPerformed
           String buttonFiveText = textDisplay.getText()+buttonFive.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonFiveText);
    }//GEN-LAST:event_buttonFiveActionPerformed

    private void buttonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevenActionPerformed
           String buttonSevenText = textDisplay.getText()+buttonSeven.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonSevenText);

    }//GEN-LAST:event_buttonSevenActionPerformed

    private void buttonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDotActionPerformed
           String buttonDotText = textDisplay.getText()+buttonDot.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonDotText);
    }//GEN-LAST:event_buttonDotActionPerformed

    private void buttonMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMulActionPerformed
       String button_text=buttonMul.getText();
       getOperator(button_text);

    }//GEN-LAST:event_buttonMulActionPerformed

    private void buttonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivActionPerformed
       String button_text=buttonDiv.getText();
       getOperator(button_text);

    }//GEN-LAST:event_buttonDivActionPerformed

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
           String buttonOneText = textDisplay.getText()+buttonOne.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonOneText);
    }//GEN-LAST:event_buttonOneActionPerformed

    private void buttonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwoActionPerformed
           String buttonTwoText = textDisplay.getText()+buttonTwo.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonTwoText);
    }//GEN-LAST:event_buttonTwoActionPerformed

    private void buttonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThreeActionPerformed
           String buttonThreeText = textDisplay.getText()+buttonThree.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonThreeText);
    }//GEN-LAST:event_buttonThreeActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
           String buttonFourText = textDisplay.getText()+buttonFour.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonFourText);

    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
           String buttonSixText = textDisplay.getText()+buttonSix.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonSixText);

    }//GEN-LAST:event_buttonSixActionPerformed

    private void buttonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEightActionPerformed
           String buttonEightText = textDisplay.getText()+buttonEight.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonEightText);

    }//GEN-LAST:event_buttonEightActionPerformed

    private void buttonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNineActionPerformed
           String buttonNineText = textDisplay.getText()+buttonNine.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonNineText);

    }//GEN-LAST:event_buttonNineActionPerformed

    private void buttonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZeroActionPerformed
           String buttonZeroText = textDisplay.getText()+buttonZero.getText();
           String textField = textDisplay.getText();
           textDisplay.setText(buttonZeroText);

    }//GEN-LAST:event_buttonZeroActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
       String button_text=buttonAdd.getText();
       getOperator(button_text);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualActionPerformed
        
        switch(math_operator){
            
            case '+':
                total2= total1 + Double.parseDouble(textDisplay.getText());
                break;
                
            case '-':
                total2= total1 - Double.parseDouble(textDisplay.getText());
                break;
                
            case '/':
                total2= total1 / Double.parseDouble(textDisplay.getText());
                break;
                
            case '*':
                total2= total1 * Double.parseDouble(textDisplay.getText());
                break;        
        }
        textDisplay.setText(Double.toString(total2));
        total1=0;

    }//GEN-LAST:event_buttonEqualActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        total2=0;
        textDisplay.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void buttonSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubActionPerformed
       String button_text=buttonSub.getText();
       getOperator(button_text);

    }//GEN-LAST:event_buttonSubActionPerformed

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
        } 
        
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
     
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDiv;
    private javax.swing.JButton buttonDot;
    private javax.swing.JButton buttonEight;
    private javax.swing.JButton buttonEqual;
    private javax.swing.JButton buttonFive;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonMul;
    private javax.swing.JButton buttonNine;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonSeven;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonSub;
    private javax.swing.JButton buttonThree;
    private javax.swing.JButton buttonTwo;
    private javax.swing.JButton buttonZero;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel displayLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textDisplay;
    // End of variables declaration//GEN-END:variables
}
