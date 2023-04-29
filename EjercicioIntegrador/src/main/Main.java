/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.Estudiante;
import java.util.Arrays;
import java.util.Scanner;
import servicio.EstudianteService;

/**
 *
 * @author jorge
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        EstudianteService ES = new EstudianteService();
        
        System.out.println("Ingrese la cantidad de estudiantes: ");
        int cantidad = leer.nextInt();
        Estudiante[] Est = new Estudiante[cantidad];
        
        for (int i = 0; i < Est.length; i++) {
            Est[i] = ES.crearEstudiante();
        }
        ES.mostrar(Est);
        System.out.println("El Promedio de todas las notas finales es: " + ES.promedio(Est));
        System.out.println("Estudiantes por encima del promedio: "+Arrays.toString(ES.mayorProm(Est)));
    }
}
