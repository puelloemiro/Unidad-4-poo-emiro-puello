/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9_ejercicios;

/**
 *
 * @author usuario1
 */
public class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
    super(nombre, edad); // Llama al constructor de Persona
    this.departamento = departamento;
    
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }    
    
}
