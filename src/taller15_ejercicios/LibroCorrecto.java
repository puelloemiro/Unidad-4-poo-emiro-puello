/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

/**
 *
 * @author usuario1
 */
public class LibroCorrecto {
    
   public static class Libro {
        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }
}

