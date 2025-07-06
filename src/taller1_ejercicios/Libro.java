/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_ejercicios;

/**
 *
 * @author usuario1
 */
public class Libro {
    
    // Atributos privados
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Anónimo";
        this.numeroPaginas = 0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Título Del Libro : " + titulo);
        System.out.println("Autor Del Libro : " + autor);
        System.out.println("Número de páginas : " + numeroPaginas);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        System.out.println("---- LIBRO 1 (Constructor por defecto) ----");
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.println("\n---- LIBRO 2 (Constructor con parámetros) ----");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 471);
        libro2.mostrarDetalles();
    }
}
    
