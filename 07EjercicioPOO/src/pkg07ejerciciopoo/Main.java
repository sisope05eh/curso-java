/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07ejerciciopoo;
import deportes.Boxeador;
import deportes.Deporte;
import deportes.Futbolista;
import oficina.Desarrollador;
import oficina.Operador;
import persona.Persona;
/**
 *
 * @author me.horta
 */
public class Main {
    public static void pruebaInterfaz(Deporte d){
        d.viajar();
    }
    public static void pruebaHerencia(Persona p){
        p.hablar();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // TODO code application logic here
        //Desarrollador d = new Desarrollador("Eduardo","Horta",24,999731,2500);
        
        //Operador p = new Operador("Jose","Martinez", 45,88299,88762);
        
        Futbolista d = new Futbolista("Eduardo","Horta",24,"delantero",1);
        Boxeador b = new Boxeador("Eduardo","Horta",25,"54");
        
        pruebaInterfaz(d);
        pruebaHerencia(d); 
        pruebaInterfaz(b);
        pruebaHerencia(b);
       /* d.trabajar();
        d.transporteTorta();
        
        p.trabajar();
        p.transporteTorta();*/
        
        /*Persona p = new Persona("Eduardo Horta");
        p.hablar();
        
        Futbolista f = new Futbolista("Eduardo", "Horta", 24,"Delantero",14);
        //System.out.println("Nombre: "+f.getNombre()+ " Apellido: "+f.getApellido()+ " Edad:"+ f.getEdad() + " Posición: "+ f.getPosicion() + " Dorsal: "+ f.getDorsal());
        System.out.println(f);
        f.hablar();
        f.comer();
        p.setEdad(24);
        Persona p2 = new Persona ("Eduardo","Horta Gutiérrez",24);
        System.out.print("Nombre: "+ p.getNombre() + " ;Apellido: " + p.getApellido()+ " ;Edad: "+p.getEdad() + 
                "\n"+ "Nombre: "+ p2.getNombre() + " ;Apellido: "+ p2.getApellido()+ " ;Edad: " + p2.getEdad());
                    */
    }
    
}
