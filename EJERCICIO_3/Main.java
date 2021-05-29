/*
Ejercicio 3: Construir un programa que dada una serie de vehículos caracterizados por su marca,
modelo y precio, imprima las propiedades del vehículo más barato. Para ello, se deberán leer por
teclado las características de cada vehículo y crear una clase que represente a cada uno de ellos.
 */
package EJERCICIO_3;

import java.util.Scanner;

/**
 *
 * @author omary
 */
public class Main {
    
    public static int vehiculoBarato(Vehiculo vehiculos[]){
           int indice=0;
           float precioMenor;
       
           precioMenor=vehiculos[0].getPrecio(); //Obtener el precio del primer vehiculo
        
           for(int i=1;i<vehiculos.length;i++){
               if(vehiculos[i].getPrecio()<precioMenor){
                   indice=i;
                   precioMenor=vehiculos[i].getPrecio();
               }
           }
           
           return indice;
       }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad_vehiculos;
        
        //cantidad de vehiculos
        Scanner entrada=new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE VEHICULOS:");
        cantidad_vehiculos=entrada.nextInt();
        
        //Crear  arreglo de vehiculos. // arreglo de enteros int Nombre_arreglo[]=new int[tamaño_Arreglo]
        
        Vehiculo vehiculos[]=new Vehiculo[cantidad_vehiculos];
        
        for(int i=0;i<cantidad_vehiculos;i++){
             entrada.nextLine();
             System.out.println("VEHICULO:"+(i+1));
             System.out.println("INGRESE LA MARCA:");
             String marca=entrada.nextLine();
             System.out.println("INGRESE EL MODELO:");
             String modelo=entrada.nextLine();
             System.out.println("INGRESE EL PRECIO:");
             float  precio=entrada.nextFloat();
             
             // crear vihiculos y asignarlos a el arreglo
             vehiculos[i]=new Vehiculo(marca,modelo,precio);
 
    }
        
       
        int indice=vehiculoBarato(vehiculos); // Guardar el indice que retorna la clase viculoBarato
        
        //Mostrar el resultado a el usuario
        
        System.out.println("EL VEHICULO CON PRECIO MAS BARATO ES: "+vehiculos[indice].mostrarDatos());
        
        
        
}
}