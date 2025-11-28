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
    public static final Unidad MILIMETRO = new Unidad("milimetro", 0.001, "longitud");
    public static final Unidad KILOMETRO = new Unidad("kilometro", 1000.0, "longitud");
    public static final Unidad MILLA = new Unidad("milla", 1609.34, "longitud");
    public static final Unidad YARDA = new Unidad ("yarda", 0.9144, "longitud");
    public static final Unidad KILOGRAMO = new Unidad("kilogramo", 1.0, "masa");
    public static final Unidad GRAMO = new Unidad("gramo", 0.001, "masa");
    public static final Unidad LIBRA = new Unidad("libra", 0.453592, "masa");
    public static final Unidad TONELADA = new Unidad("tonelada", 1000, "masa");
    public static final Unidad MILILITRO = new Unidad("mililitro", 0.001, "volumen");
    public static final Unidad GALON = new Unidad("galon", 0.473176, "volumen");
    public static final Unidad TAZA = new Unidad("taza", 0.236588, "volumen");
    
    public static Unidad buscarPorNombre(String nombre) {
        if(nombre.equalsIgnoreCase("centimetro") || nombre.equalsIgnoreCase("cm")) {
            return CENTIMETRO;
        } else if(nombre.equalsIgnoreCase("metro") || nombre.equalsIgnoreCase("m")) {
            return METRO;
        } else if(nombre.equalsIgnoreCase("pulgada") || nombre.equalsIgnoreCase("in")) {
            return PULGADA;
        } else if(nombre.equalsIgnoreCase("pies") || nombre.equalsIgnoreCase("ft")) {
            return PIES;
        } else if(nombre.equalsIgnoreCase("litro") || nombre.equalsIgnoreCase("l")) {
            return LITROS;
        } else if(nombre.equalsIgnoreCase("milimetro") || nombre.equalsIgnoreCase("mm")) {
            return MILIMETRO;
        } else if(nombre.equalsIgnoreCase("kilometro") || nombre.equalsIgnoreCase("km")) {
            return KILOMETRO;
        } else if(nombre.equalsIgnoreCase("milla") || nombre.equalsIgnoreCase("mi")) {
            return MILLA;
         } else if(nombre.equalsIgnoreCase("yarda") || nombre.equalsIgnoreCase("yd")) {
            return YARDA;
         } else if(nombre.equalsIgnoreCase("kilogramo") || nombre.equalsIgnoreCase("kg")) {
            return KILOGRAMO;
         } else if(nombre.equalsIgnoreCase("gramo") || nombre.equalsIgnoreCase("gr")) {
            return GRAMO;
         } else if(nombre.equalsIgnoreCase("libra") || nombre.equalsIgnoreCase("lb")) {
            return LIBRA;
         } else if(nombre.equalsIgnoreCase("tonelada") || nombre.equalsIgnoreCase("ton")) {
            return TONELADA;
         } else if(nombre.equalsIgnoreCase("mililitro") || nombre.equalsIgnoreCase("ml")) {
            return MILILITRO;
         } else if(nombre.equalsIgnoreCase("galon") || nombre.equalsIgnoreCase("gal")) {
            return GALON;
          } else if(nombre.equalsIgnoreCase("taza") || nombre.equalsIgnoreCase("cups")) {
            return TAZA;
         } else {
            return null;
        }
    }
  
    
}
