/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_ejercicios;

/**
 *
 * @author usuario1
 */
public class Silla implements Volador {
    
    /*
Esta clase implementa la interfaz Volador,
pero conceptualmente una silla *no debería volar*.

Esto es una *mala práctica*:
- Rompe la lógica del dominio
- Viola el principio de responsabilidad única
- Introduce confusión y errores en el mantenimiento del código
*/


    @Override
    public void volar() {
        System.out.println("La silla está volando... pero esto no tiene sentido.");
    }
}
