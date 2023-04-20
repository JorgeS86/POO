/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class NIFServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    NIF nifaux = new NIF();

    public void crearNIF(NIF nifaux) {
        System.out.println("Ingrese DNI: ");
        long dni = leer.nextLong();
        nifaux.setDni(dni);
        nifaux.setLetra(letraNIF(dni));
    }

    public char letraNIF(long dni) {
        int resto = (int) (dni % 23);
        return cuadroletraaNIF[resto];
    }

    public static char[] cuadroletraaNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public void mostrar(NIF nifaux) {
        String dniStr = String.format("%08d", nifaux.getDni());
        System.out.println(dniStr + "-" + Character.toUpperCase(nifaux.getLetra()));
    }
}
