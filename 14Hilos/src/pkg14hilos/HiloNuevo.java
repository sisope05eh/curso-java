/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author me.horta
 */
public class HiloNuevo implements Runnable {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public HiloNuevo(int id){
        this.id=id;
    
    }
    @Override
    public void run() {
        System.out.println("Inicio de hilo 3 seg."+ id);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Fin del hilo de 3 seg. ID"+id);
    }
    
}
