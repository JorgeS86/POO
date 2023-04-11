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
public class Empleado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Scanner getLeer() {
        return leer;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



    public void crearEmpleado() {
        System.out.println("Ingrese nombre del Empleado: ");
        this.nombre = leer.next();
        System.out.println("Ingrese edad del empleado: ");
        this.edad = leer.nextInt();
        System.out.println("Ingrese el salario del empleado: ");
        this.salario = leer.nextDouble();
    }

    public void calcular_aumento() {
        double aumento = 0;
        if (edad < 30) {
            aumento = (salario * 5) / 100;
            System.out.println("El aumento de %5 es de: $" +aumento);
            System.out.println("El salario actual es de: $" +salario);
            System.out.println("El salario pasará a ser de: $" + (salario += aumento));
        } else {
            aumento = (salario * 10) / 100;
            System.out.println("El aumento de 10% es de: $" + aumento);
            System.out.println("El salario actual es de: $" + salario);
            System.out.println("El salario pasará a ser de: $" + (salario += aumento));
        }
    }

}
