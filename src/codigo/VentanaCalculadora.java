/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

/**
 *
 * @author alvar
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    double operando1=0;//guarda el primer numero
    String operacion = "";
    
    
    public VentanaCalculadora() {
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

        pantalla = new javax.swing.JLabel();
        boton07 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Consolas", 0, 40)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 153, 51));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setOpaque(true);
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 476, 60));

        boton07.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton07.setText("7");
        boton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton07ActionPerformed(evt);
            }
        });
        getContentPane().add(boton07, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 64, 64));

        boton9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 64, 64));

        boton8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 64, 64));

        boton3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 64, 64));

        boton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 64, 64));

        boton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 64, 64));

        boton6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 64, 64));

        boton4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 64, 64));

        boton5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 64, 64));

        boton0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        getContentPane().add(boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 64, 64));

        botonDivision.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });
        getContentPane().add(botonDivision, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 64, 64));

        botonMultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonMultiplicacion.setText("x");
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });
        getContentPane().add(botonMultiplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 64, 64));

        botonSuma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonSuma.setText("+");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });
        getContentPane().add(botonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 64, 64));

        botonResta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonResta.setText("-");
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(botonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 64, 64));

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        getContentPane().add(botonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 160, 60));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 64, 64));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton2.setText(",");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 64, 64));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton07ActionPerformed
        String auxiliar = pantalla.getText();
        if(auxiliar=="0"){
            pantalla.setText("7");
        }else{
        pantalla.setText(auxiliar+"7");
        }
    }//GEN-LAST:event_boton07ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed
           String auxiliar = pantalla.getText();
        if(auxiliar=="0"){
            pantalla.setText("9");
        }else{
        pantalla.setText(auxiliar+"9");
        }
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("8");        }else{        pantalla.setText(auxiliar+"8");        }
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("3");        }else{        pantalla.setText(auxiliar+"3");        }
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("2");        }else{        pantalla.setText(auxiliar+"2");        }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("1");        }else{        pantalla.setText(auxiliar+"1");        }
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("6");        }
           else{        pantalla.setText(auxiliar+"6");        }
    }//GEN-LAST:event_boton6ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("4");        }else{        pantalla.setText(auxiliar+"4");        }
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("5");        }else{        pantalla.setText(auxiliar+"5");        }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed
           String auxiliar = pantalla.getText();        if(auxiliar=="0"){            pantalla.setText("0");        }else{        pantalla.setText(auxiliar+"0");        }
    }//GEN-LAST:event_boton0ActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
        operacion ="/";
        //double.valueof convierte un string en su equivalente numerico
        operando1 = Double.valueOf(pantalla.getText());
        pantalla.setText("0");
        
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicacionActionPerformed
         operacion ="x";        //double.valueof convierte un string en su equivalente numerico     
         operando1 = Double.valueOf(pantalla.getText());        pantalla.setText("0");
    }//GEN-LAST:event_botonMultiplicacionActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
         operacion ="+";        //double.valueof convierte un string en su equivalente numerico 
         operando1 = Double.valueOf(pantalla.getText());        pantalla.setText("0");
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
         operacion ="-";        //double.valueof convierte un string en su equivalente numerico
         operando1 = Double.valueOf(pantalla.getText());        pantalla.setText("0");
    }//GEN-LAST:event_botonRestaActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double operando2 = Double.valueOf(pantalla.getText());
        if(operacion.equals("+")){
        operando1 = operando1 + operando2;
    }
        if(operacion.equals("-")){
        operando1 = operando1 - operando2;
    }
   
        if(operacion.equals("*")){
        operando1 = operando1 * operando2;
    }
       
        
         
        if(operacion.equals("/")){
        operando1 = operando1 / operando2;
    }
        pantalla.setText("" + operando1);
        
       
    }//GEN-LAST:event_botonIgualActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       pantalla.setText("0"); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String auxiliar = pantalla.getText();
        pantalla.setText(auxiliar+".");
    }//GEN-LAST:event_jButton2ActionPerformed
   
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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton07;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
