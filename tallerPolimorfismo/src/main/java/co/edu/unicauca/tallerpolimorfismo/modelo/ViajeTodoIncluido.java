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
public class ViajeTodoIncluido extends Viaje{
    
    public ViajeTodoIncluido(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada)
    {
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        atrOrigen = prmOrigen;
        atrDestino = prmDestino;
        atrCosto = prmCosto;
        atrFechaSalida = prmFechaSalida;
        atrFechaLlegada = prmFechaLlegada;
    }
    
    @Override
    public String descripcion()
    {
        return "Aquí devuelve la descripcion de ViajeTodoIncluido";
    }
    
    @Override
    public String cualquierMetodo2()
    {
        return "Aquí devuelve cualquierMetodo2 en ViajeTodoIncluido";
    }
}
