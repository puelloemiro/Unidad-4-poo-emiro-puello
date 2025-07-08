/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_ejemplos;

/**
 *
 * @author usuario1
 */
public class Empleado {
    
    public String nombre;
    public double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public static void main(String[] args) {
        Empleado emp = new Empleado("Carlos", 4000000);
        System.out.println("Nombre: " + emp.nombre);
        System.out.println("Salario: " + emp.salario);
    }
}

