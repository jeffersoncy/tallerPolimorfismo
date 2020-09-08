/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Jefferson Eduardo Campo, Fabián David Marín
 */
public class ViajeTodoIncluido extends Viaje{
    
    /**
     *
     * @param prmOrigen
     * @param prmDestino
     * @param prmCosto
     * @param prmFechaSalida
     * @param prmFechaLlegada
     */
    public ViajeTodoIncluido(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada)
    {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        atrOrigen = prmOrigen;
        atrDestino = prmDestino;
        atrCosto = prmCosto;
        atrFechaSalida = prmFechaSalida;
        atrFechaLlegada = prmFechaLlegada;
    }

    /**
     * Método que sobreescribe la descripción de la clase hija viaje todo incluido
     * @return "Disfruta tu viaje todo incluido
     */
    @Override
    public String descripcion()
    {
        return "Disfruta tu viaje todo incluido";
    }
}
