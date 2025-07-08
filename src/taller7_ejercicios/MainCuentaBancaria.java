/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_ejercicios;

/**
 *
 * @author usuario1
 */
public class MainCuentaBancaria {
    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 1000000, "Ahorros");

        // Acceso válido:
        cuenta.mostrarDetalles();
        System.out.println("Saldo: $" + cuenta.getSaldo());

        // Modificando el saldo de forma controlada
        cuenta.setSaldo(1200000);

        // Acceso público al tipo de cuenta
        System.out.println("Tipo: " + cuenta.tipoCuenta);

        //Intento de acceso directo a una propiedad privada
        // System.out.println("Número de cuenta: " + cuenta.numeroCuenta); //ERROR DE COMPILACIÓN

        //También este modificador está bloqueado
        // cuenta.numeroCuenta = "9999999999"; //ERROR DE COMPILACIÓN
    }
    
}
