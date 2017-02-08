/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author me.horta
 */
public class Corrida {

    public int idCorrida;
    public String origen;
    public String destino;
    public String fechaSalida;
    public String horaSalida;
    public String fechaLlegada;
    public String horaLlegada;
    public int escalas;

    public int getIdCorrida() {
        return idCorrida;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public int getEscalas() {
        return escalas;
    }

    public void setIdCorrida(int idCorrida) {
        this.idCorrida = idCorrida;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setEscalas(int escalas) {
        this.escalas = escalas;
    }

    public Corrida(String origen, String destino, String fechaSalida, String horaSalida, String fechaLlegada, String horaLlegada, int escalas) {
       
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
        this.escalas = escalas;
    }

    public Corrida() {
    }
    
    
}
