/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_ejercicio;

/**
 *
 * @author usuario1
 */
public class MainEstudiante {
    
   public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Ana", 21, "2025-Ing. Software-003");
        Estudiante estudiante2 = new Estudiante("Luis", 19, "2025-Ing. Software-010");

        estudiante1.mostrarInformacion();
        System.out.println("---");
        estudiante2.mostrarInformacion();
    }
}


