/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_ejercicios;


import java.util.Scanner;

public class ProyectoIntegrador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== LIBRO =====
        System.out.println("===== INGRESO DE DATOS - LIBRO =====");
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Número de páginas: ");
        int paginas = sc.nextInt();
        sc.nextLine(); // ← limpia el ENTER que queda después del int

        Libro libro = new Libro(titulo, autor, paginas);
        libro.mostrarDetalles();

        // ===== CUENTA BANCARIA =====
        System.out.println("\n===== INGRESO DE DATOS - CUENTA BANCARIA =====");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = sc.nextLine();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine(); // ← limpia el ENTER que queda después del double

        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();

        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        cuenta.mostrarCuenta();

        // ===== ESTUDIANTE =====
        System.out.println("\n===== INGRESO DE DATOS - ESTUDIANTE =====");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // ← limpia el ENTER que queda después del int

        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Estudiante estudiante = new Estudiante(nombre, edad, curso);
        estudiante.mostrarInformacion();

        sc.close(); // buena práctica: cerrar el Scanner al final
    }
}