/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08ejercicioabstracinterfaz;

import javax.swing.JOptionPane;
import tipovehiculo.Automovil;
import tipovehiculo.Avion;
import tipovehiculo.Bicicleta;
import tipovehiculo.Motocicleta;
import vehiculos.Vehiculos;

/**
 *
 * @author me.horta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void vehiculos(Vehiculos v){
        v.Registrar();
    
    }
    public static void consultar(){
     
        Motocicleta moto = new Motocicleta();
        moto.consultarVehiculos();
    }
    public static void elegir(){
        
        Automovil auto = new Automovil();
        Avion avi = new Avion();
        Bicicleta bici = new Bicicleta();
        Motocicleta moto = new Motocicleta();
        
        
         
       String expresion = "";
       int mselect;
        expresion = JOptionPane.showInputDialog("Elige el vehiculo a registrar \n 1.Automovil\n 2.Aviòn \n 3.Bicicleta  \n 4.Motocicleta");
        mselect = Integer.parseInt(expresion);
        
        switch(mselect){
            
            case 1:
                vehiculos(auto);
            break;
            case 2:
                vehiculos(avi);
            break;
            case 3:
                vehiculos(bici);
            break;
            case 4:
                vehiculos(moto);
                
            break;
            default:
                JOptionPane.showMessageDialog(null, "Error!");
            break;
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Boolean bandera = false;
        
       do{
            String expresion = "";
       int mselect;
        expresion = JOptionPane.showInputDialog("Elige el una opción \n 1.Registrar\n 2.Consultar \n 3.Salir");
        mselect = Integer.parseInt(expresion);
        switch(mselect){
            
            case 1:
                elegir();
            break;
            case 2:
                consultar();
            break;
            
  
            default:
                bandera=true;
            break;
        }
       } while(bandera==false);
        
    }
    
}
