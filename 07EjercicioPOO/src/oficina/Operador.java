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
public class Operador extends Empleado {
    
    
    public Operador(String nombre,String apellido,int edad,int cveEmpleado,float salario){
        super(nombre,apellido,edad,cveEmpleado,salario);
    }
    public void trabajar(){
        System.err.println("Conduce las Unidades");
    }
    
    public void transporteTorta(){
        System.err.println("Trafica con tortas con sobres Azules");
    }

}
