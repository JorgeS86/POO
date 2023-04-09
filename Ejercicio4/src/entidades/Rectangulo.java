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
public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Crear una clase Rectángulo que modele rectángulos por medio de un
atributo privado base y un atributo privado altura.*/
    private double base;
    private double altura;
//Constructores:

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//Getter:

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
//Setter:

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /*La clase incluirá un método para crear el rectángulo 
    con los datos del Rectángulo dados por el usuario.*/
    public void crearRectangulo() {
        System.out.println("Ingrese la base del Rectángulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del Rectángulo: ");
        this.altura = leer.nextDouble();
    }

    /*También incluirá un método para calcular la superficie del
rectángulo*/
    public double superficie() {
        double sup = (base * altura) / 2;
        return sup;
    }

    /*y un método para calcular el perímetro del rectángulo*/
    public double perimetro() {
        double per = (base + altura) * 2;
        return per;
    }

    /*Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura.*/
    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("  ");;
        }
    }
}
