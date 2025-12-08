/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaderepositoriodedatos;

/**
 *
 * @author nancy
 */
public class RepositorioSQL implements IRepositorio {
    private int contador = 0;
    
    @Override
    public String guardar(Object data) {
        String idGenerado = "SQL" + contador++;
        System.out.println("INSERT INTO tabla(id, data) VALUES(" + idGenerado + "," + data + ");");
        return idGenerado;
    }
    
    @Override
    public Object leer(String id) {
        System.out.println("SELECT * FROM tabla WHERE id = " + id + ";");
        return "Dato obtenido desde SQL con id" + id;
    }
    
    @Override 
    public void eliminar(String id) {
        System.out.println("DELETE FROM tabla WHERE id = " + id + ";");
    }
}
