/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_ejercicios;

/**
 *
 * @author usuario1
 */
public class AccesoIncorrecto {
    
    public static void main(String[] args) {
        Interna obj = new Interna();

        // System.out.println(obj.dato); // Error: 'dato' tiene acceso private en 'Interna'

        System.out.println("No se puede acceder directamente a 'dato' porque es private.");
    }
}
