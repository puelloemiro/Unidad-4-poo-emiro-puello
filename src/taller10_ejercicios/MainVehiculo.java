/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainVehiculo {
    
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bici = new Bicicleta();

        vehiculo.moverse(); // Llama al método de la clase base
        bici.moverse();     // Llama al método sobrescrito en la subclase

        // También puedes usar polimorfismo:
        Vehiculo v2 = new Bicicleta();
        v2.moverse();       // Se ejecuta la versión de Bicicleta
    }
    
}
