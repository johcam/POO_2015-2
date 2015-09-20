//Hecho por Gabriel Martínez, edición por Johan Herrera
import java.util.Scanner;
        
public class ATM {
    
    public static void main(String[] args){
    int numero=0;
    String B;
    int larg;
    Scanner p=new Scanner(System.in);
    char ver;
    boolean mal_monto=true;
    inicio:
    while(mal_monto){        
        boolean check=true;
        while (check){
            System.out.println("Ingrese el monto de dinero multiplo de 50: ");
            B=p.nextLine();
            larg=B.length();
            if (larg>=11){
                System.out.println("Su monto integrado no es válido, intente nuevamente");
                continue inicio;
            }
            int D=1;
            int E=0;
            for (int C=0; larg!=C;C++) {
                ver=B.substring(D-1,D).charAt(0);
                if(Character.isDigit(ver)==false){                
                    E=1;
                }
                D++;
            }
            if (E==1){
                System.out.println("Su monto integrado no es válido, intente nuevamente");                    
            }else{
                check=false;
                numero=Integer.parseInt(B);
            }
        }
        if(numero%50==0){
            mal_monto=false;
        }else{
            System.out.println("Su monto integrado no es válido, intente nuevamente");
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
