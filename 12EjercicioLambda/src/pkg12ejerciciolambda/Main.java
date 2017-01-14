/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12ejerciciolambda;

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
        
        Diferenciador par = (int[] valor)->{ 
            int[] pares = new int[valor.length];
            for(int b =0; b< valor.length;b++){
               if(valor[b]%2==0){
                   
                   pares[b]=valor[b];
               
               }
            
            }
            
            
            return pares;
        
        };
        
        Diferenciador impar = (int[]valor)->{ 
            int[] impares = new int[valor.length];
            for(int b =0; b< valor.length;b++){
               if(valor[b]%2!=0){
                   
                   impares[b]=valor[b];
               
               }
            
            }
            
            
            return impares;
        
        };;
        
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
        
        int[] numeros = new int[tamaño];
        
        for(int a =0; a<numeros.length;a++){
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"+ (a+1)));
            numeros[a]= valor;
        }
        
        System.out.println("Los numero pares son:");
        int[] resultado = diferir(numeros,par);
        for(int a =0;a<resultado.length;a++){
            System.out.println("Valor"+resultado[a]);
        
        }
        
        System.out.println("Los numero impoares son:");
        int[] resultado2 = diferir(numeros,impar);
        for(int a =0;a<resultado2.length;a++){
            System.out.println("Valor"+resultado2[a]);
        
        }
       // for int
                
    }
    static int[] diferir(int[] a, Diferenciador diferente){
        return diferente.diferente(a);
    }
    
    
    
    
}
