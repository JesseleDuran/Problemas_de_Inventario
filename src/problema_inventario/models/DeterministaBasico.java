/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema_inventario.models;

/**
 *
 * @author Slaush
 */
public class DeterministaBasico extends DeterministaGeneral 
{

    public DeterministaBasico() 
    {
        super();
        tipo = "basico";
    }

    public DeterministaBasico(int demanda, float costo_orden, float costo_mantener, float tiempo_carga, float costo_adquisicion, String tipo) 
    {
        super(demanda, costo_orden, costo_mantener, tiempo_carga, costo_adquisicion, tipo);
    }
    

    @Override
    public float calcularCantidadOptimaOrdenar() 
    {
        return (float) Math.sqrt((2*costo_orden*demanda)/getCosto_mantener()); //EOQ  
    }

    @Override
    public float calcularCostoTotalMantenimiento() 
    {
        return getCosto_mantener()*(calcularCantidadOptimaOrdenar()/2);
        
    }

    @Override
    public float calcularTCU() 
    {
        return calcularCostoTotalColocarOrdenes() + calcularCostoTotalMaterial() + calcularCostoTotalMantenimiento();     
    }

    @Override
    public float calcularMantenimientoGrafica(float eoq) 
    {
        return getCosto_mantener()*(eoq/2);
        
    }


    
}
