/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo1 {
    public class ClaseBase {
// Atributos y métodos de la clase base
}


public class ClaseDerivada extends ClaseBase {
// Atributos y métodos de la clase derivada
}

}

// Clase base
 class Animal {
protected String especie;


Animal(String especie) {
this.especie = especie;
}


public void emitirSonido() {
System.out.println("El animal hace un sonido.");
}


public void mostrarEspecie() { System.out.println("Especie: " + especie);
}
}


// Clase derivada
 class Perro extends Animal {
private String raza;


public Perro(String especie, String raza) {
super(especie); // Llama al constructor de la clase base
this.raza = raza;
}


public void ladrar() { System.out.println("El perro ladra.");
}


@Override
public void emitirSonido() { System.out.println("El perro ladra.");
}
}
