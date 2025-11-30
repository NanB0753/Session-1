/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listascolasystacks;

/**
 *
 * @author nancy
 */
public class Tarea {
    String nombre;
    boolean completada;
    
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.completada = false;
    }
    
    public void completar() {
        this.completada = true;
    }
    
    
    public String mostrarTarea() {
        if(completada == true) {
            return nombre + "completada"; 
        } else {
            return nombre;
        }
    }
    
}
