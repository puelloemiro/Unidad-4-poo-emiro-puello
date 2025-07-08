/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_ejercicios;

/**
 *
 * @author usuario1
 */
public class ClaseNoRelacionada {

public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Deportivo", "Yamaha");

        //  Estas líneas provocarán error de compilación:
        // System.out.println(v.tipo);
        // System.out.println(v.marca);
        // v.mostrarDatos();

        // Esto compila:
        System.out.println("No se puede acceder directamente a miembros protected desde esta clase.");
    }
    
}
