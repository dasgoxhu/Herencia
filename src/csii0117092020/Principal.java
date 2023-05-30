package csii0117092020;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    String ToE;
    Estudiante estudiante;
    Trabajador trabajador;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        Selec1 = new javax.swing.JCheckBox();
        Selec2 = new javax.swing.JCheckBox();
        Selec3 = new javax.swing.JCheckBox();
        Selec4 = new javax.swing.JCheckBox();
        Selec5 = new javax.swing.JCheckBox();
        Selec6 = new javax.swing.JCheckBox();
        Selec7 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        Selec8 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame3 = new javax.swing.JFrame();
        selec6 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        selec1 = new javax.swing.JCheckBox();
        selec2 = new javax.swing.JCheckBox();
        selec3 = new javax.swing.JCheckBox();
        selec4 = new javax.swing.JCheckBox();
        selec5 = new javax.swing.JCheckBox();
        jFrame4 = new javax.swing.JFrame();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jFrame1.setLocationRelativeTo(null);
        jFrame1.setMinimumSize(new java.awt.Dimension(275, 130));
        jFrame1.setPreferredSize(new java.awt.Dimension(275, 130));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("¿Esta usted Graduado?");

        jButton8.setText("SI");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("No");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jFrame2.setLocationRelativeTo(null);
        jFrame2.setMinimumSize(new java.awt.Dimension(402, 180));

        Selec1.setText("Nombre");

        Selec2.setText("Apellido");

        Selec3.setText("Edad");

        Selec4.setText("Idioma");

        Selec5.setText("Nivel");

        Selec6.setText("Promedio");

        Selec7.setText("Graduado");

        jButton4.setText("Mostrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Selec8.setText("Sexo");
        Selec8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selec8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addComponent(Selec2)
                        .addGap(18, 18, 18)
                        .addComponent(Selec4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(Selec5))
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addComponent(Selec1)
                        .addGap(18, 18, 18)
                        .addComponent(Selec3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Selec8)))
                .addGap(18, 18, 18)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Selec6)
                    .addComponent(Selec7))
                .addGap(44, 44, 44))
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selec1)
                    .addComponent(Selec3)
                    .addComponent(Selec8)
                    .addComponent(Selec6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selec2)
                    .addComponent(Selec4)
                    .addComponent(Selec5)
                    .addComponent(Selec7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jFrame3.setLocationRelativeTo(null);
        jFrame3.setMinimumSize(new java.awt.Dimension(402, 180));

        selec6.setText("Antiguedad");

        jButton5.setText("Mostrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        selec1.setText("Nombre");

        selec2.setText("Apellido");

        selec3.setText("Edad");

        selec4.setText("Sexo");
        selec4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec4ActionPerformed(evt);
            }
        });

        selec5.setText("Salario");
        selec5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selec5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selec2)
                    .addComponent(selec1))
                .addGap(40, 40, 40)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selec3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selec4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(47, 47, 47)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selec5)
                            .addComponent(selec6))))
                .addGap(37, 37, 37))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selec1)
                    .addComponent(selec3)
                    .addComponent(selec5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selec2)
                    .addComponent(selec4)
                    .addComponent(selec6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jFrame4.setLocationRelativeTo(null);
        jFrame4.setMinimumSize(new java.awt.Dimension(300, 140));
        jFrame4.setResizable(false);

        jButton6.setText("Trabajador");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Estudiante");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("¿Que Es Usted?");

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame4Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(44, 44, 44)
                        .addComponent(jButton7)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103))))
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(37, 37, 37))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Mostrar informacion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jFrame4.setVisible(rootPaneCheckingEnabled);
        
        estudiante = new Estudiante(); 
        trabajador = new Trabajador();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(ToE.equals("EstudianteInfo")){
        jFrame2.setVisible(rootPaneCheckingEnabled);
        }
        else if(ToE.equals("TrabajadorInfo"))
        {
        jFrame3.setVisible(rootPaneCheckingEnabled);
        }
        else{
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String Mensaje="";
       
        if(Selec1.isSelected())
        {
            Mensaje += estudiante.getNombre() + " ";
        }
        if(Selec2.isSelected())
        {
            Mensaje += estudiante.getApellidos() + " ";
        }
        if(Selec3.isSelected())
        {
            Mensaje += "Edad: " + estudiante.getEdad()+ " ";
        }
        if(Selec4.isSelected())
        {
            Mensaje += "Idioma: " + estudiante.getIdioma() + " ";
        }
        if(Selec5.isSelected())
        {
            Mensaje += "Nivel: " + estudiante.getNivel()+ " ";
        }
        if(Selec6.isSelected())
        {
            Mensaje += "Primedio: " + estudiante.getPromedio()+ " ";
        }
         if(Selec8.isSelected())
        {
            Mensaje += "Sexo: " + estudiante.getSexo()+ " ";
        }
        
        if(Selec7.isSelected())
        {
            if(estudiante.isGraduado()){
            Mensaje += "Graduado: " + "si ";
            }
            else{
            Mensaje += "Graduado: " + "no ";
            }    
        }
        JOptionPane.showMessageDialog(rootPane, Mensaje);     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       String Mensaje="";
       if(selec1.isSelected())
       {
            Mensaje += trabajador.getNombre() + " ";
       }
       if(selec2.isSelected())
       {
           Mensaje += trabajador.getApellidos() + " "; 
       }
       if(selec3.isSelected())
       {
            Mensaje += "Edad: " + trabajador.getEdad()+ " ";    
       }
       if(selec4.isSelected()){
          Mensaje += "Sexo: " + trabajador.getSexo()+ " "; 
       }
       if(selec6.isSelected()){
          Mensaje += "Antiguedad: " + trabajador.getAños()+ " "; 
       }
       if(selec5.isSelected()){
           Mensaje += "Salario: " + trabajador.getSalario()+ " " + trabajador.Aunmento();
       }
        JOptionPane.showMessageDialog(rootPane, Mensaje);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void selec4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ToE = "TrabajadorInfo"; 
        
        trabajador.setNombre(JOptionPane.showInputDialog("¿Cual es su Nombre?"));
        trabajador.setApellidos((JOptionPane.showInputDialog("¿Cual es su Apellido?")));
        trabajador.setSexo(JOptionPane.showInputDialog("Cual es su Sexo"));
        trabajador.setEdad(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su Edad?")));
        trabajador.setId(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su Documento de Identidad?")));
        trabajador.setAños(Integer.parseInt(JOptionPane.showInputDialog("¿Años de Antiguedad en el trabajo?")));
        trabajador.setSalario(Integer.parseInt(JOptionPane.showInputDialog("cual es su Salario")));
        jFrame1.isMaximumSizeSet();
        jFrame1.setVisible(true); 
        jFrame4.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ToE = "EstudianteInfo";
        
        estudiante.setNombre(JOptionPane.showInputDialog("¿Cual es su Nombre?"));
        estudiante.setApellidos((JOptionPane.showInputDialog("¿Cual es su Apellido?")));
        estudiante.setSexo(JOptionPane.showInputDialog("Cual es su Sexo"));
        estudiante.setEdad(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su Edad?")));
        estudiante.setId(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es su Documento de Identidad?")));
        estudiante.setIdioma(JOptionPane.showInputDialog("¿Cual es el Idioma?"));
        estudiante.setNivel(Integer.parseInt(JOptionPane.showInputDialog("¿Cual es tu Nivel?")));
        estudiante.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("¿Cual es tu Promedio?")));
        jFrame1.isMaximumSizeSet();
        jFrame1.setVisible(true);
        jFrame4.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void Selec8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selec8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Selec8ActionPerformed

    private void selec5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selec5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selec5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        estudiante.setGraduado(true);
        trabajador.setGraduado(true);
        jFrame1.dispose();
        jFrame4.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        estudiante.setGraduado(false);
        trabajador.setGraduado(false);
        jFrame1.dispose();
        jFrame4.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Selec1;
    private javax.swing.JCheckBox Selec2;
    private javax.swing.JCheckBox Selec3;
    private javax.swing.JCheckBox Selec4;
    private javax.swing.JCheckBox Selec5;
    private javax.swing.JCheckBox Selec6;
    private javax.swing.JCheckBox Selec7;
    private javax.swing.JCheckBox Selec8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JCheckBox selec1;
    private javax.swing.JCheckBox selec2;
    private javax.swing.JCheckBox selec3;
    private javax.swing.JCheckBox selec4;
    private javax.swing.JCheckBox selec5;
    private javax.swing.JCheckBox selec6;
    // End of variables declaration//GEN-END:variables
}
