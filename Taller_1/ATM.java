//Hecho por Gabriel Martínez
import java.util.Scanner;
        
public class ATM {
    
    public static void main(String[] args){
    int numero=0;
    Scanner p=new Scanner(System.in);
    boolean mal_monto=true;
    while(mal_monto){
        System.out.println("Ingrese el monto de dinero multiplo de 50");
        numero=p.nextInt();
        if(numero%50==0){
            mal_monto=false;
                    }
    }
    NewClass maquina=new NewClass(numero);
    System.out.println("Cantidad de billetes de 50.000 son: "+maquina.billetes_50000());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de billetes de 20.000 son: "+maquina.billetes_20000());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de billetes de 10.000 son: "+maquina.billetes_10000());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de billetes de 5.000 son: "+maquina.billetes_5000());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de billetes de 2.000 son: "+maquina.billetes_2000());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de billetes de 1.000 son: "+maquina.billetes_1000());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de monedas de 500 son: "+maquina.monedas_500());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de monedas de 200: "+maquina.monedas_200());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de monedas de 100: "+maquina.monedas_100());
    numero=maquina.nuevo_dinero();
    maquina=new NewClass(numero);
    System.out.println("Cantidad de monedas de 50: "+maquina.monedas_50());
    }
}
