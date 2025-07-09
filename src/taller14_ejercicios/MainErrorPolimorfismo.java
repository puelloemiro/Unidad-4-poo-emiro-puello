/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainErrorPolimorfismo {
    
    public static void main(String[] args) {
        Animal a = new Perro(); // Referencia de tipo base

        a.hacerSonido(); // ✅ válido
        // a.moverCola(); // ❌ ERROR de compilación:
        /*
        Cannot resolve method 'moverCola()' in 'Animal'

        Aunque el objeto real es un Perro, la variable 'a' es de tipo Animal,
        y Animal no tiene ese método.
        */
    }    
}
