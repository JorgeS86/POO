/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Circunferencia {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;

    public Circunferencia() {
    }
    
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
        System.out.println("Ingrese el radio");
        radio = leer.nextDouble();
    }
    
    public void area(){
        System.out.println("Area: "+ (3.14*(radio*radio)));
    }
    
    public void perimetro(){
        System.out.println("Perimetro: "+(2*radio*3.14));
    }
}
