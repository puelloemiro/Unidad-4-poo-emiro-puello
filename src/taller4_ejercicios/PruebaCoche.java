/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_ejercicios;

/**
 *
 * @author usuario1
 */
public class PruebaCoche {
    
     public static void main(String[] args) {
        Coche coche = new Coche("Chevrolet", "Spark", 180);

        // coche.marca = "Mazda"; // Error: marca tiene acceso private
        // coche.modelo = "3"; // Error: modelo tiene acceso private
        // coche.velocidadMaxima = 200; // Error: velocidadMaxima tiene acceso private

        coche.acelerar(20); // Este sí es válido
    }
}
