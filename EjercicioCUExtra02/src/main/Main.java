/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Ahorcado;
import java.util.Arrays;
import servicios.AhorcadoService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {

        AhorcadoService AS = new AhorcadoService();
        Ahorcado Ah = AS.crearJuego();

        // System.out.println("Palabra: " + Arrays.toString(Ah.getBuscar()));
        // System.out.println("intentos: " + Ah.getCantJugMax());
        // System.out.println("La longitud de la palabra ingresada es: " + AS.longitud());
        //AS.buscar();
        // AS.encontradas();    
        // AS.intentos();
        
        AS.juego();
    }
}
