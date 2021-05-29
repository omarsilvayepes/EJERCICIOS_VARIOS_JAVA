package EJERCICIO_8;
/**
 *
 * @author omary
 */
public class Entrenador extends Persona{
    //atributos
    private String estrategia;
    //constructor

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }
 //Metodo mostrar datos-toString
    @Override
    public String toString() {
        return "Entrenador{" +"NOMBRE:"+super.nombre+"  " +"APELLIDO:"+super.apellido+"  "+ "EDAD:"+super.edad +" " +"estrategia=" + estrategia + '}';
    }
    
    
    
}
