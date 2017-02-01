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
    }

    public DeterministaEscasez(int demanda, float costo_orden, float costo_mantener, float tiempo_carga, float costo_adquisicion, float escasez) {
        super(demanda, costo_orden, costo_mantener, tiempo_carga, costo_adquisicion);
        this.escasez = escasez;

    }

    public float getEscasez() {
        return escasez;
    }

    public void setEscasez(float escasez) {
        this.escasez = escasez;
    }
 
    @Override
    public float calcularCantidadOptimaOrdenar() 
    {
        return (float) (Math.sqrt(((2*costo_orden*demanda)*(getCosto_mantener()+escasez))/(escasez*getCosto_mantener())));
    }

    @Override
    public float calcularCostoTotalMantenimiento() {
        return (float) (((Math.pow(calcularDeficitMaximo(), 2))*getCosto_mantener())*((calcularCantidadOptimaOrdenar())/2));
    }

    @Override
    public float calcularTCU() {
        return calcularCostoTotalColocarOrdenes() + calcularCostoTotalMantenimiento() + calcularCostoEscasez();
    }

    public float calcularDeficitMaximo() 
    {
    	return (float) Math.sqrt((2*costo_orden*demanda*escasez)/(getCosto_mantener()+escasez)*getCosto_mantener() );//M
    }

    public float calcularNivelInventario()
    {
    	return calcularCantidadOptimaOrdenar() - calcularDeficitMaximo(); //EOQ - M
    }

    public float calcularCostoEscasez()
    {
    	return (float) ((Math.pow(calcularNivelInventario(), 2)*escasez)/2*calcularCantidadOptimaOrdenar());
    }
    
  

    
}
