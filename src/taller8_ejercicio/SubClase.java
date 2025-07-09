/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_ejercicio;

/**
 *
 * @author usuario1
 */
public class SubClase extends SuperClase {

    public void mostrarMensaje() {
        /*
         Error si se intenta acceder directamente al atributo mensaje:
        "mensaje has private access in SuperClase"

        Solo se puede acceder mediante métodos públicos de la superclase,
        como getMensaje().
        */

        // System.out.println(mensaje); //Error

        //Forma correcta:
        System.out.println(getMensaje());
    }    
}
