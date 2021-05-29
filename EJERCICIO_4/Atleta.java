/*
 Ejercicio 4: Construir un programa para una competencia de atletismo, el programa debe gestionar una
serie de atletas caracterizados por su número de atleta, nombre y tiempo de carrera, al final el programa 
debe mostrar los datos del atleta ganador de la carrera.
 */
package EJERCICIO_4;

/**
 *
 * @author omary
 */
public class Atleta {
    
    //Atributos
    private int id;
    private String nombre;
    private Float tiempo;
    
    
    //Metodo constructor

    public Atleta(int id, String nombre, Float tiempo) {
        this.id = id;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    //metodo para obetner el tiempo 

    public Float getTiempo() {
        return tiempo;
    }
    
   // metodo para mostrar datos
    
    public String mostrarDatos(){
        String datos="NOMBRE: "+nombre+"  "+"ID: "+id+"  "+"TIEMPO: "+tiempo;
        return datos;
    }
}
