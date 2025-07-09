/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_ejemplos;

/**
 *
 * @author usuario1
 */
public class Ejemplo2 {
    
    // Clase EmailService (responsable de las notificaciones por correo)
public class EmailService {
public void enviarEmail(String destinatario, String mensaje) { System.out.println("Enviando email a: " + destinatario); System.out.println("Mensaje: " + mensaje);
}
}


// Clase SMSService (responsable de las notificaciones por SMS)
public class SMSService {
public void enviarSMS(String numero, String mensaje) { System.out.println("Enviando SMS a: " + numero); System.out.println("Mensaje: " + mensaje);
}
}
}
