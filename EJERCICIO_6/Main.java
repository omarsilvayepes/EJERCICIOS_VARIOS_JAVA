/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO_6;

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
        
        int operacion;
       
        //Ingreso numeros Complejos
        
        float a1=Float.parseFloat(JOptionPane.showInputDialog("INGRESE PARTE ENTERA NUMERO 1"));
        float b1=Float.parseFloat(JOptionPane.showInputDialog("INGRESE PARTE IMAGINARIA NUMERO 1"));
        float a2=Float.parseFloat(JOptionPane.showInputDialog("INGRESE PARTE ENTERA NUMERO 2"));
        float b2=Float.parseFloat(JOptionPane.showInputDialog("INGRESE PARTE IMAGINARIA NUMERO 2"));
        
        
        //Seleccionar el tipo de operacion
        int continuar=1;
        while(continuar==1){
            operacion=Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE OPERACION: 1->SUMAR 2->MULTIPLICAR 3->COMPARAR 4->MULTIXENTERO"));
     
            //Crear objetos para dos complejos
        
            Complejo c1=new Complejo(a1,a2,b1,b2);

            switch(operacion){

                    case 1 -> {

                         JOptionPane.showInternalMessageDialog(null,"LA SUMA ES:"+c1.Sumar());
                    }

                    case 2 -> {
                          JOptionPane.showMessageDialog(null,"LA MULTIPLICACION  ES:"+c1.Multiplicar());  
                    }
                    case 3 -> {
                        //boolean iguales=c1.Comparar();
                        if(c1.Comparar()==true){
                            JOptionPane.showMessageDialog(null,"LOS NUMEROS SON IGUALES");
                        }
                        else
                          JOptionPane.showMessageDialog(null,"LOS NUMEROS NO SON IGUALES");
                    }
                    case 4 -> {
                          int entero=Integer.parseInt(JOptionPane.showInputDialog("INGRESE NUMERO ENTERO"));

                          JOptionPane.showMessageDialog(null,"LA MULTIPLICACION POR EL ENTERO ES:"+c1.Complejo_x_entero(entero));
                    }
                    default -> JOptionPane.showMessageDialog(null,"OPERACION NO VALIDA");

            }
            
            continuar=Integer.parseInt(JOptionPane.showInputDialog("DESEA CONTINUAR: 1->SI 2->NO "));

            }
            

    }
    
}
