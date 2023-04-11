/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Cuenta;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        Cuenta C1 = new Cuenta();
        
        C1.crearCuenta();
        
        C1.retirar_dinero();
    }
}
