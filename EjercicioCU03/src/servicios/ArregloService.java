/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Arrays;

/**
 *
 * @author jorge
 */
public class ArregloService {

    /*Crear la clase ArregloService, en el paquete servicio, 
    con los siguientes métodos:
    Método inicializarA recibe un arreglo por parámetro y lo inicializa 
    con números aleatorios.*/
    public void inicializarA(double[] arregloA) {
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 10;
        }
    }

    /*Método mostrar recibe un arreglo por parámetro 
   y lo muestra por pantalla.*/
    public void mostrar(double[] arreglo) {
        System.out.println("ARRAY: " + Arrays.toString(arreglo));
        /*for (int i = 0; i < arregloA.length; i++) {
           System.out.println("["+arregloA[i] +"]");
       }*/
    }

    /*Método ordenar recibe un arreglo por parámetro 
   y lo ordena de mayor a menor.*/
    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);
    }

    /*Método inicializarB copia los primeros 10 números del arreglo A 
   en el arreglo B. Luego llenar las últimas 10 posiciones 
   del arreglo B con 0.5.*/
    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        for (int i = 10; i < arregloB.length; i++) {
           arregloB[i] = 0.5; 
        }
    }
}
