/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CadenaServicio CS = new CadenaServicio();
        boolean salir = false;
        Cadena C = CS.crearFrase();
        System.out.println("-----------------------------");
        System.out.println("Frase Ingresada: " + C.getFrase());
        System.out.println("-----------------------------");
        do {
            System.out.println("MENU");
            System.out.println("1: Mostrar Vocales");
            System.out.println("2: Invertir Frase");
            System.out.println("3: Letra Repetida");
            System.out.println("4: Comparar Frases");
            System.out.println("5: Unir Frases");
            System.out.println("6: Reemplazar Letra");
            System.out.println("7: Contiene Letra");
            System.out.println("0: Salir");
            System.out.println("-----------------------------");
            System.out.println("Ingrese la opción deseada: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    CS.mostrarVocales(C);
                    break;
                case 2:
                    CS.invertirFrase(C);
                    break;
                case 3:
                    CS.vecesRepetido(C);
                    break;
                case 4:
                    CS.compararLongitud(C);
                    break;
                case 5:
                    CS.unirFrases(C);
                    break;
                case 6:
                    CS.reemplazar(C);
                    break;
                case 7:
                    CS.contiene(C);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Usted seleccionó SALIR.");
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
        } while (salir == false);
    }
}
