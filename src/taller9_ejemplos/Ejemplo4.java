/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo4 {
    
    public class Planta {
private String tipo;


public Planta(String tipo) {
this.tipo = tipo;
}
}


public class Main {
public static void main(String[] args) {
// Error: No se puede usar `super` aquí porque Main no es una clase derivada de Planta
//super.tipo = "Orquídea"; // Error de compilación
}
}
}
