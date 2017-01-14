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
public class Automovil extends Vehiculos{
    
    Boolean   encendidoElectronico;

    public Boolean getEncendidoElectronico() {
        return encendidoElectronico;
    }

    public void setEncendidoElectronico(Boolean encendidoElectronico) {
        this.encendidoElectronico = encendidoElectronico;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }
    String tipoTraccion;

   
    
    
    public Automovil(int idvehiculo,String marca, String modelo,String color,String capacidad,Boolean encendidoElectronico,String tipoTraccion ){
        super(idvehiculo,marca,modelo,color,capacidad);
        this.encendidoElectronico= encendidoElectronico;
        this.tipoTraccion = tipoTraccion;
    }


    @Override
    public  String comoFunciona(){
        return "Por medio de motor a gasolina";
    }
    
    @Override
    public  String queTransporta(){
        return "Personas u objetos";
    }
    
    
    
}
