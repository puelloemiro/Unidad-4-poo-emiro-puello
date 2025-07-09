/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo5 {
    
    // Clase base
public class Animal {
public void hacerSonido() {
System.out.println("El animal hace un sonido.");
}
}


// Clase derivada (sin usar @Override)
public class Gato extends Animal {
public void hacerSonido() {
System.out.println("El gato maúlla.");
}
}
}
