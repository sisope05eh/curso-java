/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author macbookpro
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author me.horta
 */
public class Motocicleta extends Vehiculos  {
    String tipoMotocicleta,tipoEncendido;
    ArrayList<Motocicleta> moto = new ArrayList();
    String linea;
    int cascos;
    public int getCascos() {
        return cascos;
    }

    public Motocicleta(){}
    public void setCascos(int cascos) {
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
    
    public Motocicleta(int idvehiculo,String idTipoVehiculo,String marca, String modelo,String color,String capacidad,int cascos,String tipoMotocicleta,String tipoEncendido ){
        super(idvehiculo,idTipoVehiculo,marca,modelo,color,capacidad);
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

    @Override
    public void Registrar() {
    
        Motocicleta b = new Motocicleta();
    
       
    }

    @Override
    public void consultarVehiculos() {
     
    }
}
