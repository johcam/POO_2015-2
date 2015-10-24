import java.util.Scanner;

public class Aerolinea {
    
    public static boolean Check (String num){
        boolean a=true;
        int larg;
        char ver;
        Scanner rd = new Scanner (System.in);
        while (a){
            larg=num.length();
            int D=1;
            int E=0;
            for (int C=0; larg!=C;C++) {
                ver=num.substring(D-1,D).charAt(0);
                if(Character.isDigit(ver)==false){                
                    E=1;
                }
                D++;
            }
            if (E==1){
                System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                return true;
            }else{
                if (larg<10){
                    a=false;
                }else{                    
                    System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Comercial avion_1=new Comercial(150,0);
        Comercial avion_2=new Comercial(190,0);
        Comercial avion_3=new Comercial(200,0);
        Comercial avion_4=new Comercial(230,0);
        Carga avion_c=new Carga(500, 0);
        Privada avion_p=new Privada(20, 0);
        boolean c=true;
        while(c){
            System.out.println("Bienvenido a nuestras aerolinea y gracias por elegir nuestros servicios");
            System.out.println("POR FAVOR ELIJA UNA CATEGORIA ESCRIBIENDO EL NUMERO CORRESPONDIENTE:");
            System.out.println("1. Para vuelo comercial    2 Para vuelo de carga      3. Para vuelo privado");
            Scanner sca=new Scanner(System.in);
            boolean a=true;
            String ver="";
            int eleccion;
            while(a){
                ver=sca.next();
                while (Check(ver)){
                    ver=sca.next();
                }
                eleccion=Integer.parseInt(ver);
                switch (eleccion){
                    case (1):
                        System.out.println("Usted ha elegido vuelo comercial");
                        a=false;
                        System.out.println("Se tienen la siguiente cantidad de puestos para los siguientes aviones:");
                        System.out.println("Avion 1:" +avion_1.pasajeros(0));
                        System.out.println("Avion 2:"+avion_2.pasajeros(0));
                        System.out.println("Avion 3:"+avion_3.pasajeros(0));
                        System.out.println("Avion 4:"+avion_4.pasajeros(0));
                        System.out.println("Elija el avion escribiendo el numero del mismo");
                        boolean b=true;
                        while(b){
                            ver=sca.next();
                            while (Check(ver)){
                                ver=sca.next();
                            }
                            int n=Integer.parseInt(ver);
                            switch (n){
                                case(1):
                                    System.out.println("Usted ha elegido el avion 1");
                                    if (avion_1.getPuestos()>0){
                                        System.out.println("Ingrese la cantidad de pasajeros a transportar (Asientos disponibles: "+avion_1.getPuestos()+")");
                                        b=true;
                                        while (b){
                                            ver=sca.next();
                                            while (Check(ver)){
                                                ver=sca.next();
                                            }
                                            n=Integer.parseInt(ver);
                                            if (n>avion_1.getPuestos()){
                                                System.out.println("La cantidad de pasajeros ingresada es mayor a nuestra capacidad, intente nuevamente");
                                            }else{
                                                b=false;
                                                avion_1.pasajeros(n);
                                            }
                                        }
                                    }else{
                                        System.out.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
                                    }
                                    b=false;
                                    break;
                                case(2):                                    
                                    System.out.println("Usted ha elegido el avion 2");
                                    if (avion_2.getPuestos()>0){
                                        System.out.println("Ingrese la cantidad de pasajeros a transportar (Asientos disponibles: "+avion_2.getPuestos()+")");
                                        b=true;
                                        while (b){
                                            ver=sca.next();
                                            while (Check(ver)){
                                                ver=sca.next();
                                            }
                                            n=Integer.parseInt(ver);
                                            if (n>avion_2.getPuestos()){
                                                System.out.println("La cantidad de pasajeros ingresada es mayor a nuestra capacidad, intente nuevamente");
                                            }else{
                                                b=false;
                                                avion_2.pasajeros(n);
                                            }
                                        }
                                    }else{
                                        System.out.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
                                    }
                                    b=false;
                                    break;
                                case(3):
                                    System.out.println("Usted ha elegido el avion 3");
                                    if (avion_3.getPuestos()>0){
                                        System.out.println("Ingrese la cantidad de pasajeros a transportar (Asientos disponibles: "+avion_3.getPuestos()+")");
                                        b=true;
                                        while (b){
                                            ver=sca.next();
                                            while (Check(ver)){
                                                ver=sca.next();
                                            }
                                            n=Integer.parseInt(ver);
                                            if (n>avion_3.getPuestos()){
                                                System.out.println("La cantidad de pasajeros ingresada es mayor a nuestra capacidad, intente nuevamente");
                                            }else{
                                                b=false;
                                                avion_3.pasajeros(n);
                                            }
                                        }
                                    }else{
                                        System.out.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
                                    }
                                    b=false;
                                    break;
                                case(4):
                                    System.out.println("Usted ha elegido el avion 4");
                                    if (avion_4.getPuestos()>0){
                                        System.out.println("Ingrese la cantidad de pasajeros a transportar (Asientos disponibles: "+avion_4.getPuestos()+")");
                                        b=true;
                                        while (b){
                                            ver=sca.next();
                                            while (Check(ver)){
                                                ver=sca.next();
                                            }
                                            n=Integer.parseInt(ver);
                                            if (n>avion_4.getPuestos()){
                                                System.out.println("La cantidad de pasajeros ingresada es mayor a nuestra capacidad, intente nuevamente");
                                            }else{
                                                b=false;
                                                avion_4.pasajeros(n);
                                            }
                                        }
                                    }else{
                                        System.out.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
                                    }
                                    b=false;
                                    break;
                                default:
                                    System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                                    break;
                            }
                        }                    
                        break;
                    case (2):
                        System.out.println("Usted ha elegido vuelo de carga");
                        if (avion_c.capacidad>0){
                            System.out.println("Ingrese el peso de la carga que quiere transportar (Carga disponible: "+avion_c.capacidad+")");
                            b=true;
                            while (b){
                                ver=sca.next();
                                while (Check(ver)){
                                    ver=sca.next();
                                }
                                int n=Integer.parseInt(ver);
                                if (n>avion_c.capacidad){
                                    System.out.println("La cantidad de carga ingresada es mayor a nuestra capacidad, intente nuevamente");
                                }else{
                                    b=false;
                                    avion_c.cargado(n);
                                }
                            }
                        }else{
                            System.out.println("No hay disponibilidad de carga, por favor intente más tarde");
                        }
                        a=false;
                        break;
                    case (3):
                        System.out.println("Usted ha elegido vuelo privado");
                        if (avion_p.getPuestos()>0){
                            System.out.println("Ingrese la cantidad de pasajeros a transportar (Asientos disponibles: "+avion_p.getPuestos()+")");
                            b=true;
                            while (b){
                                ver=sca.next();
                                while (Check(ver)){
                                    ver=sca.next();
                                }
                                int n=Integer.parseInt(ver);
                                if (n>avion_p.getPuestos()){
                                    System.out.println("La cantidad de pasajeros ingresada es mayor a nuestra capacidad, intente nuevamente");
                                }else{
                                    b=false;
                                    avion_p.pasajero(n);
                                }
                            }
                        }else{
                            System.out.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
                        }
                        a=false;
                        break;                    
                    default:
                        System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                        break;
                }
            }
            Scanner sc=new Scanner(System.in);
            boolean d=true;
            String preg;
            while(d){
                System.out.println("Desea continuar (S/N)");
                preg=sc.next();
                switch (preg){
                    case "S":
                        c=true;
                        d=false;
                        break;
                    case "s":
                        c=true;
                        d=false;
                        break;
                    case "N":
                        System.out.println("Cerrando el programa");
                        c=false;
                        d=false;
                        break;
                    case "n":
                        System.out.println("Cerrando el programa");
                        c=false;
                        d=false;
                        break;
                    default:
                        System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                        d=true;
                }
            }
        }
    }
}