/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Rectangulo;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        Rectangulo R1 = new Rectangulo();
        R1.crearRectangulo();
        System.out.println("La superficie del rectangulo es: "+R1.superficie());
        System.out.println("El perimetro del rectangulo es: "+R1.perimetro());
        
        R1.dibujarRectangulo();
    }
}
