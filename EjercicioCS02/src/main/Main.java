/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Cafetera;
import java.util.Scanner;
import servicios.CafeteraServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicio CS = new CafeteraServicio();
        Cafetera cafe = CS.llenarCafetera();
        System.out.println("Capacidad Actual: " + cafe.getCantidadActual());
        System.out.println("Capacidad Máxima: " + cafe.getCapacidadMaxima());
        boolean salir = false;

        do {
            System.out.println("--------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1: Servir Taza");
            System.out.println("2: Vaciar Cafetera");
            System.out.println("3: Agregar Café");
            System.out.println("0: Salir");
            System.out.println("--------------");
            System.out.println("Seleccione una opción: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    CS.servirTaza(cafe);
                    break;
                case 2:
                    CS.vaciarCafetera(cafe);
                    break;
                case 3:
                    CS.agregarcafe(cafe);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Usted seleccionó Salir");
                    break;
                default:
                    System.out.println("La opción elegida no es válida");
            }
        } while (salir = true);

    }
}
