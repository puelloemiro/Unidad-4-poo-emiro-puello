/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3_ejemplos;

/**
 *
 * @author usuario1
 */
public class Persona {
    private String nombre;

    public static void mostrarNombre() {
       System.out.println("Nombre: " + nombre); // Error de compilación: No se puede acceder a 'nombre' desde un contexto estático
    }
}

