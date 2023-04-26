/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class PersonaService {
   private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado*/
    
    public Persona crearPersona(){
        Persona PersonaAux = new Persona();
        System.out.println("Ingrese nombre: ");
        PersonaAux.setNombre(leer.next());
        System.out.println("Ingrese día de Nac (dd): ");
        int dia = leer.nextInt();
        System.out.println("Ingrese Mes (mm): ");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese Año (aaaa): ");
        int anio = leer.nextInt()-1900;
        PersonaAux.setFechaNac(dia,mes,anio);
        return PersonaAux;
    }
    
    /*Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.*/
    
    public int calcularEdad(Persona PersonaAux){
        Date fechaActual = new Date();
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L;
        long diferenciaEnMilisegundos = fechaActual.getTime() - PersonaAux.getFechaNac().getTime();
        int difAnios = (int) Math.round((diferenciaEnMilisegundos / milisegundosPorAno));
        return difAnios;
    }
    
    /*Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.*/
    
    public boolean menorQue(Persona PersonaAux, int edad){
        int años = calcularEdad(PersonaAux);
        return (años < edad);
    }
/*Método mostrarPersona que muestra la información de la persona
deseada.*/
    
    public void mostrarPersona(Persona PersonaAux){
        System.out.println("Nombre: " + PersonaAux.getNombre());
        System.out.println("Fecha de Nacimiento: " + PersonaAux.getFechaNac());
        System.out.println("La edad del usuario ("+PersonaAux.getNombre() +") es de: "+calcularEdad(PersonaAux) +" Años");
    }
}
