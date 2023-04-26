/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import servicios.FechaService;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        
        FechaService FS = new FechaService();
        
       // System.out.println("La fecha ingresada es: "+FS.fechaNacimiento());
        
       // System.out.println("La fecha actual es: "+FS.fechaActual());
        
        System.out.println("La diferencia en años entre la fecha actual y tu nacimiento es de: "+FS.diferencia(FS.fechaActual(), FS.fechaNacimiento()));
    }
}
