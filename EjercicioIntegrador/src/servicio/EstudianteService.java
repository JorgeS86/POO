/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Estudiante;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class EstudianteService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante crearEstudiante() {
        Estudiante EstAux = new Estudiante();
        System.out.println("Ingrese el nombre del estudiante: ");
        EstAux.setNombre(leer.next());
        System.out.println("Ingrese nota final: ");
        EstAux.setNota(leer.nextDouble());

        return EstAux;
    }

    public void mostrar(Estudiante Est[]) {
        for (int i = 0; i < Est.length; i++) {
            System.out.println("------------------");
            System.out.println("Estudiante: " + Est[i].getNombre());
            System.out.println("Nota Final: " + Est[i].getNota());
            System.out.println("------------------");
        }
    }

    /*Calcular y mostrar el promedio de notas de todo el curso*/

    public double promedio(Estudiante Est[]) {
        int suma = 0;
        for (int i = 0; i < Est.length; i++) {
            suma += Est[i].getNota();
        }
        double promedio = (double) suma / (double) Est.length;
        return promedio;
        //System.out.println("El Promedio de todas las notas finales es: " + promedio);
    }
    
    /*Calcular y mostrar el promedio de notas de todo el curso*/
    
    public String[] mayorProm(Estudiante Est[]){
        
        int contM = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].getNota() > promedio(Est)) {
                contM++;
            }
        }
        String[] mayorP = new String[contM];
        int contador = 0;
        for (int i = 0; i < Est.length; i++) {
            if (Est[i].getNota() > promedio(Est)) {
                mayorP[contador] = Est[i].getNombre();
                contador++;
            }
        }
        return mayorP;
    } 
}
