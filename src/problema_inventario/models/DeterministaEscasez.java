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

    public DeterministaEscasez() 
    {
        super();
    }

    public DeterministaEscasez(int demanda, float costo_orden, float costo_mantener, float tiempo_carga, float costo_adquisicion) {
        super(demanda, costo_orden, costo_mantener, tiempo_carga, costo_adquisicion);
    }

    @Override
    public float calcularCantidadOptimaOrdenar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float calcularCostoTotalMantenimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float calcularTCU() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
