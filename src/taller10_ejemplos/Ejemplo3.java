/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo3 {
    
    
public class Main {
        
public static void main(String[] args) { 
    
    Empleado empleado = new Empleado();
    Empleado gerente = new Gerente(); // Polimorfismo 

empleado.trabajar(); // Muestra: El empleado está trabajando.
gerente.trabajar();  // Muestra: El gerente está gestionando el equipo.
}
}
}
