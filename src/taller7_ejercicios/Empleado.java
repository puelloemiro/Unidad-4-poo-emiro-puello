/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_ejercicios;

/**
 *
 * @author usuario1
 */
public class Empleado {
    
    public String nombre; // Propiedad pública

    private double salario; // Encapsulada, solo accesible por métodos públicos

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); // Aplicar validación desde el constructor
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser mayor a 0.");
        }
}
    
}