/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vault;

/**
 *
 * @author nancy
 */
public class Persona {
    private String nombre;
    private String datosBiometricos;
    private String pin; 
    private String llaveFisica;
    
   public Persona(String nombre, String pin, String datosBiometricos, String llaveFisica) {
       this.nombre = nombre;
       this.pin = pin;
       this.datosBiometricos = datosBiometricos;
       this.llaveFisica = llaveFisica;
   }
   
   public String getNombre() {
       return nombre;
   }
   
   public String getPin() {
       return pin;
   }
   
   public String getDatosBiometricos() {
       return datosBiometricos;
   }
   
   public String getLlaveFisica() {
       return llaveFisica;
   }
   
   //usuarios
   public static final Persona SARA = new Persona("Sara", "1111", "azul", "llaveSara");
   public static final Persona SOPHIE  = new Persona("Sophie", "2222", "naranja", "llaveSophie");
   public static final Persona YASHUA = new Persona("Yashua", "3333", "verde", "llaveYashua");
   public static final Persona MIGUEL = new Persona("Miguel", "4444", "amarillo", "llaveMiguel");
   
}
