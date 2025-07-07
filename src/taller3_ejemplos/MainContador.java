/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3_ejemplos;

/**
 *
 * @author usuario1
 */
public class MainContador {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        // Se accede al método estático usando el nombre de la clase
        Contador.mostrarContador(); // Muestra: Contador global: 3
    }
}

