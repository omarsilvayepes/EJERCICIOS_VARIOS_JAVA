package EJERCICIO_7;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author omary
 */
public class Main {
    
    // Crear arreglo dinamico de tipo Poligono(No necesita definirse el tamañano)
    
    //ArrayList<Tipo_De_clase> nombre_arreglo=new ArrayList<>(); estatico es para ser usado de manera global en la clase
    static ArrayList<Poligono> mispoligono=new ArrayList<>();
    static Scanner   entrada=new Scanner(System.in);
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //LLENAR ARREGLO DE POLIGONOS
        llenarPoligono();
        
        //RECORRER ARREGLO DE POLIGONOS y mostrar datos y area
        mostrarResultados();
    }
    
    public static void llenarPoligono(){ // metodo se define ESTATICO para que le pertenezca a la clase y fuera del main para no sobrecargarlo
       
       int opcion2=1;
       while(opcion2==1){
            System.out.println("CUAL TIPO DE FIGURA DESEA CONSTRUIR: ");
            System.out.println("--------------------------------------");
            System.out.println("1.RECTANGULO");
            System.out.println("2.TRIANGULO");
            System.out.println("--------------------------------------");
            int opcion1=entrada.nextInt();

             switch (opcion1) {
             
                 case 1:
                     construirRectangulo();
                     break;
             
                 case 2:
                     construirTriangulo();
                     break;
                 default:
                     System.out.println("OPCION NO VALIDO");
                     break;
        }
           System.out.println("DESEA CONSTRUIR UNA NUEVA FIGURA : ");
           System.out.println("--------------------------------------");
           System.out.println("1.SI");
           System.out.println("2.NO");
           System.out.println("--------------------------------------");
           opcion2=entrada.nextInt();
       }
    } 
    
    public static void construirRectangulo(){
        System.out.println("INGRESE LONGITUD LADO 1 : ");
        double lado1=entrada.nextDouble();
        System.out.println("INGRESE LONGITUD LADO 2 : ");
        double lado2=entrada.nextDouble();
        
        Poligono rectangulo=new Rectangulo(lado1,lado2); //Construir rectangulo usando polimorfismo
        mispoligono.add(rectangulo);//Añadir a el arreglo dinamico de poligonos
    }
    
    public static void construirTriangulo(){
        System.out.println("INGRESE LONGITUD LADO 1 : ");
        double lado1=entrada.nextDouble();
        System.out.println("INGRESE LONGITUD LADO 2 : ");
        double lado2=entrada.nextDouble();
        System.out.println("INGRESE LONGITUD LADO 3 : ");
        double lado3=entrada.nextDouble();
        
        Poligono triangulo=new Triangulo(lado1,lado2,lado3); //Construir triangulo usando polimorfismo
        mispoligono.add(triangulo);//Añadir a el arreglo dinamico de poligonos
        
    }
    
    public static void mostrarResultados(){
        //recorrer arreglo de poligonos->tipo de arreglo resultados:nombre arreglo a recorrer
        
        for(Poligono resultados:mispoligono ){
            System.out.println(resultados.toString());//Mostrar datos
            System.out.println("EL AREA ES:"+resultados.area());
            System.out.println("--------------***---------------");
        }
    }
}
