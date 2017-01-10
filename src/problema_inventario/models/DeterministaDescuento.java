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
	ArrayList<String> limiteInfDescuento = new ArrayList();
	int cantidadPuntosDescuento;

    public DeterministaDescuento() 
    {
        super();
    	cantidadPuntosDescuento = 0;
    }

    public DeterministaDescuento(int demanda, float costo_orden, float costo_mantener, float tiempo_carga, float costo_adquisicion, int cantidadPuntosDescuento) 
    {
        super(demanda, costo_orden, costo_mantener, tiempo_carga, costo_adquisicion);
        this.cantidadPuntosDescuento = cantidadPuntosDescuento;
    }
    
    
}
