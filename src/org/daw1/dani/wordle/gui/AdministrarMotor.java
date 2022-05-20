/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.daw1.dani.wordle.gui;

import org.daw1.dani.wordle.gui.MainGUI;
import static org.daw1.dani.wordle.gui.MainGUI.COLOR_ROJO;
import static org.daw1.dani.wordle.gui.MainGUI.COLOR_VERDE;
import org.daw1.dani.wordle.wordleclass.IMotor;
/**
 *
 * @author dani
 */
public class AdministrarMotor extends javax.swing.JDialog {

    /**
     * Creates new form AdministrarMotor
     */
    private IMotor tipoMotor = MainGUI.getTipoMotor();
    
    public AdministrarMotor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        mainjPanel = new javax.swing.JPanel();
        cuerpojPanel = new javax.swing.JPanel();
        anadirjPanel = new javax.swing.JPanel();
        insertarjPanel = new javax.swing.JPanel();
        anadirjTextField = new javax.swing.JTextField();
        anadir = new javax.swing.JButton();
        estadoInsertarjPanel = new javax.swing.JPanel();
        estadoInsertar = new javax.swing.JLabel();
        borrarjPanel = new javax.swing.JPanel();
        borradojPanel = new javax.swing.JPanel();
        borrarjTextField = new javax.swing.JTextField();
        borrarButton = new javax.swing.JButton();
        estadoBorrado = new javax.swing.JPanel();
        estadoBorrar = new javax.swing.JLabel();
        titulojPanel = new javax.swing.JPanel();
        titulojLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mainjPanel.setLayout(new java.awt.BorderLayout());

        cuerpojPanel.setLayout(new java.awt.GridLayout(2, 1));

        anadirjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        anadirjPanel.setLayout(new java.awt.GridLayout(2, 1));

        anadirjTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        anadirjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirjTextFieldActionPerformed(evt);
            }
        });
        insertarjPanel.add(anadirjTextField);

        anadir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        anadir.setText("Añadir");
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });
        insertarjPanel.add(anadir);

        anadirjPanel.add(insertarjPanel);

        estadoInsertarjPanel.setLayout(new java.awt.GridBagLayout());

        estadoInsertar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        estadoInsertarjPanel.add(estadoInsertar, new java.awt.GridBagConstraints());

        anadirjPanel.add(estadoInsertarjPanel);

        cuerpojPanel.add(anadirjPanel);

        borrarjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        borrarjPanel.setLayout(new java.awt.GridLayout(2, 1));

        borrarjTextField.setText("jTextField2");
        borrarjTextField.setPreferredSize(new java.awt.Dimension(160, 23));
        borradojPanel.add(borrarjTextField);

        borrarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        borrarButton.setText("Borrar");
        borrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarButtonActionPerformed(evt);
            }
        });
        borradojPanel.add(borrarButton);

        borrarjPanel.add(borradojPanel);

        estadoBorrado.setLayout(new java.awt.GridBagLayout());

        estadoBorrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        estadoBorrado.add(estadoBorrar, new java.awt.GridBagConstraints());

        borrarjPanel.add(estadoBorrado);

        cuerpojPanel.add(borrarjPanel);

        mainjPanel.add(cuerpojPanel, java.awt.BorderLayout.CENTER);

        titulojPanel.setLayout(new java.awt.GridBagLayout());

        titulojLabel.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        titulojLabel.setText("GESTIÓN MOTOR");
        titulojPanel.add(titulojLabel, new java.awt.GridBagConstraints());

        mainjPanel.add(titulojPanel, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        this.estadoInsertar.setVisible(false);
        if(!tipoMotor.checkPalabra(this.anadirjTextField.getText())){
            if(this.anadirjTextField.getText().length() != 5){
                this.estadoInsertar.setText("La palabra tiene que ser de 5 letras");
                this.estadoInsertar.setForeground(COLOR_ROJO);
                this.estadoInsertar.setVisible(true);
            }else if(!this.anadirjTextField.getText().matches("[A-Za-z]{5}")){
                this.estadoInsertar.setText("La palabra solo puede llevar letras");
                this.estadoInsertar.setForeground(COLOR_ROJO);
                this.estadoInsertar.setVisible(true);
            }else{
                tipoMotor.addPalabra(this.anadirjTextField.getText());
                this.estadoInsertar.setText("La palabra fue agregada con exito");
                this.estadoInsertar.setForeground(COLOR_VERDE);
                this.estadoInsertar.setVisible(true);
            } 
        }else{
            this.estadoInsertar.setText("La palabra ya existe no puedes agregarla");
            this.estadoInsertar.setForeground(COLOR_ROJO);
            this.estadoInsertar.setVisible(true);
        }

            
        
    }//GEN-LAST:event_anadirActionPerformed

    private void borrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_borrarButtonActionPerformed

    private void anadirjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirjTextFieldActionPerformed
        
    }//GEN-LAST:event_anadirjTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrarMotor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdministrarMotor dialog = new AdministrarMotor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JPanel anadirjPanel;
    private javax.swing.JTextField anadirjTextField;
    private javax.swing.JPanel borradojPanel;
    private javax.swing.JButton borrarButton;
    private javax.swing.JPanel borrarjPanel;
    private javax.swing.JTextField borrarjTextField;
    private javax.swing.JPanel cuerpojPanel;
    private javax.swing.JPanel estadoBorrado;
    private javax.swing.JLabel estadoBorrar;
    private javax.swing.JLabel estadoInsertar;
    private javax.swing.JPanel estadoInsertarjPanel;
    private javax.swing.JPanel insertarjPanel;
    private javax.swing.JPanel mainjPanel;
    private javax.swing.JLabel titulojLabel;
    private javax.swing.JPanel titulojPanel;
    // End of variables declaration//GEN-END:variables
}
