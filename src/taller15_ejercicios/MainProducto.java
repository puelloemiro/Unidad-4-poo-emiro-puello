/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainProducto {
    
    public static void main(String[] args) {
        ProductoCorrecto producto = new ProductoCorrecto("Camisa", 50000, 0.19);

        ProductoCalculador calculador = new ProductoCalculador();
        double precioFinal = calculador.calcularPrecioFinal(producto);

        ProductoEtiqueta etiqueta = new ProductoEtiqueta();
        String etiquetaGenerada = etiqueta.generarEtiqueta(producto, precioFinal);

        System.out.println(etiquetaGenerada);
    }
}
