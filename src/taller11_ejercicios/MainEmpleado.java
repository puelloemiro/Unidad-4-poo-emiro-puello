/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainEmpleado {
    
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Laura", 5000000, 1500000);
        Empleado vendedor = new Vendedor("Carlos", 3000000, 800000);

        gerente.mostrarDetalles();
        System.out.println("--------------------");
        vendedor.mostrarDetalles();
    
    }
}
