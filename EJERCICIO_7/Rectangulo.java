package EJERCICIO_7;

/**
 *
 * @author omary
 */
public class Rectangulo extends Poligono{
    //atributos
    private double lado1;
    private double lado2;
    
    //constructor

    public Rectangulo(double lado1, double lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //implementar los metodos abtractos heredados del padre poligino

    @Override
    public double area(){
        return lado1*lado2;
    }

    //Metodo mostrar datos
    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
}
