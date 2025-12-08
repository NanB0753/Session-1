/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaderepositoriodedatos;

/**
 *
 * @author nancy
 */
public interface IRepositorio {
    String guardar(Object data);
    Object leer(String id);
    void eliminar(String id);
    
}
