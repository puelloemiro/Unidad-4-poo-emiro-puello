/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

import taller15_ejercicios.LibroCorrecto.Libro;

/**
 *
 * @author usuario1
 */
public class LibroReporte {
    
    public void imprimir(Libro libro) {
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
    }
}
