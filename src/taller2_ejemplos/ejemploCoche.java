/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_ejemplos;

/**
 *
 * @author usuario1
 */
public class ejemploCoche {
   
     private String marca;

    public ejemploCoche(String marca) {
        this.marca = marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void mostrarMarca() {
        System.out.println("Marca: " + this.marca);
    }
} 
