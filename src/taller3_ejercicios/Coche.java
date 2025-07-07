/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3_ejercicios;

/**
 *
 * @author usuario1
 */
public class Coche {
   private String marca;
    private String modelo;
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    public static void mostrarCantidadCoches() {
        System.out.println("Cantidad de coches creados: " + contadorCoches);
    }
}  

