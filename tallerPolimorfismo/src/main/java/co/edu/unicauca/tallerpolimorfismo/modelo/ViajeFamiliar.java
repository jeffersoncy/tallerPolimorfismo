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
public class ViajeFamiliar extends Viaje{
    
    /*ZONA declaracion */
    private int atrFamilia;
    
    public ViajeFamiliar(String prmOrigen, String prmLlegada, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada, int prmFamilia)
    {
        super(prmOrigen, prmLlegada, prmCosto, prmFechaSalida, prmFechaLlegada);
        atrOrigen = prmOrigen;
        atrDestino = prmLlegada;
        atrCosto = prmCosto;
        atrFechaSalida = prmFechaSalida;
        atrFechaLlegada = prmFechaLlegada;
        atrFamilia = prmFamilia;
    }
    
    @Override
    public String descripcion()
    {
        return "Aquí devuelve la descripcion de ViajeFamiliar";
    }
    
    public void setFamilia(int prmFamilia)
    {
        atrFamilia = prmFamilia;
    }
    
    public int getFamilia()
    {
        return atrFamilia;
    }
    
    @Override
    public String cualquierMetodo2()
    {
        return "Aquí devuelve cualquierMetodo2 en ViajeFamiliar";
    }
}
