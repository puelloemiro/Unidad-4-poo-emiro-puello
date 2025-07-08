/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_ejercicios;

/**
 *
 * @author usuario1
 */    
    public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarInformacion() {
        mostrarDatos(); // Acceso permitido: desde subclase
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
    
}
