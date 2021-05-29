/*
Crear un programa para simular un equipo de futbol,(futbolista,entrenador,doctor),para lo cual tendremos
lo siguiente:

-una super clase persona que tendra los siguinetes datos:nombre,apellido,edad.
-la subclase futbolista tendra los siguientes datos:dorsal y posicion
-la sublcase entrenador tendra la estrategia que utiliza
-la subclase doctor, la titulacuon y los años de experiencia
hacer un menu donde se tengan las siguientes opciones:
1. crear futbolista
2.crear un entreanador
3.crear un doctor

Al final mostrar los datos de las personas creadas.
 */
package EJERCICIO_8;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author omary
 */
public class Main {
     static Scanner   entrada=new Scanner(System.in);
     
     //Crear arreglo dinamico tipo persona
     static ArrayList<Persona> mispersonas=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear personas 
        crearPersonas();
        
        //Mostar personas
        mostrarPersonas();
    }
    
    public static void crearPersonas(){
        int opcion2=1;
        while(opcion2==1){
            System.out.println("SELECCIONE EL PERFIL DE LA PERSONA: ");
            System.out.println("--------------------------------------");
            System.out.println("1.FUTBOLISTA");
            System.out.println("2.ENTRENADOR");
            System.out.println("3.DOCTOR");
            System.out.println("--------------------------------------");
            int perfil=entrada.nextInt();
            switch(perfil){
                case 1:
                    Persona jugador=new Futbolista(10,"DELANTERO","LIONEL","MESSI",30);
                    mispersonas.add(jugador);
                    break;
                case 2:
                    Persona profesor=new Entrenador("4-2-3","PEP","GUARDIOLA",45);
                    mispersonas.add(profesor);
                    break;
                case 3:
                    Persona galeno=new Doctor("ORTOPEDISTA",25,"RAFAEL","LLINAS",50);
                    mispersonas.add(galeno);
                    break;
                default:
                    System.out.println("SELECCION NO VALIDA");
                    break;
            }

            System.out.println("DESEA INGRESAR OTRO PERSONA: ");
            System.out.println("--------------------------------------");
            System.out.println("1.SI");
            System.out.println("CUALQUIER OTRO DIGITO.NO");
            System.out.println("--------------------------------------");
            opcion2=entrada.nextInt();    
        }
    }
    
    public static void mostrarPersonas(){
        for(Persona integrantes:mispersonas){
            System.out.println(integrantes.toString());
        }
    }
    
}
