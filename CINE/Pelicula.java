package CINE;
/**
 *
 * @author omary
 */
public class Pelicula {
    //atributos
    private String titulo;
    private float duracion;
    private int edad_minima;
    private float precio_entrada=8000;
    private String director;
    //arreglo de cartelera de tipo peliculas
    Pelicula cartelera[]=new Pelicula[4];
    //constructor

    public Pelicula(String titulo, float duracion, int edad_minima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edad_minima = edad_minima;
        this.director = director;
    }
    
    public void generarCartelera(){
        cartelera[0]=new Pelicula("TOM AND JERRY",1.8f,7,"TIM STORY");
        cartelera[1]=new Pelicula("godzilla",2,12,"Michael Dougherty");
        cartelera[2]=new Pelicula("CHIPIPATOS",1.5F,12,"DAGO GARCIA");
        cartelera[3]=new Pelicula("GOLPE BAJO",1.6F,12,"PETER SEGAL");
    }
    public Pelicula seleccionarPelicula(){
        int aleatorio=((int)(Math.random()*4));// Esto da valores de 0 a 4, excluido el 4
        //int aleatorio=((int)(Math.random()*4+1));// Esto da valores de 1 a 4, excluido el 4
        for(int i=0;i<4;i++){
            if(i==aleatorio){
               System.out.println("-------------------------------");
               System.err.println("BIENVENIDOS A CINEMAS PROCINAL");
               System.out.println("-------------------------------");
               System.out.println("PELICULA DISPONIBLE: ");
               System.out.println("TITULO:"+cartelera[aleatorio].titulo);
               System.out.println("DURACION:"+cartelera[aleatorio].duracion+" HORAS");
               System.out.println("EDAD MINIMA:"+cartelera[aleatorio].edad_minima+" años");
               System.out.println("DIRECTOR:"+cartelera[aleatorio].director);
               System.out.println("PRECIO: "+precio_entrada);
               System.out.println("-------------------------------");
               
               break;
            }

        }
        return cartelera[aleatorio];
    } 

    public int getEdad_minima() {
        return edad_minima;
    }
    
}
