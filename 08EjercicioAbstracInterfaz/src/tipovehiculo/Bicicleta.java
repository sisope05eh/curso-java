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
public class Bicicleta extends Vehiculos {
    String tipoBicicleta;
    Boolean frenosDisco,Velocimetro;

    public String getTipoBicicleta() {
        return tipoBicicleta;
    }

    public void setTipoBicicleta(String tipoBicicleta) {
        this.tipoBicicleta = tipoBicicleta;
    }

    public Boolean getFrenosDisco() {
        return frenosDisco;
    }

    public void setFrenosDisco(Boolean frenosDisco) {
        this.frenosDisco = frenosDisco;
    }

    public Boolean getVelocimetro() {
        return Velocimetro;
    }

    public void setVelocimetro(Boolean Velocimetro) {
        this.Velocimetro = Velocimetro;
    }
    
    
    public Bicicleta(int idvehiculo,String marca, String modelo,String color,String capacidad,String tipoBicicleta,Boolean frenosDisco,Boolean Velocimetro ){
        super(idvehiculo,marca,modelo,color,capacidad);
        this.tipoBicicleta= tipoBicicleta;
        this.frenosDisco = frenosDisco;
        this.Velocimetro = Velocimetro;
        
    } 
    
    @Override
    public String comoFunciona(){
    return "Por esfuerzo fisico";
    }
    
    @Override
    public  String  queTransporta(){
        return "Persona";
    
    }
}
