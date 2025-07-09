/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_ejercicios;

/**
 *
 * @author usuario1
 */
public abstract class Figura {
    
     // Método abstracto (sin cuerpo)
    public abstract double calcularArea();

    // Método concreto que usa el método abstracto
    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
    
}
