/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Jefferson Eduardo Campo, Fabian David Marín
 */
public class ViajeFamiliar extends Viaje{
    
    /*ZONA declaracion */
    private int atrFamilia;
    
    /**
     * Constructor Viaje Familiar que se deriva de clase Viaje
     * @param prmOrigen
     * @param prmLlegada
     * @param prmCosto
     * @param prmFechaSalida
     * @param prmFechaLlegada
     * @param prmFamilia
     */
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
        return "Viaje para disfrutar con toda tu familia";
    }
    
    /**
     *  metodo modificador
     * @param prmFamilia, se modifica el numero de la familia
     */
    public void setFamilia(int prmFamilia)
    {
        atrFamilia = prmFamilia;
    }
    
    /**
     * metodo para obtener el valor
     * @return se obtiene el numero de la familia
     */
    public int getFamilia()
    {
        return atrFamilia;
    }
    
    @Override
    public String cualquierMetodo2()
    {
        return "Método implementado en la clase hija viaje familiar";
    }
}
