/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo4 {
   
    // Clase base
public class Vehiculo {
public void acelerar(int velocidad) {
System.out.println("El vehículo acelera a " + velocidad + " km/h.");
}
}


// Clase derivada (incorrecta)
public class Coche extends Vehiculo {
// Error de compilación: Diferente firma del método
    
public void acelerar() { System.out.println("El coche acelera.");
}
} 
}
