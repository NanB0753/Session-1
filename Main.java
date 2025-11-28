/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vault;

/**
 *
 * @author nancy
 */

import java.util.Scanner;


public class Main {
    public static Persona seleccionarPersona(int option) {
        switch (option) {
            case 1: return Persona.SARA;
            case 2: return Persona.SOPHIE;
            case 3: return Persona.YASHUA;
            case 4: return Persona.MIGUEL;
            default: return null;
        }
    }
    
    public static void main( String []args) {
        Scanner sc = new Scanner(System.in);
        
        Persona usuario = null;
        
        //repetir la opcion hasta que se escoja un nuero valido
        while(usuario == null) {
        
    
    //seleccionar cliente
        System.out.println("Seleccionar el cliente que desea acceso al Vault");
        System.out.println("1: Sara");
        System.out.println("2: Sophie");
        System.out.println("3: Yashua");
        System.out.println("4: Miguel");
        
        int option = sc.nextInt();
        sc.nextLine();
        
        usuario = seleccionarPersona(option);
        
        if(usuario == null) {
        System.out.println("Usuario no valido");
       
        }
}
        Vault vault = new Vault();
        try {
        vault.abrir(usuario);
} catch(ExceptionSeguridad e) {
    if(e.getTipo().equals(ExceptionSeguridad.ALERTA_MANIPULACION)) {
    
        System.out.println("Error. " + e.getMessage());
} else {
        
    }
    //si el acceso es denegado pero aun no se cumplen el maximo de intentos
        return;
    }
    }
}
