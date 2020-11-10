package moneda;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GALATEA
 */
public class Cotizador extends javax.swing.JFrame {

    /**
     * Creates new form Cotizador
     */
    public Cotizador() {
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

        jLabel3 = new javax.swing.JLabel();
        txt_ValorIn = new javax.swing.JTextField();
        comboMoneda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_Cotizar = new javax.swing.JButton();
        lbl_resultado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor de Moneda");
        setLocation(new java.awt.Point(500, 200));

        jLabel3.setText("Ingrese el monto en pesos");

        txt_ValorIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValorInActionPerformed(evt);
            }
        });

        comboMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Euro", "Real" }));
        comboMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMonedaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Moneda");

        btn_Cotizar.setText("Cotizar");
        btn_Cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CotizarActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moneda/img/logo2.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Cotizar)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ValorIn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(comboMoneda, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(87, 87, 87)
                        .addComponent(lbl_resultado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ValorIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_resultado))
                .addGap(18, 18, 18)
                .addComponent(btn_Cotizar)
                .addGap(24, 24, 24))
        );

        jLabel4.getAccessibleContext().setAccessibleName("logo");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CotizarActionPerformed
        
        if(txt_ValorIn.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingrese un valor");
        }else if(Integer.parseInt(txt_ValorIn.getText())< 0) { 
          JOptionPane.showMessageDialog(null, "Ingrese un valor mayor a cero");
        }else{
            int MontoIngresado=Integer.parseInt(txt_ValorIn.getText());
            int resultado = 0;
        
        int index = comboMoneda.getSelectedIndex();
        
        switch(index){
            //dolar
            case 0:
                resultado = MontoIngresado/(133);
                
                break;
            //euro    
            case 1:
                resultado = MontoIngresado/(91);
                
                break;
            //real
            case 2:
                resultado = MontoIngresado/(11);
                
                break;
        }
        lbl_resultado.setText("El valor en " + comboMoneda.getSelectedItem().toString() + " es: " + resultado );
        }
        
    }//GEN-LAST:event_btn_CotizarActionPerformed

    
    private void comboMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMonedaActionPerformed
        
    }//GEN-LAST:event_comboMonedaActionPerformed

    private void txt_ValorInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValorInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValorInActionPerformed

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
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cotizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cotizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cotizar;
    private javax.swing.JComboBox<String> comboMoneda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JTextField txt_ValorIn;
    // End of variables declaration//GEN-END:variables
}
