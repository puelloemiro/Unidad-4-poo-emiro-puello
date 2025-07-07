/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2_ejercicios;

/**
 *
 * @author usuario1
 */
public class ProyectoIntegradorT2 {

    public static void main(String[] args) {
        Producto producto = new Producto("Pan", 1.5);
        producto.mostrarProducto();

        Estudiante estudiante1 = new Estudiante("Ana", 22);
        estudiante1.mostrarDatos();

        Estudiante estudiante2 = new Estudiante();
        estudiante2.mostrarDatos();

        StaticErrorDemo.metodoEstatico();
    }
}  

