/*
Ejercicio 5: Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los
atributos necesarios que se requieren, proporcione métodos de consulta, un método constructor
e implemente métodos para calcular el perímetro y el área de un triángulo, además implementar
un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.
 */
package EJERCICIO_5;

import java.util.Scanner;

/**
 *
 * @author omary
 */
public class Main {
    
    
    public static double mayorArea(Triangulo_Isosceles triangulos[]){
        double areaMayor;
        areaMayor=triangulos[0].getArea(); // obtener el area del primer triangulo
        
        for(int i=1;i<triangulos.length;i++){
            if(triangulos[i].getArea()>areaMayor){
                areaMayor=triangulos[i].getArea();
                
            }
        }
   
        return areaMayor;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad_triangulos;
        
        //Numero de triangulos
        Scanner entrada =new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE TRIANGULOS A CONSTRUIR:");
        cantidad_triangulos=entrada.nextInt();
        
        //Construir arreglo de tipo triangulo
        
        Triangulo_Isosceles triangulos[]=new Triangulo_Isosceles[cantidad_triangulos];
        
        for(int i=0;i<cantidad_triangulos;i++){
            entrada.nextLine();
            System.out.println("TRIANGULO:"+(i+1));
            System.out.println("INGRESE EL LADO DEL TRIANGULO:");
            double lado=entrada.nextDouble();
            System.out.println("INGRESE LA BASE DEL TRIANGULO:");
            double base=entrada.nextDouble();
            
            // Construir triangulos y llenar el arreglo
            
            triangulos[i]=new Triangulo_Isosceles(lado,base);
            
            //Mostrar area y perimetro
            
            System.out.println("EL PERIMETRO ES:"+triangulos[i].getPerimetro());
            System.out.println("EL AREA ES:"+triangulos[i].getArea());
 
        }
        
       
        //Mostrar informacion a el usuario
        
        System.out.println("EL TRIANGULO DE AREA MAYOR ES:"+mayorArea(triangulos));
           
    }
    
}
