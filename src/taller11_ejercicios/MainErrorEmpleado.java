/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainErrorEmpleado {
    
    public static void main(String[] args) {
        EmpleadoMalo gerente = new GerenteMalo("Diana");
        gerente.mostrarDetalles();

        /*
        Esto compila y se ejecuta,
        pero muestra un salario de $0.0, lo cual es incorrecto.

        Si el método calcularSalario hubiera sido abstracto,
        Java habría obligado a la subclase a implementarlo.
        */
    }
}
