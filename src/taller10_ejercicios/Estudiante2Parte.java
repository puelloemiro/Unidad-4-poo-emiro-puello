/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejercicios;

/**
 *
 * @author usuario1
 */
public class Estudiante2Parte extends Persona2Parte {

    //Este método sí sobrescribe correctamente,
    // pero al no usar @Override, si cometemos un error, el compilador no avisa.

    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }    
}
