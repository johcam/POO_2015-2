import java.util.Scanner;

public class Aerolinea {

    public static void main(String[] args) {
       comercial Avion_1=new comercial(150,0);
       comercial Avion_2=new comercial(190,0);
       comercial Avion_3=new comercial(200,0);
       comercial Avion_4=new comercial(230,0);
       
       
       while(true){
            System.out.println("Bienvenido a nuestras aerolinea y gracias por elegir nuestros servicios");
            System.out.println("POR FAVOR ELIJA UNA CATEGORIA ESCRIBIENDO EL NUMERO CORRESPONDIENTE:");
            System.out.println("1. Para vuelo comercial.    2 Para vuelo de carga      3. Para vuelo privado");
            Scanner sca=new Scanner(System.in);
            boolean a=true;            
            while(a){
            int eleccion=sca.nextInt();            
            if(eleccion==1){                
                System.out.println("Usted ha elegido vuelo comercial");
                a=false;
                System.out.println("Se tienen la siguiente cantidad de puestos para los siguientes aviones:");
                System.out.println("Avion 1:" +Avion_1.pasajeros(0));
                System.out.println("Avion 2:"+Avion_2.pasajeros(0));
                System.out.println("Avion 3:"+Avion_3.pasajeros(0));
                System.out.println("Avion 4:"+Avion_4.pasajeros(0));
                System.out.println("Elija el avion escribiendo el numero del mismo");
                boolean b=true;
                while(b){
                    int n=sca.nextInt();
                    if(n==1){
                        System.out.println("Usted ha elegido el avion 1");
                        Avion_1.pasajeros(1);
                        b=false;
                    }
                    if(n==2){
                        System.out.println("Usted ha elegido el avion 2");
                        Avion_2.pasajeros(1);
                        b=false;
                    }
                    if(n==3){
                        System.out.println("Usted ha elegido el avion 3");
                        Avion_3.pasajeros(1);
                        b=false;
                    }
                    if(n==4){
                        System.out.println("Usted ha elegido el avion 4");
                        Avion_4.pasajeros(1);
                        b=false;
                    }
                    if(n!=1 && n!=2 && n!=3 && n!=4){
                        System.out.println("Escriba de nuevo el avion");                    
                    }
                }
            }
                if(eleccion==2){
                    System.out.println("Usted ha elegido vuelo de carga");
                    a=false;
                }            
                if(eleccion==3){
                    System.out.println("Usted ha elegido vuelo privado");
                    a=false;
                }
                if(eleccion!=3 && eleccion!=2 && eleccion!=1){
                    System.out.println("Esa opcion no es valida, valide de nuevo");
               }            
            }    
        }
    }
}
