/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Persona;
import java.util.Scanner;
import servicios.PersonaService;

/**
 *
 * @author jorge
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaService PS = new PersonaService();
        Persona P1 = PS.crearPersona();

        //System.out.println("Nombre: " + P1.getNombre());
        //System.out.println("Fecha de Nacimiento: " + P1.getFechaNac());
        //System.out.println("La edad del usuario ("+P1.getNombre() +") es de: "+PS.calcularEdad(P1) +" Años");
        //System.out.println("Ingrese edad a consultar: ");
        PS.mostrarPersona(P1);
        
        int edad = leer.nextInt();
        
        System.out.println("La edad del usuario (" + P1.getNombre() + ") es menor a " + edad + "?: " + PS.menorQue(P1, edad));
    }
}
