/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo1 {
    
    // Definición de una clase abstracta
public abstract class Animal {
protected String nombre;


// Constructor
public Animal(String nombre) {
this.nombre = nombre;
}


// Método abstracto (sin cuerpo)
public abstract void hacerSonido();


// Método concreto
public void mostrarNombre() { System.out.println("Nombre: " + nombre);
}
}


// Definición de una clase derivada
public class Perro extends Animal {
public Perro(String nombre) {
super(nombre);
}


@Override
public void hacerSonido() { System.out.println("El perro ladra.");
}
}
}
