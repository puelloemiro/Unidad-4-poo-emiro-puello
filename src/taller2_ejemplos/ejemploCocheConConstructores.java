/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_ejemplos;

/**
 *
 * @author usuario1
 */
public class ejemploCocheConConstructores {
    
    private String marca;
    private int velocidadMaxima;

    public ejemploCocheConConstructores() {
        this("Desconocida", 0); // llama al constructor con parámetros
    }

    public ejemploCocheConConstructores(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + this.marca + ", Velocidad máxima: " + this.velocidadMaxima);
    }
}
    

