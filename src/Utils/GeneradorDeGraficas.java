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
import problema_inventario.models.DeterministaBasico;
import problema_inventario.models.DeterministaEscasez;
import problema_inventario.models.DeterministaGeneral;

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
    
    public JFreeChart graficarInventario(DeterministaGeneral general, String unidad)
    { 
      XYDataset dataset;  
      if(general.getTipo() == "escasez")
          dataset = createDatasetEscasez(general);
      else
          dataset = createDataset(general);
      System.out.println(general);  
      return ChartFactory.createXYLineChart(
         "Perfil del Inventario",
         "Tiempo en " + unidad ,
         "Unidades" ,
         dataset,
         PlotOrientation.VERTICAL ,
         true , true , false);
    }
    
    public JFreeChart graficarCostos(DeterministaGeneral general, String unidad)
    { 
        XYDataset dataset;  
      if(general.getTipo() == "escasez")
            dataset = createDatasetCostoEscasez(general);
      else
            dataset = createDatasetCosto(general, unidad);
      return ChartFactory.createXYLineChart(
         "Análisis de Costo de Inventario por " + unidad,
         "Cantidad de pedido" ,
         "Costo" ,
         dataset,
         PlotOrientation.VERTICAL ,
         true , true , false);
    }
    
    private XYDataset createDatasetCosto(DeterministaGeneral general, String unidad) 
    {
        
      XYSeries TCq = new XYSeries("Costo total en "+unidad);          
      
      /*float y = general.calcularTCqGrafica(general.calcularCantidadOptimaOrdenar()*3);
      float ancho = general.calcularCantidadOptimaOrdenar()*3;*/
      int i =0;
      
      for(i = 0; i< general.calcularCantidadOptimaOrdenar()*3; i++)
      {
    
          TCq.add(i*10, general.calcularCostoGrafica(i)); 
          System.out.println(general.calcularCostoGrafica(i));
          //TCq.add(i+1, general.calcularCostoGrafica(i+1));
      }
      
      /*XYSeries mantener = new XYSeries("Costo de Mantenimiento");
      mantener.add(0,general.calcularMantenimientoGrafica(0.0f));
      mantener.add(i ,general.calcularMantenimientoGrafica(i));*/
         
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( TCq );          
      //dataset.addSeries(mantener);
      return dataset;
    }
    
    private XYDataset createDatasetCostoEscasez(DeterministaGeneral general)
    {
        return null;
    }
    
    
  

    private XYDataset createDataset(DeterministaGeneral general) 
    {
      XYSeries firefox = new XYSeries("Nivel de Inventario");          
      
      float amplitud = general.calcularCantidadOptimaOrdenar();
      float ancho = general.calcularTiempoEntreOrdenes();
      int cantidad_triangulos = 10;
      for(int i = 0; i< cantidad_triangulos; i++)
      {
          firefox.add(ancho*i, amplitud);  
          firefox.add(ancho*(i+1),0);
      }
      XYSeries raya = new XYSeries("Inventario medio");
      raya.add(0,amplitud/2);
      raya.add(cantidad_triangulos*ancho,amplitud/2);
         
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( firefox );          
      dataset.addSeries(raya);
      return dataset;
    }

    private XYDataset createDatasetEscasez(DeterministaGeneral general) 
    {
      DeterministaEscasez data = (DeterministaEscasez)general;
      XYSeries firefox = new XYSeries("Nivel de Inventario");          
      
      float amplitud = data.calcularInvMax();
      float ancho = general.calcularTiempoEntreOrdenes();
      float negativo = data.calcularReorderPoint();
      int cantidad_triangulos = 10;
      for(int i = 0; i< cantidad_triangulos; i++)
      {
          firefox.add(ancho*i, amplitud);
          System.out.println("Negativo"+negativo);
          firefox.add(ancho*(i+1),negativo);
      }
      XYSeries raya = new XYSeries("Inventario medio");
      raya.add(0,general.calcularCantidadOptimaOrdenar()/2);
      raya.add(cantidad_triangulos*ancho,general.calcularCantidadOptimaOrdenar()/2);
         
      final XYSeriesCollection dataset = new XYSeriesCollection( );          
      dataset.addSeries( firefox );          
      dataset.addSeries(raya);
      return dataset;
    }
    
    
 
}
