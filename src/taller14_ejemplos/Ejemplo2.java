/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller14_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo2 {
   
    public class Vehiculo {
public void mover() {
System.out.println("El vehículo se está moviendo.");
}
}


public class Coche extends Vehiculo {
@Override
public void mover() {
System.out.println("El coche se está moviendo.");
}
}


public class Bicicleta extends Vehiculo {
@Override
public void mover() {
System.out.println("La bicicleta se está moviendo.");
}
}
}
