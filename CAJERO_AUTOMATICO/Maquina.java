package CAJERO_AUTOMATICO;
/**
 *
 * @author omary
 */
public abstract class Maquina {
    //atributos
    protected String serial;
    
    
    //constructor
    public Maquina(String serial) {
        this.serial = serial;
    }

    //Metodos abstractos
    public abstract void consultarSaldo();
    public abstract void retiroEfectivo();
    public abstract void depositoEfectivo();

}
