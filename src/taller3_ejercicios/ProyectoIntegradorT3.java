/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3_ejercicios;

/**
 *
 * @author usuario1
 */
public class ProyectoIntegradorT3 {
    public static void main(String[] args) {
        Coche c1 = new Coche("Toyota", "Corolla");
        Coche c2 = new Coche("Mazda", "3");
        Coche.mostrarCantidadCoches();

        int suma = Matematicas.sumar(10, 5);
        int resta = Matematicas.restar(10, 5);
        int mult = Matematicas.multiplicar(10, 5);
        double div = Matematicas.dividir(10, 5);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + mult);
        System.out.println("División: " + div);

        StaticErrorDemoT3.metodoIncorrecto();
    }
}

