/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3_ejercicios;

/**
 *
 * @author usuario1
 */
public class StaticErrorDemoT3 {
    private int numero;

    public static void metodoIncorrecto() {
        // System.out.println(numero); // Error: no se puede acceder desde un contexto estático
        System.out.println("No se puede acceder al atributo 'numero' desde un método static");
    }
} 

