/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainErrorFirma {
    
    public static void main(String[] args) {
        Animal a = new Perro();
        a.hacerSonido(); //Llama al método de Animal, NO al de Perro
        // No se llama al método nuevo porque la firma es distinta
    }
}
