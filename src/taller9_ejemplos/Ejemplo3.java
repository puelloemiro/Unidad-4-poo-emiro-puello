/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo3 {
 
    public class Animal {
protected String especie;


public Animal(String especie) {
this.especie = especie;
}


public void mostrarEspecie() { System.out.println("Especie: " + especie);
}
}


public class Gato extends Animal {
private String color;


public Gato(String especie, String color) {
super(especie); // Llama al constructor de la clase base
this.color = color;
}


@Override
public void mostrarEspecie() {
super.mostrarEspecie(); // Llama al método de la clase base
System.out.println("Color: " + color);
}
}
}
