/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author Slaush
 */
public class GeneradorDeGraficas 
{
    private static GeneradorDeGraficas instance;
    private GeneradorDeGraficas(){}
    
    public static GeneradorDeGraficas getInstance()
    {
        if(instance == null)
            instance = new GeneradorDeGraficas();
        return instance;
    } 
    
    public JFreeChart graficarInventario()
    {
      return ChartFactory.createXYLineChart(
         "TITULO",
         "TEXTO EN X" ,
         "TEXTO EN Y" ,
         createDataset() ,
         PlotOrientation.VERTICAL ,
         true , true , false);
    }

    private XYDataset createDataset() 
    {
      XYSeries firefox = new XYSeries( "loquesea" );          
      
      int amplitud = 40;
      int ancho = 10;
      int cantidad_triangulos = 10;
      for(int i = 0; i< cantidad_triangulos; i++)
      {
          firefox.add(ancho*i, amplitud);  
          firefox.add(ancho*(i+1),0);
      }
      XYSeries raya = new XYSeries("raya");
      raya.add(0,amplitud/2);
      raya.add(cantidad_triangulos*ancho+5,amplitud/2);
         
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( firefox );          
      dataset.addSeries(raya);
      return dataset;
    }
    
    
    
    
}
