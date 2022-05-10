/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.dani.wordle.gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author dani
 */
public class MainGUI extends javax.swing.JFrame {
    
    private static java.awt.Color COLOR_VERDE = new java.awt.Color(51,102,0);
    private static java.awt.Color COLOR_AMARILLO = new java.awt.Color(204,204,0);
    private static java.awt.Color COLOR_ROJO = new java.awt.Color(204,0,0);
    
    private static final int MAX_INTENTOS = 6;
    private static final int TAMANO_PALABRA = 5;
    
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMANO_PALABRA];
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        inicializarLabels();
        test(0);
    }
    
    public void test(int fila){
      for(int i = 0 ; i < labels.length;i++){
        JLabel[] label = labels[fila];
        for(int j = 0;j < label.length;j++){
            JLabel jLabel = label[j];
            jLabel.setForeground(COLOR_ROJO);
            }
        }
    }
    
    public final void inicializarLabels(){
        for(int i = 1;i <= MAX_INTENTOS;i++){
            for(int j = 1;j <= TAMANO_PALABRA;j++){
                try {
                    String nombreLabel = "jLabel" + i + "_" + j;
                    System.out.println(nombreLabel);
                    javax.swing.JLabel aux = (javax.swing.JLabel)this.getClass().getDeclaredField(nombreLabel).get(this);
                    labels[i-1][j-1]= aux;
                } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
                    Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
     
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainJPanel = new javax.swing.JPanel();
        letrasPanel = new javax.swing.JPanel();
        jLabel1_1 = new javax.swing.JLabel();
        jLabel1_2 = new javax.swing.JLabel();
        jLabel1_3 = new javax.swing.JLabel();
        jLabel1_4 = new javax.swing.JLabel();
        jLabel1_5 = new javax.swing.JLabel();
        jLabel2_1 = new javax.swing.JLabel();
        jLabel2_2 = new javax.swing.JLabel();
        jLabel2_3 = new javax.swing.JLabel();
        jLabel2_4 = new javax.swing.JLabel();
        jLabel2_5 = new javax.swing.JLabel();
        jLabel3_1 = new javax.swing.JLabel();
        jLabel3_2 = new javax.swing.JLabel();
        jLabel3_3 = new javax.swing.JLabel();
        jLabel3_4 = new javax.swing.JLabel();
        jLabel3_5 = new javax.swing.JLabel();
        jLabel4_1 = new javax.swing.JLabel();
        jLabel4_2 = new javax.swing.JLabel();
        jLabel4_3 = new javax.swing.JLabel();
        jLabel4_4 = new javax.swing.JLabel();
        jLabel4_5 = new javax.swing.JLabel();
        jLabel5_1 = new javax.swing.JLabel();
        jLabel5_2 = new javax.swing.JLabel();
        jLabel5_3 = new javax.swing.JLabel();
        jLabel5_4 = new javax.swing.JLabel();
        jLabel5_5 = new javax.swing.JLabel();
        jLabel6_1 = new javax.swing.JLabel();
        jLabel6_2 = new javax.swing.JLabel();
        jLabel6_3 = new javax.swing.JLabel();
        jLabel6_4 = new javax.swing.JLabel();
        jLabel6_5 = new javax.swing.JLabel();
        bottomPanel = new javax.swing.JPanel();
        estadojPanel1 = new javax.swing.JPanel();
        maljPanel1 = new javax.swing.JPanel();
        maljLabel1 = new javax.swing.JLabel();
        existenjPanel2 = new javax.swing.JPanel();
        existenjLabel1 = new javax.swing.JLabel();
        bienjPanel3 = new javax.swing.JPanel();
        bienjLabel2 = new javax.swing.JLabel();
        inputjPanel2 = new javax.swing.JPanel();
        palabrajTextField1 = new javax.swing.JTextField();
        enviarjButton1 = new javax.swing.JButton();
        exitojPanel3 = new javax.swing.JPanel();
        finaljLabel1 = new javax.swing.JLabel();
        errorjPanel4 = new javax.swing.JPanel();
        errorjLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daw1_Wordle_Dani");

        mainJPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainJPanel.setLayout(new java.awt.BorderLayout());

        letrasPanel.setBackground(new java.awt.Color(255, 255, 255));
        letrasPanel.setLayout(new java.awt.GridLayout(6, 5));

        jLabel1_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_1.setText("A");
        letrasPanel.add(jLabel1_1);

        jLabel1_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_2.setText("A");
        letrasPanel.add(jLabel1_2);

        jLabel1_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_3.setText("A");
        letrasPanel.add(jLabel1_3);

        jLabel1_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_4.setText("A");
        letrasPanel.add(jLabel1_4);

        jLabel1_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_5.setText("A");
        letrasPanel.add(jLabel1_5);

        jLabel2_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_1.setText("A");
        letrasPanel.add(jLabel2_1);

        jLabel2_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_2.setText("A");
        letrasPanel.add(jLabel2_2);

        jLabel2_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_3.setText("A");
        letrasPanel.add(jLabel2_3);

        jLabel2_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_4.setText("A");
        letrasPanel.add(jLabel2_4);

        jLabel2_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_5.setText("A");
        letrasPanel.add(jLabel2_5);

        jLabel3_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_1.setText("A");
        letrasPanel.add(jLabel3_1);

        jLabel3_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_2.setText("A");
        letrasPanel.add(jLabel3_2);

        jLabel3_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_3.setText("A");
        letrasPanel.add(jLabel3_3);

        jLabel3_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_4.setText("A");
        letrasPanel.add(jLabel3_4);

        jLabel3_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3_5.setText("A");
        letrasPanel.add(jLabel3_5);

        jLabel4_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_1.setText("A");
        letrasPanel.add(jLabel4_1);

        jLabel4_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_2.setText("A");
        letrasPanel.add(jLabel4_2);

        jLabel4_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_3.setText("A");
        letrasPanel.add(jLabel4_3);

        jLabel4_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_4.setText("A");
        letrasPanel.add(jLabel4_4);

        jLabel4_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4_5.setText("A");
        letrasPanel.add(jLabel4_5);

        jLabel5_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_1.setText("A");
        letrasPanel.add(jLabel5_1);

        jLabel5_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_2.setText("A");
        letrasPanel.add(jLabel5_2);

        jLabel5_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_3.setText("A");
        letrasPanel.add(jLabel5_3);

        jLabel5_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_4.setText("A");
        letrasPanel.add(jLabel5_4);

        jLabel5_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5_5.setText("A");
        letrasPanel.add(jLabel5_5);

        jLabel6_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_1.setText("A");
        letrasPanel.add(jLabel6_1);

        jLabel6_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_2.setText("A");
        letrasPanel.add(jLabel6_2);

        jLabel6_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_3.setText("A");
        letrasPanel.add(jLabel6_3);

        jLabel6_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_4.setText("A");
        letrasPanel.add(jLabel6_4);

        jLabel6_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6_5.setText("A");
        letrasPanel.add(jLabel6_5);

        mainJPanel.add(letrasPanel, java.awt.BorderLayout.CENTER);

        bottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        bottomPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        bottomPanel.setPreferredSize(new java.awt.Dimension(200, 100));
        bottomPanel.setLayout(new java.awt.GridLayout(2, 2));

        estadojPanel1.setBackground(new java.awt.Color(255, 255, 255));
        estadojPanel1.setPreferredSize(new java.awt.Dimension(200, 100));
        estadojPanel1.setLayout(new java.awt.GridLayout(3, 0));

        maljPanel1.setBackground(new java.awt.Color(255, 255, 255));
        maljPanel1.setLayout(new java.awt.GridLayout());

        maljLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        maljLabel1.setForeground(new java.awt.Color(204, 0, 0));
        maljLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        maljLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        maljLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        maljLabel1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        maljPanel1.add(maljLabel1);

        estadojPanel1.add(maljPanel1);

        existenjPanel2.setBackground(new java.awt.Color(255, 255, 255));
        existenjPanel2.setLayout(new java.awt.GridLayout());

        existenjLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        existenjLabel1.setForeground(new java.awt.Color(204, 204, 0));
        existenjPanel2.add(existenjLabel1);

        estadojPanel1.add(existenjPanel2);

        bienjPanel3.setBackground(new java.awt.Color(255, 255, 255));
        bienjPanel3.setLayout(new java.awt.GridLayout());

        bienjLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        bienjLabel2.setForeground(new java.awt.Color(51, 153, 0));
        bienjPanel3.add(bienjLabel2);

        estadojPanel1.add(bienjPanel3);

        bottomPanel.add(estadojPanel1);

        inputjPanel2.setBackground(new java.awt.Color(255, 255, 255));

        palabrajTextField1.setPreferredSize(new java.awt.Dimension(120, 24));
        inputjPanel2.add(palabrajTextField1);

        enviarjButton1.setText("Enviar");
        inputjPanel2.add(enviarjButton1);

        bottomPanel.add(inputjPanel2);

        exitojPanel3.setBackground(new java.awt.Color(255, 255, 255));
        exitojPanel3.setLayout(new java.awt.GridBagLayout());

        finaljLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        finaljLabel1.setForeground(new java.awt.Color(0, 102, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 90, 16, 91);
        exitojPanel3.add(finaljLabel1, gridBagConstraints);

        bottomPanel.add(exitojPanel3);

        errorjPanel4.setBackground(new java.awt.Color(255, 255, 255));
        errorjPanel4.setLayout(new java.awt.GridBagLayout());

        errorjLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        errorjLabel1.setForeground(new java.awt.Color(204, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 95, 16, 96);
        errorjPanel4.add(errorjLabel1, gridBagConstraints);

        bottomPanel.add(errorjPanel4);

        mainJPanel.add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienjLabel2;
    private javax.swing.JPanel bienjPanel3;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton enviarjButton1;
    private javax.swing.JLabel errorjLabel1;
    private javax.swing.JPanel errorjPanel4;
    private javax.swing.JPanel estadojPanel1;
    private javax.swing.JLabel existenjLabel1;
    private javax.swing.JPanel existenjPanel2;
    private javax.swing.JPanel exitojPanel3;
    private javax.swing.JLabel finaljLabel1;
    private javax.swing.JPanel inputjPanel2;
    private javax.swing.JLabel jLabel1_1;
    private javax.swing.JLabel jLabel1_2;
    private javax.swing.JLabel jLabel1_3;
    private javax.swing.JLabel jLabel1_4;
    private javax.swing.JLabel jLabel1_5;
    private javax.swing.JLabel jLabel2_1;
    private javax.swing.JLabel jLabel2_2;
    private javax.swing.JLabel jLabel2_3;
    private javax.swing.JLabel jLabel2_4;
    private javax.swing.JLabel jLabel2_5;
    private javax.swing.JLabel jLabel3_1;
    private javax.swing.JLabel jLabel3_2;
    private javax.swing.JLabel jLabel3_3;
    private javax.swing.JLabel jLabel3_4;
    private javax.swing.JLabel jLabel3_5;
    private javax.swing.JLabel jLabel4_1;
    private javax.swing.JLabel jLabel4_2;
    private javax.swing.JLabel jLabel4_3;
    private javax.swing.JLabel jLabel4_4;
    private javax.swing.JLabel jLabel4_5;
    private javax.swing.JLabel jLabel5_1;
    private javax.swing.JLabel jLabel5_2;
    private javax.swing.JLabel jLabel5_3;
    private javax.swing.JLabel jLabel5_4;
    private javax.swing.JLabel jLabel5_5;
    private javax.swing.JLabel jLabel6_1;
    private javax.swing.JLabel jLabel6_2;
    private javax.swing.JLabel jLabel6_3;
    private javax.swing.JLabel jLabel6_4;
    private javax.swing.JLabel jLabel6_5;
    private javax.swing.JPanel letrasPanel;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JLabel maljLabel1;
    private javax.swing.JPanel maljPanel1;
    private javax.swing.JTextField palabrajTextField1;
    // End of variables declaration//GEN-END:variables
}
