/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo3 {
   
    public class Empleado { private String nombre; private double salario;


public double calcularSalarioMensual() {
return salario * 12;
}


public void generarInforme() {
System.out.println("Generando informe para: " + nombre);
}


public void guardarEnBaseDeDatos() {
System.out.println("Guardando empleado en la base de datos...");
}
}
}
