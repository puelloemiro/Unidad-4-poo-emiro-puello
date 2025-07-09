/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainPersona {
    
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Estudiante();  // polimorfismo
        Persona p3 = new Profesor();    // polimorfismo

        p1.presentarse(); // Llama al método de Persona
        p2.presentarse(); // Llama al método sobrescrito de Estudiante
        p3.presentarse(); // Llama al método sobrescrito de Profesor
    }
    
}
