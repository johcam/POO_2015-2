import java.util.Scanner;

public class Aerolinea {
    
    public static boolean check (String num3){
        boolean a=true;
        int larg;
        char ver;
        Scanner rd = new Scanner (System.in);
        while (a){
            larg=num3.length();
            int D=1;
            int E=0;
            for (int C=0; larg!=C;C++) {
                ver=num3.substring(D-1,D).charAt(0);
                if(Character.isDigit(ver)==false){                
                    E=1;
                }
                D++;
            }
            if (E==1){
                System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                return true;
            }else{
                a=false;
            }
        }
        return false;
    }

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
            String ver="";
            int eleccion;
            while(a){
                ver=sca.next();
                while (check(ver)){
                    ver=sca.next();
                }
                eleccion=Integer.parseInt(ver);
                switch (eleccion){
                    case (1):
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
                            ver=sca.next();
                            while (check(ver)){
                                ver=sca.next();
                            }
                            int n=Integer.parseInt(ver);
                            switch (n){
                                case(1):
                                    System.out.println("Usted ha elegido el avion 1");
                                    Avion_1.pasajeros(1);
                                    b=false;
                                case(2):
                                    System.out.println("Usted ha elegido el avion 2");
                                    Avion_2.pasajeros(1);
                                    b=false;

                                case(3):
                                    System.out.println("Usted ha elegido el avion 3");
                                    Avion_3.pasajeros(1);
                                    b=false;
                                case(4):
                                    System.out.println("Usted ha elegido el avion 4");
                                    Avion_4.pasajeros(1);
                                    b=false;                             
                                default:
                                    System.out.println("Escriba de nuevo el avion");
                            }
                        }                    
                        break;
                    case (2):
                        System.out.println("Usted ha elegido vuelo de carga");
                        a=false;
                        break;
                    case (3):
                        System.out.println("Usted ha elegido vuelo privado");
                        a=false;
                        break;
                    default:
                        System.out.println("Esa opcion no es valida, valide de nuevo");
                        break;
                }
            }    
        }
    }
}