/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class NIFServicio {

   private Scanner scanner = new Scanner(System.in);

    public void crearNIF(NIF nif) {
        System.out.print("Introduce el número de DNI: ");
        long dni = scanner.nextLong();
        nif.setDni(dni);
        nif.setLetra(calcularLetra(dni));
    }

    private char calcularLetra(long dni) {
        int resto = (int) (dni % 23);
        return NIF.LETRAS_DNI[resto];
    }

    public void mostrar(NIF nif) {
        System.out.println(nif.mostrar());
    }
}