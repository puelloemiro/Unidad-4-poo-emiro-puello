/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainEmpleado {
   
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Andrea", 3500000);
        Empleado empleado2 = new Empleado("Luis", -500); // Salario inválido

        System.out.println("Empleado 1: " + empleado1.nombre + ", Salario: $" + empleado1.getSalario());
        System.out.println("Empleado 2: " + empleado2.nombre + ", Salario: $" + empleado2.getSalario());

        // Modificar salario usando set con validación
        empleado2.setSalario(2500000);
        System.out.println("Nuevo salario de " + empleado2.nombre + ": $" + empleado2.getSalario());
    }
    
}
