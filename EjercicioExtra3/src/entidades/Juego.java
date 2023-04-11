/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Crea una clase "Juego" que tenga un método "iniciar_juego" 
    que permita a dos jugadores jugar un juego de adivinanza de números.*/
    private int numJ1;
    private int numJ2;

    public Juego() {
    }

    public Juego(int numJ1, int numJ2) {
        this.numJ1 = numJ1;
        this.numJ2 = numJ2;
    }

    public Scanner getLeer() {
        return leer;
    }

    public int getNumJ1() {
        return numJ1;
    }

    public int getNumJ2() {
        return numJ2;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setNumJ1(int numJ1) {
        this.numJ1 = numJ1;
    }

    public void setNumJ2(int numJ2) {
        this.numJ2 = numJ2;
    }

    public void iniciar_juego() {
        String validacion;
        boolean salir = true;
        int winJ1 = 0;
        int winJ2 = 0;
        do {
            System.out.println("Jugador 1 Ingrese su numero: ");
            numJ1 = leer.nextInt();
            System.out.println("Ingrese cantidad de intentos máximos: ");
            int intentosMax = leer.nextInt();
            int intentos = 0;

            do {
                System.out.println("Jugador 2 Ingrese un número: ");
                numJ2 = leer.nextInt();

                if (numJ2 == numJ1) {
                    System.out.println("Usted acertó");
                    winJ2++;
                } else {
                    if (numJ2 > numJ1) {
                        System.out.println("Usted ERRÓ, el nro es más bajo!!! ");
                        intentos++;
                        System.out.println("intentos usados: " + intentos);
                    } else {
                        System.out.println("Usted ERRÓ, el nro es más alto!!! ");
                        intentos++;
                        System.out.println("intentos usados: " + intentos);
                        if (intentos == intentosMax) {
                            System.out.println("Usted acabó con los intentos disponibles");
                            winJ1++;
                        }
                    }
                }
            } while (intentos != intentosMax && numJ2 != numJ1);

            System.out.println("Desea continuar jugando (SI/NO)? ");
            validacion = leer.next();
            switch (validacion) {
                case "si":
                case "SI":
                    salir = true;
                    break;
                case "no":
                case "NO":
                    salir = false;
                    break;
            }
        } while (salir != false);
        System.out.println("Partidas ganadas por Jugador 1: " + winJ1);
        System.out.println("Partidas ganadas por Jugador 2: " + winJ2);
    }
}
