/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Raices;

/**
 *
 * @author jorge
 */
public class RaicesServicio {

    /* Luego, en RaicesServicio las operaciones que se podrán realizar 
    son las siguientes:
    Método getDiscriminante(): devuelve el valor del discriminante 
    (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c */
    public double getDiscriminante(Raices raices) {
        double discriminante = (Math.pow(raices.getB(), 2)) - (4 * raices.getA() * raices.getC());
        return discriminante;
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene
    dos soluciones, para que esto ocurra,
    el discriminante debe ser mayor o igual que 0.*/
    public boolean tieneRaices(Raices raices) {
        return getDiscriminante(raices) >= 0;
    }

    /*Método tieneRaiz(): devuelve un booleano indicando si tiene
una única solución, para que esto ocurra, el discriminante debe ser 
igual que 0.*/
    public boolean tieneRaiz(Raices raices) {
        return getDiscriminante(raices) == 0;
    }

    /*Método obtenerRaices(): llama a tieneRaices() y si devolvió true,
imprime las 2 posibles soluciones.*/
    public void obtenerRaices(Raices raices) {
        if (tieneRaices(raices) == true) {
            double discriminante = Math.sqrt(getDiscriminante(raices));
            double raiz1 = (-raices.getB() + discriminante) / (2 * raices.getA());
            double raiz2 = (-raices.getB() - discriminante) / (2 * raices.getA());
            System.out.println("La primer raiz es: " + raiz1);
            System.out.println("La segunda raiz es: " + raiz2);
        } else {
            System.out.println("No tiene raices!");
        }
    }

    public void obtenerRaiz(Raices raices) {
        if (tieneRaiz(raices)) {
            double raiz = -raices.getB() / (2 * raices.getA());
            System.out.println("La única raíz es: " + raiz);
        }
    }

    public void calcular(Raices raices) {
        if (tieneRaices(raices)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No hay solución real para esta ecuación.");
        }
    }
}
