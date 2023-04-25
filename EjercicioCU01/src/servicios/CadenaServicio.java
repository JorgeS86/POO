/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {
        System.out.println("Ingrese Frase: ");
        String fraseAux = leer.next();
        return new Cadena(fraseAux);
    }

    /*Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.*/
    public void mostrarVocales(Cadena fraseAux) {
        int contVocales = 0;
        for (int i = 0; i < fraseAux.getLongFrase(); i++) {
            switch (fraseAux.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    contVocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contVocales);
        System.out.println("-----------------------------");
    }

    /*Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrase(Cadena fraseAux) {
        String invertir = "";
        for (int i = fraseAux.getLongFrase() - 1; i >= 0; i--) {
            invertir += fraseAux.getFrase().charAt(i);
        }
        System.out.println("La cadena invertida es: " + invertir);
        System.out.println("-----------------------------");
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar
    cuántas veces se repite el carácter en la frase, por ejemplo: 
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena fraseAux) {
        int contLetra = 0;
        System.out.println("Ingrese letra a buscar: ");
        char letra = leer.next().charAt(0);

        for (int i = 0; i < fraseAux.getLongFrase(); i++) {
            if (letra == fraseAux.getFrase().charAt(i)) {
                contLetra++;
            }
        }
        System.out.println("La letra (" + letra + ") se repite " + contLetra + " vez/veces.");
        System.out.println("-----------------------------");
    }

    /*Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone 
    la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena fraseAux) {
        System.out.println("Ingrese Frase a comparar: ");
        String nuevaFrase = leer.next();

        if (nuevaFrase.length() > fraseAux.getLongFrase()) {
            System.out.println("La nueva frase contiene MÁS caracteres");
            System.out.println("-----------------------------");
        } else if (nuevaFrase.length() < fraseAux.getLongFrase()) {
            System.out.println("La nueva frase contiene MENOS caracteres");
            System.out.println("-----------------------------");
        } else {
            System.out.println("La nueva frase contiene IGUAL cantidad de caracteres");
            System.out.println("-----------------------------");
        }
    }

    /*Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(Cadena fraseAux) {
        System.out.println("Ingrese una nueva frase: ");
        String nuevaFrase = leer.next();
        System.out.println("La frase resultante es: " + fraseAux.getFrase() + " " + nuevaFrase);
        System.out.println("-----------------------------");
    }

    /*Método reemplazar(String letra), deberá reemplazar todas las letras “a” 
    que se encuentren en la frase, por algún otro carácter seleccionado por el usuario
    y mostrar la frase resultante.*/
    public void reemplazar(Cadena fraseAux) {
        System.out.println("Ingrese letra para reemplazar: ");
        char letraR = leer.next().charAt(0);
        String reemplazo = fraseAux.getFrase().toLowerCase().replace('a', letraR);
        System.out.println("La frase reemplazada es: " + reemplazo);
        System.out.println("-----------------------------");
    }

    /*Método contiene(String letra), deberá comprobar si la frase contiene una letra 
    que ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public void contiene(Cadena fraseAux) {
        System.out.println("Ingrese letra para buscar: ");
        String letraR = leer.next();
        if (fraseAux.getFrase().contains(letraR)) {
            System.out.println("La letra se encuentra en la frase (VERDADERO)");
            System.out.println("-----------------------------");
        } else {
            System.out.println("La letra no se encuentra en la frase (FALSO)");
            System.out.println("-----------------------------");
        }
    }
}
