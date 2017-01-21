/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author me.horta
 */
public class Autobus {
    
    private int numaut,capacidad,modelo;
    private String siglas,base;

    public int getNumaut() {
        return numaut;
    }

    public void setNumaut(int numaut) {
        this.numaut = numaut;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Autobus(int numaut, int capacidad, int modelo, String siglas, String base) {
        this.numaut = numaut;
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.siglas = siglas;
        this.base = base;
    }
    
    public Autobus(){
    
    }
    @Override
    public String toString() {
        return "Autobus{" + "numaut=" + numaut + ", capacidad=" + capacidad + ", modelo=" + modelo + ", siglas=" + siglas + ", base=" + base + '}';
    }
    
    
    
}
