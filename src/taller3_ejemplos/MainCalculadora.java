/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3_ejemplos;

/**
 *
 * @author usuario1
 */
public class MainCalculadora {
    public static void main(String[] args) {
        int resultado = Calculadora.sumar(5, 7); // Llama al método estático sin crear una instancia
        System.out.println("Resultado: " + resultado); // Muestra: Resultado: 12
    }
}

