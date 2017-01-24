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
public class Automovil extends Vehiculos{
    
    String   encendidoElectronico;
    ArrayList<Automovil> auto = new ArrayList();
    String encendido;
    String linea;
    public Automovil(){
    
    }
    public String getEncendidoElectronico() {
        return encendidoElectronico;
    }

    public void setEncendidoElectronico(String encendidoElectronico) {
        this.encendidoElectronico = encendidoElectronico;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }
    String tipoTraccion;

   

   
    
    
    public Automovil(int idvehiculo,String idTipoVehiculo,String marca, String modelo,String color,String capacidad,String encendidoElectronico,String tipoTraccion ){
        super(idvehiculo,idTipoVehiculo,marca,modelo,color,capacidad);
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

    @Override
    public void Registrar() {
  
     
    }

    @Override
    public void consultarVehiculos() {
      
    }
    
    
    
}
