/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportes;

import persona.Persona;

/**
 *
 * @author me.horta
 */
public class Boxeador extends Persona implements Deporte {
 String peso;
 
    public Boxeador(String nombre, String apellido, int edad, String peso){
        super(nombre,apellido,edad);
        this.peso=peso;
    }
    
    @Override
    public void entrenar(){
        System.out.println("Al gym a las 5 am");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja a la pelea");
    }
    
    @Override
    public void jugar(){
        System.out.println("Boxea");
    }
    
}
