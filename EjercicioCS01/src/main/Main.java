/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.CuentaBancaria;
import java.util.Scanner;
import servicio.CuentaBancariaServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CuentaBancariaServicio CBS1 = new CuentaBancariaServicio();
        CuentaBancaria cuenta1= CBS1.crearCuenta();
        boolean salir = false;

        do {
            System.out.println("--------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("");
            System.out.println("1: Ingresar Dinero");
            System.out.println("2: Retirar Dinero");
            System.out.println("3: Retiro Express");
            System.out.println("4: Consultar Saldos");
            System.out.println("5: Consultar Datos");
            System.out.println("0: Salir");
            System.out.println("");
            System.out.println("Ingrese la opción deseada: ");
            int opcion = leer.nextInt();
            System.out.println("--------------");

            switch (opcion) {
                case 1:
                    CBS1.ingresarDinero(cuenta1);
                    break;
                case 2:
                    CBS1.retirarDinero(cuenta1);
                    break;
                case 3:
                   CBS1.extraccionRapida(cuenta1);
                    break;
                case 4:
                    CBS1.consultarSaldo(cuenta1);
                    break;
                case 5:
                    CBS1.consultarDatos(cuenta1);
                    break;
                case 0:
                    System.out.println("Usted seleccionó SALIR");
                    salir = true;
                    break;
                default:
                    System.out.println("Usted Ingresó una opción no válida");
            }
        } while (salir != true);

    }
}
