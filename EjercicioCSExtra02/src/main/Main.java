/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.NIF;
import servicios.NIFServicio;

/**
 *
 * @author jorge
 */
public class Main {
 public static void main(String[] args) {
        NIFServicio nifService = new NIFServicio();
        NIF nif = new NIF();
        nifService.crearNIF(nif);
        nifService.mostrar(nif);
    }

}
