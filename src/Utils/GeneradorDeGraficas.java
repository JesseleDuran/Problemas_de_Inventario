/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.awt.Color;
import static java.awt.Color.black;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.TickUnitSource;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RectangleInsets;
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
        
       
            dataset = createDatasetCosto(general, unidad);
        
        JFreeChart chart = ChartFactory.createXYLineChart(
         "Análisis de Costo de Inventario por " + unidad,
         "Cantidad de pedido" ,
         "Costo" ,
         dataset,
         PlotOrientation.VERTICAL ,
         true , true , false);
      
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);
        
        XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesPaint(4, black, true);
        renderer.setSeriesPaint(3, black, true);
        
        
       /* renderer.setShapesFilled(true);
        renderer.setShapesVisible(true);*/
       
        
        XYPlot plot2 = chart.getXYPlot();
        NumberAxis rangeAxis = (NumberAxis) plot2.getRangeAxis();
        rangeAxis.setAutoRange(false);
        
        
        rangeAxis.setUpperBound(general.calcularCostoGrafica(general.calcularCantidadOptimaOrdenar())*2);

        
        return chart;  
    }
    
    private XYDataset createDatasetCosto(DeterministaGeneral general, String unidad) 
    {
    
      XYSeries TCq = new XYSeries("Costo total en "+unidad);   
      XYSeries costoOrden = new XYSeries("Costo de Orden");
      XYSeries mantener = new XYSeries("Costo de Mantenimiento");
      XYSeries EOQx = new XYSeries("Punto Optimo (x)");
      XYSeries EOQy = new XYSeries("Punto Optimo (y)");
      
            
      for(int i = 1; i< general.calcularCantidadOptimaOrdenar()*2; i++)
      {
          TCq.add(i, general.calcularCostoGrafica(i));
          costoOrden.add(i, general.calcularCostoOrdenGrafica(i));
          mantener.add(i ,general.calcularMantenimientoGrafica(i));
      }
      
      EOQx.add(general.calcularCantidadOptimaOrdenar(),0);
      EOQx.add(general.calcularCantidadOptimaOrdenar(),general.calcularCostoGrafica(general.calcularCantidadOptimaOrdenar()));
      
      EOQy.add(0,general.calcularCostoGrafica(general.calcularCantidadOptimaOrdenar()));
      EOQy.add(general.calcularCantidadOptimaOrdenar(),general.calcularCostoGrafica(general.calcularCantidadOptimaOrdenar()));
      
      
      final XYSeriesCollection dataset = new XYSeriesCollection( );  
       
      dataset.addSeries( TCq );          
      dataset.addSeries(mantener);
      dataset.addSeries(costoOrden);
      dataset.addSeries(EOQx);
      dataset.addSeries(EOQy);
      
      
      return dataset;
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
