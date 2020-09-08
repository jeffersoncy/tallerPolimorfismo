/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.cliente;

import co.edu.unicauca.tallerpolimorfismo.modelo.Viaje;
import co.edu.unicauca.tallerpolimorfismo.modelo.ViajeFamiliar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Personal
 */
public class ClienteMain {

    /**
     * @param args the command line arguments
     */
    public static List<Viaje> viajes = new ArrayList();
    
    public static void main(String[] args) {
        
        leerViajes();
        mostrarViajes();
    }

    private static void leerViajes() {
        try
        {
            Viaje viaje1 = new ViajeFamiliar("Popayan", "Bogota", 100000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("08/10/2015"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("11/11/2015"), 4);
                    viajes.add(viaje1);
            
            Viaje viaje2 = new ViajeFamiliar("Cali", "Bucaramanga", 250000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("05/01/2016"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("10/02/2016"), 6);
                    viajes.add(viaje2);
             
            Viaje viaje3 = new ViajeFamiliar("Pasto", "Popayan", 60000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("01/03/2018"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("20/03/2018"), 5);
                    viajes.add(viaje3);
             
            Viaje viaje4 = new ViajeFamiliar("Bogota", "Mitu", 1500000, 
                    new SimpleDateFormat("dd/MM/yyyy").parse("03/12/2019"), 
                    new SimpleDateFormat("dd/MM/yyyy").parse("17/01/2020"), 9);
                    viajes.add(viaje4);
        }catch(ParseException ex)
        {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    private static void mostrarViajes() {
        
        for(Viaje viaje : viajes)
        {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripcion: " + viaje.descripcion());
            System.out.println("Cualquier metodo: " + viaje.cualquierMetodo());
            System.out.println("Cualquier metodo 2: " + viaje.cualquierMetodo2());
            System.out.println("");
        }
    }
    
}
