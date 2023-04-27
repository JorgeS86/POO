/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entidades.Curso;
import servicios.CursoService;

/**
 *
 * @author jorge
 */
public class Main {

    public static void main(String[] args) {
        
        CursoService CS = new CursoService();
        Curso Curso = CS.crearCurso();
        
        CS.mostrarCurso(Curso);
        
        CS.calcularGanancias(Curso);
    }
}
