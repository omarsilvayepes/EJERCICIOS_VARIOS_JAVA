package AEROPUERTO;
/**
 *
 * @author omary
 */
public class Vuelo {
    //atributos
    private String origen;
    private String destino;
    private double precio;
    private  int capacidad;
    private int numPasajeros;
    private int codigo;
    private int dia;
    private int mes;
    private int año;
    private String compañia;
    //constructor

    public Vuelo(String origen, String destino, double precio, int capacidad, int codigo,int dia,int mes,int año, String compañia) {
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
        this.capacidad = capacidad;
        this.codigo = codigo;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.compañia = compañia;
    }

    //metodo mostrar vuelo

    @Override
    public String toString() {
        return "Vuelo{" + "origen=" + origen + ", destino=" + destino + ", precio=" + precio + ", capacidad=" + capacidad + ", numPasajeros=" + numPasajeros + ", codigo=" + codigo + ", dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + ", compa\u00f1ia=" + compañia + '}';
    }

    
    //metodos get para acceder(leer) a los atributos desde otra clase

    public int getCodigo() {
        return codigo;
    }

    public String getCompañia() {
        return compañia;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }
    public String getDestino() {
        return destino;
    }

    public String getOrigen() {
        return origen;
    }
    

    public double getPrecio() {
        return precio;
    }
    
    //metodos set para acceder(modificar)  los atributos desde otra clase

    public void setNumPasajeros() {
        numPasajeros+=1;
    }

    public void setPrecio(double incremento) {
        precio+=(incremento/100)*precio;
 
    } 
}
