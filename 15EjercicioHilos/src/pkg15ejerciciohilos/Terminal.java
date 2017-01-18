/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15ejerciciohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author me.horta
 */
public class Terminal implements Runnable {
    private Autobus autobus;
    private long tiempoInicial;
    
    private static String [] proceso={" Ascenso "," Espera "," Descenso "};
    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }
    
    public Terminal(Autobus autobus, long tiempoInicial){
        this.autobus=autobus;
        this.tiempoInicial=tiempoInicial;
    }
     @Override
    public void run(){
     System.out.println("Autobus con el Numero: "+autobus.getNumAuto()+ 
             " se comenzo en el tiempo: "+(System.currentTimeMillis()-tiempoInicial)/1000);
     
     
                for(int valor =0; valor <autobus.getTiempos().length;valor++){
                    esperarSegundos(autobus.getTiempos()[valor]);
                    
                    System.out.println("Autobus: "+ autobus.getNumAuto() + proceso[valor]+ 
                            " Tiempo: "+ (System.currentTimeMillis()-tiempoInicial)/1000);
                
                }
                
                
                System.out.println("El autobus con el numero: "+autobus.getNumAuto()+ " partio a su destino: "+autobus.getDestino());
    }
    
    private void esperarSegundos(int seg){
    
        try {
            Thread.sleep(seg*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Terminal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
