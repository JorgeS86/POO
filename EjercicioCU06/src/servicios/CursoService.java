/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class CursoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.*/
    public String[] cargarAlumnos() {
        System.out.println("Ingrese cantidad de alumnos a ingresar: ");
        int cantAlumnos = leer.nextInt();

        String[] alumnos = new String[cantAlumnos];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno: ");
            alumnos[i] = leer.next();
        }
        return alumnos;
    }
    
    public Curso crearCurso(){
        Curso CursoAux = new Curso();
        
        System.out.println("Ingrese el nombre del curso:");
        CursoAux.setNombreCurso(leer.next());
        System.out.println("Ingrese cantidad de Horas por día del curso: ");
        CursoAux.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de Días por semana del curso: ");
        CursoAux.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese Turno (Mañana / Tarde): ");
        CursoAux.setTurno(leer.next());
        System.out.println("Ingrese el precio por Hora: ");
        CursoAux.setPrecioPorHora(leer.nextInt());
        CursoAux.setAlumnos(cargarAlumnos());
        return CursoAux;
    }
public void mostrarCurso(Curso CursoAux){
    System.out.println("--------------------");
    System.out.println("Curso: "+CursoAux.getNombreCurso());
    System.out.println("Hs x día: "+CursoAux.getCantidadHorasPorDia());
    System.out.println("Días x semana de cursado: "+CursoAux.getCantidadDiasPorSemana());
    System.out.println("Turno: "+CursoAux.getTurno());
    System.out.println("Precio x hora: "+CursoAux.getPrecioPorHora());
    System.out.println("Alumnos: "+Arrays.toString(CursoAux.getAlumnos()));
    System.out.println("--------------------");
}
public void calcularGanancias(Curso CursoAux){
    int cantAlumnos = CursoAux.getAlumnos().length;
    System.out.println("cant alum: "+cantAlumnos);
    double ganancias = (CursoAux.getCantidadHorasPorDia() * CursoAux.getCantidadDiasPorSemana()) * CursoAux.getPrecioPorHora() * cantAlumnos;
    System.out.println("Las ganancia semanal de este curso es de: "+ganancias);
}
}
