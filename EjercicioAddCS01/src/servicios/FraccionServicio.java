/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Fraccion;

/**
 *
 * @author jorge
 */
public class FraccionServicio {

    /*Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.*/

    public Fraccion crearFr() {
        Fraccion FRaux = new Fraccion(1, 2, 2, 4);
        return FRaux;
    }

    public void sumar(Fraccion FRaux) {
        double suma = ((FRaux.getNumerador1() * FRaux.getDenominador2()) + (FRaux.getNumerador2() * FRaux.getDenominador1())) / (FRaux.getDenominador1() * FRaux.getDenominador2());
        System.out.println("La suma es: " + suma);
    }

    public void restar(Fraccion FRaux) {
        double resta = ((FRaux.getNumerador1() * FRaux.getDenominador2()) - (FRaux.getNumerador2() * FRaux.getDenominador1())) / (FRaux.getDenominador1() * FRaux.getDenominador2());
        System.out.println("La resta es: " + resta);
    }

    public void multiplicacion(Fraccion FRaux) {
        double multiplicar = (FRaux.getNumerador1() * FRaux.getNumerador2()) / (FRaux.getDenominador1() * FRaux.getDenominador2());
        System.out.println("La multiplicación es: " + multiplicar);
    }
    public void division(Fraccion FRaux) {
        double dividir = (FRaux.getNumerador1() * FRaux.getDenominador2() ) / (FRaux.getDenominador1() * FRaux.getNumerador2());
        System.out.println("La división es: " + dividir);
    }

}
