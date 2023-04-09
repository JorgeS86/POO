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
public class Puntos {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.*/
    private int x;
    private int y;
//Constructores
        public Puntos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Puntos() {
    }
//Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
//Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    /*Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.*/
public void crearPuntos(){
    System.out.println("Ingrese el valor para X: ");
    this.x = leer.nextInt();
    System.out.println("Ingrese el valor para Y: ");
    this.y = leer.nextInt();
}

}
