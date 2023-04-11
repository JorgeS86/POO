/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Libro {
    /*Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas*/
    int ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;
//constructor vacio
    public Libro() {
    }
//constructor completo
    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
/*Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.*/
    public void cargarLibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN del libro");
        this.ISBN = leer.nextInt();
        
        System.out.println("Ingrese el Título del libro");
        this.titulo = leer.next();
        
        System.out.println("Ingrese el Autor del libro");
        this.autor = leer.next();
        
        System.out.println("Ingrese el Número de páginas del libro");
        this.numeroPaginas = leer.nextInt();
        
        
    }
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }

}
