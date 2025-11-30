/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listascolasystacks;

/**
 *
 * @author nancy
 */
public class ToDoList {
    private Tarea[] pendientes = new Tarea[25];
    private Tarea[] completada = new Tarea[25];
    
    private int totalPendientes = 0;
    private int totalCompletada = 0;
    

    
    //add tarea
    public void agregarTarea(String nombre) {
        if(!ManejoDeErrores.validarArregloLleno(totalPendientes, 25))
            return;
        
        pendientes[totalPendientes] = new Tarea(nombre);
        totalPendientes++;
        System.out.println("Tarea agregada: " + nombre);
    }
    
    //completar tarea
    public void completarTarea(int posicion) {
        if(!ManejoDeErrores.validarposicion(posicion, totalPendientes))
            return;
        
      
    
        //ubicar tarea
        Tarea t = pendientes[posicion];
        t.completar();
        
        //mover tarea a completados
        completadas[totalCompletadas] = t;
        totalCompletadas++;
        
        //mover el arreglo hacia arrina
        for (int i = posicion; i < totalPendientes - 1; i++) {
            pendientes[i] = pendientes[i + 1];
            
        }
        
        pendientes[totalPendientes - 1] = null;
        totalPendientes--;
        
        System.out.println("Tarea completada: " + t.nombre);
        
        
    }
    //mover tarea de prioridad
    public void moverTarea(int actual, int nuevo) {
if(!ManejoDeErrores.validarPosicion(actual, totalPendientes))
return;
if(!ManejoDeErrores.validarPosicion(nuevo, totalPendientes))
return;

        
        
        Tarea temp = pendientes[actual];
        
        //mover hacia arriba o abajo 
        if(nuevo < actual) {
            for (int i = actual; i > nuevo; i--) {
                pendientes[i] = pendientes[i -1];
                
            }
        } else {
            for (int i = actual; i < nuevo; i++) {
                pendientes[i] = pendientes[i + 1];
                
            }
        }
        pendientes[nuevo] = temp;
        System.out.println("La tarea " + temp.nombre + "ha sido movida");
        
    }
    //mostrar pendientes
    public void mostrarPendientes() {
            System.out.println("Tareas Pendientes");
            for (int i = 0; i < totalPendientes; i++) {
                System.out.println(i + "-" + pendientes[i].mostrarTarea());
            }
                
               
            
        }
    
    //mostrar completadas
    public void mostrarCompletadas() {
        System.out.println("Tareas Completadas");
        for (int i = 0; i < totalCompletadas; i++) { 
            System.out.println(i + " - " + completadas[i].mostrarTarea());
            
        }
    }
} 
