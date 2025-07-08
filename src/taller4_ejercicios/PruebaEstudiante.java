/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_ejercicios;

/**
 *
 * @author usuario1
 */
public class PruebaEstudiante {
    
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Camila");
        
        estudiante.setEdad(20);
        
        estudiante.setNotaPromedio(4.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        
        System.out.println("Edad: " + estudiante.getEdad());
        
        System.out.println("Nota promedio: " + estudiante.getNotaPromedio());
    }
}


