/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5_ejercicios;

/**
 *
 * @author usuario1
 */
public class Producto {
   
    String nombre;
    double precio;
    int stock;

    // Constructor con acceso default
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método con acceso default
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + stock);
    }

    // Método main para probar dentro de la misma clase
    public static void main(String[] args) {
        // Crear instancia del objeto Producto
        Producto producto = new Producto("Mouse inalámbrico", 59.99, 20);
        producto.mostrarInfo();  // Llamada válida al método no estático desde el objeto
    }
}


