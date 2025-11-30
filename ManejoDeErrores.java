/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listascolasystacks;

/**
 *
 * @author nancy
 */
public class ManejoDeErrores {
    public static boolean validarposicion(int posicion, int limite) {
        if(posicion < 0 || posicion >= limite) {
            System.out.println("Eror. La posicion " + posicion + "no existe");
            return false;
        }
        return true;
    }
    public static boolean validarArregloLleno(int total, int max) {
        if(total >= max) {
            System.out.println("Error. Limite de tareas posibles alcanzado");
            return false;
        }
        return true;
    }
}
