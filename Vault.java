/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vault;

/**
 *
 * @author nancy 
 */

import java.util.Scanner;

public class Vault {
    private Scanner sc = new Scanner(System.in);
    
    public void abrir(Persona usuario) 
            throws ExceptionSeguridad {
        System.out.println("La verificacion para tener acceso al Vault consiste en tres metodos");
        
        validarEtapa("PIN", usuario.getPin());
        validarEtapa("DATOSBIOMETRICOS", usuario.getDatosBiometricos());
        validarEtapa("LLAVEFISICA", usuario.getLlaveFisica());
        
        //si los tres metodos son validados con exito
        System.out.println("Access Granted. Welcome to the Vault.");
        
    }
    //metodo que valida etapas (3 intentos por etapa)
    private void validarEtapa(String nombreEtapa, Object claveCorrecta)
            throws ExceptionSeguridad {
        int intentosFallidos = 0; 
        
        while(intentosFallidos < 3) {
                   System.out.println("Ingrese " + nombreEtapa + ": ");
        String credencialIngresada = sc.nextLine();
                
            
   
        if(!credencialIngresada.equals(claveCorrecta)) {
            intentosFallidos++;
            
            //si se falla un maximo de 3 veces
           if(intentosFallidos >= 3) {
                throw new ExceptionSeguridad("Alerta. Multiples intentos fallidos detectados. Cerrando programa.",
                ExceptionSeguridad.ALERTA_MANIPULACION);
            }
            System.out.println("Acceso denegaddo. Numero de intentos: " + intentosFallidos);
        } else {
        //si se verifica la etapa exitosamente
        System.out.println(nombreEtapa + "Verificada Exitosamente");
        return;
            }
    }
}
}
    

