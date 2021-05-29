package CARROS_CONSOLA;
import java.util.Scanner;
/**
 *
 * @author omary
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //cantidad de Jugadores y distancia pista
        Scanner entrada=new Scanner(System.in);
        System.out.println("INGRESE LA CANTIDAD DE JUGADORES:");
        int cantidadJugadores=entrada.nextInt();
         while(cantidadJugadores<3){
             System.out.println("<<<La CANTIDAD MINIMA DE JUGADORES ES DE 3>>>");
             System.out.println("INGRESE LA CANTIDAD DE JUGADORES:");
             cantidadJugadores=entrada.nextInt();
        }
        System.out.println("INGRESE LA DISTANCIA DE LA PISTA EN KM:");
        int distanciaPista=(entrada.nextInt())*1000;// conversion a metros
  
        // Construir arreglo de pistas
        Pista carriles[]=new Pista[cantidadJugadores];
        
        // Construir arreglo de Carros
        Carro carros[]=new Carro[cantidadJugadores];
        
        //Construir arreglo de tipo jugador
        
        Jugador conductores[]=new Jugador[cantidadJugadores];
   
       // contruir arreglo tipo String para ganadores
        String ganadores[]=new String[3];
        
        // construir podio 
        Podio podio=new Podio();
   
        //Crear partida -NO LA USE
        //Juego partida=new Juego(i+1,conductores[i]);
      
        // llenar el arreglo con jugadores [j1,j2,j3...]
        
        for(int i=0;i<cantidadJugadores;i++){
            
            carriles[i]=new Pista(cantidadJugadores,distanciaPista);// construir pistas
            
            carros[i]=new Carro(carriles[i]);// construir carros 
      
            String id="Jugador"+(i+1);
            conductores[i]=new Jugador(id,carros[i],carriles[i]); //Construir jugadores
            //CONDUCTORES->CARROS->CARRILES EL PADRE CONDUCTOR TIENE UN HIJO CARRO ,EL CARRO TIENE UN HIJO CARRILES
        }
        
        // Iniciar juego
        int jugar=1;
        int carrera=1;
        while(jugar==1){
            System.out.println("<<<CARRERA NUMERO: "+carrera);
            for(int i=0;i<conductores.length;i++){
                boolean meta=conductores[i].carros.llegoMeta(distanciaPista);
                
                if(meta==false){
                int avance=conductores[i].lanzarDados();
                conductores[i].carros.aumentarDistancia(avance,i+1);

                }else{
                    System.out.println("<<<llego a al meta jugador"+(i+1));
                    if((ganadores[0]==null|| ganadores[1]==null || ganadores[2]==null) && (conductores[i].podio==false)){
                        if(ganadores[0]!=null && ganadores[1]!=null){
                            //tercer puesto
                            ganadores[2]=conductores[i].id;
                            conductores[i].vecesTercero+=1;
                           
                        }
                        else if(ganadores[0]!=null){
                            //segundo puesto
                              ganadores[1]=conductores[i].id;
                              conductores[i].vecesSegundo+=1;
                        }else{
                            // primer puesto
                            ganadores[0]=conductores[i].id;
                            conductores[i].vecesPrimero+=1;
                        }
                        
                         conductores[i].podio=true;
                    }

                    //terminar carrea
                    
                    if(ganadores[0]!=null&& ganadores[1]!=null && ganadores[2]!=null){//podio full
                        //Motrar Podio
                        podio.mostrarPodio(ganadores);
                        
                        //Mostrar resultado de todas las carreras
                        for(int k=0;k<conductores.length;k++){
                            conductores[k].contadorResultados(conductores[k].id);   
                        }
                        //Iniciar otra cerrera
                        System.out.println("DESEA INICIAR OTRA CARRERA SI->1 N0->2:");
                        jugar=entrada.nextInt();
                        
                        //Inicializar Partida
                        
                        if(jugar==1){
                            carrera+=1;
                            ganadores[0]=null;
                            ganadores[1]=null;
                            ganadores[2]=null;
                            for(int j=0;j<conductores.length;j++){
                                conductores[j].carros.distanciaRecorrida=0;
                                conductores[j].podio=false;                                
                            }
                        }
                        else{
                            System.out.println("<<<JUEGO TERMINADO>>>");
                        }
                        break;
                    }
                    
                    }
       
            }
 
        }
    } 
}

