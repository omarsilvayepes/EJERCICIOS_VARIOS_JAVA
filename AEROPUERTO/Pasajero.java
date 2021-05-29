package AEROPUERTO;
/**
 *
 * @author omary
 */
public class Pasajero {
    //atributos
    private String nombre;
    private String id;
    private Vuelo vuelo;
    
    //constructor

    public Pasajero(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    // Metodo setter para acceder a el atributo vuelo de un pasajero.
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    
}
