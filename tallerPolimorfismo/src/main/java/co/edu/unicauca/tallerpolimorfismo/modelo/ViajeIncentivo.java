/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 * Clase hija que hereda de una Clase Viaje
 * @author Jefferson Eduardo Campo, Fabián David Marín
 */
public class ViajeIncentivo extends Viaje {
    private String atrEmpresa;
    
    /**
     *
     * @param prmOrigen
     * @param prmDestino
     * @param prmCosto
     * @param prmFechaSalida
     * @param prmFechaLlegada
     * @param prmEmpresa
     */
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
    
    /**
     * Método que sobreescribe la descripción del tipo de viaje.
     * @return 
     */
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa "+atrEmpresa;
    }

    /**
     * 
     * @return "Método implementado en la clase hija viaje incentivo"
     */
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }

    
    
}
