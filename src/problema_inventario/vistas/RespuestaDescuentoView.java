/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_inventario.vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import problema_inventario.models.DeterministaDescuento;


/**
 *
 * @author Slaush
 */
public class RespuestaDescuentoView extends javax.swing.JFrame {

    /**
     * Creates new form RespuestaDescuentoView
     */
    public RespuestaDescuentoView(String unidad, int intervalos, DeterministaDescuento problema) 
    {
        super("Análisis de costos de inventario por "+ unidad + " para el modelo Determinista con Descuentos por Volumen");
        initComponents();
        this.intervalos = intervalos;
        this.problema = problema;
        
        
        initPanel();
        addtablaInput();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respuestaDesPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout respuestaDesPanelLayout = new javax.swing.GroupLayout(respuestaDesPanel);
        respuestaDesPanel.setLayout(respuestaDesPanelLayout);
        respuestaDesPanelLayout.setHorizontalGroup(
            respuestaDesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        respuestaDesPanelLayout.setVerticalGroup(
            respuestaDesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(respuestaDesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(respuestaDesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    static ArrayList<JLabel>     nLabels;
    static ArrayList<JLabel> limites;
    static ArrayList<JLabel> descuentos;
    static ArrayList<JLabel>     cantidadOrdenar;
    static ArrayList<JLabel> TCU;
    static ArrayList<JLabel> factibilidad;
    private final int TAMANIO_RESTRICCIONESFIELDS    = 10;
    DeterministaDescuento problema;
    
    private int intervalos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel respuestaDesPanel;
    // End of variables declaration//GEN-END:variables
    private void initPanel()
    {
        respuestaDesPanel.setLayout(new GridLayout(intervalos+3, 6));
        nLabels = new ArrayList<JLabel>();
        limites = new ArrayList<JLabel>(); 
        descuentos = new ArrayList<JLabel>();
        cantidadOrdenar = new ArrayList<JLabel>();
        TCU = new ArrayList<JLabel>();
        factibilidad = new ArrayList<JLabel>();
    }
    
    private void addtablaInput()
    {
     
        ArrayList<Double> limitInf = problema.getLimiteInfDescuento();
        ArrayList<Double> limitSup = problema.calcularLimiteSuperior();
        ArrayList<Float> porcent = problema.getDescuentos();
        
        problema.calcularListaCantidadOptimaOrdenar();
        ArrayList<Double> total = problema.calcularListaTCU();
  
   
        
        respuestaDesPanel.removeAll();
        
        for (int i = 0; i<intervalos ; i++) 
        {

            nLabels.add(crearLabel(Integer.toString(i)));
            limites.add(crearLabel(Double.toString(limitInf.get(i)) + "-" + Double.toString(limitSup.get(i))));
            descuentos.add(crearLabel(Float.toString(porcent.get(i))));
            cantidadOrdenar.add(crearLabel(Double.toString(problema.getListaEOQ().get(i))));
            TCU.add(crearLabel(Double.toString(total.get(i))));
        }
        
        addDescuentosPanel();   
        cambiarTamanioPanelRestricciones(intervalos*TAMANIO_RESTRICCIONESFIELDS);
        respuestaDesPanel.updateUI();
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
    
    private void addDescuentosPanel()
    {
        for(int i = 0; i <intervalos; i++)
        {
            if (i == 0) 
            {
                respuestaDesPanel.add(crearLabel("Número"));
                respuestaDesPanel.add(crearLabel("Límites"));
                respuestaDesPanel.add(crearLabel("Descuento(%)"));
                respuestaDesPanel.add(crearLabel("Cantidad a Ordenar"));
                respuestaDesPanel.add(crearLabel("Costo Total"));
                respuestaDesPanel.add(crearLabel("Factibilidad"));           
            }
            

            respuestaDesPanel.add(nLabels.get(i));
            respuestaDesPanel.add(limites.get(i));
            respuestaDesPanel.add(descuentos.get(i));
            respuestaDesPanel.add(cantidadOrdenar.get(i));
            respuestaDesPanel.add(TCU.get(i));
                  
        }
    } 



}
