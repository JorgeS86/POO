/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona1 = new Persona("Jorge", 12123123, 37);
        Persona persona2 = new Persona();

        System.out.println("Ingrese el nombre de la persona");
        persona2.setNombre(leer.next());
        System.out.println("Ingrese DNI de la persona");
        persona2.setDNI(leer.nextLong());
        System.out.println("Ingrese edad de la persona");
        persona2.setEdad(leer.nextInt());

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getDNI());
        System.out.println(persona1.getEdad());

        System.out.println(persona2.getNombre());
        System.out.println(persona2.getDNI());
        System.out.println(persona2.getEdad());
    }
}
