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
        return cuadroletraaNIF(resto);
    }

    public char cuadroletraaNIF(int resto) {
        char retorno = '@';
        char[] cuadro = new char[23];
        for (int i = 0; i < 23; i++) {
            switch (i) {
                case 0:
                    cuadro[i] = 'T';
                    if (resto == i) {
                        retorno = 'T';
                    }
                    break;
                case 1:
                    cuadro[i] = 'R';
                    if (resto == i) {
                        retorno = 'R';
                    }
                    break;
                case 2:
                    cuadro[i] = 'W';
                    if (resto == i) {
                        retorno = 'W';
                    }
                    break;
                case 3:
                    cuadro[i] = 'A';
                    if (resto == i) {
                        retorno = 'A';
                    }
                    break;
                case 4:
                    cuadro[i] = 'G';
                     if (resto == i) {
                        retorno = 'G';
                     }
                    break;
                case 5:
                    cuadro[i] = 'M';
                     if (resto == i) {
                        retorno = 'M';
                     }
                    break;
                case 6:
                    cuadro[i] = 'Y';
                     if (resto == i) {
                        retorno = 'Y';
                     }
                    break;
                case 7:
                    cuadro[i] = 'F';
                     if (resto == i) {
                        retorno = 'F';
                     }
                    break;
                case 8:
                    cuadro[i] = 'P';
                     if (resto == i) {
                        retorno = 'P';
                     }
                    break;
                case 9:
                    cuadro[i] = 'D';
                     if (resto == i) {
                        retorno = 'D';
                     }
                    break;
                case 10:
                    cuadro[i] = 'X';
                     if (resto == i) {
                        retorno = 'X';
                     }
                    break;
                case 11:
                    cuadro[i] = 'B';
                     if (resto == i) {
                        retorno = 'B';
                     }
                    break;
                case 12:
                    cuadro[i] = 'N';
                     if (resto == i) {
                        retorno = 'N';
                     }
                    break;
                case 13:
                    cuadro[i] = 'J';
                     if (resto == i) {
                        retorno = 'J';
                     }
                    break;
                case 14:
                    cuadro[i] = 'Z';
                     if (resto == i) {
                        retorno = 'Z';
                     }
                    break;
                case 15:
                    cuadro[i] = 'S';
                     if (resto == i) {
                        retorno = 'S';
                     }
                    break;
                case 16:
                    cuadro[i] = 'Q';
                     if (resto == i) {
                        retorno = 'Q';
                     }
                    break;
                case 17:
                    cuadro[i] = 'V';
                     if (resto == i) {
                        retorno = 'V';
                     }
                    break;
                case 18:
                    cuadro[i] = 'H';
                     if (resto == i) {
                        retorno = 'H';
                     }
                    break;
                case 19:
                    cuadro[i] = 'L';
                     if (resto == i) {
                        retorno = 'L';
                     }
                    break;
                case 20:
                    cuadro[i] = 'C';
                     if (resto == i) {
                        retorno = 'C';
                     }
                    break;
                case 21:
                    cuadro[i] = 'K';
                     if (resto == i) {
                        retorno = 'K';
                     }
                    break;
                case 22:
                    cuadro[i] = 'E';
                     if (resto == i) {
                        retorno = 'E';
                     }
                    break;
            }
        }
        return retorno;
    }

    public void mostrar(NIF nifaux) {
        String dniStr = String.format("%08d", nifaux.getDni());
        System.out.println(dniStr + "-" + Character.toUpperCase(nifaux.getLetra()));
    }
}
