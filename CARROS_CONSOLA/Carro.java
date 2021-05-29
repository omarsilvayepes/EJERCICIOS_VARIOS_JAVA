package CARROS_CONSOLA;
/**
 *
 * @author omary
 */
public class Carro {
    Pista pista;
    int distanciaRecorrida=0;
    boolean meta;

    public Carro(Pista pista) {
        this.pista = pista;
    }
 
    // incrementar la distancia recorrida 
    public void aumentarDistancia(int avance,int id){
        distanciaRecorrida+=avance;
        System.out.println("DISTANCIA RECORRIDA DEL JUGADOR"+id+" ES: "+distanciaRecorrida);
    }
    
    //determinar si carro llego a la meta
    
    public boolean llegoMeta(int distancia){
        
      if(distanciaRecorrida>=distancia){
          meta=true;
      }  
      else{
          meta=false;
      }
        return meta;
    }
}
