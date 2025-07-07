/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_ejercicios;

/**
 *
 * @author usuario1
 */
public class StaticErrorDemo {
   
    private String texto;

    // Esto generaría error si se intenta usar this:
    public static void metodoEstatico() {
        // System.out.println(this.texto); // Error
        System.out.println("No se puede usar 'this' en métodos static");
    }
}
