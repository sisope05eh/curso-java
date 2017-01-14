/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09exception;

/**
 *
 * @author ac.barrios
 */
public class FechaInvalidaException extends Exception{
    public FechaInvalidaException(){
       // System.out.println("Excepcion lanzada");
       super("Usted indico una fecha anterior a la de hoy");
    }
    
    public void otroMensaje(){
        System.out.println("Otro mensaje");
    }
}
