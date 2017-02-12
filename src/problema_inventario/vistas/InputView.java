
package problema_inventario.vistas;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import problema_inventario.models.DeterministaBasico;
import problema_inventario.models.DeterministaDescuento;
import problema_inventario.models.DeterministaEscasez;

/**
 *
 * @author Jessele
 */
public class InputView extends javax.swing.JFrame 
{
    public InputView(String unidad) 
    {
        super("Problema de Inventario Determinista");
        this.unidad = unidad;
        initComponents();
        initLabel();
        initButtons();
        restringirTeclas(); 
        jMenuBar1.setVisible(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    InputView() 
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        demandaInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ordenInput = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mantenimientoInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tiempoInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        adquisicionInput = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        descuentoInput = new javax.swing.JTextField();
        escasezLabel = new javax.swing.JLabel();
        escasezInput = new javax.swing.JTextField();
        eraseButton = new javax.swing.JButton();
        resolveButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();

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

        jLabel3.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        jLabel3.setText("Demanda");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        jLabel4.setText("Costo de orden:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ordenInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        ordenInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        jLabel5.setText("Costo de mantenimiento");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        adquisicionInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        adquisicionInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adquisicionInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adquisicionInputActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        jLabel8.setText("Cantidad de puntos de quiebre (descuentos):");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        descuentoInput.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        descuentoInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        descuentoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descuentoInputActionPerformed(evt);
            }
        });

