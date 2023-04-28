/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AhorcadoService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado PalabraJuego = new Ahorcado();

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.*/
    public Ahorcado crearJuego() {
        System.out.println("Ingrese la palabra a buscar: ");
        String Palabra = leer.next();

        String[] palabraVect = new String[Palabra.length()];
        PalabraJuego.setBuscar(palabraVect);

        System.out.println("Ingrese la cantidad de intentos posibles: ");
        PalabraJuego.setCantJugMax(leer.nextInt());

        for (int i = 0; i < Palabra.length(); i++) {
            palabraVect[i] = String.valueOf(Palabra.charAt(i));
        }
        return PalabraJuego;
    }

    /*Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
    public int longitud() {
        int longitud = PalabraJuego.getBuscar().length;
        return longitud;
    }

    /*Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.*/
    public boolean buscar() {

        boolean buscaletra = false;
        String letraB = letra();

        for (int i = 0; i < PalabraJuego.getBuscar().length; i++) {
            if (PalabraJuego.getBuscar()[i].equals(letraB)) {
                buscaletra = true;
            }
        }
        if (buscaletra) {
            System.out.println("La letra se encuentra en la Palabra");
        } else {
            System.out.println("La letra no se encuentra en la Palabra");
        }
        return buscaletra;
    }

    public String letra() {
        System.out.println("Ingrese letra: ");
        String letra = leer.next();
        return letra;
    }

    /*Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.*/
    public void encontradas() {
        int aciertos = PalabraJuego.getCantLetrasEnc();
        int opRestantes = PalabraJuego.getCantJugMax();

        if (buscar()) {
            aciertos++;
            PalabraJuego.setCantLetrasEnc(aciertos);
        } else {
            opRestantes--;
            PalabraJuego.setCantJugMax(opRestantes);
        }
    }

    /*Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.*/
    public void intentos() {
        System.out.println("Cantidad de letras encontradas: " + PalabraJuego.getCantLetrasEnc() + "/" + longitud());
        System.out.println("Oportunidades restantes: " + PalabraJuego.getCantJugMax());
    }

    /*Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.*/
    public void juego() {

        do {
            encontradas();
            intentos();
        } while (longitud() != PalabraJuego.getCantLetrasEnc() && PalabraJuego.getCantJugMax() != 0);
        System.out.println("-------------------");
        if (longitud() == PalabraJuego.getCantLetrasEnc()) {
            System.out.println("USTED GANÓ!!!");
            intentos();
        } else if (PalabraJuego.getCantJugMax() == 0) {
            System.out.println("Usted PERDIÓ!!! Agotó todos los intentos.");
            intentos();
        }
        System.out.println("-------------------");
    }
}