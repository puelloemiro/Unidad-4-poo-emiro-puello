/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

/**
 *
 * @author usuario1
 */
/*
Esta clase viola el Principio de Responsabilidad Única (SRP):
- Tiene lógica de datos del libro
- Genera reportes
- Maneja persistencia
*/

public class LibroIncorrecto {
    private String titulo;
    private String autor;

    public LibroIncorrecto(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void imprimirReporte() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public void guardarEnArchivo() {
        System.out.println("Guardando '" + titulo + "' en archivo...");
    }    
}
