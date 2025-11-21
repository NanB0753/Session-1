/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidordemedidas;

/**
 *
 * @author nancy
 */

import java.util.Scanner;
import convertidordemedidas.Unidad;
import convertidordemedidas.ConvertidorDeMedidas;
import convertidordemedidas.ConversionInvalidaException;
        

public class Main {
    public static Unidad elegirUnidad(int opcion) {
        switch (opcion) {
            case 1: return Unidad.CENTIMETRO;
            case 2: return Unidad.METRO;
            case 3: return Unidad.PULGADAS;
            case 4: return Unidad.LITROS;
            default: return null;
        }
    }
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String repetir = "si";
        
        while(repetir.equalsIgnoreCase("si")) {
            try {
                System.out.println("Ingresa el el monto que se quiere convertir : ");
                double valor = Double.parseDouble(sc.nextLine());
                
                System.out.println("Elige la unidad original que quieres convertir:");
                System.out.println("1: Centimetros 2: Metros 3: Pulgadas 4: Litros");
                System.out.println("Opcion : ");
                
                int opcionOriginal = Integer.parseInt(sc.nextLine());
                
                Unidad desde = elegirUnidad(opcionOriginal);
                if(desde == null) {
                    System.out.println("Error. Unidad valida");
                    continue;
                }
                
                ConvertidorDeMedidas medida = new ConvertidorDeMedidas(valor, desde);
                
                System.out.println("Elige la unidad a la que quieres haver la conversion");
                System.out.println("1: Centimetros 2: Metros 3: Pulgadas 4: Litros");
                System.out.println("Opcion: ");
                
                int opcionFinal = Integer.parseInt(sc.nextLine());
                
                Unidad hacia = elegirUnidad(opcionFinal);
                if(hacia == null) {
                    System.out.println("Error. Unidad invalida");
                    continue;
                }
                
                ConvertidorDeMedidas resultado = medida.convertir(hacia);
                
                System.out.println(resultado);
                
            } catch (ConversionInvalidaException e ) {
                System.out.println("Error. " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado.");
                e.printStackTrace();
                sc.nextLine();
            }
            
           
            System.out.print("Desea hacer otra conversion? (si/no)");
            repetir = sc.nextLine();
            System.out.println();
           
            
        }
            
            System.out.println("Fin del Programa");
        }
        
}
