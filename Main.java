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
import convertidordemedidas.Medida;
import convertidordemedidas.ConversionInvalidaException;
        

public class Main {
    public static Unidad elegirUnidad(int opcion) {
        switch (opcion) {
            case 1: return Unidad.CENTIMETRO;
            case 2: return Unidad.METRO;
            case 3: return Unidad.PULGADAS;
            case 4: return Unidad.LITROS;
            case 5: return Unidad.MILIMETRO;
            case 6: return Unidad.KILOMETRO;
            case 7: return Unidad.MILLA;
            case 8: return Unidad.YARDA;
            case 9: return Unidad.KILOGRAMO;
            case 10: return Unidad.GRAMO;
            case 11: return Unidad.LIBRA;
            case 12: return Unidad.TONELADA;
            case 13: return Unidad.GALON;
            case 14: return Unidad.TAZA;
            default: return null;
        }
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String repetir = "si";
        
        //seleccionar unidad original
        while(repetir.equalsIgnoreCase("si")) {
            try {
                System.out.println("Seleccione la unidad del valor que desea ingresar: ");
                System.out.println("1: Centimetro");
                System.out.println("2: Metros");
                System.out.println("3: Pulgadas");
                System.out.println("4: Litros");
                System.out.println("5: Milimetros");
                System.out.println("6: Kilometros");
                System.out.println("7: Millas");
                System.out.println("8: Yardas");
                System.out.println("9: Kilogramos");
                System.out.println("10: Gramos");
                System.out.println("11: Libras");
                System.out.println("12: Toneladas");
                System.out.println("13: Mililitros");
                System.out.println("14: Tazas");
               
                
                String entradaOriginal = sc.nextLine();
                int opcionOriginal;
                
                try{
                    opcionOriginal = Integer.parseInt(entradaOriginal);
                } catch(NumberFormatException e) {
                    System.out.println("Error. Debes elegir entre las opciones presentadas");
                    continue;
                }
                
                Unidad desde = elegirUnidad(opcionOriginal);
                if(desde == null) {
                    System.out.println("Error. Favor de intentar de nuevo.");
                    continue;
                }
                
                //ingresar monto
                System.out.println("Ingresa el el monto que se quiere convertir : ");
                String entradaValor = sc.nextLine();
                
                double valor;
                
                try {
                    valor = Double.parseDouble(entradaValor);
                } catch(NumberFormatException e) {
                    System.out.println("Error. Favor de intentar de nuevo.");
                    continue;
                }
                
                Medida medida = new Medida(valor, desde);
                
                //seleccionar unidad final
                System.out.println("Elige la unidad final a la que quieres convertir:");
                System.out.println("1: Centimetros");
                System.out.println("2: Metros");
                System.out.println("3: Pulgadas");
                System.out.println("4: Litros");
                
                System.out.println("5: Milimetros");
                System.out.println("6: Kilometros");
                System.out.println("7: Millas");
                System.out.println("8: Yardas");
                System.out.println("9: Kilogramos");
                System.out.println("10: Gramos");
                System.out.println("11: Libras");
                System.out.println("12: Toneladas");
                System.out.println("13: Mililitros");
                System.out.println("14: Tazas");
               
                
                String entradaUnidadFinal = sc.nextLine();
                int opcionFinal;
                
                try {
                    opcionFinal = Integer.parseInt(entradaUnidadFinal);
                } catch(NumberFormatException e) {
                    System.out.println("Error.Favor de intentar de nuevo");
                    continue;
                }
                
                Unidad hacia = elegirUnidad(opcionFinal);
                if(hacia == null) {
                    System.out.println("Error. Unidad invalida");
                    continue;
                }
                
                //conversion 
                Medida resultado = medida.convertir(hacia);
                System.out.println(resultado);
                
                  
            } catch (ConversionInvalidaException e ) {
                System.out.println("Error. " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado.");
                sc.nextLine();
            }
            
           
            System.out.print("Desea hacer otra conversion? (si/no)");
            repetir = sc.nextLine();
            System.out.println();
           
            
        }
            
            System.out.println("Fin del Programa");
        }
        
}
