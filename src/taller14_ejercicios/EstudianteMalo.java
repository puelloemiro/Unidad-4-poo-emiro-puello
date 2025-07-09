/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14_ejercicios;

/**
 *
 * @author usuario1
 */
/*
Mala práctica:
Este método sobrescribe 'saludar()' pero NO cambia el comportamiento,
solo lo repite exactamente igual.
*/

public class EstudianteMalo extends Persona {
    public void saludar() {
        System.out.println("Hola, soy una persona."); // Igual al de la superclase
    }    
}
