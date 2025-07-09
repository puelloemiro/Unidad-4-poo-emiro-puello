/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainUtilidades {
    
    public static void main(String[] args) {
        double a = 10;
        double b = 5;
        double c = 0;

        System.out.println("Suma: " + Utilidades.sumar(a, b));
        System.out.println("Resta: " + Utilidades.restar(a, b));
        System.out.println("Multiplicación: " + Utilidades.multiplicar(a, b));
        System.out.println("División: " + Utilidades.dividir(a, b));

        // Validar división por cero
        System.out.println("División por cero: " + Utilidades.dividir(a, c));
    }
    
}
