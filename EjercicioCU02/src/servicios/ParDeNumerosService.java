/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.ParDeNumeros;

/**
 *
 * @author jorge
 */
public class ParDeNumerosService {

    /*Método mostrarValores que muestra cuáles son los dos números guardados.*/
    ParDeNumeros PDN = new ParDeNumeros();

    public void mostrarValores() {
        System.out.println("Número 1: " + PDN.getNumero1());
        System.out.println("Número 2: " + PDN.getNumero2());
    }

    /*Método devolverMayor para retornar cuál de los dos 
    atributos tiene el mayor valor */
    public void devolverMayor() {
        if (PDN.getNumero1() > PDN.getNumero2()) {
            System.out.println("El número 1 es mayor: (" + PDN.getNumero1() + ")");
        } else if (PDN.getNumero1() < PDN.getNumero2()) {
            System.out.println("El número 2 es mayor: (" + PDN.getNumero2() + ")");
        } else {
            System.out.println("Los números son IGUALES");
        }
    }

    /*Método calcularPotencia para calcular la potencia del mayor valor de la
clase elevado al menor número. Previamente se deben redondear ambos valores.*/
    public void calcularPotencia() {
        long numR1 = Math.round(PDN.getNumero1());
        long numR2 = Math.round(PDN.getNumero2());

        System.out.println("Num 1: " + numR1);
        System.out.println("Num 2: " + numR2);

        double numMay = Math.max(numR2, numR1);
        double numMin = Math.min(numR2, numR1);
            System.out.println("La potencia de num2 elevado a num1 es: "+Math.pow(numMay, numMin));
    }
    /*Método calculaRaiz, para calcular la raíz cuadrada del menor de 
    los dos valores. Antes de calcular la raíz cuadrada se debe obtener
    el valor absoluto del número.*/
    
    public void calculaRaiz(){
        double numA1 = Math.abs(PDN.getNumero1());
        double numA2 = Math.abs(PDN.getNumero2());
        System.out.println("Num 1: " + numA1);
        System.out.println("Num 2: " + numA2);
        
        double numMin = Math.min(numA2, numA1);
        System.out.println("El número mínimo es: "+numMin);
        
        System.out.println("La raíz cuadrada es: "+Math.sqrt(numMin));
    }
}
