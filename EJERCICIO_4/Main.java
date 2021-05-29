package EJERCICIO_4;

import EJERCICIO_3.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author omary
 */
public class Main {
    
    public static int tiempoMenor(Atleta corredores[]){
        int indice=0;
        Float tiempoMenor=corredores[0].getTiempo();
        for(int i=1;i<corredores.length;i++){
            if(corredores[i].getTiempo()<tiempoMenor){
                indice=i;
                tiempoMenor=corredores[i].getTiempo();
            }
        }
        return indice;
           
       }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       int cantidad_atletas;
       
       cantidad_atletas=Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE CORREDORES:"));
       
       // Crear arreglo de tipo atletas
       
       Atleta corredores[]=new Atleta[cantidad_atletas];
       
       for(int i=0;i<cantidad_atletas;i++){
           JOptionPane.showInternalMessageDialog(null,"INGRESE DATOS CORREDOR:"+(i+1));
           String nombre=(JOptionPane.showInputDialog("INGRESE NOMBRE:"));
           int id=Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ID:"));
           float tiempo=Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL TIEMPO:"));
           
           // llenar arreglo con los atletas
           
           corredores[i]=new Atleta(id,nombre,tiempo);
       }
       
       // invoca el metodo menor tiempo.
       
       int indice=tiempoMenor(corredores);
        
       //Mostrar resultados a el usuario
       
       JOptionPane.showInternalMessageDialog(null,"El MEJOR CORREDOR FUE:"+corredores[indice].mostrarDatos());
       
    }
    
}
