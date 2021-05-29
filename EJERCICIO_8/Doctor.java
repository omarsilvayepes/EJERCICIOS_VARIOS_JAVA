package EJERCICIO_8;
/**
 *
 * @author omary
 */
public class Doctor extends Persona{
    //atributos
    private String titulacion;
    private int experencia;
    //constructor

    public Doctor(String titulacion, int experencia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.experencia = experencia;
    }
    //Metodo mostrar datos-toString

    @Override
    public String toString() {
        return "Doctor{" +"NOMBRE:"+super.nombre+"  " +"APELLIDO:"+super.apellido+"  "+ "EDAD:"+super.edad +" " + "titulacion=" + titulacion + ", experencia=" + experencia + '}';
    }
    
    
}
