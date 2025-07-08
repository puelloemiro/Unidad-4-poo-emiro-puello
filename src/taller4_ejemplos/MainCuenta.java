/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4_ejemplos;

/**
 *
 * @author usuario1
 */
public class MainCuenta {

        public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.mostrarSaldo();
    }
} 

