/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidad.NIF;
import servicios.NIFServicio;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        NIFServicio NIFS = new NIFServicio();
        NIF N1 = new NIF();
        NIFS.crearNIF(N1);
        NIFS.mostrar(N1);
    }
}
