/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_ejemplos;

/**
 *
 * @author usuario1
 */
public class ejemploPersonaConErrorStatic {
    
    private String nombre;

    public static void mostrarNombre() {
        // System.out.println(this.nombre); // Esto daría error
        System.out.println("Error: no se puede usar 'this' en un contexto estático");
    }
}
    

