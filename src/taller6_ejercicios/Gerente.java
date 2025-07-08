/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_ejercicios;

/**
 *
 * @author usuario1
 */
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Hereda nombre y salario de Empleado
        this.departamento = departamento;
    }

    @Override
    protected void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método de Empleado
        System.out.println("Departamento: " + departamento);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Laura Gómez", 8500000, "Recursos Humanos");
        gerente.mostrarInformacion(); // Muestra toda la información heredada + propia
    }
    
    
}
