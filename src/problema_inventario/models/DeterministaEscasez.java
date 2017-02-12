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
public class DeterministaEscasez extends DeterministaGeneral 
{
	private float escasez;

    public DeterministaEscasez() 
    {
        super();
        escasez = 0;
        tipo = "escasez";
    }

    public DeterministaEscasez(int demanda, float costo_orden, float costo_mantener, float tiempo_carga, float costo_adquisicion, float escasez, String tipo) {
        super(demanda, costo_orden, costo_mantener, tiempo_carga, costo_adquisicion, tipo);
        this.escasez = escasez;
        this.tipo = tipo;

    }

    public float getEscasez() {
        return escasez;
    }

    public void setEscasez(float escasez) {
        this.escasez = escasez;
    }

    public String getTipo()
    {
        return tipo;
    }
 
    @Override
    public float calcularCantidadOptimaOrdenar() 
    {
        return (float) (Math.sqrt(((2*costo_orden*demanda)*(getCosto_mantener()+escasez))/(escasez*getCosto_mantener())));
    }

    @Override
    public float calcularCostoTotalMantenimiento() {
        return (float) (((Math.pow(calcularInvMax(), 2))*getCosto_mantener())/((calcularCantidadOptimaOrdenar())*2));
    }

    @Override
    public float calcularTCU() {
        return calcularCostoTotalColocarOrdenes() + calcularCostoTotalMantenimiento() + calcularCostoEscasez();
    }

    public float calcularInvMax() 
    {
    	return (float) Math.sqrt((2*costo_orden*demanda*escasez)/((getCosto_mantener()+escasez)*getCosto_mantener()) );//M
    }

    public float calcularMaxOrdenesPendientes()
    {
    	return calcularCantidadOptimaOrdenar() - calcularInvMax(); //EOQ - M
    }

    public float calcularReorderPoint()
    {
        if(tiempo_carga == 0)
        {
            return  calcularInvMax() - calcularCantidadOptimaOrdenar(); //EOQ - M
        }
        else if(tiempo_carga < calcularTiempoEntreOrdenes())
        {
            return tiempo_carga * demanda;
        }
        else
        {
            float le;
            le = tiempo_carga - (calcularValorEnteroMayor()*calcularTiempoEntreOrdenes());
            return le*demanda;    
        }  
        
    }

    public float calcularCostoEscasez()
    {
    	return (float) ((Math.pow(calcularMaxOrdenesPendientes(), 2)*escasez)/(2*calcularCantidadOptimaOrdenar()));
    }

    @Override
    public float calcularMantenimientoGrafica(float eoq) 
    {
        return (float) (((Math.pow(calcularInvMax(), 2))*getCosto_mantener())/((eoq)*2));
    }
    
  

    
}
