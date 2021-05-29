package EJERCICIO_2;

import javax.swing.JOptionPane;

/**
 *
 * @author omary
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String movimiento;
        int posicion_actualx;
        int posicion_actualy;
        String mover="si";
       
        
       Tablero t1=new Tablero(0,0); //  instanciar tablero e Inicializar posicion del objecto en (0,0)
        
        while(mover.equals("si") || mover.equals("SI") ){
  
            movimiento=JOptionPane.showInputDialog("INGRESE EL MOVIMIENTO:");

            posicion_actualx=t1.getPoscion_x();
            posicion_actualy=t1.getPosicion_y();


            switch(movimiento){
                case "derecha" -> {
                    JOptionPane.showInternalMessageDialog(null, "MOVISTE HACIA:"+movimiento);
                    t1.setPoscion_x(posicion_actualx+1);
                }
                case "izquierda" -> {
                    JOptionPane.showInternalMessageDialog(null, "MOVISTE HACIA:"+movimiento);
                    t1.setPoscion_x(posicion_actualx-1);
                }
                case "arriba" -> {
                    JOptionPane.showInternalMessageDialog(null, "MOVISTE HACIA:"+movimiento);
                    t1.setPosicion_y(posicion_actualy+1);
                }
                case "abajo" -> {
                    JOptionPane.showInternalMessageDialog(null, "MOVISTE HACIA:"+movimiento);
                    t1.setPosicion_y(posicion_actualy-1);
                }
                default -> JOptionPane.showInternalMessageDialog(null, "MOVIMIENTO NO VALIDO");
            }


            JOptionPane.showInternalMessageDialog(null, "POSICION EN X:"+t1.getPoscion_x());
            JOptionPane.showInternalMessageDialog(null, "POSICION EN Y:"+ t1.getPosicion_y());


            //Volver a mover
              mover=JOptionPane.showInputDialog("DESEA VOLVER A MOVER/SI/NO:");
        
    }
        
       
    }
    
}
