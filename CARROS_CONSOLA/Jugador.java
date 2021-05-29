package CARROS_CONSOLA;
/**
 *
 * @author omary
 */
public class Jugador {
   //Atributos 
   String id;
   Carro carros;
   Pista pista;
   int vecesPrimero=0;
   int vecesSegundo=0;
   int vecesTercero=0;
   boolean podio=false;
   
   //Constructor
    public Jugador(String id, Carro carros, Pista pista) {
        this.id = id;
        this.carros = carros;
        this.pista = pista;
    }
    //metodo lanzar dados
    public int lanzarDados(){
        int avance=((int)(Math.random()*6+1))*100; 
        return avance;
    }   
   //Contador de podio
    
    public void contadorResultados(String id){
        System.out.println(id);
        System.out.println("VECES PRIMERO: "+vecesPrimero);
        System.out.println("VECES SEGUNDO: "+vecesSegundo);
        System.out.println("VECES TERCERO: "+vecesTercero);
        
    }
}
