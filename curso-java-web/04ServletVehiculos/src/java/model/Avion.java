/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author macbookpro
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
import vehiculos.Vehiculos;

/**
 *
 * @author me.horta
 */
public class Avion extends Vehiculos{
    
      String propulsores, tipoAvion ;
      ArrayList<Avion> avion = new ArrayList();
      String linea;

    public Avion(){}
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
    
      public Avion(int idvehiculo,String idTipoVehiculo,String marca, String modelo,String color,String capacidad,String propulsores,String tipoAvion ){
        super(idvehiculo,idTipoVehiculo,marca,modelo,color,capacidad);
        this.propulsores= propulsores;
        this.tipoAvion = tipoAvion;
    }
      
     
    public  String comoFunciona(){
        return "Por medio de propulsores";
    
    }
    
    public  String queTransporta(){
        return "Personas, equipaje o cargas pesadas";
    }

    @Override
    public void Registrar() {
        
      
    }

    @Override
    public void consultarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
