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
public abstract class DeterministaGeneral 
{
    protected int demanda; //D
    protected float costo_orden; //K
    protected float costo_mantener; //h, si tiene "%" varía EOQ y demás ecuaciones
    protected float tiempo_carga; //L
    protected float costo_adquisicion; //p
    protected boolean hdB;
    protected String tipo;
    
    public DeterministaGeneral()
    {
        this.demanda = 0;
        this.costo_orden = 0;
        this.costo_mantener = 0;
        this.tiempo_carga = 0;
        this.costo_adquisicion = 0;
        this.tipo = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DeterministaGeneral(int demanda, float costo_orden, float costo_mantener, float tiempo_carga, float costo_adquisicion, String tipo) 
    {
        this.demanda = demanda;
        this.costo_orden = costo_orden;
        this.costo_mantener = costo_mantener;
        this.tiempo_carga = tiempo_carga;
        this.costo_adquisicion = costo_adquisicion;
        this.tipo = tipo;
    }

    public int getDemanda() 
    {
        return demanda;
    }

    public void setDemanda(int demanda) 
    {
        this.demanda = demanda;
    }

    public float getCosto_orden() 
    {
        return costo_orden;
    }

    public void setCosto_orden(float costo_orden) 
    {
        this.costo_orden = costo_orden;
    }

    public float getCosto_mantener() 
    {
        if (hdB == true) 
        {
            setCosto_mantenerCalcularHd();
            hdB= false;
        }
        return costo_mantener;
    }

    public void setCosto_mantener(String costo_mantener) 
    {
        if(costo_mantener.indexOf("%")!=-1)
        {
           float hd = 0;
           String antes = "";
           antes = costo_mantener.replaceAll("%", "");
           hd = Float.parseFloat(antes);
           hd= hd/100;
           this.costo_mantener = hd;
           hdB = true;
        }
        else
        {
            hdB = false;
            this.costo_mantener = (Float.parseFloat(costo_mantener));
        } 

         
    }

    public void setCosto_mantenerCalcularHd()
    {
        this.costo_mantener = costo_mantener *costo_adquisicion;
        
    }

    public float getTiempo_carga() 
    {
        return tiempo_carga;
    }

    public void setTiempo_carga(float tiempo_carga) 
    {
        this.tiempo_carga = tiempo_carga;
    }

    public float getCosto_adquisicion() 
    {
        return costo_adquisicion;
    }

    public void setCosto_adquisicion(float costo_adquisicion) 
    {
        this.costo_adquisicion = costo_adquisicion;
    }
    
    public abstract float calcularCantidadOptimaOrdenar(); //Representa la EOQ, varía SOLO para el de escasez

    public abstract float calcularCostoTotalMantenimiento(); //Representa uno de los términos de TCU, varía SOLO para el de escasez

    public abstract float calcularTCU(); //Represental el Costo Total de Inventario en un tiempo dado (TC*), diferente SOLO para el de escasez
    
    public float calcularTiempoEntreOrdenes() 
    {
        return (calcularCantidadOptimaOrdenar()/demanda); //Representa to*
    }
    
    public int calcularValorEnteroMayor() 
    {
        return (int) (tiempo_carga/calcularTiempoEntreOrdenes()); //Representa n
    }
    
    public float calcularPtoReorden()
    {        
        if(tiempo_carga == 0)
        {
            return 0;
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

    public float calcularCostoTotalColocarOrdenes()
    {
        return (costo_orden*demanda)/calcularCantidadOptimaOrdenar();
    }

    public float calcularCostoTotalMaterial()
    {
        return costo_adquisicion*demanda;
    }

    public float calcularCantidadPedidosXTiempo()
    {  
        return (demanda/calcularCantidadOptimaOrdenar()); //n
        
    }

    @Override
    public String toString() {
        return "DeterministaGeneral{" + "demanda=" + demanda + ", costo_orden=" + costo_orden + ", costo_mantener=" + costo_mantener + ", tiempo_carga=" + tiempo_carga + ", costo_adquisicion=" + costo_adquisicion + ", hdB=" + hdB + ", tipo=" + tipo + '}';
    }

    //se le pasa X, en donde estará un pto de la EOQ óptima
    public float calcularCostoGrafica(float eoq) 
    {
        return calcularTCqGrafica(eoq); //Retorna y
    }

    public float calcularTCqGrafica(float eoq)
    {
        return calcularMantenimientoGrafica(eoq) + calcularCostoOrdenGrafica(eoq);
    }


    //Curva interceptada con la recta
    public float calcularCostoOrdenGrafica(float eoq)
    {
        return (costo_orden*demanda)/eoq;
    }

    //la recta
    public abstract float calcularMantenimientoGrafica(float eoq);







    
        
}


