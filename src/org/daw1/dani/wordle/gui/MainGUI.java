/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.daw1.dani.wordle.gui;


import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.daw1.dani.wordle.wordleclass.IMotor;
import org.daw1.dani.wordle.wordleclass.MotorTest;
import javax.swing.SwingUtilities;
import org.daw1.dani.wordle.wordleclass.MotorArchivo;
import org.daw1.dani.wordle.wordleclass.MotorBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author dani
 */
public  class MainGUI extends javax.swing.JFrame {
    
    public static java.awt.Color COLOR_VERDE = new java.awt.Color(51,102,0);
    public static java.awt.Color COLOR_AMARILLO = new java.awt.Color(204,204,0);
    public static java.awt.Color COLOR_ROJO = new java.awt.Color(204,0,0);
    public static java.awt.Color COLOR_DEFAULT = new java.awt.Color(187,187,187);
    
    private static final int MAX_INTENTOS = 6;
    private static final int TAMANO_PALABRA = 5;
    private static IMotor motor = new MotorTest();
    private static int numeroIntentos;
    private static String palabra;
    private Set<Character> amarillo = new TreeSet<>();
    private Set<Character> rojo = new TreeSet<>();
    private Set<Character> verde = new TreeSet<>();

   
    
    private final javax.swing.JLabel[][] labels = new javax.swing.JLabel[MAX_INTENTOS][TAMANO_PALABRA];
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        inicializarLabels();
        Objects.requireNonNull(motor);
        this.motor = motor;
        try {
            this.palabra = this.motor.obtenerPalabraAleatoria().toUpperCase();
        } catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        this.exitojPanel.setVisible(false);
        this.amarillo.clear();
        this.rojo.clear();
        this.verde.clear();
        jRadioButtonMenuItem1.setSelected(false);
        jRadioButtonTest.setSelected(true);
        jRadioButtonArchivo.setSelected(false);
        jRadioButtonBaseDatosESP.setSelected(false);
        jRadioButtonBaseDatosGAL.setSelected(false);
        jRadioButtonEditarMotor.setSelected(false);
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
        MaljLabel = new javax.swing.JLabel();
        existenjPanel2 = new javax.swing.JPanel();
        ExistenjLabel = new javax.swing.JLabel();
        bienjPanel3 = new javax.swing.JPanel();
        BienjLabel = new javax.swing.JLabel();
        inputjPanel2 = new javax.swing.JPanel();
        palabrajTextField = new javax.swing.JTextField();
        enviarjButton1 = new javax.swing.JButton();
        exitojPanel = new javax.swing.JPanel();
        finaljLabel = new javax.swing.JLabel();
        errorjPanel4 = new javax.swing.JPanel();
        errorjLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuI = new javax.swing.JMenu();
        jRadioButtonTest = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonArchivo = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonBaseDatosESP = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonBaseDatosGAL = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonEditarMotor = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daw1_Wordle_Dani");

        mainJPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainJPanel.setLayout(new java.awt.BorderLayout());

        letrasPanel.setBackground(new java.awt.Color(255, 255, 255));
        letrasPanel.setLayout(new java.awt.GridLayout(6, 5));

