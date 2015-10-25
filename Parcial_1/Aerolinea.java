import java.util.ArrayList;
import java.util.Scanner;

public class Aerolinea {
    
    public static void main(String[] args) {
        Funciones fs = new Funciones();
        ArrayList<Comercial>com=new ArrayList();
        com=fs.leerComercial();
        ArrayList<Carga>car=new ArrayList();
        car=fs.leerCarga();
        ArrayList<Privado>pri=new ArrayList();
        pri=fs.leerPrivado();
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
                while (Funciones.Check(ver)){
                    ver=sca.next();
                }
                eleccion=Integer.parseInt(ver);
                switch (eleccion){
                    case (1):
                        System.out.println("Usted ha elegido vuelo comercial");
                        a=false;
                        System.out.println("Se tienen la siguiente cantidad de puestos para los siguientes aviones:");
                        for (int i=0; i<com.size();i++){
                            System.out.println("Avion "+(i+1)+" "+com.get(i).getNombre()+": "+com.get(i).getPuestos());
                        }
                        System.out.println("Elija el avion escribiendo el numero del mismo");
                        boolean b=true;
                        while(b){
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            int n=Integer.parseInt(ver);
                            if (n<com.size()){
                                fs.restarPasajerosComerciales(com, n);
                                b=false;
                            }else{
                                System.err.println("Opcion ingresada no valida, por favor intente de nuevo");
                            }
                        }
                        break;
                    case (2):
                        System.out.println("Usted ha elegido vuelo de carga");
                        a=false;
                        System.out.println("Se tienen la siguiente capacidad de carga para los siguientes aviones:");
                        for (int i=0; i<car.size();i++){
                            System.out.println("Avion "+(i+1)+" "+car.get(i).getNombre()+": "+car.get(i).getCapacidad());
                        }
                        System.out.println("Elija el avion escribiendo el numero del mismo");
                        b=true;
                        while(b){
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            int n=Integer.parseInt(ver);
                            if (n<car.size()){
                                fs.restarCarga(car, n);
                                b=false;
                            }else{
                                System.err.println("Opcion ingresada no valida, por favor intente de nuevo");
                            }
                        }
                        break;
                    case (3):
                        System.out.println("Usted ha elegido vuelo privado");
                        a=false;
                        System.out.println("Se tienen la siguiente cantidad de puestos para los siguientes aviones:");
                        for (int i=0; i<pri.size();i++){
                            System.out.println("Avion "+(i+1)+" "+pri.get(i).getNombre()+": "+pri.get(i).getPuestos());
                        }
                        System.out.println("Elija el avion escribiendo el numero del mismo");
                        b=true;
                        while(b){
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            int n=Integer.parseInt(ver);
                            if (n<pri.size()){
                                fs.restarPasajerosPrivados(pri, n);
                                b=false;
                            }else{
                                System.err.println("Opcion ingresada no valida, por favor intente de nuevo");
                            }
                        }
                        break;
                    default:
                        System.err.println("Opcion ingresada no valida, por favor intente de nuevo");
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
                        System.err.println("Opcion ingresada no valida, por favor intente de nuevo");
                        d=true;
                }
            }
        }
    }
}