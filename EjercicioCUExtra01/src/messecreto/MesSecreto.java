/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messecreto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class MesSecreto {

    Random aleatorio = new Random();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    String[] mesesSecreto = new String[12];
    String mesSecreto;

    public void MesesSecretos() {
        this.mesesSecreto[0] = "enero";
        this.mesesSecreto[1] = "febrero";
        this.mesesSecreto[2] = "marzo";
        this.mesesSecreto[3] = "abril";
        this.mesesSecreto[4] = "mayo";
        this.mesesSecreto[5] = "junio";
        this.mesesSecreto[6] = "julio";
        this.mesesSecreto[7] = "agosto";
        this.mesesSecreto[8] = "septiembre";
        this.mesesSecreto[9] = "octubre";
        this.mesesSecreto[10] = "noviembre";
        this.mesesSecreto[11] = "diciembre";

        mesSecreto = mesesSecreto[aleatorio.nextInt(12)];

        //System.out.println("El mes secreto es: " + mesSecreto);
    }

    public void juegoMesSecreto() {
        System.out.println("Juego MES SECRETO");

        boolean acierto = false;
        do {
            System.out.println("Adivine el mes (ingresar en minúsculas): ");
            String MesUsuario = leer.next();
            //System.out.println("Mes Usuario: "+MesUsuario);
            //System.out.println("Mes Secreto: "+mesSecreto);
            if (MesUsuario.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Correcto! Usted ha acertado!!!");
                acierto = true;
            }else{
                System.out.println("Incorrecto! Intente nuevamente");
            }
        } while (acierto == false);

    }
}
