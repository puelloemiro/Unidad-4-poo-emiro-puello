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
public class MainLibro {
  
    public static void main(String[] args) {
        
    Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez");

        LibroReporte reporte = new LibroReporte();
        reporte.imprimir(libro);

        LibroPersistencia persistencia = new LibroPersistencia();
        persistencia.guardar(libro);
    }
}
