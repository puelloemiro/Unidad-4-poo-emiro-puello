/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9_ejercicios;

/**
 *
 * @author usuario1
 */
public class Pez extends Animal {
    
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
    super(especie); // Llama al constructor de Animal
    this.tipoDeAgua = tipoDeAgua;
    }

    public void mostrarDetalles() {
    super.mostrarEspecie(); // Llama al método mostrarEspecie() de Animal
    System.out.println("Tipo de agua: " + tipoDeAgua);
    }    
}
