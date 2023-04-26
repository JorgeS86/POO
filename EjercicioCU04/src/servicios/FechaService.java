/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class FechaService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);*/

    public Date fechaNacimiento() {

        System.out.println("FECHA DE NACIMIENTO");
        System.out.println("Ingrese el día (dd): ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes (mm): ");
        int mes = leer.nextInt()-1;
        System.out.println("Ingrese año (aa): ");
        int año = leer.nextInt();
        return new Date(año, mes, dia);
    }

    /*Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
    El método debe retornar el objeto Date.*/
    
    public Date fechaActual(){
        return new Date();
    }
    
    /*Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).*/
    
    public int diferencia(Date fechaNacimiento, Date fechaActual){
        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L; // milisegundos por año
        long diferenciaEnMilisegundos = fechaNacimiento.getTime() - fechaActual.getTime();
        int diferenciaAnos = (int)(diferenciaEnMilisegundos / milisegundosPorAno);
        return diferenciaAnos;
    }

}
