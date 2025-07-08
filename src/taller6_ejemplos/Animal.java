/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_ejemplos;

/**
 *
 * @author usuario1
 */
public class Animal {
    
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    protected void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }
    
}
