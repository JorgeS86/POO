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
public class Ahorcado {

    /*Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual
deberá contener como atributos, un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario*/

    private String[] buscar;
    private int cantLetrasEnc;
    private int cantJugMax;

    public Ahorcado() {
    }

    public Ahorcado(String[] buscar, int cantLetrasEnc, int cantJugMax) {
        this.buscar = buscar;
        this.cantLetrasEnc = cantLetrasEnc;
        this.cantJugMax = cantJugMax;
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getCantLetrasEnc() {
        return cantLetrasEnc;
    }

    public void setCantLetrasEnc(int cantLetrasEnc) {
        this.cantLetrasEnc = cantLetrasEnc;
    }

    public int getCantJugMax() {
        return cantJugMax;
    }

    public void setCantJugMax(int cantJugMax) {
        this.cantJugMax = cantJugMax;
    }

    

}