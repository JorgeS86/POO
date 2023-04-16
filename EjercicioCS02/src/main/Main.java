/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Cafetera;
import servicios.CafeteraServicio;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        CafeteraServicio CS = new CafeteraServicio();
        Cafetera cafe = CS.llenarCafetera();
        System.out.println("cap actual: "+cafe.getCantidadActual());
        System.out.println("cap max: "+cafe.getCapacidadMaxima());
   
        CS.servirTaza(cafe);
        
        CS.vaciarCafetera(cafe);
        
        CS.agregarcafe(cafe);
    }
}
