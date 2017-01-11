/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author me.horta
 */
public class Operaciones {
    
    public float sumaArreglo(float[] arreglo){
        float suma = 0;
        for(int a = 0; a<arreglo.length; a++ ){
            suma = arreglo[a]+suma;
        }
        return suma;
        
    }
    
    public float mediaArreglo(float[] arreglo){
        float media = 0;
        float suma =sumaArreglo(arreglo);
        
        return media = suma/arreglo.length;
        
    }
    
    public float numeroMayor(float[] arreglo){
        float numeromayor = arreglo[0];
        for(int a = 0; a<arreglo.length;a++){
            if(arreglo[a]>numeromayor){
                numeromayor = arreglo[a];
            }
        
        }
        return numeromayor;
        
    
    }
    
    
}
