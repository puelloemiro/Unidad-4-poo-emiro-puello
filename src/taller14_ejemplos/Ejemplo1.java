/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo1 {
    
    // Clase base
public class Empleado {
public void trabajar() {
System.out.println("El empleado está trabajando.");
}
}


// Clases derivadas
public class Gerente extends Empleado {
@Override
public void trabajar() {
System.out.println("El gerente está gestionando el equipo.");
}
}


public class Ingeniero extends Empleado {
@Override
public void trabajar() {
System.out.println("El ingeniero está diseñando.");
}
}


// Clase de prueba
public class Main {
public void main(String[] args) { Empleado empleado1 = new Gerente(); Empleado empleado2 = new Ingeniero();


empleado1.trabajar(); // Muestra: El gerente está gestionando el equipo.
empleado2.trabajar(); // Muestra: El ingeniero está diseñando.
}
}
}
