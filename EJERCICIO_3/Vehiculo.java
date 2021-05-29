package EJERCICIO_3;

/**
 *
 * @author omary
 */
public class Vehiculo {
    
    //Atributos encapsulados
    private String marca;
    private String modelo;
    private Float precio;
    
    //Metodo Constructor-para inicilizar datos

    public Vehiculo(String marca, String modelo, Float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    //Obtener el precio del vehiciculo
    public Float getPrecio() {
        return precio;
    }

 
    public String mostrarDatos(){
        String datos=marca+" modelo: "+modelo+" Precio: "+precio;
        return  datos;
    }
    
}
