/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_ejercicio;

/**
 *
 * @author usuario1
 */
public class MainEmpleado {
    
    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 3800000);
        Gerente gerente = new Gerente("Lucía", 5600000, "Finanzas");

        System.out.println("Información del empleado:");
        emp.mostrarDetalles();

        System.out.println("\nInformación del gerente:");
        gerente.mostrarDetalles();
    }
}
