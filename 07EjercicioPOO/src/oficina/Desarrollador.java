/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oficina;

/**
 *
 * @author me.horta
 */
public class Desarrollador extends Empleado {
    
    public Desarrollador(String nombre,String apellido,int edad,int cveEmpleado,float salario){
        super(nombre,apellido,edad,cveEmpleado,salario);
    }
    public void trabajar(){
        System.out.println("Codifica, Desarrolla, etc.");
    }
    
    public void transporteTorta(){
        System.out.println("Trafica tortas.");
    }
}
