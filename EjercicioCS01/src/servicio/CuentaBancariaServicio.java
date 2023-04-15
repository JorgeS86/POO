/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class CuentaBancariaServicio {

    /*Agregar la clase CuentaBancariaServicio en el paquete Servicios 
    que contenga: Método para crear cuenta pidiéndole los datos al usuario.*/
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria CB1 = new CuentaBancaria();

    public void crearCuenta() {

        System.out.println("Ingrese el número de cuenta: ");
        CB1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI de la cuenta: ");
        CB1.setDniCliente(leer.nextLong());
        System.out.println("Ingrese el Saldo inicial de la cuenta: ");
        CB1.setSaldoActual(leer.nextDouble());
        System.out.println("Nro Cuenta: " + CB1.getNumeroCuenta() + " DNI: " + CB1.getDniCliente() + " Saldo: " + CB1.getSaldoActual());
    }

    /*Método ingresar(double): recibe una cantidad de dinero a ingresar
y se le sumará al saldo actual.*/
    public void ingresarDinero() {
        System.out.println("------------");
        System.out.println("Monto (en $) a ingresar a su saldo: ");
        double ingreso = leer.nextDouble() + CB1.getSaldoActual();
        CB1.setSaldoActual(ingreso);
        System.out.println("Saldo actualizado: " + CB1.getSaldoActual());
    }

    /*Método retirar(double): recibe una cantidad de dinero a retirar
y se le restara al saldo actual. Si la cuenta no tiene la cantidad de
dinero a retirar se retirará el máximo posible hasta dejar la cuenta 
en 0.*/
    public void retirarDinero() {
        System.out.println("------------");
        System.out.println("Saldo actual: " + CB1.getSaldoActual());
        System.out.println("Cuánto dinero ($) desea retirar: ");
        double retiro = leer.nextDouble();
        if (retiro > CB1.getSaldoActual()) {
            System.out.println("El Máximo saldo disponible a retirar es: " + CB1.getSaldoActual());
            CB1.setSaldoActual(0);
        }else{
            CB1.setSaldoActual(CB1.getSaldoActual() - retiro);
            System.out.println("El Saldo actual es: " +CB1.getSaldoActual());
        }
    }
/*Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%*/
    public void extraccionRapida(){
        System.out.println("------------");
        System.out.println("Saldo actual: " + CB1.getSaldoActual());
        System.out.println("Cuánto dinero ($) desea retirar: ");
        double retiroExp = leer.nextDouble();
        if (retiroExp > CB1.getSaldoActual() * 0.2) {
            System.out.println("El monto ingresado excede el maximo expres");
        }else{
            CB1.setSaldoActual(CB1.getSaldoActual()-retiroExp);
            System.out.println("El Saldo actual es: " +CB1.getSaldoActual());
        }
    }
}
