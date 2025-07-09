/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo3 {
    
    // Clase base
public class Animal {
public void hacerSonido() {
System.out.println("El animal hace un sonido.");
}
}


// Clase derivada
public class Perro extends Animal {
public void correr() {
System.out.println("El perro está corriendo.");
}
}
}


/* Clase de prueba (incorrecta)
public class Main {
public  void main(String[] args) { Animal miAnimal = new Perro();
miAnimal.correr(); // Error de compilación: El método correr() no existe en Animal

}
}
}*/