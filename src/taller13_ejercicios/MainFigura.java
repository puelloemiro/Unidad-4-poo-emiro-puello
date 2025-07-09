/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainFigura {
    
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5.0, 4.0);
        Figura triangulo = new Triangulo(6.0, 3.0);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
    
}
