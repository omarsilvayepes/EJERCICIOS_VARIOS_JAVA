package CINE;
/**
 *
 * @author omary
 */
public class Cine {
    //atributos
    private float precio_entrada; // atributo no usado
    //constructor

    public Cine(float precio_entrada) {
        this.precio_entrada = precio_entrada;
    }
    
    //metodo getter para leer atributos privados desde otra clase

    public float getPrecio_entrada() {
        return precio_entrada;
    }
}
