/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo2 {
   
// Clase base
public class Empleado {
    
public void trabajar() {
    
System.out.println("El empleado está trabajando.");
}
}


// Clase derivada
public class Gerente extends Empleado {
@Override

public void trabajar() {
    
System.out.println("El gerente está gestionando el equipo.");

    }

}

}
