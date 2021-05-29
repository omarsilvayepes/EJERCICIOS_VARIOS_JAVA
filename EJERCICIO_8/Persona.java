package EJERCICIO_8;
/**
 *
 * @author omary
 */
public class Persona {
    //atributos
    protected String nombre;
    protected String apellido;
    protected int edad;
    //Constructor

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    //Metodo mostrar datos-toString

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    
}
