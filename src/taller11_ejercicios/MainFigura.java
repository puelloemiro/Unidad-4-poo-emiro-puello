/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainFigura {
    
     public static void main(String[] args) {
        Figura figura1 = new Circulo(5.0);
        Figura figura2 = new Rectangulo(4.0, 3.0);

        figura1.mostrarArea();  // Área del círculo
        figura2.mostrarArea();  // Área del rectángulo
    }
}
