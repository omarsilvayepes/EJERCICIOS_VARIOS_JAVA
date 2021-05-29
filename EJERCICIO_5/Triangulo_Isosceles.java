package EJERCICIO_5;

/**
 *
 * @author omary
 */
public class Triangulo_Isosceles {
    
    //Atributos
    private double lado;
    private double base;
    private double perimetro;
    private double area;
    
    //Constructor

    public Triangulo_Isosceles(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }
    
    //Obtener perimetro

    public double getPerimetro() {
        perimetro=2*lado+base;
        return perimetro;
    }
    
    //Obtener area

    public double getArea() {
        area=base*(Math.sqrt((4*lado*lado-base*base)/4))/2;
        return area;
    }

}
