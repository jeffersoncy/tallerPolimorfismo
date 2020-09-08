/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Personal
 */
public abstract class Viaje {
    
    private String atrOrigen;
    private String atrDestino;
    private int atrCosto;
    private Date atrFechaSalida;
    private Date atrFechaLlegada;

    
    /**
     * @return the atrOrigen
     */
    public String getAtrOrigen() {
        return atrOrigen;
    }
    

    /**
     * @param atrOrigen the atrOrigen to set
     */
    public void setAtrOrigen(String atrOrigen) {
        this.atrOrigen = atrOrigen;
    }

    /**
     * @return the atrDestino
     */
    public String getAtrDestino() {
        return atrDestino;
    }

    /**
     * @param atrDestino the atrDestino to set
     */
    public void setAtrDestino(String atrDestino) {
        this.atrDestino = atrDestino;
    }

    /**
     * @return the atrCosto
     */
    public int getAtrCosto() {
        return atrCosto;
    }

    /**
     * @param atrCosto the atrCosto to set
     */
    public void setAtrCosto(int atrCosto) {
        this.atrCosto = atrCosto;
    }

    /**
     * @return the atrFechaSalida
     */
    public Date getAtrFechaSalida() {
        return atrFechaSalida;
    }

    /**
     * @param atrFechaSalida the atrFechaSalida to set
     */
    public void setAtrFechaSalida(Date atrFechaSalida) {
        this.atrFechaSalida = atrFechaSalida;
    }

    /**
     * @return the atrFechaLlegada
     */
    public Date getAtrFechaLlegada() {
        return atrFechaLlegada;
    }

    /**
     * @param atrFechaLlegada the atrFechaLlegada to set
     */
    public void setAtrFechaLlegada(Date atrFechaLlegada) {
        this.atrFechaLlegada = atrFechaLlegada;
    }
}
