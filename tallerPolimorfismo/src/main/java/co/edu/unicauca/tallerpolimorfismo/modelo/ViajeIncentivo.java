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
public class ViajeIncentivo extends Viaje {
    private String atrEmpresa;

    public ViajeIncentivo(String prmOrigen, String prmDestino, int prmCosto, Date prmFechaSalida, Date prmFechaLlegada,String prmEmpresa){
        super(prmOrigen, prmDestino, prmCosto, prmFechaSalida, prmFechaLlegada);
        atrOrigen = prmOrigen;
        atrDestino = prmDestino;
        atrCosto = prmCosto;
        atrFechaSalida = prmFechaSalida;
        atrFechaLlegada = prmFechaLlegada;
        atrEmpresa = prmEmpresa;
    };
    
    /**
     * @return the atrEmpresa
     */
    public String getEmpresa() {
        return atrEmpresa;
    }

    /**
     * @param atrEmpresa the atrEmpresa to set
     */
    public void setEmpresa(String atrEmpresa) {
        this.atrEmpresa = atrEmpresa;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te la envia a la empresa "+atrEmpresa;
    }

    @Override
    public String cualquierMetodo2() {
        return "Meétodo implementado en la clase hija viaje de incentivo";
    }

    
    
}
