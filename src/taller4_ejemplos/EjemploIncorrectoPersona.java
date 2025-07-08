/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_ejemplos;

/**
 *
 * @author usuario1
 */
public class EjemploIncorrectoPersona {
   
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        // persona.nombre = "Pedro"; // Error: nombre tiene acceso private
        // persona.edad = 25; // Error: edad tiene acceso private
        persona.mostrarInformacion(); // Este sí es válido
    }
}
