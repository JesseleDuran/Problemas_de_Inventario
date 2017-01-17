/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_inventario.vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Slaush
 */
public class PuntosDeQuiebreView extends javax.swing.JFrame {

    /**
     * Creates new form PuntosDeQuiebreView
     */
    public PuntosDeQuiebreView(int intervalos) 
    {
        super("Puntos de Quiebre");
        initComponents();
        this.intervalos = intervalos;
        initPanel();
        addQuiebresInput();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        descuentosPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        acceptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        descuentosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Puntos de Quiebre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Cn", 0, 18))); // NOI18N

        javax.swing.GroupLayout descuentosPanelLayout = new javax.swing.GroupLayout(descuentosPanel);
        descuentosPanel.setLayout(descuentosPanelLayout);
        descuentosPanelLayout.setHorizontalGroup(
            descuentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        descuentosPanelLayout.setVerticalGroup(
            descuentosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        cancelButton.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        acceptButton.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        acceptButton.setText("Aceptar");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(descuentosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descuentosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        setPorcentaje();
        setLimite();       
        dispose();
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose() ;
    }//GEN-LAST:event_cancelButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel descuentosPanel;
    // End of variables declaration//GEN-END:variables
    static ArrayList<JTextField> limiteInferior;
    static ArrayList<JTextField> descuentos;
    static ArrayList<JLabel>     nLabels;
    private KeyListener restringirTecla;
    private final int ANCHO_TEXTFIELD_LIMINFERIOR = 230;
    private final int LARGO_TEXTFIELD = 20;
    private int intervalos;
    private final int TAMANIO_RESTRICCIONESFIELDS    = 10;
    static ArrayList<Float> porcentaje;
    static ArrayList<Double> limite;
    
    private void initPanel()
    {
        descuentosPanel.setLayout(new GridLayout(intervalos+1, 3));
        limiteInferior = new ArrayList<JTextField>();
        nLabels = new ArrayList<JLabel>();
        descuentos = new ArrayList<JTextField>();
    }

    
    private void addQuiebresInput()
    {   
        descuentosPanel.removeAll();
        for (int i = 1; i<=intervalos ; i++) 
        {

            limiteInferior.add(crearTextField());
            descuentos.add(crearTextField());
            nLabels.add(crearLabel(Integer.toString(i)));   
        }
        addDescuentosPanel();   
        cambiarTamanioPanelRestricciones(intervalos*TAMANIO_RESTRICCIONESFIELDS);
        descuentosPanel.updateUI();
    }
    
    private JTextField crearTextField()
    {
        JTextField field = new JTextField();
        field.setFont(new java.awt.Font("Roboto Cn", 0, 14));
        

        field.setPreferredSize(new Dimension(ANCHO_TEXTFIELD_LIMINFERIOR,LARGO_TEXTFIELD));
        field.setBorder(BorderFactory.createLineBorder(Color.black));
        field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        field.addKeyListener(restringirTecla); //NO RESTRINGE COMO DEBERIA
        return field;
    }

    private void restringirTeclas() 
    {
        restringirTecla = new KeyListener() //PONER BIEN LAS RESTRICCIONES
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
    }

    private JLabel crearLabel(String indexer)
    {
        JLabel label = new JLabel(indexer);
        label.setFont(new java.awt.Font("Roboto Cn", 0, 14));
        label.setMaximumSize(new Dimension(20,20));
        label.setBorder(BorderFactory.createLineBorder(Color.black));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        return label;
    } 

    private void addDescuentosPanel()
    {
        for(int i = 0; i <intervalos; i++)
        {
            if (i == 0) 
            {
                descuentosPanel.add(crearLabel("Número"));
                descuentosPanel.add(crearLabel("Límite inferior del descuento"));
                descuentosPanel.add(crearLabel("Porcentaje de descuento(%)"));
            }

            descuentosPanel.add(nLabels.get(i));
            descuentosPanel.add(limiteInferior.get(i));
            descuentosPanel.add(descuentos.get(i));
                       
        }
    } 
    
    private void cambiarTamanioPanelRestricciones(int holgura)
    {
        Dimension windowSize = getSize();
        windowSize.setSize(windowSize.getWidth(),(windowSize.getHeight()+holgura));
        Dimension panelSize = this.getPreferredSize();
        panelSize.setSize(panelSize.getWidth(),(panelSize.getHeight()+holgura));
        this.setPreferredSize(panelSize);
        setResizable(true);
        setSize(windowSize);
        setResizable(false);
    }
    
    private ArrayList<Float> convertirTextFieldsAsFloatDescuentos()
    {
        ArrayList<Float> porcentaje = new ArrayList<Float>();
        
        for (JTextField cadaDescuento : descuentos)
        {
            porcentaje.add(Float.parseFloat(cadaDescuento.getText()));    
        }
        return porcentaje;
    }
    
    private ArrayList<Double> convertirTextFieldsAsDoubleLimites()
    {
        ArrayList<Double> inferior = new ArrayList<Double>();
        
        for (JTextField cadaLimite : limiteInferior)
        {
            inferior.add(Double.parseDouble(cadaLimite.getText()));    
        }
        return inferior;
    }
    
    public ArrayList<Float> getPorcentaje()
    {
        return porcentaje;
    }
    
    public ArrayList<Double> getLimite()
    {
        return limite;
    }
    
    private void setPorcentaje()
    {
        porcentaje = new ArrayList<Float>();
        porcentaje = convertirTextFieldsAsFloatDescuentos();
    }
    
    private void setLimite()
    {
        limite = new ArrayList<Double>();
        limite = convertirTextFieldsAsDoubleLimites();
    }

}
