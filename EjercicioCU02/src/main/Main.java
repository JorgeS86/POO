/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import servicios.ParDeNumerosService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ParDeNumerosService PDNS = new ParDeNumerosService();

        boolean salir = false;
        
        do {
            System.out.println("-----------------------------");
            System.out.println("MENU");
            System.out.println("1: Mostrar Valores");
            System.out.println("2: Devolver Mayor");
            System.out.println("3: Calcular Potencia");
            System.out.println("4: Calcular Raiz");
            System.out.println("0: Salir");
            System.out.println("-----------------------------");
            System.out.println("Ingrese la opción deseada: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    PDNS.mostrarValores();
                    break;
                case 2:
                    PDNS.devolverMayor();
                    break;
                case 3:
                    PDNS.calcularPotencia();
                    break;
                case 4:
                    PDNS.calculaRaiz();
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
