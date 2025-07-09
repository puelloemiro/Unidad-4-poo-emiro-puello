/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo2 {
    
    // Clase abstracta
public abstract class Empleado {
protected String nombre;


public Empleado(String nombre) {
this.nombre = nombre;
}


public abstract void calcularSalario(); // Método abstracto


public void mostrarNombre() { System.out.println("Nombre: " + nombre);
}
// Clase derivada
public class Gerente extends Empleado {
private double bono;


public Gerente(String nombre, double bono) {
super(nombre);
this.bono = bono;
}


@Override
public void calcularSalario() {
System.out.println("El salario del gerente incluye un bono de: " + bono);
            }
        }
    }
}
