/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 
package taller8_ejemplos;


 *
 * @author usuario1
 
public class Ejemplo3 {
    
    // Clase base 1
public class ClaseA {
}


// Clase base 2
public class ClaseB {
}


// Clase derivada (incorrecta)
public class ClaseC extends ClaseA, ClaseB { // Error de compilación

}

// Clase base
public class Vehiculo {
private String marca; 
}

//public Vehiculo(String marca) {
//this.marca = marca;
}

Clase derivada (incorrecta)

class Coche extends Vehiculo {
public void mostrarMarca() {
System.out.println(marca); // Error de compilación: 'marca' tiene acceso privado
}   
}
}

*/

