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
public class Automovil extends Vehiculos{
    
    Boolean   encendidoElectronico;
    ArrayList<Automovil> auto = new ArrayList();
    Boolean encendido;
    String linea;
    public Automovil(){
    
    }
    public Boolean getEncendidoElectronico() {
        return encendidoElectronico;
    }

    public void setEncendidoElectronico(Boolean encendidoElectronico) {
        this.encendidoElectronico = encendidoElectronico;
    }

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }
    String tipoTraccion;

   
    
    
    public Automovil(int idvehiculo,String marca, String modelo,String color,String capacidad,Boolean encendidoElectronico,String tipoTraccion ){
        super(idvehiculo,marca,modelo,color,capacidad);
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
        Automovil b = new Automovil();
        b.setIdvehiculo(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id del Auto")));
        b.setMarca(JOptionPane.showInputDialog("Introduce la marca del Auto"));
        b.setModelo(JOptionPane.showInputDialog("Introduce el modelo del Auto"));
        b.setCapacidad(JOptionPane.showInputDialog("Introduce la capacidad del Auto"));
        b.setColor(JOptionPane.showInputDialog("Introduce el color del Auto"));
        b.setTipoTraccion(JOptionPane.showInputDialog("Introduce el tipo de Auto"));
        String expresion2 = "";
        int mselect2;
        expresion2 = JOptionPane.showInputDialog("El automovil tiene encendido electrónico  \n 1.Si\n 2.No");
        mselect2 = Integer.parseInt(expresion2);
     
        switch(mselect2){
            
            case 1:
                encendido=true;
            break;
            case 2:
               encendido=false;
           
            default:
                encendido=false;
            break;
        }
        
        b.setEncendidoElectronico(encendido);
        
        
        
       
        auto.add(new Automovil (b.getIdvehiculo(),b.getMarca(),b.getModelo(),b.getColor(),b.getCapacidad(),b.getEncendidoElectronico(),b.getTipoTraccion()));
        
         for(int a =0;a<auto.size();a++){
             linea= "idVehiculo: "+ auto.get(a).getIdvehiculo()+
                     " Marca: "+auto.get(a).getMarca()+
                     " Modelo: "+auto.get(a).getModelo()+
                     " Color: "+auto.get(a).getColor()+
                     " Capacidad: "+auto.get(a).getCapacidad()+
                     " Encendido electrónico: "+auto.get(a).getEncendidoElectronico()+
                     " Tipo Traccion: "+auto.get(a).getTipoTraccion()+
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
      
    }
    
    
    
}
