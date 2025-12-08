/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serviciodenotificacionesmultiples;

/**
 *
 * @author nancy
 */
public class Main {
    public static void main(String []args) {
        INotificador email = new NotificadorEmail();
        INotificador sms = new NotificadorSMS();
        INotificador push = new NotificadorPush();
        GestorDeAlertas gestor = new GestorDeAlertas(email, sms, push);
   
                gestor.dispararAlertaMaxima("Puede que sea victima de un fraude a traves de su servicio de paqueteria", "Usuario");
                }
    
}
