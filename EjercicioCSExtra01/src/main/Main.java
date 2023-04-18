/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Raices;
import servicios.RaicesServicio;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        
        Raices ecuacion = new Raices(5,7,2);
        
        System.out.println("A: "+ecuacion.getA());
        System.out.println("B: "+ecuacion.getB());
        System.out.println("C: "+ecuacion.getC());
        
        RaicesServicio RS = new RaicesServicio();
        
       // System.out.println("Discriminante: "+RS.getDiscriminante(ecuacion));
        
       // System.out.println("Tiene raices?: "+RS.tieneRaices(ecuacion));
        
       // System.out.println("Tiene una raiz?: "+RS.tieneRaiz(ecuacion));
        
       // RS.obtenerRaices(ecuacion);
        
       // RS.obtenerRaiz(ecuacion);
        
        RS.calcular(ecuacion);
    }
}
