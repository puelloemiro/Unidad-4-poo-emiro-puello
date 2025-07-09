/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo3 {
    
    // Interfaz Vehiculo con un método abstracto y un método predeterminado
public interface Vehiculo {
void acelerar();


default void encender() {
System.out.println("El vehículo está encendido.");
}
}


// Clase Coche que implementa la interfaz Vehiculo
public class Coche implements Vehiculo {
@Override
public void acelerar() {
System.out.println("El coche está acelerando.");
        }
    }
}
