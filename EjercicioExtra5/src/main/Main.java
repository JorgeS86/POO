/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Empleado;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        
        Empleado E1 = new Empleado();
        
        E1.crearEmpleado();
        E1.calcular_aumento();
    }
}
