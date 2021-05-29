package CINE;
/**
 *
 * @author omary
 */
public class Asiento {
      // atributos
      Espectador puestos[][]=new Espectador[2][3]; // arreglo tipo espectadores de 8 filas x 9 columnas
      private boolean sala_llena;
      private int contador_puestos;
      private  int numero_puestos=6;
      private int puestos_disponibles=6;
      
    public void sentarEspectadores(Espectador espectador){
        boolean persona_sentada=false;
        System.out.println("-------------------------------------------");
        System.out.println("UBICANDO ESPECTADOR:"+espectador.getNombre());
        System.out.println("EDAD MINIMA PERMITIDA:"+espectador.getPelicula().getEdad_minima());
        System.out.println("PRECIO INGRESO:"+espectador.getCine().getPrecio_entrada());
        System.out.println("-------------------------------------------");
        if(espectador.getEdad()>espectador.getPelicula().getEdad_minima() && espectador.getEfectivo()> espectador.getCine().getPrecio_entrada() && sala_llena==false ){
            for(int i=0;i<puestos.length;i++){ //puestos.length=longitud filas
                for(int j=0;j<puestos[i].length;j++){ //puestos[i].length=longitud fija de  columnas
                    if(puestos[i][j]==null){//puesto vacio
                        puestos[i][j]=espectador;
                        puestos_disponibles-=1;
                        System.out.println("PUESTOS DISPONIBLES:"+puestos_disponibles);
                        System.out.println("PERSONA SENTADA EN:");
                        System.out.println("FILA:"+(i+1));
                        
                        String asiento="";
                        switch(j){
                            case 0:
                                System.out.println("COLUMNA:"+'A');
                                asiento=(i+1)+"A";
                                break;
                            case 1:
                                System.out.println("COLUMNA:"+'B');
                                asiento=(i+1)+"B";
                                break;
                            case 2:
                                System.out.println("COLUMNA:"+'C');
                                asiento=(i+1)+"C";
                                break;
                            case 3:
                                System.out.println("COLUMNA:"+'D');
                                asiento=(i+1)+"D";
                                break;
                            case 4:
                                System.out.println("COLUMNA:"+'E');
                                asiento=(i+1)+"E";
                                break;
                            case 5:
                                System.out.println("COLUMNA:"+'F');
                                asiento=(i+1)+"F";
                                break;
                            case 6:
                                System.out.println("COLUMNA:"+'G');
                                asiento=(i+1)+"G";
                                break;
                            case 7:
                                System.out.println("COLUMNA:"+'H');
                                asiento=(i+1)+"H";
                                break;
                            case 8:
                                System.out.println("COLUMNA:"+'I');
                                asiento=(i+1)+"I";
                                break;
                        }
                        espectador.setAsiento(asiento);//asignar asiento a espectador
                        contarPuestos();
                        persona_sentada=true;
                        break;
                    }
                }
                if(persona_sentada==true){
                   break; 
                } 
            }
        }
        else{
            System.out.println("PERSONA NO PUEDE INGRESAR A LA SALA");
            System.out.println("-----------------------------------");
        }
    }
    public void contarPuestos(){
          contador_puestos=0;
          for(int k=0;k<puestos.length;k++){
                for(int m=0;m<puestos[k].length;m++){
                    if(puestos[k][m]!=null){//puesto lleno
                        contador_puestos+=1;
                    } 
                } 
            }
          salaFull();
    }
     public void salaFull(){
          if(contador_puestos==numero_puestos){
              sala_llena=true;
              System.out.println("----------------------------------");
              System.out.println("SALA ESTA LLENA NO PUDE INGRESAR");
              System.out.println("----------------------------------");
          }
        }
     public void mostrarEspectadores(){
          System.out.println("---------MOSTRAR SALA-------------");
          for(int i=0;i<puestos.length;i++){ 
                for(int j=0;j<puestos[i].length;j++){
                    if(puestos[i][j]!=null){
                        System.out.println("NOMBRE: "+puestos[i][j].getNombre());
                        System.out.println("UBICACION: "+puestos[i][j].getAsiento());
                        System.out.println("----------------------------------");
                        
                    }
                    
          }
        }
     }
}
