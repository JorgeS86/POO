/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class PersonaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
    b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje*/
    public Persona crearPersona() {
        System.out.println("-------------------");
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el sexo de la persona (H/M):");
        char sexo;
        do {
            sexo = leer.next().charAt(0);
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');
        System.out.println("Ingrese el peso de la persona:");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona:");
        persona.setAltura(leer.nextDouble());
        System.out.println("-------------------");
        return persona;
        
    }

    /*a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.*/
    public boolean esMayor(Persona persona) {
        return persona.getEdad() >= 18;
    }

    /*c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.*/
    public int calcularIMC(Persona persona) {
        double pesoIdeal = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        int retorno;
        if (pesoIdeal < 20) {
            retorno = -1;
        } else if (pesoIdeal <= 25) {
            retorno = 0;
        }else{
            retorno = 1;
        }
        return retorno;
    }
    
}
