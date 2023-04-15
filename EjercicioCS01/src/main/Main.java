/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicio.CuentaBancariaServicio;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        
      CuentaBancariaServicio CBS1 = new CuentaBancariaServicio();
      CBS1.crearCuenta();
     // CBS1.ingresarDinero();
     // CBS1.retirarDinero();
    //  CBS1.extraccionRapida();
      CBS1.consultarSaldo();
      CBS1.consultarDatos();
    }
}
