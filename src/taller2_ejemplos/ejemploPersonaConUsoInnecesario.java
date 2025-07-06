/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_ejemplos;

/**
 *
 * @author usuario1
 */
public class ejemploPersonaConUsoInnecesario {
    
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.mostrarNombre(); // uso innecesario de this
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre); // correcto sin this
    }
}
   
