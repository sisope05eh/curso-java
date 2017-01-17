/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipovehiculo;

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

    @Override
    public void Registrar() {
        
        Avion b = new Avion();
        b.setIdvehiculo(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del Avión")));
        b.setMarca(JOptionPane.showInputDialog("Introduce la marca del Avión"));
        b.setModelo(JOptionPane.showInputDialog("Introduce el modelo del Avión"));
        b.setCapacidad(JOptionPane.showInputDialog("Introduce la capacidad del Avión"));
        b.setColor(JOptionPane.showInputDialog("Introduce el color del Avión"));
        b.setTipoAvion(JOptionPane.showInputDialog("Introduce el tipo de Avion"));
        b.setPropulsores(JOptionPane.showInputDialog("Introduce cuantos propulsores tiene el Avion"));
       
        
        
       
        avion.add(new Avion (b.getIdvehiculo(),b.getMarca(),b.getModelo(),b.getColor(),b.getCapacidad(),b.getPropulsores(),b.getTipoAvion()));
        
         
         
         for(int a =0;a<avion.size();a++){
             linea= "idVehiculo: "+ avion.get(a).getIdvehiculo()+ 
                     "-Marca: "+avion.get(a).getMarca()+ 
                     "-Modelo: "+avion.get(a).getModelo()+
                     "-Color: "+avion.get(a).getColor()+
                     "-Capacidad: "+avion.get(a).getCapacidad()+
                     "-Propulsoes: "+avion.get(a).getPropulsores()+
                     "-Tipo de Avión: "+avion.get(a).getTipoAvion()+
                     "-Como funciona: "+ comoFunciona()+
                     "-Que transporta: "+ queTransporta()+
                     "-Vehiculo: Avión"+
                     "\n";
         
         }
         
         
          try {
            FileOutputStream f = new FileOutputStream("C:\\Users\\me.horta\\Documents\\CursoJava\\curso-java\\08EjercicioAbstracInterfaz\\src\\tipovehiculo\\vehiculos.txt",true);
            OutputStreamWriter oS= new OutputStreamWriter(f,"UTF-8");
            BufferedWriter bW = new BufferedWriter(oS);
            String lineaError = linea;
            bW.write(lineaError);
            bW.close();
            
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } 
             
 
    }

    @Override
    public void consultarVehiculos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
