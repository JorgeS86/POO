/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Entidades.Operacion;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        Operacion op1 = new Operacion();

        op1.crearOperacion();

        System.out.println("Suma: " + op1.sumar());
        System.out.println("Resta: " + op1.restar());
        System.out.println("Multiplicacion: " + op1.multiplicar());
        System.out.println("Division: " + op1.dividir());
    }
}
