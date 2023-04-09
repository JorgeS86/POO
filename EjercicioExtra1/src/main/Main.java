/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cancion C1 = new Cancion();
        
        System.out.println("Ingrese el título de la canción: ");
        C1.setTitulo(leer.next());
        System.out.println("Ingrese el autor de la canción: ");
        C1.setAutor(leer.next());
        
        System.out.println("El título de la canción es: "+C1.getTitulo());
        System.out.println("El autor de la canción es: "+C1.getAutor());
    }
}
