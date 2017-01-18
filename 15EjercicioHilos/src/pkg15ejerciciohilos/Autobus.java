/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15ejerciciohilos;

/**
 *
 * @author me.horta
 */
public class Autobus {
    private int numAuto;
    private String origen,destino;
    private int[] tiempos;
    public Autobus(int numAuto,String origen,String destino, int[] tiempos){
        this.numAuto=numAuto;
        this.origen= origen;
        this.destino=destino;
        this.tiempos = tiempos;
        
    
    }
    public int getNumAuto() {
        return numAuto;
    }
    
    public void setNumAuto(int numAuto) {
        this.numAuto = numAuto;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int[] getTiempos() {
        return tiempos;
    }

    public void setTiempos(int[] tiempos) {
        this.tiempos = tiempos;
    }
    
    
   
    
}
