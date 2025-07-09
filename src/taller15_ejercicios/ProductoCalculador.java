/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

/**
 *
 * @author usuario1
 */
public class ProductoCalculador {
    
    public double calcularPrecioFinal(ProductoCorrecto producto) {
        return producto.getPrecioBase() + (producto.getPrecioBase() * producto.getImpuesto());
    }
}
