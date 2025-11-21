/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidordemedidas;

/**
 *
 * @author nancy
 */
public class ConvertidorDeMedidas {
    private double valor;
    private Unidad unidad;
    
    public ConvertidorDeMedidas(double valor, Unidad unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }
    
    public ConvertidorDeMedidas convertir(Unidad nuevaUnidad)
            throws ConversionInvalidaException {
        if(!this.unidad.getTipo().equals(nuevaUnidad.getTipo())) {
            
            throw new ConversionInvalidaException("Error al escoger unidades incompatibles" +
            this.unidad.getTipo() + " " + nuevaUnidad.getTipo());
        }
        
        double valorBase = this.valor * this.unidad.getFactorBase();
        double nuevoValor = valorBase / nuevaUnidad.getFactorBase();
        
        return new ConvertidorDeMedidas(nuevoValor, nuevaUnidad);
        
    }
    @Override
    public String toString() {
        return valor + " " + unidad.getNombre();
    }

}
