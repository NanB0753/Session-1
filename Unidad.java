/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidordemedidas;

/**
 *
 * @author nancy
 */
public class Unidad {
    private String nombre;
    private double factorBase;
    private String tipo;
    
    public Unidad(String nombre, double factorBase,String tipo) {
        this.nombre = nombre;
        this.factorBase = factorBase;
        this.tipo = tipo;
    }
    
    public String getNombre() {
    return nombre;
    }
    public double getFactorBase() {
        return factorBase;
    }
    public String getTipo() {
        return tipo;
        
    }
    
    //constantes
    public static final Unidad CENTIMETRO = new Unidad("centimetro", 0.01, "longitud");
    public static final Unidad METRO = new Unidad("metro", 1.0, "longitud");
    public static final Unidad PULGADAS = new Unidad("pulgadas", 0.254, "longitud");
    public static final Unidad PIES = new Unidad("pies", 0.3048, "longitud");
    public static final Unidad LITROS = new Unidad("litros", 1.0, "volumen");
  
    
}
