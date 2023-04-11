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
    private int x1;
    private int y1;
    private int x2;
    private int y2;
//Constructores

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    //Setters

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
//Getters

    public Scanner getLeer() {
        return leer;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
/*Generar un objeto puntos usando un método crearPuntos() que le pide al
    usuario los dos números y los ingresa en los atributos del objeto.*/
    public void crearPuntos() {
        System.out.println("Ingrese el valor para X1: ");
        this.x1 = leer.nextInt();
        System.out.println("Ingrese el valor para Y1: ");
        this.y1 = leer.nextInt();
        System.out.println("Ingrese el valor para X2: ");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese el valor para Y2: ");
        this.y2 = leer.nextInt();
    }
    public void Distancia(){
        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("La distancia es: "+distancia);
    }
}
