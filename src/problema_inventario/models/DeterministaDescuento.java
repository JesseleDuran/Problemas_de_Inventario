/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_inventario.models;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Slaush
 */
public class DeterministaDescuento extends DeterministaBasico
{
	ArrayList<Double> limiteInfDescuento = new ArrayList<Double>();
         
        ArrayList<Float> descuentos = new ArrayList<Float>();//LISTA DE LOS DESCUENTOS (4%, 5%...) que pasarán a ser 0.04, 0.05
        ArrayList<Double> listaEOQ = new ArrayList<Double>();


    public DeterministaDescuento() 
    {
        super();
        tipo = "descuento";
    }

    public DeterministaDescuento(int demanda, float costo_orden, float costo_mantener, float tiempo_carga, float costo_adquisicion, int cantidadPuntosDescuento, String tipo) 
    {
        super(demanda, costo_orden, costo_mantener, tiempo_carga, costo_adquisicion, tipo);
    }

    public ArrayList<Double> getListaEOQ() {
        return listaEOQ;
    }

    public ArrayList<Double> getLimiteInfDescuento() {
        return limiteInfDescuento;
    }

    public void setLimiteInfDescuento(ArrayList<Double> limiteInfDescuento) 
    {
        for (int i=0;i < limiteInfDescuento.size() ; i++ ) 
        {
            if (i == 0) 
            {
                this.limiteInfDescuento.add(0.0);
            }  
            this.limiteInfDescuento.add(limiteInfDescuento.get(i));
            System.out.println(this.limiteInfDescuento.get(i));
        }
    }

    public ArrayList<Float> calcularCostosAdquisicionDescuentos() 
    {
        ArrayList<Float> valorDescontado = new ArrayList<Float>(); //LISTA DE LOS VALORES CON LOS COSTOS DE ADQUISICION CON DESCUENTO
        
        for (Float cadaPorcentaje : descuentos)
        {
            valorDescontado.add(costo_adquisicion-((cadaPorcentaje/100)*costo_adquisicion));    
        }

        return valorDescontado;
    }

    /*public ArrayList<Double> getLimiteSuperior()
    {
        return limiteSuperior;
    }*/


    public void setDescuentos(ArrayList<Float> descuentos)
    {
        for (int i=0;i < descuentos.size() ; i++ ) 
        {
            if (i == 0) 
            {
                this.descuentos.add(0.0f);
            }   
            
            this.descuentos.add(descuentos.get(i));
            
        }
    }

    public ArrayList<Float> getDescuentos()
    {
        return descuentos;
    }

    public void calcularListaCantidadOptimaOrdenar() 
    {
        ArrayList<Double> listaEOQ = new ArrayList<Double>(); //Lista de las cantidades óptimas
        ArrayList<Float> costosAdquisicion = calcularCostosAdquisicionDescuentos();
        
        for (Float cadaCostoAdquisicion : costosAdquisicion)
        {
            listaEOQ.add(Math.sqrt((2*costo_orden*demanda)/(costo_mantener*cadaCostoAdquisicion)));   
        }

        this.listaEOQ = listaEOQ;
        ajustarCantidadOrdenar();
    }

    public ArrayList<Double> calcularLimiteSuperior()
    {
        ArrayList<Double> sup = new ArrayList<Double>();
        for (int i = 0; i<(limiteInfDescuento.size()-1) ;i++ ) 
        {
            sup.add(limiteInfDescuento.get(i+1)-1);
            
        }
        sup.add(0.0);

        return sup;
    }

    public void ajustarCantidadOrdenar()
    {
        ArrayList<Double> sup = calcularLimiteSuperior();
        for (int i = 0; i< listaEOQ.size(); i++)
        {
            if(listaEOQ.get(i) <  limiteInfDescuento.get(i)) 
            {
                listaEOQ.set(i,limiteInfDescuento.get(i));   
            }
            
            if(listaEOQ.get(i) > sup.get(i)) 
            {
                listaEOQ.set(i,sup.get(i)); 
            }

            if (i == (listaEOQ.size()-1)) 
            {
                if(listaEOQ.get(i) <  limiteInfDescuento.get(i) || (listaEOQ.get(i) > sup.get(i)) ) 
                {
                    listaEOQ.set(i,limiteInfDescuento.get(i));   
                }       
            }      
        }
    }

    public ArrayList<Double> calcularCostoFijo()
    {
        ArrayList<Double> listaCostosF = new ArrayList<Double>();

        for (Double cadaEOQ : listaEOQ)
        {
            listaCostosF.add((costo_orden*demanda)/cadaEOQ);    
        }
        return listaCostosF;
    } 

    public ArrayList<Float> calcularCostoCompra()
    {
        ArrayList<Float> listaCostosCompra = new ArrayList<Float>();
         ArrayList<Float> costosAdquisicion = calcularCostosAdquisicionDescuentos();

        for (Float cadaCostoAdquisicion : costosAdquisicion)
        {
            listaCostosCompra.add(cadaCostoAdquisicion*demanda);    
        }
        return listaCostosCompra;
    }

    public ArrayList<Double> calcularCostoAlmacenamiento()
    {
        ArrayList<Double> listaCostoAlmacenamiento = new ArrayList<Double>();

        for (Double cadaEOQ : listaEOQ)
        {
            listaCostoAlmacenamiento.add(costo_mantener*(cadaEOQ/2));    
        }
        return listaCostoAlmacenamiento;
    }

    public ArrayList<Double> calcularListaTCU()
    {
        ArrayList<Double> listaTCU = new ArrayList<Double>();
        ArrayList<Double> listaCostoAlmacenamiento = calcularCostoAlmacenamiento();
        ArrayList<Float> listaCostosCompra = calcularCostoCompra();
        ArrayList<Double> listaCostosF = calcularCostoFijo();

        for (int i = 0; i<listaEOQ.size(); i++)
        {
            listaTCU.add(listaCostoAlmacenamiento.get(i)+listaCostosCompra.get(i)+listaCostosF.get(i));
        }
        return listaTCU;
    }

    public int calcularMenorElemento()
    {
        ArrayList<Double> listaTCUs = calcularListaTCU();
        int indice_menor = 0;
        double menor= 0;

        for (int i = 0; i<listaTCUs.size(); i++)
        {   
            if(i == 0) 
            {
                menor = listaTCUs.get(i);
            }  
            else
            {
                if(listaTCUs.get(i) < menor) 
                {
                    menor = listaTCUs.get(i);
                    indice_menor = i;
                }
            }
        }

        return indice_menor;
    }

    public ArrayList<String> llenarFactibilidad()
    {
        ArrayList<String> listaFactible = new ArrayList<String>();
        int efectivo = calcularMenorElemento();

        for (int i = 0; i<listaEOQ.size(); i++)
        {   
            if(i == efectivo) 
            {
                listaFactible.add("Si");    
            }
            listaFactible.add("No");
        }
        
        return listaFactible;

    }

  
}
