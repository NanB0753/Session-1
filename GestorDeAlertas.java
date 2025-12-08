/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodenotificacionesmultiples;

/**
 *
 * @author nancy
 */
public class GestorDeAlertas {
    private INotificador email;
    private INotificador sms;
    private INotificador push;
    
    public GestorDeAlertas(INotificador email, INotificador sms, INotificador push) {
        this.email = email;
        this.sms = sms;
        this.push = push;
    }
    
    public void dispararAlertaMaxima(String mensaje, String destinatario) {
        System.out.println("Alerta Maxima Activada");
    
email.enviar(mensaje, destinatario);
sms.enviar(mensaje, destinatario);
push.enviar(mensaje, destinatario);
    }
}
