/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_inventario.vistas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import problema_inventario.models.Probabilistico;

/**
 *
 * @author Slaush
 */
public class InputProbView extends javax.swing.JFrame {

    /**
     * Creates new form InputProbView
     */
    public InputProbView(String unidad) 
    {
        super("Problema de Inventario Probabilístico");
        this.unidad = unidad;
        initComponents();
        initLabel();
        initButtons();
        restringirTeclas();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        demandaInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        demandaLabel = new javax.swing.JLabel();
        desvDemandaInput = new javax.swing.JTextField();
        mantenimientoLabel = new javax.swing.JLabel();
        mantenimientoInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tiempoInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        desvDlabel = new javax.swing.JLabel();
        costoOrdenInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        costoVentaLabel = new javax.swing.JLabel();
        costoVentaInput = new javax.swing.JTextField();
        varianzaTimeInput = new javax.swing.JTextField();
        adquisicionInput = new javax.swing.JTextField();
        varianzaTiempoLabel = new javax.swing.JLabel();
        escasezLabel = new javax.swing.JLabel();
        escasezInput = new javax.swing.JTextField();
        eraseButton = new javax.swing.JButton();
        resolveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        demandaInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        demandaInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        demandaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demandaInputActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto Cn", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTRADA");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        demandaLabel.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        demandaLabel.setText("Media de la Demanda:");
        demandaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        desvDemandaInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        desvDemandaInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mantenimientoLabel.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        mantenimientoLabel.setText("Costo de mantenimiento");
        mantenimientoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mantenimientoInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        mantenimientoInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mantenimientoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoInputActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        jLabel6.setText("Lead Time");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tiempoInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        tiempoInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        jLabel7.setText("Costo de adquisición de una unidad sin descuento:");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        desvDlabel.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        desvDlabel.setText("Desviación estándar de la Demanda:");
        desvDlabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        costoOrdenInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        costoOrdenInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        costoOrdenInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoOrdenInputActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        jLabel4.setText("Costo de orden:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        costoVentaLabel.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        costoVentaLabel.setText("Costo de Venta:");
        costoVentaLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        costoVentaInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        costoVentaInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        costoVentaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoVentaInputActionPerformed(evt);
            }
        });

        varianzaTimeInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        varianzaTimeInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        varianzaTimeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varianzaTimeInputActionPerformed(evt);
            }
        });

        adquisicionInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        adquisicionInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adquisicionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adquisicionInputActionPerformed(evt);
            }
        });

        varianzaTiempoLabel.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        varianzaTiempoLabel.setText("varianza del lead time");
        varianzaTiempoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        escasezLabel.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        escasezLabel.setText("Costo de Escasez Unitaria:");
        escasezLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        escasezInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        escasezInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        escasezInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escasezInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(varianzaTiempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(varianzaTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costoOrdenInput)
                                    .addComponent(adquisicionInput)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mantenimientoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(demandaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desvDlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mantenimientoInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desvDemandaInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(demandaInput)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(tiempoInput))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(costoVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costoVentaInput)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(escasezLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(escasezInput)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(demandaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(demandaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desvDemandaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desvDlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mantenimientoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mantenimientoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varianzaTimeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(varianzaTiempoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adquisicionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoOrdenInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costoVentaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costoVentaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escasezLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escasezInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        eraseButton.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        eraseButton.setText("Borrar Todo");
        eraseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eraseButtonActionPerformed(evt);
            }
        });

        resolveButton.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        resolveButton.setText("Resolver");
        resolveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(eraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resolveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void demandaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demandaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demandaInputActionPerformed

    private void mantenimientoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoInputActionPerformed

    }//GEN-LAST:event_mantenimientoInputActionPerformed

    private void adquisicionInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adquisicionInputActionPerformed

    }//GEN-LAST:event_adquisicionInputActionPerformed

    private void costoOrdenInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoOrdenInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoOrdenInputActionPerformed

    private void escasezInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escasezInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escasezInputActionPerformed

    private void eraseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseButtonActionPerformed
       borrarTodoAction();
    }//GEN-LAST:event_eraseButtonActionPerformed

    private void resolveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolveButtonActionPerformed
        try
        {
            if(validaciones() != true)
            {
                    Probabilistico probabilistico = new Probabilistico();
            
                    probabilistico.setDemanda(Integer.parseInt(demandaInput.getText()));
                    probabilistico.setDesvDemanda(Float.parseFloat(desvDemandaInput.getText()));
                    probabilistico.setCosto_mantener(mantenimientoInput.getText());
                    probabilistico.setTiempo_carga(Float.parseFloat(tiempoInput.getText()));
                    
                    if(varianzaTimeInput.getText().isEmpty() != true)
                    {
                        probabilistico.setVarianzaL(Float.parseFloat(varianzaTimeInput.getText())); 
                    }
                    else
                    {
                        probabilistico.setVarianzaL(0);
                    }
                    
                    if(adquisicionInput.getText().isEmpty() != true)
                    {
                        probabilistico.setCosto_adquisicion(Float.parseFloat(adquisicionInput.getText())); 
                    }

                    probabilistico.setCosto_orden(Float.parseFloat(costoOrdenInput.getText()));
                    
                    if(costoVentaInput.getText().isEmpty() != true)
                    {
                        probabilistico.setCosto_venta(Float.parseFloat(costoVentaInput.getText())); 
                    }
                    else
                    {
                        probabilistico.setCosto_venta(0);
                    }
                    
                    probabilistico.setCostoUnitEscasez(Float.parseFloat(escasezInput.getText()));
                  
                    RespuestaProb respuestaBasicoFrame = new RespuestaProb(probabilistico, unidad);
                    respuestaBasicoFrame.setVisible(true);
            }
        }
        catch(Exception excepcion)
        {      
            if(demandaInput.getText().isEmpty() == true )
            {
                JOptionPane.showMessageDialog(null,"Error: La media de la demanda no puede ser nula","ERROR",JOptionPane.ERROR_MESSAGE);     
            }
            if(costoOrdenInput.getText().isEmpty() == true )
            {
                JOptionPane.showMessageDialog(null,"Error: El costo de orden no puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
            if(mantenimientoInput.getText().isEmpty() == true )
            {
                JOptionPane.showMessageDialog(null,"Error: El costo de mantenimiento no puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
              
            JOptionPane.showMessageDialog(null,"Error: "+excepcion.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }  
        

    }//GEN-LAST:event_resolveButtonActionPerformed

    private void costoVentaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoVentaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costoVentaInputActionPerformed

    private void varianzaTimeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varianzaTimeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varianzaTimeInputActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adquisicionInput;
    private javax.swing.JTextField costoOrdenInput;
    private javax.swing.JTextField costoVentaInput;
    private javax.swing.JLabel costoVentaLabel;
    private javax.swing.JTextField demandaInput;
    private javax.swing.JLabel demandaLabel;
    private javax.swing.JTextField desvDemandaInput;
    private javax.swing.JLabel desvDlabel;
    private javax.swing.JButton eraseButton;
    private javax.swing.JTextField escasezInput;
    private javax.swing.JLabel escasezLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mantenimientoInput;
    private javax.swing.JLabel mantenimientoLabel;
    private javax.swing.JButton resolveButton;
    private javax.swing.JTextField tiempoInput;
    private javax.swing.JLabel varianzaTiempoLabel;
    private javax.swing.JTextField varianzaTimeInput;
    // End of variables declaration//GEN-END:variables
private String unidad;
 private KeyListener eventosDeTecla;

private void initLabel() 
    {
      demandaLabel.setText("Media de la demanda por " + unidad);
      mantenimientoLabel.setText("Costo unitario de mantenimiento por " + unidad+":");
      jLabel6.setText("Tiempo de espera para una nueva orden en " + unidad+":");
      varianzaTiempoLabel.setText("Varianza de tiempo de entrega en "+ unidad+":");
    }

private void initButtons()
    {
        eraseButton.setToolTipText("Presione para borrar todos los datos");
        eraseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eraseButton.setFocusable(false);
        
        resolveButton.setToolTipText("Presione para resolver el problema");
        resolveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resolveButton.setFocusable(false);   
    }

private void borrarTodoAction()
    {   
        demandaInput.setText("");
        desvDemandaInput.setText("");
        mantenimientoInput.setText("");
        tiempoInput.setText("");
        adquisicionInput.setText("");
        costoOrdenInput.setText("");
        escasezInput.setText("");
        System.gc();
    }

private void restringirTeclas()//PONER BIEN LAS RESTRICCIONES
    {
        eventosDeTecla = new KeyListener() 
        {
            @Override
            public void keyTyped(KeyEvent ke) 
            {
               char caracter = ke.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)&&(caracter != '.') &&(caracter != '/') )
                   ke.consume();  
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        };
        
        
        demandaInput.addKeyListener(eventosDeTecla);//poner el resto
        desvDemandaInput.addKeyListener(eventosDeTecla);
        tiempoInput.addKeyListener(eventosDeTecla);
        costoOrdenInput.addKeyListener(eventosDeTecla);
        adquisicionInput.addKeyListener(eventosDeTecla);
        costoVentaInput.addKeyListener(eventosDeTecla);
        escasezInput.addKeyListener(eventosDeTecla);
        
    }


    public boolean validaciones()
    {
        if(mantenimientoInput.getText().contains("%") && (adquisicionInput.getText().isEmpty()== true || adquisicionInput.getText().equals("0") ))
        {
                JOptionPane.showMessageDialog(null,"Error: Si el costo de mantenimiento es con %, el costo de adquisición no\n"+ "puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        
        if(demandaInput.getText().equals("0"))
        {
                JOptionPane.showMessageDialog(null,"Error: La demanda no puede ser nula","ERROR",JOptionPane.ERROR_MESSAGE);    
                return true;
        }
        if(costoOrdenInput.getText().equals("0"))
        {
                JOptionPane.showMessageDialog(null,"Error: El costo de orden no puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
            
        if(mantenimientoInput.getText().equals("0"))
        {
                JOptionPane.showMessageDialog(null,"Error: El costo de mantenimiento no puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }          
        
        return false;
    }

    public JTextField getAdquisicionInput() {
        return adquisicionInput;
    }

    public void setAdquisicionInput(JTextField adquisicionInput) {
        this.adquisicionInput = adquisicionInput;
    }

    public JTextField getCostoOrdenInput() {
        return costoOrdenInput;
    }

    public void setCostoOrdenInput(JTextField costoOrdenInput) {
        this.costoOrdenInput = costoOrdenInput;
    }

    public JTextField getCostoVentaInput() {
        return costoVentaInput;
    }

    public void setCostoVentaInput(JTextField costoVentaInput) {
        this.costoVentaInput = costoVentaInput;
    }

    public JTextField getDemandaInput() {
        return demandaInput;
    }

    public void setDemandaInput(JTextField demandaInput) {
        this.demandaInput = demandaInput;
    }

    public JTextField getDesvDemandaInput() {
        return desvDemandaInput;
    }

    public void setDesvDemandaInput(JTextField desvDemandaInput) {
        this.desvDemandaInput = desvDemandaInput;
    }

    public JTextField getEscasezInput() {
        return escasezInput;
    }

    public void setEscasezInput(JTextField escasezInput) {
        this.escasezInput = escasezInput;
    }

    public JTextField getMantenimientoInput() {
        return mantenimientoInput;
    }

    public void setMantenimientoInput(JTextField mantenimientoInput) {
        this.mantenimientoInput = mantenimientoInput;
    }

    public JTextField getTiempoInput() {
        return tiempoInput;
    }

    public void setTiempoInput(JTextField tiempoInput) {
        this.tiempoInput = tiempoInput;
    }

    public JTextField getVarianzaTimeInput() {
        return varianzaTimeInput;
    }

    public void setVarianzaTimeInput(JTextField varianzaTimeInput) {
        this.varianzaTimeInput = varianzaTimeInput;
    }
    
    




}