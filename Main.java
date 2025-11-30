/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listascolasystacks;

/**
 *
 * @author nancy
 */
public class Main {
    public static void main(String []args) {
        ToDoList lista = new ToDoList();
        
        lista.agregarTarea("Preparar desayuno");
        lista.agregarTarea("Planear Menu semanal");
        lista.agregarTarea("Hacer despensa semanal");
        lista.agregarTarea("Clases Gracia y Caleb");
        lista.agregarTarea("Hacer ejercicio 30 mimutos");
        lista.agregarTarea("Limpiar casa");
        lista.agregarTarea("Escribir 500 palabras novela");
        lista.agregarTarea("Estudiar programacion");
        
        lista.mostrarPendientes();
        
        lista.completarTarea(7);
        
        lista.mostrarPendientes();
        lista.mostrarCompletadas();
        
        lista.moverTarea(7, 0);
        
        lista.mostrarPendientes();
        
    }
    
}
