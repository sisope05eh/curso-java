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
public class Futbolista extends Persona implements Deporte {
    private String posicion;
    private int dorsal;
    
    
    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
   
    
    
    public Futbolista(String nombre, String apellido, int edad,String posicion,int dorsal){
        super(nombre,apellido,edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
    }
    
    @Override
    public void hablar(){
        System.out.println("Se hizo lo que se pudo...., dimos lo mejor");
    }
    @Override
    public void comer(){
        System.out.println("¿Que es eso?");
    }
    
    public String toString(){
        return  "Nombre: "+getNombre()+ " Apellido: "+getApellido()+ " Edad:"+ getEdad() + " Posición: "+ posicion + " Dorsal: "+ dorsal;

    }
    
    
     @Override
    public void entrenar(){
        System.out.println("Al la cancha a las 5 am");
    }
    
    @Override
    public void viajar(){
        System.out.println("Viaja cada partido");
    }
    
    @Override
    public void jugar(){
        System.out.println("cascarita");
    }
}
