package EJERCICIO_1;

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
        float lado1=Float.parseFloat(JOptionPane.showInputDialog("INGRESE LADO 1:"));
        float lado2=Float.parseFloat(JOptionPane.showInputDialog("INGRESE LADO 2:"));
        Cuadrilatero c1;
        if(lado1==lado2){
           c1=new Cuadrilatero(lado1);
        }else{
           c1=new Cuadrilatero(lado1,lado2);
        }
       
        System.out.println("El area es:"+c1.getArea());
        System.out.println("El perimetro es:"+c1.getPerimetro());
        
    }
    
}
