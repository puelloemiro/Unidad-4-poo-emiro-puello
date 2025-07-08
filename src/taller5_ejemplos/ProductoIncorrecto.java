/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5_ejemplos;

/**
 *
 * @author usuario1
 */
public class ProductoIncorrecto {
    
  String nombre; // Atributo de paquete (default)
  double precio; // Atributo de paquete (default)
  
  ProductoIncorrecto(String nombre, double precio) {
    this.nombre = nombre;
    this.precio = precio;
    
    }
  
    void mostrarInfo() {
System.out.println("Nombre: " + nombre + ", Precio: " + precio);
}
}

  



