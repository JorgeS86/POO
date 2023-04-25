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
public class Cadena {
    /*Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase 
    (String) y su longitud. Agregar constructor vacío y con atributo frase solamente.
    Agregar getters y setters. El constructor con frase como atributo debe setear la longitud de la frase
    de manera automática. Crear una clase CadenaServicio en el paquete servicios que implemente los 
    siguientes métodos: */
    private String frase;
    private int longFrase;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longFrase = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }
    
    
    
}
