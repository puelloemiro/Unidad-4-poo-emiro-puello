/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_ejercicios;

/**
 *
 * @author usuario1
 */
public class Estudiante {
    
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Sin nombre", 0); // llama al constructor con parámetros
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }
}
