/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vault;

/**
 *
 * @author nancy
 */

public class ExceptionSeguridad extends Exception {
    public static final String ACCESO_DENEGADO = "ACCESO_DENEGADO";
    public static final String ALERTA_MANIPULACION = "ALERTA_MANIPULACION";
    
    private String tipo;
    
    public ExceptionSeguridad(String mensaje, String tipo) {
        super(mensaje);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
}
