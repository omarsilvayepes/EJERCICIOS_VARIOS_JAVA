/*
 Realizar un programa que simule todas las funcionalidades basicas de un cajero automatico:

0.Informacion del cajero
1.consultar saldo
2.retiro de efectivo
3.deposito de efectivo
4.salir(finalizar operacion)

El programa debe tener:
1.paradigma de POO
2.encapsulamiento
3.herencia
4.polimorfismo
5.abstraccion
 */
package CAJERO_AUTOMATICO;
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
        Scanner entrada=new Scanner(System.in);
        int operacion=0;
        Maquina cajero=new cajeroAutomatico("PARQUE RIONGRO","RIONEGRO","BANCOLOMBIA","1234ABC");
        while(operacion!=4){
            System.out.println("SELECCIONE EL TIPO DE OPERACION:");
            System.out.println("-------------------------------");
            System.out.println("0.INFORMACION DEL CAJERO");
            System.out.println("1.CONSULTAR SALDO");
            System.out.println("2.RETIRO DE EFECTIVO");
            System.out.println("3.DEPOSITIVO DE EFECTIVO");
            System.out.println("4.FINALIZAR OPERACION");
            System.out.println("-------------------------------");
            operacion=entrada.nextInt();

            switch(operacion){
                 case 0:
                     System.out.println(cajero.toString());
                    break;
                case 1:
                    cajero.consultarSaldo();
                    break;
                case 2:
                    cajero.retiroEfectivo();
                    break;
                case 3:
                    cajero.depositoEfectivo();
                    break;
                case 4:
                    System.out.println("!FUE UN PLACER SERVIRTE, HASTA PRONTO¡");
                    break;

                default:
                    System.out.println("OPERACION NO VALIDA");
                    break;
        }
       }
    }
  
}
