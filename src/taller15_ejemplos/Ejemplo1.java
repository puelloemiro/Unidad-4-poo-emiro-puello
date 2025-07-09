/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo1 {
    
       // Clase Usuario (solo datos del usuario)
public class Usuario { private String nombre; private String contrasena;

public Usuario(String nombre, String contrasena) {
this.nombre = nombre;
this.contrasena = contrasena;
} 

        private String getNombre() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

}	
public String getNombre() {
    String nombre = null;
return nombre;
}

// Clase AutenticacionService (responsable de la autenticación)
public class AutenticacionService {
public boolean autenticar(Usuario usuario, String contrasena) {
return usuario.getNombre().equals("admin") && contrasena.equals("1234");
}
}

// Clase InformeService (responsable de la generación de informes)
public class InformeService {
public void generarInformeUsuario(Usuario usuario) { System.out.println("Generando informe para " + usuario.getNombre());
}
}
}
