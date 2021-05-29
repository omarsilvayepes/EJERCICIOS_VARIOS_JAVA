package AEROPUERTO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @author omary
 */
public class Main {
    static Scanner entrada=new Scanner(System.in);
    static Vuelo v;
    //Crear arreglo dinamico tipo vuelos
     static ArrayList<Vuelo> vuelos=new ArrayList<>();
     //Crear arreglo dinamico tipo pasajero
     static ArrayList<Pasajero> pasajeros=new ArrayList<>();
     //Crear arreglo dinamico tipo string para las compañias
     static  ArrayList<String> compañias=new ArrayList<>();// arreglo de compañias
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("SELECCIONE EL TIPO DE USUARIO:");
        System.out.println("--------------------------------");
        System.out.println("1.ADMINISTRADOR");
        System.out.println("2.CLIENTE");
        System.out.println("--------------------------------");
        int tipoUsuario=entrada.nextInt();
        switch(tipoUsuario){
            case 1:
                menuAdmin();//contraseña para compañia??
                break;
            case 2:
                menuUsuario();
                break;
            default:
                System.out.println("OPCION NO VALIDA");
        }
    }
    public static void menuUsuario(){
        int salir=0;
        while(salir!=1){
        System.out.println("MENU USUARIO:");
        System.out.println("--------------------------------");
        System.out.println("0.COMPRAR VUELO");
        System.out.println("1.LISTA VUELOS DE UNA COMPAÑIA");
        System.out.println("2.LISTA DE COMPAÑIAS DE UN AEROPUERTO");
        System.out.println("3.VUELOS ORIGEN A DESTINO");
        System.out.println("4.VUELO POR FECHA");
        System.out.println("5.DESTINO MAS BARATO");
        System.out.println("6.PRIMER VUELO DISPONIBLE");
        System.out.println("7.CAMBIAR A MENU ADMINISTRADOR");
        System.out.println("8.SALIR");
        System.out.println("--------------------------------");
        int opcion=entrada.nextInt();
        switch(opcion){
            case 0:
                comprarVuelo();
                break;
            case 1:
                vuelosCompañia();
                break;
            case 2:
                compañiasAeropuerto();
                break;
            case 3:
                vuelOrigenDestino();
                break;
            case 4:
                vuelosFecha();
                break;
            case 5:
                destinoBarato();
                break;
            case 6:
                primerLibre();
                break;
            case 7:
                menuAdmin();
                break;
            case 8:
                salir=1;
                break;
            default:
                System.out.println("OPCION NO VALIDA");
        }
        
        }
        
    }
    public static void menuAdmin(){
        int salir=0;
        while(salir!=1){
        System.out.println("MENU ADMINISTRADOR:");
        System.out.println("--------------------------------");
        System.out.println("1.AÑADIR VUELO");
        System.out.println("2.QUITAR VUELO");
        System.out.println("3.VUELOS COMPLETOS");
        System.out.println("4.RECAUDACION DESTINO:");
        System.out.println("5.MAYOR % RECAUDACION POR FECHA:");
        System.out.println("6.INCREMENTO DE VUELOS A PARTIR DE LA FECHA:");
        System.out.println("7.CAMBIAR A MENU USUARIO");
        System.out.println("8.SALIR");
        System.out.println("--------------------------------");
        int opcion=entrada.nextInt();
        switch(opcion){
            case 1:
                crearVuelo();
                break;
            case 2:
                quitarVuelo();
                break;
            case 3:
                vuelosCompletos();
                break;
            case 4:
                recaudacionDestino();
                break;
            case 5:
                mayorRecaudacion();
                break;
            case 6:
                incrementarVuelo();
                break;
            case 7:
                menuUsuario();
                break;
            case 8:
                salir=1;
                break;
            default:
                System.out.println("OPCION NO VALIDA");
        }
        
        }
    }
    public static void crearVuelo(){
        System.out.println("DATOS DEL VUELO:");
        System.out.println("--------------------------------");
        System.out.println("CODIGO:");
        int codigo=entrada.nextInt();
        System.out.println("COMPAÑIA:");
        String compañia=entrada.next();
        System.out.println("CIUDAD DE ORIGEN:");
        String origen=entrada.next();
        System.out.println("CIUDAD DESTINO:");
        String destino=entrada.next();
        System.out.println("PRECIO:");
        double precio=entrada.nextDouble();
        System.out.println("CAPACIDAD:");
        int capacidad=entrada.nextInt();
        System.out.println("DIA:");
        int dia =entrada.nextInt();
        System.out.println("MES:");
        int mes =entrada.nextInt();
        System.out.println("AÑO:");
        int año =entrada.nextInt();
        
        //Crear Vuelo
        Vuelo v=new Vuelo(origen,destino,precio,capacidad,codigo,dia,mes,año,compañia);
        vuelos.add(v);// añadir a el arreglo
        System.out.println("VUELO CREADO EXITOSAMENTE");
        System.out.println("--------------------------------");
}
    public static void quitarVuelo(){
        System.out.println("CODIGO:");
        int codigo=entrada.nextInt();
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getCodigo()==codigo){
                vuelos.remove(i);
                System.err.println("VUELO BORRADO EXITOSAMENTE");
                break;
            }
        }
            
        }
    public static void vuelosCompañia(){
         System.out.println("COMPAÑIA:");
         String compañia=entrada.next();
         for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getCompañia().equals(compañia)){
                System.out.println(vuelos.get(i).toString());
            }
        }
         
    }
    public static void comprarVuelo(){
        System.out.println("DATOS DEL PASAJERO:");
        System.out.println("--------------------------------");
        System.out.println("NOMBRE:");
        String nombre=entrada.next();
        System.out.println("C.C:");
        String cc=entrada.next();
        System.out.println("CODIGO DE VUELO:");
        int codigo=entrada.nextInt();
        
        //Crear Pasajero
        Pasajero p=new Pasajero(nombre,cc);
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getCodigo()==codigo && vuelos.get(i).getCapacidad()>vuelos.get(i).getNumPasajeros()){
              p.setVuelo(vuelos.get(i));// asignar vuelo a pasajero
              pasajeros.add(p);// añadir pasajero a el arreglo
              vuelos.get(i).setNumPasajeros();//aumentar numero pasajeros del vuelo
              
              System.out.println("VUELO COMPRADO EXITOSAMENTE");
              System.out.println("--------------------------------");
              break;
            }
        }   
    }
    public static void vuelosFecha(){
        System.out.println("DIA:");
        int dia =entrada.nextInt();
        System.out.println("MES:");
        int mes =entrada.nextInt();
        System.out.println("AÑO:");
        int año =entrada.nextInt();
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getDia()==dia && vuelos.get(i).getMes()==mes && vuelos.get(i).getAño()==año){
                System.out.println(vuelos.get(i).toString());
            }
        }
    }
    public static void destinoBarato(){
        System.out.println("DESTINO:");
        String destino=entrada.next();
        double precios[]=new double[vuelos.size()];// arreglo para almacenar los precios
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getDestino().equals(destino)){
               precios[i]=vuelos.get(i).getPrecio();
            }
    }
        double precioMenor=precios[0];
        int indiceMenor=0;
        for(int i=1;i<precios.length;i++){
            if(precioMenor>precios[i]){
                precioMenor=precios[i];
                indiceMenor=i;
            }
        }
        System.out.println(vuelos.get(indiceMenor).toString());
        System.out.println("PRECIO:"+precioMenor);
}
    public static void vuelOrigenDestino(){
        System.out.println("ORIGEN:");
        String origen=entrada.next();
        System.out.println("DESTINO:");
        String destino=entrada.next();
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getDestino().equals(destino) && vuelos.get(i).getOrigen().equals(origen)){
               System.out.println(vuelos.get(i).toString());
            }
    }
    }
    public static void vuelosCompletos(){
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getCapacidad()==vuelos.get(i).getNumPasajeros()){
                System.out.println(vuelos.get(i).toString());
            }
    }    
    }
    public static void recaudacionDestino(){
        System.out.println("DESTINO:");
        String destino=entrada.next();
        double recaudacion=0;
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getDestino().equals(destino)){
               recaudacion+=vuelos.get(i).getNumPasajeros()*vuelos.get(i).getPrecio();
            }
    }
        System.out.println("RECAUDACION: "+recaudacion);
    }
    public static void mayorRecaudacion(){
        System.out.println("DIA:");
        int dia =entrada.nextInt();
        System.out.println("MES:");
        int mes =entrada.nextInt();
        System.out.println("AÑO:");
        int año=entrada.nextInt();
        double recaudacion[]=new double[vuelos.size()];// arreglo para almacenar las recaudaciones
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getDia()==dia && vuelos.get(i).getMes()==mes && vuelos.get(i).getAño()==año){
//                double pasajeros=vuelos.get(i).getNumPasajeros();
//                double capacidad=vuelos.get(i).getCapacidad();
//                double recauda=(pasajeros/capacidad)*100;
                recaudacion[i]=((vuelos.get(i).getNumPasajeros())/(vuelos.get(i).getCapacidad()))*100;
                System.out.println(recaudacion[i]);
            }
        }
        double mayorRecaudacion=recaudacion[0];
        int indiceMayor=0;
        for(int i=1;i<recaudacion.length;i++){
            if(mayorRecaudacion<recaudacion[i]){
                mayorRecaudacion=recaudacion[i];
                indiceMayor=i;
            }
        }
        System.out.println(vuelos.get(indiceMayor).toString());
        System.out.println("RECAUDACION:"+mayorRecaudacion+"%");
    }
    public static void compañiasAeropuerto(){
        //crear un aeropuerto
        Aeropuerto a=new Aeropuerto("JOSE MARIA CORDOBA");
        //llenar arreglo compañias
        for(int i=0;i<vuelos.size();i++){
            compañias.add(vuelos.get(i).getCompañia());
    }
        //Eliminar elmentos repetidos del arraylist ,para comparar mayusculas o minusculas usar equalsIgnoreCase
        Set<String> hashSet=new HashSet<>(compañias);
        compañias.clear();
        compañias.addAll(hashSet);
        System.out.println("AEROPUERTO: "+a.getNombre());
        System.out.println("--------------------------");
        System.out.println("COMPAÑIAS:"+compañias); 
    }
    public static void primerLibre(){
        System.out.println("DESTINO:");
        String destino=entrada.next();
        ArrayList<Vuelo> mi_destino=new ArrayList<Vuelo>();
        //llenar arreglo con los vuelos a el destino seleccionado
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getDestino().equals(destino)){
               mi_destino.add(vuelos.get(i)); 
            }      
    }
        //Buscar vuelo de menor año
        int menorAño=mi_destino.get(0).getAño();
        ArrayList<Vuelo> menor_año =new ArrayList<Vuelo>();
        for(int i=1;i<mi_destino.size();i++){
            if(menorAño>mi_destino.get(i).getAño()){ 
                menorAño=mi_destino.get(i).getAño();
            } 
        }
        //Guardar vuelos con menor año
        for(int i=0;i<mi_destino.size();i++){
            if(mi_destino.get(i).getAño()==menorAño){
                menor_año.add(mi_destino.get(i));
            }
        } 
       //Buscar vuelo de menor mes 
        ArrayList<Vuelo> menor_mes =new ArrayList<Vuelo>();
        int menormes=menor_año.get(0).getMes();
        for(int i=1;i<menor_año.size();i++){
            if(menormes>menor_año.get(i).getMes()){ 
                menormes=menor_año.get(i).getMes();
            } 
        }
        //Guardar vuelos con menor mes
        for(int i=0;i<menor_año.size();i++){
            if(menor_año.get(i).getMes()==menormes){
                menor_mes.add(menor_año.get(i));
            }  
        } 
        
        //Buscar vuelo de menor dia
        ArrayList<Vuelo> menor_dia =new ArrayList<Vuelo>();
        int menordia=menor_mes.get(0).getDia();
        for(int i=1;i<menor_mes.size();i++){
            if(menordia>menor_mes.get(i).getDia()){ 
                menordia=menor_mes.get(i).getDia();
            } 
        }
        //Guardar vuelos con menor mes
        for(int i=0;i<menor_mes.size();i++){
            if(menor_mes.get(i).getDia()==menordia){
                menor_dia.add(menor_mes.get(i));
            }  
        } 
        
        System.out.println("PRIMEROS VUELOS:"+menor_dia);
    }
    public static void incrementarVuelo(){
        System.out.println("DIA:");
        int dia =entrada.nextInt();
        System.out.println("MES:");
        int mes =entrada.nextInt();
        System.out.println("AÑO:");
        int año=entrada.nextInt();
        System.out.println("% INCREMEMENTO:");
        double incremento=entrada.nextDouble();
        for(int i=0;i<vuelos.size();i++){
            if(vuelos.get(i).getDia()>=dia || vuelos.get(i).getMes()>mes || vuelos.get(i).getAño()>año){
                vuelos.get(i).setPrecio(incremento);
            }
        }  
    }
}