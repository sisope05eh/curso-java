/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
public class Bicicleta extends Vehiculos {
    String tipoBicicleta;
    Boolean frenosDisco,Velocimetro;
    ArrayList<Bicicleta> bici = new ArrayList();
    String linea;
    /**
     *
     */
    public Bicicleta() { 
    
    }

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
    
    
    public Bicicleta(int idvehiculo,String idTipoVehiculo,String marca, String modelo,String color,String capacidad,String tipoBicicleta,Boolean frenosDisco,Boolean Velocimetro ){
        super(idvehiculo,idTipoVehiculo,marca,modelo,color,capacidad);
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

    @Override
    public void Registrar() {
  
         }
   
        
        
    

    @Override
    public void consultarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
