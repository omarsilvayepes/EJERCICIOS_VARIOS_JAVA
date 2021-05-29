package CAJERO_AUTOMATICO;
import java.util.Scanner;
/**
 *
 * @author omary
 */
public class cajeroAutomatico extends Maquina{
    //atributos propios
    Scanner entrada=new Scanner(System.in);
    private String sucursal;
    private String ciudad;
    private String banco;
    private float saldo;
    //constructor

    public cajeroAutomatico(String sucursal, String ciudad, String banco, String serial) {
        super(serial);
        this.sucursal = sucursal;
        this.ciudad = ciudad;
        this.banco = banco;
    }
    
    //metodo mostrarDatos cajero

    @Override
    public String toString() {
        return "cajeroAutomatico{" +"SERIAL: "+super.serial +"  "+ "sucursal=" + sucursal + ", ciudad=" + ciudad + ", banco=" + banco + '}';
    }
    
    //implementar metodos abtractos del padre
    
    @Override
    public void consultarSaldo(){
        System.out.println("SU SALDO ACTUAL ES:"+saldo+" PESOS");
    }
    
    @Override
    public void retiroEfectivo(){
        
        System.out.println("CUANTO DINERO DESEA RETIRAR:");
        float retiro=entrada.nextFloat();
        if(saldo-retiro>=10000){
            saldo-=retiro;
            System.out.println("RETIRO REALIZADO CON EXITO POR VALOR DE:"+retiro);
            consultarSaldo();
        }else{
            System.out.println("FONDOS INSUFICIENTES EN LA CUENTA");
        }
    }
    
    @Override
    public void depositoEfectivo(){
        System.out.println("CUANTO DINERO DESEA DEPOSITAR:");
        float deposito=entrada.nextFloat();
        if(deposito>0){
            saldo+=deposito;
            System.out.println("DEPOSITO REALIZADO CON EXITO");
            consultarSaldo();
        }else{
            System.out.println("EL MONTO A DEPOSITAR DEBE SER MAYOR A CERO");
            
        }
    }
    
}
