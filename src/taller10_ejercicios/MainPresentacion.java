/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainPresentacion {
    
     public static void main(String[] args) {
         
        Persona p = new Persona();
        Persona estudiante = new Estudiante();  // Polimorfismo
        Persona profesor = new Profesor();      // Polimorfismo

        
        p.presentarse();           // Llama a método de Persona
        estudiante.presentarse();  // Llama a método sobrescrito de Estudiante
        profesor.presentarse();    // Llama a método sobrescrito de Profesor
    }
     
}
