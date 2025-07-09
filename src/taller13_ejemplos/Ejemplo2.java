/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo2 {
   
    // Definición de una interfaz
public interface Vehiculo {
void acelerar();


default void encender() {
System.out.println("El vehículo está encendido.");
}
}


// Clase que implementa la interfaz
public class Coche implements Vehiculo {
@Override
public void acelerar() {
System.out.println("El coche está acelerando.");
}

    }
}
