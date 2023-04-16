/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class CafeteraServicio {

    /*Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima*/
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cafetera llenarCafetera() {
        Cafetera cafe = new Cafetera();
        System.out.println("Ingrese capacidad actual de café (g): ");
        cafe.setCantidadActual(leer.nextInt());
        cafe.setCapacidadMaxima(cafe.getCantidadActual());
        return cafe;
    }

    /*b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
     */
    public void servirTaza(Cafetera cafe) {
        System.out.println("Ingrese la capacidad de la taza: ");
        int taza = leer.nextInt();
        if (cafe.getCantidadActual() < taza) {
            System.out.println("La capacidad actual no alcanza para llenar la taza");
            taza = cafe.getCantidadActual();
            cafe.setCantidadActual(0);
            System.out.println("La taza se cargó con: " + taza);
            System.out.println("Capacidad restante en cafetera: " + cafe.getCantidadActual());
        } else {
            System.out.println("La taza se llenó completamente");
            cafe.setCantidadActual(cafe.getCantidadActual() - taza);
            System.out.println("Capacidad restante en cafetera: " + cafe.getCantidadActual());
        }
    }

    /*c) Método vaciarCafetera(): pone la cantidad de café actual en cero*/
    public void vaciarCafetera(Cafetera cafe) {
        cafe.setCantidadActual(0);
        System.out.println("Se vació la cafetera");
        System.out.println("Capacidad restante en cafetera: " + cafe.getCantidadActual());
    }

    /*d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.*/
    public void agregarcafe(Cafetera cafe) {
        System.out.println("Ingrese la cantidad de café a agregar:");
        int agregar = leer.nextInt();
        cafe.setCantidadActual(cafe.getCantidadActual() + agregar);
        if (cafe.getCantidadActual() > cafe.getCapacidadMaxima()) {
            cafe.setCantidadActual(cafe.getCapacidadMaxima());
        }
        System.out.println("Capacidad restante en cafetera: " + cafe.getCantidadActual());
    }

}
