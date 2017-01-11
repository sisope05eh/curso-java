/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05flujocontrol;

import javax.swing.JOptionPane;

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
        String [] nombres = new String[5];
        String cadena="";
        
        for(int a =0;a<nombres.length;a++){
            String nombre ="";
            nombre =JOptionPane.showInputDialog("Escribe el nombre "+(a+1));
            nombres[a]=nombre;
        }
        for(int b=0;b<nombres.length;b++){
            cadena= cadena+nombres[b]+"\n";
        }
        
        JOptionPane.showMessageDialog(null,"Los nombres registrados son: \n"+ cadena);
    }
    
}
