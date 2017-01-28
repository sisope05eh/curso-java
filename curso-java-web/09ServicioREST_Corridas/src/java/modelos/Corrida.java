/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author ac.barrios
 */
public class Corrida {

    public int idCorrida;
    public String origen;
    public String destino;
    public Date fechaSalida;
    public Time horaSalida;
    public Date fechaLlegada;
    public Time horaLlegada;
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

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public Time getHoraLlegada() {
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

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public void setEscalas(int escalas) {
        this.escalas = escalas;
    }

    public Corrida(String origen, String destino, Date fechaSalida, Time horaSalida, Date fechaLlegada, Time horaLlegada, int escalas) {
       
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
