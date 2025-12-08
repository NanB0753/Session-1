/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaderepositoriodedatos;

/**
 *
 * @author nancy
 */
public class RepositorioEnMemoria implements IRepositorio {
    private Object[] datos = new Object[3];
    private String[] ids = new String[3];
    private int index = 0;
    
    @Override
    public String guardar(Object data) {
        if(index < datos.length) {
            String idGenerado = "id" + index;
            datos[index] = data;
            ids[index] = idGenerado;
            
            System.out.println("Guardando en: " + idGenerado +" -> " + data);
            index++;
            return idGenerado;
            
        } else {
            System.out.println("Error. No hay suficiente espacio para guardar");
            return null;
        }
    }
    
    @Override 
    public Object leer(String id) {
        for (int i = 0; i < index; i++) {
            if(ids[i].equals(id)) {
                System.out.println("Leyendo " + id);
                return datos[i];
            }
            
        }
        System.out.println("No existe el id: " + id);
        return null;
    }
    
    @Override 
    public void eliminar(String id) {
        for (int i = 0; i < index; i++) {
            if(ids[i].equals(id)) {
                System.out.println("Eliminando: " + id);
                datos[i] = null;
                return;
            }
            
        }
        System.out.println("No se encontro el id: " + id);
    }
    
    
}
