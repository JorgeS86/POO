/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicios.ArregloService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        /*Crear en el Main dos arreglos. El arreglo A de 50 números reales 
        y el arreglo B de 20 números reales. */

        ArregloService AS = new ArregloService();

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        AS.inicializarA(arregloA);
        AS.mostrar(arregloA);
        AS.ordenar(arregloA);
        AS.mostrar(arregloA);
        
        AS.inicializarB(arregloA, arregloB);
        AS.mostrar(arregloB);
        AS.ordenar(arregloB);
        AS.mostrar(arregloB);
    }
}
