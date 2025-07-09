/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

/**
 *
 * @author usuario1
 */
/*
Esta clase viola el SRP porque:
- Maneja datos
- Realiza autenticación
- Valida datos

Son responsabilidades distintas.
*/

public class Usuario {
    private String nombreUsuario;
    private String contraseña;

    public Usuario(String nombreUsuario, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public boolean autenticar(String input) {
        return this.contraseña.equals(input);
    }

    public boolean validarNombreUsuario() {
        return nombreUsuario.length() >= 5;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }    
}
