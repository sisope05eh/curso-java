/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operador;

/**
 *
 * @author me.horta
 */
public class Operador {
 String nombre;
 int clave;
 boolean status;

    public Operador(String nombre,int clave,boolean status){
        this.nombre=nombre;
        this.clave=clave;
        this.status=status;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return String.format("Nombre: %s | Clave: %d | Status: %b", nombre,clave,status);
    }
}
