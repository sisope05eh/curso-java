/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06ejercicioarreglos;
import javax.swing.JOptionPane;
import operaciones.Operaciones;
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
         Operaciones mat = new Operaciones();
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
        
        float[] numeros = new float[tamaño];
        
        for(int a =0; a<numeros.length;a++){
            float valor = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero"+ (a+1)));
            numeros[a]= valor;
        }
        
       String expresion = "";
       int mselect;
        expresion = JOptionPane.showInputDialog("Elige la operación a ejecutar \n 1.Suma\n 2.Media \n 3.Numero Mayor del arreglo\n 4.Salir");
        mselect = Integer.parseInt(expresion);
        
        switch(mselect){
            
            case 1:
                JOptionPane.showMessageDialog(null, mat.sumaArreglo(numeros));
            break;
            case 2:
                JOptionPane.showMessageDialog(null, mat.mediaArreglo(numeros));
            break;
            case 3:
                JOptionPane.showMessageDialog(null, mat.numeroMayor(numeros));
            break;
            case 4:JOptionPane.showMessageDialog(null, "Oh dear! Error!");
                
            break;
            default:
                JOptionPane.showMessageDialog(null, "Error!");
            break;
        }
        
        
        
        
    }
    
}
