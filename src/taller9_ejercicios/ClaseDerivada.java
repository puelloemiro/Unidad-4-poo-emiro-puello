/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9_ejercicios;

/**
 *
 * @author usuario1
 */

public class ClaseDerivada extends ClaseBase {

public void mostrarMensaje() {
    
        /*
      
        Aunque ClaseDerivada hereda de ClaseBase, no puede acceder directamente
        a los atributos privados de la superclase, ni siquiera usando super.

        La única forma correcta de acceder sería a través de un método público (getter).
        */

        // System.out.println(super.mensaje); //Error de compilación

        //Forma correcta:
        System.out.println(super.getMensaje());
    }
}
