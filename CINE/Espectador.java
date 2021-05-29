package CINE;
import java.util.Scanner;
/**
 *
 * @author omary
 */
public class Espectador {
    //atributos
    private String nombre;
    private int edad;
    private float efectivo;
    private Pelicula pelicula;
    private Cine cine;
    private String Asiento;

    //constructor
    public Espectador(String nombre, int edad, float efectivo,Pelicula pelicula,Cine cine) {
        this.nombre = nombre;
        this.edad = edad;
        this.efectivo = efectivo;
        this.pelicula= pelicula;
        this.cine= cine;
    }
    
    public Espectador crearEspectadores(Pelicula pelicula,Cine cine){
        Scanner entrada=new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println("INGRESE NOMBRE:");
        nombre=entrada.nextLine();
        System.out.println("INGRESE EDAD:");
        edad=entrada.nextInt();
        System.out.println("INGRESE EFECTIVO:");
        System.out.println("--------------------------");
        efectivo=entrada.nextFloat();
        //Crear espectador
        Espectador espectador=new Espectador(nombre,edad,efectivo,pelicula,cine);
        return espectador;
    }
    
    //como los atributos son privados deben ser accedidos a traves de los metodos getter

    public int getEdad() {
        return edad;
    }

    public float getEfectivo() {
        return efectivo;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public Cine getCine() {
        return cine;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getAsiento() {
        return Asiento;
    }
    // metdo setter para asignar un asiento a el espectador

    public void setAsiento(String Asiento) {
        this.Asiento = Asiento;
    }
}
