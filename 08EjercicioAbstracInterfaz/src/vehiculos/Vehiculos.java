/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author me.horta
 */
public abstract class Vehiculos {
    
    private String marca,color, capacidad,modelo;
    int idvehiculo;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public int getIdvehiculo() {
        return idvehiculo;
    }

    public void setIdvehiculo(int idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
     
     public Vehiculos(int idvehiculo,String marca, String modelo,String color,String capacidad){
        this.marca =marca;
        this.modelo = modelo;
        this.idvehiculo = idvehiculo;
        this.color = color;
        this.capacidad= capacidad;
    }
     
    public Vehiculos(){
    
    };
    
    public abstract String comoFunciona();
    
    public abstract String queTransporta();
    
    public  abstract void Registrar();
    
    public abstract void consultarVehiculos(); 
    
}
