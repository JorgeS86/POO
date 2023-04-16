/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        System.out.println("Ingresa la cantidad de personas a controlar:");
        int N = leer.nextInt();
        Persona[] personas = new Persona[N];
        int[] IMC = new int[N];
        boolean[] mayor = new boolean[N];
        double sobrepeso = 0;
        double pesoBajo = 0;
        double pesoIdeal = 0;
        double esMayor = 0;
        double esMenor = 0;

        for (int i = 0; i < N; i++) {
            personas[i] = ps.crearPersona();
            IMC[i] = ps.calcularIMC(personas[i]);
            switch (IMC[i]) {
                case 1:
                    System.out.println("La persona tiene sobrepeso");
                    sobrepeso++;
                    break;
                case 0:
                    System.out.println("La persona tiene el peso ideal");
                    pesoIdeal++;
                    break;
                default:
                    System.out.println("La persona está debajo del peso ideal");
                    pesoBajo++;
                    break;
            }

            mayor[i] = ps.esMayor(personas[i]);
            if (mayor[i]) {
                esMayor++;
            } else {
                esMenor++;
            }
        }
        System.out.println("El promedio de personas con peso ideal es " + ((pesoIdeal / N) * 100));
        System.out.println("El promedio de personas con peso alto es " + ((sobrepeso / N) * 100));
        System.out.println("El promedio de personas con peso bajo es " + ((pesoBajo / N) * 100));
        System.out.println(esMayor + " son mayores de edad");
        System.out.println(esMenor + " son menores de edad");
    }
}
