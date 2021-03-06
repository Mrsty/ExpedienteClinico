/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Cita;
import domain.Clinica;
import domain.Paciente;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class NuevaCita extends javax.swing.JFrame {

    Clinica cln = new Clinica();

    /**
     * Creates new form NuevaCita
     */
    public NuevaCita() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfPaciente = new javax.swing.JTextField();
        bSiguiente = new javax.swing.JButton();
        bAnterior = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ftfFecha = new javax.swing.JFormattedTextField();
        bGuardar = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nueva Cita");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 330, 50));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Fecha:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 80, 30));

        tfPaciente.setEditable(false);
        tfPaciente.setBackground(new java.awt.Color(0, 51, 51));
        tfPaciente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 360, -1));

        bSiguiente.setBackground(new java.awt.Color(0, 51, 51));
        bSiguiente.setForeground(new java.awt.Color(0, 153, 153));
        bSiguiente.setText(">>");
        bSiguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(bSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 30, 20));

        bAnterior.setBackground(new java.awt.Color(0, 51, 51));
        bAnterior.setForeground(new java.awt.Color(0, 153, 153));
        bAnterior.setText("<<");
        bAnterior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(bAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(786, 170, 30, 20));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Paciente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 110, 30));

        try {
            ftfFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(ftfFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 140, 30));

        bGuardar.setBackground(new java.awt.Color(0, 51, 51));
        bGuardar.setForeground(new java.awt.Color(0, 153, 153));
        bGuardar.setText("Guardar");
        bGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(bGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 110, 30));

        bVolver.setBackground(new java.awt.Color(0, 51, 51));
        bVolver.setForeground(new java.awt.Color(0, 153, 153));
        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });
        jPanel1.add(bVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1078, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
        Paciente e;
        boolean sig = this.cln.sigPaciente();

        if(sig){
        e = this.cln.leerPacienteAct();
        this.mostrarPaciente(e);
        }else{
            JOptionPane.showMessageDialog(this, "Ya no hay pacientes para mostrar","Nueva Cita",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bSiguienteActionPerformed

    private void bAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAnteriorActionPerformed
        Paciente e;
        boolean ant = this.cln.antPaciente();
        if(ant){
        e = this.cln.leerPacienteAct();
        this.mostrarPaciente(e);
        }else{
           JOptionPane.showMessageDialog(this, "Ya no hay pacientes para mostrar","Nueva Cita",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bAnteriorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cln.cargarPacientes();
        Paciente s = this.cln.leerPaciente();
        this.mostrarPaciente(s);
    }//GEN-LAST:event_formWindowOpened

    private void bGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarActionPerformed
        Cita n = new Cita();
        n.setPaciente(this.tfPaciente.getText());
        n.setFecha(this.ftfFecha.getText());
        this.cln.agregarCita(n);
    }//GEN-LAST:event_bGuardarActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_bVolverActionPerformed

    private void mostrarPaciente(Paciente p) {
        if (p != null) {
            this.tfPaciente.setText(p.getNombre());
        }
    }

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
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevaCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAnterior;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton bVolver;
    private javax.swing.JFormattedTextField ftfFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tfPaciente;
    // End of variables declaration//GEN-END:variables
}
