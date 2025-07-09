/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo6 {
   
    // Interfaz Corredor
public interface Corredor {
void correr();
}


// Clase incorrecta que implementa la interfaz pero no tiene lógica relacionada
public class Arbol implements Corredor {
@Override
public void correr() {
// El árbol no tiene una lógica para correr, lo cual no tiene sentido
System.out.println("Los árboles no pueden correr.");
}
}
}
