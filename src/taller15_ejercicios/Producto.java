/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

/**
 *
 * @author usuario1
 */
/*
Esta clase viola el SRP porque:
- Almacena datos
- Calcula precio final
- Genera etiquetas
*/

public class Producto {
    private String nombre;
    private double precioBase;
    private double impuesto;

    public Producto(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto);
    }

    public String generarEtiqueta() {
        return "Producto: " + nombre + " - Precio final: $" + calcularPrecioFinal();
    }
}    

