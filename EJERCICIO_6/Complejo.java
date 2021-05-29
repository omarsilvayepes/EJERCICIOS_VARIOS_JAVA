/*
Ejercicio 6: Construir un programa para trabajar con 2 números complejos, implemente el siguiente menú:
1. Sumar dos números complejos
2. Multiplicar 2 números complejos
3. Comparar 2 números complejos (iguales o no)
4. Multiplicar un número complejos por un entero
 */
package EJERCICIO_6;

/**
 *
 * @author omary
 */
public class Complejo {
    
    //Atributos
    private float a1;
    private float a2;
    private float b1;
    private float b2;
 
    //Constructor de 2 complejos

    public Complejo(float a1, float a2, float b1, float b2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }

    public String Sumar(){
        float sumarEntera=a1+a2;
        float sumarImaginaria=b1+b2;
        String resultado=sumarEntera+" + "+sumarImaginaria+"j";
        return resultado;
        
    }
    public String Multiplicar(){
        float multiEntera=a1*a2-b1*b2;
        float multiImaginaria=a1*b2+a2*b1;
        String resultado=multiEntera+" + "+multiImaginaria+"j";
        return resultado;
    }
    public boolean Comparar(){
        boolean igual=false;
        if(a1==a2 && b1==b2){
             igual=true;
        }
        return igual;
    }

     public String Complejo_x_entero(int entero){
        float multiEnt=a1*entero;
        float multiCompleja=b1*entero;
        String resultado=multiEnt+" + "+multiCompleja+"j";
        return resultado;
        
    }
    

    
}
