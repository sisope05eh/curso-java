/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipovehiculo;

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
import vehiculos.Vehiculos;

/**
 *
 * @author me.horta
 */
public class Motocicleta extends Vehiculos  {
    String cascos,tipoMotocicleta,tipoEncendido;
    ArrayList<Motocicleta> moto = new ArrayList();
    String linea;
    public String getCascos() {
        return cascos;
    }

    public Motocicleta(){}
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

    @Override
    public void Registrar() {
    
        Motocicleta b = new Motocicleta();
        b.setIdvehiculo(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id de la moto")));
        b.setMarca(JOptionPane.showInputDialog("Introduce la marca de la moto"));
        b.setModelo(JOptionPane.showInputDialog("Introduce el modelo de la moto"));
        b.setCapacidad(JOptionPane.showInputDialog("Introduce la capacidad de la moto"));
        b.setColor(JOptionPane.showInputDialog("Introduce el color de la moto"));
        b.setCascos(JOptionPane.showInputDialog("Introduce cuantos cascos tiene la moto"));
        b.setTipoEncendido(JOptionPane.showInputDialog("Introduce el tipo de encedido de la moto"));
        b.setTipoMotocicleta(JOptionPane.showInputDialog("Introduce el tipo de moto"));
       
        
        
       
        moto.add(new Motocicleta (b.getIdvehiculo(),b.getMarca(),b.getModelo(),b.getColor(),b.getCapacidad(),b.getCascos(),b.getTipoMotocicleta(),b.getTipoEncendido()));
        
         for(int a =0;a<moto.size();a++){
             linea= "idVehiculo: "+ moto.get(a).getIdvehiculo()+
                     " Marca: "+moto.get(a).getMarca()+
                     " Modelo: "+moto.get(a).getModelo()+
                     " Color: "+moto.get(a).getColor()+
                     " Capacidad: "+moto.get(a).getCapacidad()+
                     " Cascos: "+moto.get(a).getCascos()+
                     " Tipo de Motocicleta: "+moto.get(a).getTipoMotocicleta()+
                     " Tipo de encendido: "+moto.get(a).getTipoEncendido()+
                     "\n";
         
         }
         try {
            FileOutputStream f = new FileOutputStream("/Users/macbookpro/NetBeansProjects/curso-java-master/08EjercicioAbstracInterfaz/src/tipovehiculo/vehiculos.txt",true);
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
        try {
            FileReader fR = new FileReader("/Users/macbookpro/NetBeansProjects/curso-java-master/08EjercicioAbstracInterfaz/src/tipovehiculo/vehiculos.txt");
            BufferedReader bR = new BufferedReader(fR);
            String linea2;
            while((linea2= bR.readLine())!=null){
                System.out.println(linea2);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Error.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
