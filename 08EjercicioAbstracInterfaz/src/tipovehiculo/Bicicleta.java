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
    
    
    public Bicicleta(int idvehiculo,String marca, String modelo,String color,String capacidad,String tipoBicicleta,Boolean frenosDisco,Boolean Velocimetro ){
        super(idvehiculo,marca,modelo,color,capacidad);
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
        Boolean frenosd;
        Boolean velocim;
        Bicicleta b = new Bicicleta();
        b.setIdvehiculo(Integer.parseInt(JOptionPane.showInputDialog("Introduce el Id de la bicileta")));
        b.setMarca(JOptionPane.showInputDialog("Introduce la marca de la bicileta"));
        b.setModelo(JOptionPane.showInputDialog("Introduce el modelo de la bicileta"));
        b.setCapacidad(JOptionPane.showInputDialog("Introduce la capacidad de la bicileta"));
        b.setColor(JOptionPane.showInputDialog("Introduce el color de la bicileta"));
        b.setTipoBicicleta(JOptionPane.showInputDialog("Introduce el tipo de bicileta"));
        String expresion = "";
        int mselect;
        expresion = JOptionPane.showInputDialog("La bicicleta cuenta con frenos de disco \n 1.Si\n 2.No");
        mselect = Integer.parseInt(expresion);
        switch(mselect){
            
            case 1:
                frenosd=true;
            break;
            case 2:
               frenosd=false;
           
            default:
                frenosd=false;
            break;
        }
        
        b.setFrenosDisco(frenosd);
        String expresion2 = "";
        int mselect2;
        expresion2 = JOptionPane.showInputDialog("La bicicleta cuenta con Velocimetro  \n 1.Si\n 2.No");
        mselect2 = Integer.parseInt(expresion2);
     
        switch(mselect2){
            
            case 1:
                velocim=true;
            break;
            case 2:
               velocim=false;
           
            default:
                velocim=false;
            break;
        }
        
        b.setVelocimetro(velocim);
       
        bici.add(new Bicicleta (b.getIdvehiculo(),b.getMarca(),b.getModelo(),b.getColor(),b.getCapacidad(),b.getTipoBicicleta(),b.getFrenosDisco(),b.getVelocimetro()));
        
         
         for(int a =0;a<bici.size();a++){
             linea= "idVehiculo: "+ bici.get(a).getIdvehiculo()+
                     "-Marca: "+bici.get(a).getMarca()+
                     "-Modelo: "+bici.get(a).getModelo()+
                     "-Color: "+bici.get(a).getColor()+
                     "-Capacidad: "+bici.get(a).getCapacidad()+
                     "-Tipo de bicileta: "+bici.get(a).getTipoBicicleta()+
                     "-Frenos de disco: "+bici.get(a).getFrenosDisco()+
                     "-Velocimetro: "+bici.get(a).getVelocimetro()+
                     "-Como funciona: "+ comoFunciona()+
                     "-Que transporta: "+ queTransporta()+
                     "-Vehiculo: Bicicleta"+
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
