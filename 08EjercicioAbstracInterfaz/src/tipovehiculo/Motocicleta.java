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
public class Motocicleta extends Vehiculos  {
    String cascos,tipoMotocicleta,tipoEncendido;

    public String getCascos() {
        return cascos;
    }

    public void setCascos(String cascos) {
        this.cascos = cascos;
    }

    public String getTipoMotocicleta() {
        return tipoMotocicleta;
    }

    public void setTipoMotocicleta(String tipoMotocicleta) {
        this.tipoMotocicleta = tipoMotocicleta;
    }

    public String getTipoEncendido() {
        return tipoEncendido;
    }

    public void setTipoEncendido(String tipoEncendido) {
        this.tipoEncendido = tipoEncendido;
    }
    
    public Motocicleta(int idvehiculo,String marca, String modelo,String color,String capacidad,String cascos,String tipoMotocicleta,String tipoEncendido ){
        super(idvehiculo,marca,modelo,color,capacidad);
        this.cascos= cascos;
        this.tipoMotocicleta = tipoMotocicleta;
        this.tipoEncendido = tipoEncendido;
        
    } 
    
    
    @Override
    public  String comoFunciona(){
        return "Por medio de gasolina";
    }
    
    @Override
    public  String queTransporta(){
        return "Personas";
    }
}
