/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_ejercicios;

/**
 *
 * @author usuario1
 */
public class Estudiante {
    
    // Atributos privados
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.curso = "No asignado";
    }

    // Constructor con 2 parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Pendiente";
    }

    // Constructor con 3 parámetros, que usa this()
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // llama al constructor con 2 parámetros
        this.curso = curso;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre Del Estudiante : " + nombre);
        System.out.println("Edad Del Estudiante : " + edad);
        System.out.println("Curso : " + curso);
    }

    // Método main para probar
    public static void main(String[] args) {
        System.out.println("---- ESTUDIANTE 1 (por defecto) ----");
        Estudiante e1 = new Estudiante();
        e1.mostrarInformacion();

        System.out.println("\n---- ESTUDIANTE 2 (nombre y edad) ----");
        Estudiante e2 = new Estudiante("Laura", 19);
        e2.mostrarInformacion();

        System.out.println("\n---- ESTUDIANTE 3 (nombre, edad y curso) ----");
        Estudiante e3 = new Estudiante("Carlos", 21, "POO");
        e3.mostrarInformacion();
    }
}

