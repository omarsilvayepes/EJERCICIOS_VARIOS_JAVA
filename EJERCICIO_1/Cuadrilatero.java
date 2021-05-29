/* Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados. 
Los valores de la longitud deberán introducirse por línea de ordenes. Si es un cuadrado, 
sólo se proporcionará la longitud de uno de los lados al constructor.
 */
package EJERCICIO_1;

/**
 *
 * @author omary
 */
public class Cuadrilatero {
    
    //atributos
    private float lado1;
    private float lado2;
    private float perimetro;
    private float area;
    
    // constructor cuadrado

    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
        this.lado2=lado1;
    }
    
    // constructor cuadrilatero diferente a cuadrado
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getPerimetro() {
        perimetro=2*(lado1+lado2);
        return perimetro;
    }

    public float getArea() {
        
        area=lado1*lado2;
        return area;
    }
 
}
