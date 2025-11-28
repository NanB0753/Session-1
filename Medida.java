/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convertidordemedidas;

/**
 *
 * @author nancy
 */
public class Medida {
    private double valor;
    private Unidad unidad;
    
    public Medida(double valor, Unidad unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }
    //constructor 
    public Medida(double valor) {
        this.valor = valor;
        this.unidad = Unidad.METRO;
    }
    
    //metodo
    public Medida convertir(Unidad nuevaUnidad)
            throws ConversionInvalidaException {
        if(!this.unidad.getTipo().equals(nuevaUnidad.getTipo())) {
            throw new ConversionInvalidaException("Error. Unidades incompatibles" + 
                    this.unidad.getTipo() + " " + nuevaUnidad.getTipo());
            
        }
        double valorBase = this.valor * this.unidad.getFactorBase();
        double nuevoValor = valorBase / nuevaUnidad.getFactorBase();
        
        return new Medida(nuevoValor, nuevaUnidad);
    }
    
    //metodo
    public Medida convertir(String nuevaUnidad)
            throws ConversionInvalidaException {
        Unidad unidadEncontrada = null;
        
        if(nuevaUnidad.equalsIgnoreCase(centimetro)) ||
                nuevaUnidad.equalsIgnoreCase(("cm")) {
                unidadEncontrada = Unidad.CENTIMETRO;
            } else if(nuevaUnidad.equalsIgnoreCase("metro") ||
                    nuevaUnidad.equalsIgnoreCase("m")) {
                    unidadEncontrada = Unidad.METRO;
                    } else if(nuevaUnidad.equalsIgnoreCase("pulgadas") ||
                    nuevaUnidad.equalsIgnoreCase("in")) {
                    unidadEncontrada = Unidad.PULGADAS;
                    } else if(nuevaUnidad.equalsIgnoreCase("pies") ||
                            nuevaUnidad.equalsIgnoreCase("ft")) {
                    unidadEncontrada = Unidad.PIES;
                    } else if(nuevaUnidad.equalsIgnoreCase("litros") ||
                            nuevaUnidad.equalsIgnoreCase("l")) {
                    unidadEncontrada = Unidad.LITROS;
                    }
            
            if(unidadEncontrada == null) {
                throw new ConversionInvalidaException("Unidad no reconocida: " + nuevaUnidad);
            }
                    
        return this.convertir(unidadEncontrada);
        
    }
    @Override
    public String toString() {
        return valor + " " + unidad.getNombre();
    }
    
    
}
