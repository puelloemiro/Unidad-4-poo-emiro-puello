/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_ejercicios;

/**
 *
 * @author usuario1
 */
public class Coche {
    
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadMaxima += incremento;
            System.out.println("Nueva velocidad máxima: " + velocidadMaxima);
        } else {
            System.out.println("El incremento debe ser mayor que cero.");
        }
    }
}
