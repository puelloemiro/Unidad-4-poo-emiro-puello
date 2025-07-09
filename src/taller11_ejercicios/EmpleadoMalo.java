/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_ejercicios;

/**
 *
 * @author usuario1
 */
public abstract class EmpleadoMalo {
    
    protected String nombre;
    public EmpleadoMalo(String nombre) {
        this.nombre = nombre;
    }

    // ⚠️ Este método debería ser abstracto,
    // pero como tiene cuerpo, NO obliga a sobrescribirlo
    public double calcularSalario() {
        return 0.0; // Valor predeterminado incorrecto
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + calcularSalario());
    }    
}