        jLabel1_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel1_1);

        jLabel1_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel1_2);

        jLabel1_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel1_3);

        jLabel1_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel1_4);

        jLabel1_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel1_5);

        jLabel2_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel2_1);

        jLabel2_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel2_2);

        jLabel2_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel2_3);

        jLabel2_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel2_4);

        jLabel2_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel2_5);

        jLabel3_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel3_1);

        jLabel3_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel3_2);

        jLabel3_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel3_3);

        jLabel3_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel3_4);

        jLabel3_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel3_5);

        jLabel4_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel4_1);

        jLabel4_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel4_2);

        jLabel4_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel4_3);

        jLabel4_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel4_4);

        jLabel4_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel4_5);

        jLabel5_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel5_1);

        jLabel5_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel5_2);

        jLabel5_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel5_3);

        jLabel5_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel5_4);

        jLabel5_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel5_5);

        jLabel6_1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel6_1);

        jLabel6_2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel6_2);

        jLabel6_3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel6_3);

        jLabel6_4.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        letrasPanel.add(jLabel6_4);

        jLabel6_5.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        maljPanel1.setLayout(new java.awt.GridLayout(1, 0));

        MaljLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        MaljLabel.setForeground(new java.awt.Color(204, 0, 0));
        MaljLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MaljLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        MaljLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        MaljLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        maljPanel1.add(MaljLabel);

        estadojPanel1.add(maljPanel1);

        existenjPanel2.setBackground(new java.awt.Color(255, 255, 255));
        existenjPanel2.setLayout(new java.awt.GridLayout(1, 0));

        ExistenjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ExistenjLabel.setForeground(new java.awt.Color(204, 204, 0));
        existenjPanel2.add(ExistenjLabel);

        estadojPanel1.add(existenjPanel2);

        bienjPanel3.setBackground(new java.awt.Color(255, 255, 255));
        bienjPanel3.setLayout(new java.awt.GridLayout(1, 0));

        BienjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        BienjLabel.setForeground(new java.awt.Color(51, 153, 0));
        bienjPanel3.add(BienjLabel);

        estadojPanel1.add(bienjPanel3);

        bottomPanel.add(estadojPanel1);

        inputjPanel2.setBackground(new java.awt.Color(255, 255, 255));

        palabrajTextField.setPreferredSize(new java.awt.Dimension(120, 24));
        palabrajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabrajTextFieldActionPerformed(evt);
            }
        });
        inputjPanel2.add(palabrajTextField);

        enviarjButton1.setText("Enviar");
        enviarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarjButton1ActionPerformed(evt);
            }
        });
        inputjPanel2.add(enviarjButton1);

        bottomPanel.add(inputjPanel2);

        exitojPanel.setBackground(new java.awt.Color(255, 255, 255));
        exitojPanel.setLayout(new java.awt.GridBagLayout());

        finaljLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        finaljLabel.setForeground(new java.awt.Color(0, 102, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 90, 16, 91);
        exitojPanel.add(finaljLabel, gridBagConstraints);

        bottomPanel.add(exitojPanel);

        errorjPanel4.setBackground(new java.awt.Color(255, 255, 255));
        errorjPanel4.setLayout(new java.awt.GridBagLayout());

        errorjLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        errorjLabel.setForeground(new java.awt.Color(204, 0, 0));
        errorjLabel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        errorjLabel.setMinimumSize(new java.awt.Dimension(191, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 95, 16, 96);
        errorjPanel4.add(errorjLabel, gridBagConstraints);

        bottomPanel.add(errorjPanel4);

        mainJPanel.add(bottomPanel, java.awt.BorderLayout.PAGE_END);

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArchivoActionPerformed(evt);
            }
        });

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenuArchivo);

        jMenuI.setText("Motores");

        jRadioButtonTest.setSelected(true);
        jRadioButtonTest.setText("Test");
        jRadioButtonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTestActionPerformed(evt);
            }
        });
        jMenuI.add(jRadioButtonTest);

        jRadioButtonArchivo.setSelected(true);
        jRadioButtonArchivo.setText("Archivo");
        jRadioButtonArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonArchivoActionPerformed(evt);
            }
        });
        jMenuI.add(jRadioButtonArchivo);

        jRadioButtonBaseDatosESP.setSelected(true);
        jRadioButtonBaseDatosESP.setText("BaseDatos_ESPA??OL");
        jRadioButtonBaseDatosESP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBaseDatosESPActionPerformed(evt);
            }
        });
        jMenuI.add(jRadioButtonBaseDatosESP);

        jRadioButtonBaseDatosGAL.setSelected(true);
        jRadioButtonBaseDatosGAL.setText("BaseDatos_GALEGO");
        jRadioButtonBaseDatosGAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBaseDatosGALActionPerformed(evt);
            }
        });
        jMenuI.add(jRadioButtonBaseDatosGAL);

        jRadioButtonEditarMotor.setSelected(true);
        jRadioButtonEditarMotor.setText("Administrar motor");
        jRadioButtonEditarMotor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEditarMotorActionPerformed(evt);
            }
        });
        jMenuI.add(jRadioButtonEditarMotor);

        jMenuBar1.add(jMenuI);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArchivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuArchivoActionPerformed

    private void enviarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarjButton1ActionPerformed
        this.errorjLabel.setText("");
        String insertada = this.palabrajTextField.getText().toUpperCase();
        if (insertada.length() != 5) {
            this.errorjLabel.setText("palabras de 5 letras");
        }
        else if (this.motor.checkPalabra(insertada)) {
            procesarPalabraInterfaz(insertada, numeroIntentos);
            numeroIntentos++;
            if (insertada.equals(this.palabra)) {
                this.exitojPanel.setVisible(true);
                this.finaljLabel.setText("Ganaste en " + numeroIntentos + " intentos");
                this.finaljLabel.setVisible(true);
                this.enviarjButton1.setEnabled(false);
                this.palabrajTextField.setEnabled(false);
            }
            else {
                this.palabrajTextField.setText("");
                if (this.numeroIntentos == 6) {
                    this.exitojPanel.setVisible(true);
                    this.finaljLabel.setText("??Has perdido!");
                    this.finaljLabel.setForeground(MainGUI.COLOR_ROJO);
                    this.finaljLabel.setVisible(true);
                    this.enviarjButton1.setEnabled(false);
                    this.palabrajTextField.setEnabled(false);
                }
                else {
                    this.palabrajTextField.requestFocus();
                }
            }
        }
        else {
            this.errorjLabel.setText("La palabra no existe");
        }
    }//GEN-LAST:event_enviarjButton1ActionPerformed

    private void palabrajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabrajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_palabrajTextFieldActionPerformed

        
    //Boton de nueva Partida
    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        if(jRadioButtonMenuItem1.isSelected()){
           jRadioButtonMenuItem1.setSelected(false);
           resetJuego();
       }
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTestActionPerformed
        if(this.jRadioButtonTest.isSelected()){
          this.motor = new MotorTest();
          this.jRadioButtonArchivo.setSelected(false);
          this.jRadioButtonBaseDatosESP.setSelected(false);
          this.jRadioButtonBaseDatosGAL.setSelected(false);
          this.jRadioButtonTest.setEnabled(false);
          this.jRadioButtonArchivo.setEnabled(true);
          this.jRadioButtonBaseDatosESP.setEnabled(true);
          this.jRadioButtonBaseDatosGAL.setEnabled(true);
          resetJuego();
      }
    }//GEN-LAST:event_jRadioButtonTestActionPerformed

    private void jRadioButtonArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonArchivoActionPerformed
       if(this.jRadioButtonArchivo.isSelected()){
          this.motor = new MotorArchivo();
          this.jRadioButtonTest.setSelected(false);
          this.jRadioButtonBaseDatosESP.setSelected(false);
          this.jRadioButtonBaseDatosGAL.setSelected(false);
          this.jRadioButtonArchivo.setEnabled(false);
          this.jRadioButtonTest.setEnabled(true);
          this.jRadioButtonBaseDatosESP.setEnabled(true);
          this.jRadioButtonBaseDatosGAL.setEnabled(true);
           
          resetJuego();
      }
    }//GEN-LAST:event_jRadioButtonArchivoActionPerformed

    private void jRadioButtonBaseDatosESPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBaseDatosESPActionPerformed
        if(this.jRadioButtonBaseDatosESP.isSelected()){
          this.motor = new MotorBD("ESPA??OL");
          this.jRadioButtonArchivo.setSelected(false);
          this.jRadioButtonTest.setSelected(false);
          this.jRadioButtonBaseDatosGAL.setSelected(false);
          this.jRadioButtonBaseDatosESP.setEnabled(false);
           this.jRadioButtonArchivo.setEnabled(true);
          this.jRadioButtonTest.setEnabled(true);
          this.jRadioButtonBaseDatosGAL.setEnabled(true);
          resetJuego();
      }
    }//GEN-LAST:event_jRadioButtonBaseDatosESPActionPerformed

    private void jRadioButtonEditarMotorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEditarMotorActionPerformed
        if(this.jRadioButtonEditarMotor.isSelected()){
            AdministrarMotor ADmotor = new AdministrarMotor(this, rootPaneCheckingEnabled);
            ADmotor.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButtonEditarMotorActionPerformed

    private void jRadioButtonBaseDatosGALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBaseDatosGALActionPerformed
        if(this.jRadioButtonBaseDatosGAL.isSelected()){
          this.motor = new MotorBD("GALLEGO");
          this.jRadioButtonArchivo.setSelected(false);
          this.jRadioButtonTest.setSelected(false);
          this.jRadioButtonBaseDatosESP.setSelected(false);
          this.jRadioButtonBaseDatosGAL.setEnabled(false);
          this.jRadioButtonBaseDatosESP.setEnabled(true);
           this.jRadioButtonArchivo.setEnabled(true);
          this.jRadioButtonTest.setEnabled(true);
          resetJuego();
      }
    }//GEN-LAST:event_jRadioButtonBaseDatosGALActionPerformed

    private void resetJuego(){
      try{
        for(int i = 1;i <= MAX_INTENTOS;i++){
            for(int j = 1;j <= TAMANO_PALABRA;j++){
                labels[i-1][j-1].setText("");  
            }
        }
        this.palabra = this.motor.obtenerPalabraAleatoria().toUpperCase();
        verde.clear();
        amarillo.clear();
        rojo.clear();
        this.enviarjButton1.setEnabled(true);
        this.palabrajTextField.setEnabled(true);
        this.exitojPanel.setVisible(false);
        this.finaljLabel.setVisible(false);
        this.MaljLabel.setText("");
        this.ExistenjLabel.setText("");
        this.BienjLabel.setText("");
        this.numeroIntentos = 0;
    }catch (SQLException ex) {
            Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        
    }

    
    
        
     private void procesarPalabraInterfaz(final String insertada, final int intento) {
        for (int i = 0; i < 5; ++i) {
            final char c = insertada.charAt(i);
            labels[intento][i].setText(String.valueOf(c));
            if (this.palabra.charAt(i) == c) {
                labels[intento][i].setForeground(COLOR_VERDE);
                this.amarillo.remove(c);
                this.verde.add(c);
                this.ExistenjLabel.setText(this.amarillo.toString());
                this.BienjLabel.setText(this.verde.toString());
            }
            else if (this.palabra.contains(String.valueOf(c))) {
                if (!this.verde.contains(c)) {
                     labels[intento][i].setForeground(COLOR_AMARILLO);
                    this.amarillo.add(c);
                    this.ExistenjLabel.setText(this.amarillo.toString());
                }
            }
            else {
                labels[intento][i].setForeground(COLOR_ROJO);
                this.rojo.add(c);
                this.MaljLabel.setText(this.rojo.toString());
            }
        }
    }
  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
    
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BienjLabel;
    private javax.swing.JLabel ExistenjLabel;
    private javax.swing.JLabel MaljLabel;
    private javax.swing.JPanel bienjPanel3;
    private javax.swing.JPanel bottomPanel;
    private javax.swing.JButton enviarjButton1;
    private javax.swing.JLabel errorjLabel;
    private javax.swing.JPanel errorjPanel4;
    private javax.swing.JPanel estadojPanel1;
    private javax.swing.JPanel existenjPanel2;
    private javax.swing.JPanel exitojPanel;
    private javax.swing.JLabel finaljLabel;
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
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuI;
    private javax.swing.JRadioButtonMenuItem jRadioButtonArchivo;
    private javax.swing.JRadioButtonMenuItem jRadioButtonBaseDatosESP;
    private javax.swing.JRadioButtonMenuItem jRadioButtonBaseDatosGAL;
    private javax.swing.JRadioButtonMenuItem jRadioButtonEditarMotor;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonTest;
    private javax.swing.JPanel letrasPanel;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JPanel maljPanel1;
    private javax.swing.JTextField palabrajTextField;
    // End of variables declaration//GEN-END:variables
}
