/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejercicios;

/**
 *
 * @author usuario1
 */
public class Autenticador {
    
    public boolean autenticar(UsuarioCorrecto usuario, String entradaContraseña) {
        return usuario.getContraseña().equals(entradaContraseña);
    }
}
