/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11lambda;

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
        Matematicas suma = (float a,float b)->a+b;
        Matematicas resta = (float a,float b)->a-b;
        Matematicas multiplicacion = (float a,float b)->a*b;
        Matematicas division = (float a,float b)->a/b;
        
        
        System.out.print(operar(10f,20f,suma));
        System.out.print(operar(10f,20f,resta));
        System.out.print(operar(10f,20f,multiplicacion));
        System.out.print(operar(10f,20f,division));
        
    }
    static float operar(float a,float b, Matematicas operacion){
        return operacion.operacion(a, b);
    }
}
