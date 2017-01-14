/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09exception;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ac.barrios
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* String nombre = "Cristina";
        ArrayList <String> a = null;
        try {
            a.add("d");
            int num = Integer.parseInt(nombre);
            System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Posición del arreglo no válida");
        } catch (NumberFormatException ex){
             System.out.println("Formato no válido");
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Formato no válido");
        }

        System.out.println("Final");*/
       
       
       Boleto b = new Boleto();
       Date fecha = new Date("05/01/2016");
       try{
       b.setFecha(fecha);
       }catch(FechaInvalidaException e){
           e.printStackTrace();
           e.otroMensaje();
           System.out.println("Introduce una fecha posterior");
       }finally{
           System.out.println(b.getFecha());
           System.out.println("Siempre se va a ejecutar");
       }
    }

}
