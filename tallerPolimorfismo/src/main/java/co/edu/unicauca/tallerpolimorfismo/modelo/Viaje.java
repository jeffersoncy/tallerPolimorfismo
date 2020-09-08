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
    
    protected String atrOrigen;
    protected String atrDestino;
    protected int atrCosto;
    protected Date atrFechaSalida;
    protected Date atrFechaLlegada;
    
    public Viaje(String pOrigen, String pDestino, int pCosto, Date pFechaLlegada, Date pFechaSalida)
    {
        atrOrigen = pOrigen;
        atrDestino = pDestino;
        atrCosto = pCosto;
        atrFechaLlegada = pFechaLlegada;
        atrFechaSalida = pFechaSalida;
    }
    /**
     * @return the atrOrigen
     */
    public String getOrigen() {
        return atrOrigen;
    }
    

    /**
     * @param atrOrigen the atrOrigen to set
     */
    public void setOrigen(String atrOrigen) {
        this.atrOrigen = atrOrigen;
    }

    /**
     * @return the atrDestino
     */
    public String getDestino() {
        return atrDestino;
    }

    /**
     * @param atrDestino the atrDestino to set
     */
    public void setDestino(String atrDestino) {
        this.atrDestino = atrDestino;
    }

    /**
     * @return the atrCosto
     */
    public int getCosto() {
        return atrCosto;
    }

    /**
     * @param atrCosto the atrCosto to set
     */
    public void setCosto(int atrCosto) {
        this.atrCosto = atrCosto;
    }

    /**
     * @return the atrFechaSalida
     */
    public Date getFechaSalida() {
        return atrFechaSalida;
    }

    /**
     * @param atrFechaSalida the atrFechaSalida to set
     */
    public void setFechaSalida(Date atrFechaSalida) {
        this.atrFechaSalida = atrFechaSalida;
    }

    /**
     * @return the atrFechaLlegada
     */
    public Date getFechaLlegada() {
        return atrFechaLlegada;
    }

    /**
     * @param atrFechaLlegada the atrFechaLlegada to set
     */
    public void setFechaLlegada(Date atrFechaLlegada) {
        this.atrFechaLlegada = atrFechaLlegada;
    }
    
    public abstract String descripcion();
    
    public String cualquierMetodo() {
        return "Cualquier método implementado en la clase base";
    }
    
    public String cualquierMetodo2() {
        return "Cualquier método2 implementado en la clase base";
    }
    
}
