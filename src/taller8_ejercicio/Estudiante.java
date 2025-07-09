/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_ejercicio;

/**
 *
 * @author usuario1
 */
public class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llama al constructor de Persona
        this.matricula = matricula;
    }

    @Override
    public void mostrarInformacion() {
        // Sobrescribe el método de Persona
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Matrícula: " + matricula);
    }
}
