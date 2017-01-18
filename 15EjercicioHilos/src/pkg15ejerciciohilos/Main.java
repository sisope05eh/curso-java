/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15ejerciciohilos;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author me.horta
 */
public class Main {
   static  List<Autobus> autobuses = Arrays.asList(
            new Autobus(1, "Leon", "Guadalajara", new int[]{5,3,5}),
            new Autobus(2, "México", "Guadalajara", new int[]{2,3,5}),
            new Autobus(3, "Guadalajara", "León", new int[]{4,3,6}),
            new Autobus(4, "Queretaro", "León", new int[]{1,3,7}),
            new Autobus(5, "León", "Queretaro", new int[]{2,3,4}),
            new Autobus(6, "Toluca", "León", new int[]{8,3,5}),
            new Autobus(7, "Guanajuato", "Guadalajara", new int[]{6,3,7})
            
            
   );

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long tiempo = System.currentTimeMillis();
        int terminales = 2;
        ExecutorService ejecutor= Executors.newFixedThreadPool(terminales);
        
        autobuses.forEach(autobus->{
            Runnable terminal = new Terminal(autobus,tiempo);
            ejecutor.execute(terminal);
            
        
        });
        ejecutor.shutdown();
        while(!ejecutor.isTerminated()){
        
        
        }
        
        System.out.println("Proceso terminado...");
        
        
        
    }
    
}
