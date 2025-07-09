/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainPolimorfismo {
    
     public static void main(String[] args) {
        // Polimorfismo: todas son del tipo Figura
        Figura f1 = new Circulo(3.0);
        Figura f2 = new Rectangulo(4.0, 5.0);
        Figura f3 = new Figura(); // Figura genérica

        f1.calcularArea(); // ejecuta el método de Circulo
        f2.calcularArea(); // ejecuta el método de Rectangulo
        f3.calcularArea(); // ejecuta el método de Figura
    }
}
