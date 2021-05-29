/*
 Ejercicio 7(Contiene Herencia,abstraccion,encapsulamiento ,polimorfismo): Hacer un programa para calcular
el área de Polígonos (Triángulos y Rectángulos) el programa
debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, y al final mostrar el área y los 
datos de cada uno. Para ello se tendrá lo siguiente: 

    - Una super clase llamada Polígono.
    - Una sub clase llamada Rectángulo.
    - Una sub clase llamada Triángulo.
 */
package EJERCICIO_7;

/**
 *
 * @author omary
 */
public abstract class Poligono {
    //atributos
    protected int numLados;
    
    //Constructor

    public Poligono(int numLados) {
        this.numLados = numLados;
    }
    
    //Metodos

    public abstract double area();//metodos abtractos(deben  inmplmentarse necesariamnete en los hijos)
   
 // el metodo toString es igual a el metodo mostrarDatos();
    @Override
    public String toString() {
        return "Poligono{" + "numLados=" + numLados + '}';
    }
}
