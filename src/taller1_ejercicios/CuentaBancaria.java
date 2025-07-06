/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1_ejercicios;

/**
 *
 * @author usuario1
 */
public class CuentaBancaria {
   
    // Atributos privados
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    // Constructor con dos parámetros
    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = "Ahorros";
    }

    // Constructor con tres parámetros (sobrecarga)
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    // Método para mostrar los detalles de la cuenta
    public void mostrarCuenta() {
        System.out.println("Número de cuenta : " + numeroCuenta);
        System.out.println("Saldo : $" + saldo);
        System.out.println("Tipo de cuenta : " + tipoCuenta);
    }

    // Método main para probar
    public static void main(String[] args) {
        System.out.println("---- CUENTA 1 (por defecto) ----");
        CuentaBancaria c1 = new CuentaBancaria();
        c1.mostrarCuenta();

        System.out.println("\n---- CUENTA 2 (2 parámetros) ----");
        CuentaBancaria c2 = new CuentaBancaria("12345678", 500000);
        c2.mostrarCuenta();

        System.out.println("\n---- CUENTA 3 (3 parámetros) ----");
        CuentaBancaria c3 = new CuentaBancaria("87654321", 1000000, "Corriente");
        c3.mostrarCuenta();
    }
}
    

