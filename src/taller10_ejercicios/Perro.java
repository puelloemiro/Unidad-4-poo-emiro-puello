/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejercicios;

/**
 *
 * @author usuario1
 */
public class Perro extends Animal {

    //Esto no es una sobrescritura, es una sobrecarga
    // porque la firma cambió (ahora tiene un parámetro)

    public void hacerSonido(String tipo) {
        System.out.println("El perro hace un sonido tipo: " + tipo);
    }    
}
