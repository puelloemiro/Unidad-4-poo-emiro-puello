/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_ejercicios;

/**
 *
 * @author usuario1
 */
public class CuentaBancaria {
   
    private String numeroCuenta;     // No se puede acceder directamente fuera de esta clase
    private double saldo;            // Controlado por get/set
    public String tipoCuenta;        // Accesible desde cualquier clase

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Número de cuenta (oculto por privacidad)");
    }
    
}
