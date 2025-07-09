/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo2 {
    
    // Interfaz Caminador
public interface Caminador {
void caminar();
}


// Interfaz Hablador
public interface Hablador {
void hablar();
}


// Clase Robot que implementa ambas interfaces
public class Robot implements Caminador, Hablador {
@Override
public void caminar() {
System.out.println("El robot está caminando.");
}


@Override
public void hablar() {
System.out.println("El robot está hablando.");
}
}
}
