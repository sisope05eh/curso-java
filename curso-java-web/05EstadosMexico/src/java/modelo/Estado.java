/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author me.horta
 */
public class Estado {
    private int idEstado,municipios,poblacion;
    private String nombre,comidaTipica,capital;

    public int getEstado() {
        return idEstado;
    }

    public void setEstado(int Estado) {
        this.idEstado = Estado;
    }

    public int getMunicipios() {
        return municipios;
    }

    public void setMunicipios(int municipios) {
        this.municipios = municipios;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComidaTipica() {
        return comidaTipica;
    }

    public void setComidaTipica(String comidaTipica) {
        this.comidaTipica = comidaTipica;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Estado(int idEstado,String nombre, int municipios,String capital,String comidaTipica, int poblacion ) {
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.municipios = municipios;
         this.capital = capital;
         this.comidaTipica = comidaTipica;
        this.poblacion = poblacion;
       
        
       
    }
    public Estado(){
    
    }
}
