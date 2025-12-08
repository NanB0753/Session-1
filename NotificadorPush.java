/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodenotificacionesmultiples;

/**
 *
 * @author nancy
 */
public class NotificadorPush implements INotificador {
    
      @Override
    public void enviar(String mensaje, String destinatario) {
        
        System.out.println("Enviando Email a " + destinatario );
        System.out.println("Su paquete ha llegado");
    }
    
    
}
