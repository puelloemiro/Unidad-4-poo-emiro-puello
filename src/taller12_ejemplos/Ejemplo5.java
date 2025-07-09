/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo5 {
    
    // Interfaz Volador
public interface Volador {
default void despegar() { System.out.println("Volador despega.");
}
}


// Interfaz Nadador
public interface Nadador {
default void despegar() { System.out.println("Nadador despega.");
}
}


// Clase incorrecta que implementa ambas interfaces
/*public class Anfibio implements Volador, Nadador {
// Error de compilación: conflicto entre los métodos predeterminados de las interfaces
}
}

