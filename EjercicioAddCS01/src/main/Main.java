/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Fraccion;
import java.util.Scanner;
import servicios.FraccionServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        FraccionServicio FS = new FraccionServicio();
        Fraccion FR = FS.crearFr();

        System.out.println("Fraccion 1: " + (int) FR.getNumerador1() + "/" + (int) FR.getDenominador1());
        System.out.println("Fraccion 2: " + (int) FR.getNumerador2() + "/" + (int) FR.getDenominador2());

        boolean salir = false;
        do {
            System.out.println("----");
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1: SUMAR");
            System.out.println("2: RESTAR");
            System.out.println("3: MULTIPLICAR");
            System.out.println("4: DIVIDIR");
            System.out.println("0: SALIR");
            System.out.println("----");
            System.out.println("Seleccione una opcíon: ");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    FS.sumar(FR);
                    break;
                case 2:
                    FS.restar(FR);
                    break;
                case 3:
                    FS.multiplicacion(FR);
                    break;
                case 4:
                    FS.division(FR);
                    break;
                case 0:
                    salir = true;
                    System.out.println("Usted seleccionó SALIR");
                    break;
                default:
                    System.out.println("LA OPCIÓN INGRESADA NO ES VÁLIDA");
            }
        } while (salir == false);
    }
}
