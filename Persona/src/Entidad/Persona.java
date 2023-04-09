/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author jorge
 */
public class Persona {

    String nombre;
    int edad;
    long DNI;

    public Persona() {
    }

    public Persona(String nombre, int edad, long DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public long getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    
}
