/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14hilos;

/**
 *
 * @author me.horta
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for(int a =0; a<5;a++){
            HiloNuevo h = new HiloNuevo(a+1);
            Thread t = new Thread(h);
            t.start();
        }
    }
    
}
