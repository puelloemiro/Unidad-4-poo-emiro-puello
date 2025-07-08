/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5_ejercicios;

/**
 *
 * @author usuario1
 */
public class PruebaPersona {
   
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Acceso al atributo default: permitido dentro del mismo paquete
        persona.edad = 30;

        // Acceso al atributo privado: solo mediante los métodos públicos
        persona.setNombre("Emiro");
        
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.edad);
    }
}
/*
 Discusión:
 - El atributo 'nombre' es privado (private), por lo tanto solo se puede acceder a él mediante los métodos get/set.
 - El atributo 'edad' tiene acceso de paquete (default), y por eso sí es accesible directamente desde otra clase del mismo paquete.
 - Esto demuestra la diferencia de acceso entre private (más restrictivo) y default (acceso dentro del paquete).
*/