/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @name class: Principal
 * @Objetivo: Mostrar y llevar a cabi las conversiones que se pueden realizar
 * Esta es la pantalla principal, donde son llamados cada uno de os metodos
 * usados para la conversion de los diferentes datos, son llamados cada vez que
 * se da un click en el jComboBox correspondiente, tomando el valor que se
 * encuentra en el jTextArea, asi como la posicion de la opcion seleccionada,
 * esto se lleva a la clase de calculos correspondiente donde se hacen los
 * calculos para despues mandar el resultado y ser mostrado en la jLabel
 * principal.
 *
 *
 */
package Interfaces;

import Calculos.CalculosDivisas;
import Calculos.CalculosMedidas;
import Calculos.CalculosMedidasInglesas;
import Calculos.CalculosPesos;
import Calculos.CalculosTemperatura;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Se inicializaron las clases correspondientes para cada conversion.
     *
     * Se utilizo el DecimalFormat para, como su nombre lo dice, darle un
     * formato a los diferentes resultados que nos aparecian en las diferentes
     * conversiones
     */

    CalculosDivisas Calculo = new CalculosDivisas();
    CalculosTemperatura Temp = new CalculosTemperatura();
    CalculosMedidas Med = new CalculosMedidas();
    CalculosPesos Peso = new CalculosPesos();
    CalculosMedidasInglesas MedIn = new CalculosMedidasInglesas();
    DecimalFormat df = new DecimalFormat("#.00");
    DecimalFormat dc = new DecimalFormat("#.0000");

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        JPanelDivisas = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        Pics1 = new javax.swing.JLabel();
        Pics2 = new javax.swing.JLabel();
        Pics3 = new javax.swing.JLabel();
        Pics4 = new javax.swing.JLabel();
        Pics5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextArea2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de Moneda Alura");
        setBackground(new java.awt.Color(0, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Pesos Mexicanos a Dolares", "Pesos Mexicanos a Euros", "Pesos Mexicanos a Libras Esterlinas", "Pesos Mexicanos a Yen Japones", "Pesos Mexicanos a Won Sur Coreano", "Dolares a Pesos Mexicanos", "Euros a a Pesos Mexicanos", "Libras Esterlinas a Pesos Mexicanos", "Yen Japones a a Pesos Mexicanos", "Won Sur Coreano a a Pesos Mexicanos" }));
        jComboBox1.setToolTipText("Selecciona algunas de las opciones");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Divisas");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Temperaturas");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit" }));
        jComboBox2.setToolTipText("Selecciona algunas de las opciones");
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Unidades de Medidas");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Centimetro a Milimetro", "Centimetro a Decimetro", "Centimetro a Metro", "Centimetro a Decametro", "Centimetro a Hectometro", "Centimetro a Kilometro", " " }));
        jComboBox3.setToolTipText("Selecciona algunas de las opciones");
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Pesos");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Gramo a Kilogramo", "Gramo a Hectogramo", "Gramo a Decagramo", "Gramo a Decigramo", "Gramo a Centigramo", "Gramo a Miligramo" }));
        jComboBox4.setToolTipText("Selecciona algunas de las opciones");
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Unidades de Medidas Inglesas");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Centimetro a Pulgada", "Centimetro a Pie", "Centimetro a Yarda", "Centimetro a Milla", " " }));
        jComboBox5.setToolTipText("Selecciona algunas de las opciones");
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        Pics1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/cambio-de-divisas.png"))); // NOI18N

        Pics2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/termometro.png"))); // NOI18N

        Pics3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/la-medida.png"))); // NOI18N

        Pics4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/perdida-de-peso.png"))); // NOI18N

        Pics5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/cinta-metrica.png"))); // NOI18N

        jButton1.setText("Limpiar Espacio");
        jButton1.setToolTipText("Da click para limpiar el espacio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelDivisasLayout = new javax.swing.GroupLayout(JPanelDivisas);
        JPanelDivisas.setLayout(JPanelDivisasLayout);
        JPanelDivisasLayout.setHorizontalGroup(
            JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDivisasLayout.createSequentialGroup()
                .addGroup(JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDivisasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanelDivisasLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pics1))
                            .addGroup(JPanelDivisasLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pics2))
                            .addGroup(JPanelDivisasLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pics3))
                            .addGroup(JPanelDivisasLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Pics4))
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPanelDivisasLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Pics5))
                            .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(JPanelDivisasLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelDivisasLayout.setVerticalGroup(
            JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDivisasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(Pics1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pics2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pics3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pics4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPanelDivisasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pics5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 71)); // NOI18N
        jLabel2.setText("0.00");
        jLabel2.setToolTipText("Resultado");

        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jTextArea2.setToolTipText("Escriba la cantidad");
        jTextArea2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextArea2KeyTyped(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/ciencias-economicas.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jLabel8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel8KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JPanelDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextArea2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8))
                    .addComponent(JPanelDivisas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metodo utilizado para regresar al primer elemento de cada jComboBox, este se utilizara mas adelante
    public void Regreso() {
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        jComboBox5.setSelectedIndex(0);
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        /**
         * En este este JCombobox como en los demas, se obtiene le Id del
         * elemento que se selecciona este esenviado junto conl valor que se
         * encuentra en el jTextarea al metodo correspondiente, en este caso
         * "Cambio", que a su vez retorna un total que despues es mostrado en
         * pantalla en el jLabel. En caso de el jTextArea este vacio, no se
         * envia nada al metodo y se manda mostrar directamente un "0.00".
         *
         * Este Metodo o forma de trabajo funcina igual en cada jComboBox
         */
        int Posicion = jComboBox1.getSelectedIndex();
        this.jLabel2.setText("0.00");

        if (jTextArea2.getText().length() != 0) {
            double Valor = Double.parseDouble(this.jTextArea2.getText());
            this.jLabel2.setText(df.format(Calculo.Cambio(Valor, Posicion)));
        } else {
            this.jLabel2.setText("0.00");
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        int Posicion = jComboBox2.getSelectedIndex();
        this.jLabel2.setText("0.00");

        if (jTextArea2.getText().length() != 0) {
            double Valor = Double.parseDouble(this.jTextArea2.getText());
            this.jLabel2.setText(df.format(Temp.Cambio(Valor, Posicion)));
        } else {
            this.jLabel2.setText("0.00");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        int Posicion = jComboBox3.getSelectedIndex();
        this.jLabel2.setText("0.00");

        if (jTextArea2.getText().length() != 0) {
            double Valor = Double.parseDouble(this.jTextArea2.getText());
            this.jLabel2.setText(df.format(Med.Cambio(Valor, Posicion)));
        } else {
            this.jLabel2.setText("0.00");
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        int Posicion = jComboBox4.getSelectedIndex();
        this.jLabel2.setText("0.00");

        if (jTextArea2.getText().length() != 0) {
            double Valor = Double.parseDouble(this.jTextArea2.getText());
            this.jLabel2.setText(df.format(Peso.Cambio(Valor, Posicion)));
        } else {
            this.jLabel2.setText("0.00");
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        int Posicion = jComboBox5.getSelectedIndex();
        this.jLabel2.setText("0.00");

        if (jTextArea2.getText().length() != 0) {
            double Valor = Double.parseDouble(this.jTextArea2.getText());
            this.jLabel2.setText(df.format(MedIn.Cambio(Valor, Posicion)));
        } else {
            this.jLabel2.setText("0.00");
        }
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jTextArea2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea2KeyTyped
        // TODO add your handling code here:
        //El metodo que se ve a continuacion se utilizo validar los datos que
        //entraban en el jTeztArea y de esta manera solo aceptar numeros y algunos caractares especiales("," y ".")
        char car = evt.getKeyChar();
        if ((car < '0' || car > '9') && (car < ',' || car > '.')) {
            evt.consume();
        }

    }//GEN-LAST:event_jTextArea2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        /**
         * En este boton, como su nombre muestra, se retroede en cada jComboBox
         * para regresar al Id 0, esto con auda del metodo regreso, además de
         * dejar en 0.00 el jLevel que nos muestra los resultados y dejar vacio
         * nuevamente el jTextArea
         */
        Regreso();
        this.jLabel2.setText("0.00");
        this.jTextArea2.setText("");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel8KeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel8KeyPressed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Alura Challenge Convertidor de Moneda");
    }//GEN-LAST:event_jLabel8MouseClicked

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
    private javax.swing.JPanel JPanelDivisas;
    private javax.swing.JLabel Pics1;
    private javax.swing.JLabel Pics2;
    private javax.swing.JLabel Pics3;
    private javax.swing.JLabel Pics4;
    private javax.swing.JLabel Pics5;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextArea2;
    // End of variables declaration//GEN-END:variables
}
