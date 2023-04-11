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
public class Cuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".*/
    private double saldo;
    private String titular;
//Constructores

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
//Getters

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }
//Setters

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void crearCuenta() {
        System.out.println("Ingrese el nombre del Titular de la cuenta: ");
        this.titular = leer.next();
        System.out.println("Ingrese el Saldo a cargar en la cuenta: ");
        this.saldo = leer.nextDouble();
    }

    /*Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.*/
    public void retirar_dinero() {
        System.out.println("Ingrese el dinero a retirar: ");
        double dinero = leer.nextDouble();
        if ((saldo-dinero)<0) {
            System.out.println("El saldo en la cuenta es Insuficiente");
            System.out.println("El saldo disponible es: "+saldo);
        }else{
            System.out.println("Su saldo es: "+(saldo-=dinero));
        }
    }
}
