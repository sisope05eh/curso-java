/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipovehiculo;

import vehiculos.Vehiculos;

/**
 *
 * @author me.horta
 */
public class Avion extends Vehiculos{
    
      String propulsores, tipoAvion ;

    public String getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(String propulsores) {
        this.propulsores = propulsores;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }
    
      public Avion(int idvehiculo,String marca, String modelo,String color,String capacidad,String propulsores,String tipoAvion ){
        super(idvehiculo,marca,modelo,color,capacidad);
        this.propulsores= propulsores;
        this.tipoAvion = tipoAvion;
    }
      
     
    public  String comoFunciona(){
        return "Por medio de propulsores";
    
    }
    
    public  String queTransporta(){
        return "Personas, equipaje o cargas pesadas";
    }
}
