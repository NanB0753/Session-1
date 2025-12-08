/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemaderepositoriodedatos;

/**
 *
 * @author nancy
 */
public class Main {
    public static void main(String []args) {
        IRepositorio repo;
        
        repo = new RepositorioSQL();
        //repo = new RepositorioEnMemoria();
        
        String id1 = repo.guardar("Diagrama");
        String id2 = repo.guardar("Manual de Usuario");
        
        Object dato = repo.leer(id1);
        System.out.println("Dato leido: " + dato);
        
        repo.eliminar(id2);
    }
    
}
