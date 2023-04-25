/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author jorge
 */
public class ParDeNumeros {
    /*Realizar una clase llamada ParDeNumeros que tenga como atributos 
    dos números reales con los cuales se realizarán diferentes 
    operaciones matemáticas. La clase debe tener un constructor vacío,
    getters y setters.  En el constructor vacío se usará el
    Math.random para generar los dos números. Crear una clase
    ParDeNumerosService, en el paquete Servicios, 
    que deberá además implementar los siguientes métodos:*/
    
    private double numero1;
    private double numero2;

    public ParDeNumeros() {
        numero1 = Math.random()*10;
        numero2 = Math.random()*10;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    
}
