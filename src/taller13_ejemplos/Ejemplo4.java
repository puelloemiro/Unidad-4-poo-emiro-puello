/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo4 {
 
    // Clase abstracta
public abstract class Animal {
public abstract void hacerSonido();
}


// Clase derivada incorrecta
public class Gato extends Animal {

        @Override
        public void hacerSonido() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
// Aunque el método hacerSonido no se sobrescribe, el error se evita por falta de visibilidad o error lógico.

}

}
