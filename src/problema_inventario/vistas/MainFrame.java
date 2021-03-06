
package problema_inventario.vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Slaush
 */
public class MainFrame extends javax.swing.JFrame 
{
    /**
     * Creates new form MainFrame
     */
    public MainFrame() 
    {
        super("Problemas de Inventario"); 
        initComponents();
        initButtons();
    }
    
    private void initButtons()
    {
        acceptButton.setToolTipText("Presione para avanzar");
        acceptButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acceptButton.setFocusable(false);
        cancelButton.setToolTipText("Presione para cerrar");
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setFocusable(false);
        
        ayudaBar.add(menuEjemplos);
        addEjemplos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tiempoField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        deterministaRadioButton1 = new javax.swing.JRadioButton();
        probabilisticoRadioButton2 = new javax.swing.JRadioButton();
        ayudaBar = new javax.swing.JMenuBar();
        menuEjemplos = new javax.swing.JMenu();
        ayudaItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tiempoField.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        tiempoField.setText("Años");
        tiempoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Unidad de Tiempo:");

        acceptButton.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        acceptButton.setText("Aceptar");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(deterministaRadioButton1);
        deterministaRadioButton1.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        deterministaRadioButton1.setText("Problema de Inventario Determinístico");

        buttonGroup1.add(probabilisticoRadioButton2);
        probabilisticoRadioButton2.setFont(new java.awt.Font("Roboto Cn", 0, 14)); // NOI18N
        probabilisticoRadioButton2.setText("Problema de Inventario Probabilístico");
        probabilisticoRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probabilisticoRadioButton2ActionPerformed(evt);
            }
        });

        menuEjemplos.setText("Ejemplos");
        menuEjemplos.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        ayudaBar.add(menuEjemplos);

        ayudaItem.setText("Ayuda");
        ayudaItem.setFont(new java.awt.Font("Roboto Cn", 0, 12)); // NOI18N
        ayudaBar.add(ayudaItem);

        setJMenuBar(ayudaBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tiempoField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deterministaRadioButton1)
                            .addComponent(probabilisticoRadioButton2))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(deterministaRadioButton1)
                .addGap(27, 27, 27)
                .addComponent(probabilisticoRadioButton2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tiempoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
      
        String unidad = tiempoField.getText();
        
        if(deterministaRadioButton1.isSelected()==true)
        {
            InputView basicoFrame = new InputView(unidad);
            basicoFrame.setVisible(true);
        }
        if(probabilisticoRadioButton2.isSelected()==true)
        {
            InputProbView probFrame = new InputProbView(unidad);
            probFrame.setVisible(true);
        }
                
      
    }//GEN-LAST:event_acceptButtonActionPerformed
    
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void tiempoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoFieldActionPerformed
       
    }//GEN-LAST:event_tiempoFieldActionPerformed

    private void probabilisticoRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probabilisticoRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_probabilisticoRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JMenuBar ayudaBar;
    private javax.swing.JMenu ayudaItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelButton;
    private javax.swing.JRadioButton deterministaRadioButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu menuEjemplos;
    private javax.swing.JRadioButton probabilisticoRadioButton2;
    private javax.swing.JTextField tiempoField;
    // End of variables declaration//GEN-END:variables
    private ButtonGroup buttonGroup;
    
    
    private void addEjemplos()
    {
        InputView problema = new InputView("Años");
        JMenuItem ej1 = new JMenuItem("Ejemplo 1");
        ej1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) 
            {
                String textoPlanteamiento="Suponga que R & B Beverage Company tiene una bebida refrescante \n"+
                                           "que muestra una tasa de demanda anual constante de 3600 cajas.\n"+ 
                                           "Una caja de la bebida le cuesta a R & B $3. Los costos de ordenar \n"+ 
                                           "son $20 por pedido y los costos de mantener son 25% del valor del \n"+
                                           "inventario. R & B tiene 250 días hábiles anuales, y el tiempo de \n"+
                                           "entregar  es de cinco días. Identifiquen los siguientes aspectos de \n"+
                                           "la política de inventario. \n"; 
                
                String demanda ="3600";
                String costoOrden = "20";
                String costoMantener = "25%";
                String leadTime = "0.0138";
                String costoUnitario = "3";

                if (JOptionPane.showConfirmDialog(null, textoPlanteamiento+" ¿Ingresar al Programa?" 
                                                    , "Planteamiento Ejemplo 1",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) 
                {
                    problema.setVisible(true);
                    problema.getDemandaInput().setText(demanda);
                    problema.getOrdenInput().setText(costoOrden);
                    problema.getMantenimientoInput().setText(costoMantener);
                    problema.getTiempoInput().setText(leadTime);
                    problema.getAdquisicionInput().setText(costoUnitario);
                    
                }
            }
        });
        menuEjemplos.add(ej1);
        //EJEMPLO 2
        InputProbView problemaProb = new InputProbView("Años");
        JMenuItem ej2 = new JMenuItem("Ejemplo 2");
        ej2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String textoPlanteamiento = "La demanda de un artículo en una empresa se distribuye normalmente con una media de 300 unidades al año y una  \n"+
                                            "desviación estándar de 30 artículos. El costo de hacer un pedido es de $60, el costo de un artículo es de $40 y la vende en  \n"+
                                            "50$, el costo por unidad agotada es de $6 por año y el costo anual de almacenamiento es de 25% del valor del artículo. La  \n"+
                                            "duración del Tiempo de entrega es aleatorio con media 80 días y varianza 4 días. Todo el agotamiento de existencia origina  \n"+
                                            "perdida de venta. \n";

                String demanda ="300";
                String desviacion_demanda = "30";
                String costoMantener = "25%";
                String leadTime = "0.22";
                String varianzaLeadTime = "0.011";
                String p = "40";
                String costoOrden = "60";
                String costo_venta = "50";
                String costo_escasez_unitaria = "6";

                

                if(JOptionPane.showConfirmDialog(null,textoPlanteamiento+"¿Ingresar al programa?"
                                                        ,"Planteamiento Ejemplo 2",
                        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
                    {

                        problemaProb.setVisible(true);
                        problemaProb.getDemandaInput().setText(demanda);
                        problemaProb.getDesvDemandaInput().setText(desviacion_demanda);
                        problemaProb.getMantenimientoInput().setText(costoMantener);
                        problemaProb.getTiempoInput().setText(leadTime);
                        problemaProb.getVarianzaTimeInput().setText(varianzaLeadTime);
                        problemaProb.getAdquisicionInput().setText(p);
                        problemaProb.getCostoOrdenInput().setText(costoOrden);
                        problemaProb.getCostoVentaInput().setText(costo_venta);
                        problemaProb.getEscasezInput().setText(costo_escasez_unitaria);
                        
                        
                        

                    }
            }
        });
        menuEjemplos.add(ej2);


        /*JMenuItem ej3 = new JMenuItem("Ejemplo 3");
        ej3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String textoPlanteamiento = "Mi gato requiere un mínimo diario 8 mg de proteína y 6 mg de minerales, Para ello le doy gatarina y comida casera. \n"+
                                            "La gatarina aporta 12 mg de minerales y 4 mg de proteína por cada Kg, mientras la comida casera aporta 8 mg de proteína\n"+
                                            "y 6 mg de minerales por cada Kg,El Kg de gatarina cuesta 0,8$ y el Kg. de comida casera 1,2 $ en ingredientes. \n"+
                                            "¿Cómo minimizo los costos y alimento bien a mi gato? \n";

                // x1 = Kg de Gatarina.
                // x2 = Kg de Comida casera.

                String funcionObjetivo = "Min z = 0.8x1 + 1.2x2";

                //s.a

                String r1 = "12x1 + 6x2 >= 6";
                String r2 = "4x1 + 8x2 >= 8";
                

                if(JOptionPane.showConfirmDialog(null,textoPlanteamiento+"¿Ingresar al programa?"
                                                        ,"Planteamiento Ejemplo 3",
                        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
                    {

                        if(funcionObjetivoInput.getText().isEmpty() && restricciones.size()==0)
                        {
                            funcionObjetivoInput.setText(funcionObjetivo);
                            addRestriccionInput();
                            addRestriccionInput();
                        
                            restricciones.get(0).setText(r1);
                            restricciones.get(1).setText(r2);
                    
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Recuerda Borrar Todo antes de ingresar un ejemplo",
                                "Alerta", JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        });
        menuEjemplos.add(ej3);


        JMenuItem ej4 = new JMenuItem("Ejemplo 4");
        ej4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String textoPlanteamiento = "Un constructor va a edificar dos tipos de viviendas A y B. Dispone de 1800 millones de dólares y el coste de una casa de \n"+
                                            "tipo A es de 18 millones y 10 millones una de tipo B. El número de casas de tipo A ha de ser, al menos, del 50 % del total \n"+
                                            "y el de tipo B, el 30 % por lo menos. Si cada casa de tipo A se vende a 24 y cada una de tipo B en 15 millones. ¿Cuántas \n"+
                                            "casas de cada tipo debe construir para obtener el beneficio máximo? \n"+
                                            "NOTA: Los datos ingresados estan en Millones pj 18 = 18000000 \n";

                // x1 = Cantidad de casas de tipo A a construir.
                // x2 = Cantidad de casas de tipo B a construir.

                String funcionObjetivo = "Max z = 6x1 + 5x2";

                //s.a

                String r1 = "18x1 + 10x2 <= 1800";
                String r2 = "0.50x1 - 0.50x2 >= 0";
                String r3 = "0.70x2 - 0.30x1 >= 0";

                if(JOptionPane.showConfirmDialog(null,textoPlanteamiento+"¿Ingresar al programa?"
                                                        ,"Planteamiento Ejemplo 4",
                        JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
                    {


                        if(funcionObjetivoInput.getText().isEmpty() && restricciones.size()==0)
                        {
                             funcionObjetivoInput.setText(funcionObjetivo);
                            addRestriccionInput();
                            addRestriccionInput();
                            addRestriccionInput();

                            restricciones.get(0).setText(r1);
                            restricciones.get(1).setText(r2);
                            restricciones.get(2).setText(r3);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Recuerda Borrar Todo antes de ingresar un ejemplo",
                                "Alerta", JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }
        });
        menuEjemplos.add(ej4);


        JMenuItem ej5 = new JMenuItem("Ejemplo 5");
        ej5.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            String textoPlanteamiento = "Un inversionista dispone de 100000 $ y puede invertir en dos tipos de cultivo Algodón y maíz. El de Algodón produce un \n"+
                                        "beneficio del 10%, el de maíz produce solo el 7%. Decide invertir como máximo 60.000 $ en el cultivo de Algodón y por lo \n"+
                                        "menos 20.000 $ en el de maíz. Además, quiere que lo invertido en Algodón sea por lo menos igual a lo invertido en maíz. \n"+
                                        "¿Cómo debe invertir los 100.000 $ para que el beneficio anual sea máximo? \n";

            // x1 = Inversion en el cultivo de Algodon.
            // x2 = Inversion en el cultivo de Maiz.

            String funcionObjetivo = "Max z = 0.1x1 + 0.07x2";

            //s.a

            String r1 = "x1 + x2 <= 100000";
            String r2 = "x1 <= 60000";
            String r3 = "x2 >= 20000";
            String r4 = "x1 - x2 >= 0";

            if(JOptionPane.showConfirmDialog(null,textoPlanteamiento+"¿Ingresar al programa?"
                                                    ,"Planteamiento Ejemplo 5",
                    JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
                {


                        if(funcionObjetivoInput.getText().isEmpty() && restricciones.size()==0)
                        {
                            funcionObjetivoInput.setText(funcionObjetivo);
                            addRestriccionInput();
                            addRestriccionInput();
                            addRestriccionInput();
                            addRestriccionInput();

                            restricciones.get(0).setText(r1);
                            restricciones.get(1).setText(r2);
                            restricciones.get(2).setText(r3);
                            restricciones.get(3).setText(r4);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Recuerda Borrar Todo antes de ingresar un ejemplo",
                                "Alerta", JOptionPane.ERROR_MESSAGE);
                        }
        
                }
        }
        });
        menuEjemplos.add(ej5);

        JMenuItem ej6 = new JMenuItem("Ejemplo 6");
        ej6.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent e)
        {
            String textoPlanteamiento = "Esto Es un Problema que posee Soluciones Multiples";

            // x1 = Inversion en el cultivo de Algodon.
            // x2 = Inversion en el cultivo de Maiz.

            String funcionObjetivo = "Max z = 14x1 + 4x2";

            //s.a

            String r1 = "2x1 + 7x2 <= 21";
            String r2 = "7x1 + 2x2 <= 21";

            if(JOptionPane.showConfirmDialog(null,textoPlanteamiento+"¿Ingresar al programa?"
                                                    ,"Planteamiento Ejemplo 5",
                    JOptionPane.YES_NO_OPTION)== JOptionPane.YES_OPTION)
                {


                        if(funcionObjetivoInput.getText().isEmpty() && restricciones.size()==0)
                        {
                            funcionObjetivoInput.setText(funcionObjetivo);
                            addRestriccionInput();
                            addRestriccionInput();

                            restricciones.get(0).setText(r1);
                            restricciones.get(1).setText(r2);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Recuerda Borrar Todo antes de ingresar un ejemplo",
                                "Alerta", JOptionPane.ERROR_MESSAGE);
                        }
        
                }
        }
        });
        menuEjemplos.add(ej6);*/
    }
}
