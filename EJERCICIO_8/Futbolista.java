package EJERCICIO_8;

/**
 *
 * @author omary
 */
public class Futbolista extends Persona{
    //atributos
    private int dorsal;
    private String posicion;
    
    //constructor

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    //Metodo mostrar datos-toString

    @Override
    public String toString() {
        return "Futbolista{" +"NOMBRE:"+super.nombre+"  " +"APELLIDO:"+super.apellido+"  "+ "EDAD:"+super.edad +" "+ "dorsal=" + dorsal + ", posicion=" + posicion + '}';
    }
    
}
