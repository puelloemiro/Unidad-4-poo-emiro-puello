/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo2 {
    
    public class Empleado {
protected String nombre;


public void mostrarNombre() {
System.out.println("Nombre: " + nombre);
}
}


public class Gerente extends Empleado {
private String departamento;


@Override
public void mostrarNombre() {
super.mostrarNombre(); // Llama al método de la clase base
System.out.println("Departamento: " + departamento);
}
}
public class Vehiculo {
protected String marca;


public Vehiculo(String marca) {
this.marca = marca;
}
}


public class Coche extends Vehiculo {
private int numeroDePuertas;


public Coche(String marca, int numeroDePuertas) { 



super(marca); // Llama al constructor de la clase base
this.numeroDePuertas = numeroDePuertas;
}
}

}
