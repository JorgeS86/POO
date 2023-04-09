/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Puntos P1 = new Puntos();
        Puntos P2 = new Puntos();
        
        P1.crearPuntos();
        P2.crearPuntos();
        System.out.println("P1 X: " + P1.getX() + " P1 Y: " + P1.getY());
        System.out.println("P2 X: " + P2.getX() + " P2 Y: " + P2.getY());
        
        double Distancia = Math.sqrt(Math.pow((P2.getX() - P1.getX()), 2) + Math.pow((P2.getY() - P1.getY()), 2));
        System.out.println(+Distancia);
    }
}
