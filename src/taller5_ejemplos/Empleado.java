/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5_ejemplos;

/**
 *
 * @author usuario1
 */
public class Empleado {
    String nombre;
double salario;

Empleado(String nombre, double salario) {
this.nombre = nombre;
this.salario = salario;
}

void mostrarInformacion() {
System.out.println("Nombre: " + nombre + ", salario :" + salario);
}
}
