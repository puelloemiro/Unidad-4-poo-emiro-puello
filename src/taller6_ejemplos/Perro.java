/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_ejemplos;

/**
 *
 * @author usuario1
 */
public class Perro extends Animal {

    public Perro(String especie) {
        super(especie);
    }

    @Override
    protected void emitirSonido() {
        System.out.println("El perro ladra.");
    }
    
}