        escasezLabel.setFont(new java.awt.Font("Roboto Cn", 1, 12)); // NOI18N
        escasezLabel.setText("Costo de Escasez");
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(escasezLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(demandaInput, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addComponent(ordenInput, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(mantenimientoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(tiempoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(adquisicionInput, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(descuentoInput, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(escasezInput, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
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
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ordenInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mantenimientoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tiempoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adquisicionInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descuentoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(escasezLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(escasezInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        editMenu.setText("Descuentos");
        jMenuBar1.add(editMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(eraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resolveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eraseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resolveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void resolveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolveButtonActionPerformed
        
        PuntosDeQuiebreView quiebre = new PuntosDeQuiebreView(0);
        try
        { 
            if(descuentoInput.getText().isEmpty() != true)
            {
                if(validaciones() != true)
                {
                    DeterministaDescuento descuentoDeter = new DeterministaDescuento();//NO!!!, CAMBIAR!
            
                    descuentoDeter.setDemanda(Integer.parseInt(demandaInput.getText()));
                    descuentoDeter.setCosto_orden(Float.parseFloat(ordenInput.getText()));
                    if(tiempoInput.getText().isEmpty() != true)
                    {
                        descuentoDeter.setTiempo_carga(Float.parseFloat(tiempoInput.getText()));   
                    }
                    descuentoDeter.setCosto_adquisicion(Float.parseFloat(adquisicionInput.getText()));
                    descuentoDeter.setCosto_mantener(mantenimientoInput.getText());
            
                    ArrayList<Double> limit = new ArrayList<Double>();
                    limit = quiebre.getLimite();
                    descuentoDeter.setLimiteInfDescuento(limit);
            
                    ArrayList<Float> porcent = new ArrayList<Float>();
                    porcent = quiebre.getPorcentaje();
                    descuentoDeter.setDescuentos(porcent);
                    descuentoDeter.llenarOptimo();
                    RespuestaDescuentoView respuestaDesFrame = new RespuestaDescuentoView(unidad, Integer.parseInt(descuentoInput.getText()), descuentoDeter);
                    respuestaDesFrame.setVisible(true);  
                    
                }
            }
        
            if(escasezInput.getText().isEmpty() == true && (descuentoInput.getText().isEmpty() == true))
            {
                if(validaciones() != true)
                {
 
                    DeterministaBasico basico = new DeterministaBasico();//NO!!!, CAMBIAR!
                    basico.setDemanda(Integer.parseInt(demandaInput.getText()));
                    basico.setCosto_orden(Float.parseFloat(ordenInput.getText()));
                    if(tiempoInput.getText().isEmpty() != true)
                    {
                        basico.setTiempo_carga(Float.parseFloat(tiempoInput.getText())); 
                    }
            
                    if(adquisicionInput.getText().isEmpty() != true)
                    {
                        basico.setCosto_adquisicion(Float.parseFloat(adquisicionInput.getText())); 
                    }
            
                    basico.setCosto_mantener(mantenimientoInput.getText());
                    RespuestaBasicoView respuestaBasicoFrame = new RespuestaBasicoView(basico, unidad);
                    respuestaBasicoFrame.setVisible(true);  
                }
            }
        
            if(escasezInput.getText().isEmpty() != true)
            {
                
                if(validaciones() != true)
                {
                    DeterministaEscasez escasezDeter = new DeterministaEscasez(); 
                    escasezDeter.setDemanda(Integer.parseInt(demandaInput.getText()));
                    escasezDeter.setCosto_orden(Float.parseFloat(ordenInput.getText()));
                    if(tiempoInput.getText().isEmpty() != true)
                    {
                        escasezDeter.setTiempo_carga(Float.parseFloat(tiempoInput.getText())); 
                    }
            
                    if(adquisicionInput.getText().isEmpty() != true)
                    {
                        escasezDeter.setCosto_adquisicion(Float.parseFloat(adquisicionInput.getText())); 
                    }
            
                    escasezDeter.setCosto_mantener(mantenimientoInput.getText());
                    escasezDeter.setEscasez(Float.parseFloat(escasezInput.getText()));
                    RespuestaBasicoView respuestaBasicoFrame = new RespuestaBasicoView(escasezDeter, unidad);
                    respuestaBasicoFrame.setVisible(true);
                }
            }    
        }
        catch(Exception excepcion)
        {      
            if(demandaInput.getText().isEmpty() == true )
            {
                JOptionPane.showMessageDialog(null,"Error: La demanda no puede ser nula","ERROR",JOptionPane.ERROR_MESSAGE);     
            }
            if(ordenInput.getText().isEmpty() == true )
            {
                JOptionPane.showMessageDialog(null,"Error: El costo de orden no puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            
            if(mantenimientoInput.getText().isEmpty() == true )
            {
                JOptionPane.showMessageDialog(null,"Error: El costo de mantenimiento no puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            if(quiebre.getLimite() == null && quiebre.getPorcentaje() == null && descuentoInput.getText().isEmpty() == false)
            {
                JOptionPane.showMessageDialog(null,"Error: Los puntos de quiebres con sus respectivos descuentos no fueron ingresados","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(quiebre.getLimite() == null && descuentoInput.getText().isEmpty() == false)
            {
                JOptionPane.showMessageDialog(null,"Error: Los puntos de quiebres no fueron ingresados","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(quiebre.getPorcentaje() == null && descuentoInput.getText().isEmpty() == false)
            {
                    JOptionPane.showMessageDialog(null,"Error: Los descuentos de cada punto de quiebre no fueron ingresados","ERROR",JOptionPane.ERROR_MESSAGE);
            }
              
            JOptionPane.showMessageDialog(null,"Error: "+excepcion.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }       
           
    }//GEN-LAST:event_resolveButtonActionPerformed

    private void eraseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eraseButtonActionPerformed
        borrarTodoAction();
    }//GEN-LAST:event_eraseButtonActionPerformed

    private void descuentoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descuentoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descuentoInputActionPerformed

    private void escasezInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escasezInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escasezInputActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adquisicionInput;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField demandaInput;
    private javax.swing.JTextField descuentoInput;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton eraseButton;
    private javax.swing.JTextField escasezInput;
    private javax.swing.JLabel escasezLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mantenimientoInput;
    private javax.swing.JTextField ordenInput;
    private javax.swing.JButton resolveButton;
    private javax.swing.JTextField tiempoInput;
    // End of variables declaration//GEN-END:variables
    private String unidad;
    private KeyListener eventosDeTecla;
    
    private void initLabel() 
    {
      jLabel3.setText("Demanda por " + unidad);
      jLabel5.setText("Costo unitario de mantenimiento por " + unidad+":");
      jLabel6.setText("Tiempo de espera para una nueva orden en " + unidad+":");
      escasezLabel.setText("Costo de escasez unitaria por "+ unidad+":");
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
    
    private void setCasoDescuento()
    {
        
            editMenu.addMouseListener(new MouseListener(){

                @Override
                public void mouseClicked(MouseEvent me) {
                    //RESOLVER QUE NO SE MANTENGA PRESIONADO
                   
                    PuntosDeQuiebreView descuentosFrame = new PuntosDeQuiebreView(Integer.parseInt(descuentoInput.getText()));
                    descuentosFrame.setVisible(true);
                }

                @Override
                public void mousePressed(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseReleased(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void mouseExited(MouseEvent me) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            });
        
    }

    private void restringirTeclas()//PONER BIEN LAS RESTRICCIONES
    {
        eventosDeTecla = new KeyListener() 
        {
            @Override
            public void keyTyped(KeyEvent ke) 
            {
               char caracter = ke.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
                   ke.consume();  
            }

            @Override
            public void keyPressed(KeyEvent ke) {
                
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                
            }
        };
        descuentoInput.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent ke) 
            {
                char caracter = ke.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/))
                {
                   ke.consume();
                }     
            }

            @Override
            public void keyPressed(KeyEvent ke){
                
            }

            @Override
            public void keyReleased(KeyEvent ke)
            {
                if(descuentoInput.getText().isEmpty() == false)
                {
                    jMenuBar1.setVisible(true);             
                      
                }
                else
                { 

                    jMenuBar1.setVisible(false);
                }
                
                if(descuentoInput.getText().matches("0"))
                {
                    jMenuBar1.setVisible(false);             
                      
                }
             
            }
        });
        setCasoDescuento();
        
        demandaInput.addKeyListener(eventosDeTecla);//poner el resto
        ordenInput.addKeyListener(eventosDeTecla);
        tiempoInput.addKeyListener(eventosDeTecla);
        adquisicionInput.addKeyListener(eventosDeTecla);
        descuentoInput.addKeyListener(eventosDeTecla);
        escasezInput.addKeyListener(eventosDeTecla);
        
    }
    
    private void borrarTodoAction()
    {   
        demandaInput.setText("");
        mantenimientoInput.setText("");
        ordenInput.setText("");
        tiempoInput.setText("");
        adquisicionInput.setText("");
        descuentoInput.setText("");
        escasezInput.setText("");
        System.gc();
    }
    
    public boolean validaciones()
    {
        if(mantenimientoInput.getText().contains("%") && (adquisicionInput.getText().isEmpty()== true || adquisicionInput.getText().equals("0") ))
        {
                JOptionPane.showMessageDialog(null,"Error: Si el costo de mantenimiento es con %, el costo de adquisición no\n"+ "puede ser nulo","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        if(((mantenimientoInput.getText().indexOf("%"))==-1) && (descuentoInput.getText().isEmpty()!= true || descuentoInput.getText().equals("0")))
        {
                JOptionPane.showMessageDialog(null,"Error: Si el problema a cuestión es de descuento, el costo de mantenimiento \n" + "debe ser con porcentaje (%)","ERROR",JOptionPane.ERROR_MESSAGE);
                return true;
        }
        
        if(demandaInput.getText().equals("0"))
        {
                JOptionPane.showMessageDialog(null,"Error: La demanda no puede ser nula","ERROR",JOptionPane.ERROR_MESSAGE);    
                return true;
        }
        if(ordenInput.getText().equals("0"))
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

    public JTextField getDemandaInput() {
        return demandaInput;
    }

    public void setDemandaInput(JTextField demandaInput) {
        this.demandaInput = demandaInput;
    }

    public JTextField getDescuentoInput() {
        return descuentoInput;
    }

    public void setDescuentoInput(JTextField descuentoInput) {
        this.descuentoInput = descuentoInput;
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

    public JTextField getOrdenInput() {
        return ordenInput;
    }

    public void setOrdenInput(JTextField ordenInput) {
        this.ordenInput = ordenInput;
    }

    public JTextField getTiempoInput() {
        return tiempoInput;
    }

    public void setTiempoInput(JTextField tiempoInput) {
        this.tiempoInput = tiempoInput;
    }
    
    
    
}
