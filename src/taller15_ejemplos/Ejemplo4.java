/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo4 {
  
    public class Factura {
private double monto;


public double calcularImpuestos() { 



return monto * 0.12;
}


public void imprimirFactura() {
System.out.println("Imprimiendo factura...");
}


public void guardarFactura() {
System.out.println("Guardando factura en la base de datos...");
}
}
}
