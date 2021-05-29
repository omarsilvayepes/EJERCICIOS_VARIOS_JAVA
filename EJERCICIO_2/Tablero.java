/*
 Ejercicio 2: Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero
y actualice su posición dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del
objeto dentro del tablero.
 */
package EJERCICIO_2;

/**
 *
 * @author omary
 */
public class Tablero {
    
    private int poscion_x;
    private int posicion_y;
    
    //Metodo constructor.

    public Tablero(int poscion_x, int posicion_y) {
        this.poscion_x = poscion_x;
        this.posicion_y = posicion_y;
    }
    
    //Metodos get para obeter la posicion actual del objeto

    public int getPoscion_x() {
        
        return poscion_x;
    }

    public int getPosicion_y() {
        return posicion_y;
    }
    
     //Metodos set para registar la posicion actual del objeto

    public void setPoscion_x(int poscion_x) {
        this.poscion_x = poscion_x;
    }

    public void setPosicion_y(int posicion_y) {
        this.posicion_y = posicion_y;
    }
    
    

}
