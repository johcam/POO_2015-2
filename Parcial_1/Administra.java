import java.util.ArrayList;
import java.util.Scanner;

public class Administra {    
    public static void main(String[] args) {
        Funciones fs = new  Funciones();
        Scanner sca=new Scanner(System.in);
        boolean a=true;
        String ver="";
        int eleccion;
        String nombre="";
        int n;
        ArrayList<Comercial>com=new ArrayList();
        com=fs.leerComercial();
        ArrayList<Carga>car=new ArrayList();
        car=fs.leerCarga();
        ArrayList<Privado>pri=new ArrayList();
        pri=fs.leerPrivado();
        ArrayList<Pasajero>Pas=null;
        while (a){
            System.out.println("SISTEMA ADMINISTRATIVO AEROLINEA");
            System.out.println("Bienvenidos al Sistema Administrativo, seleccione una de las siguientes opciones");
            System.out.println("1. Nuevo avion     2. Nuevo cliente");
            ver=sca.next();
            while (Funciones.Check(ver)){
                ver=sca.next();
            }
            eleccion=Integer.parseInt(ver);
            switch (eleccion){
                case (1):
                    System.out.println("Ha elegido crear un nuevo avion\nSeleccione el tipo de avion a crear:");
                    System.out.println("1. Comercial     2. Carga     3.Privado");
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    eleccion=Integer.parseInt(ver);
                    switch (eleccion){
                        case (1):
                            boolean b=true;
                            System.out.println("Ingrese el nombre del avion:");
                            nombre=sca.next();
                            System.out.println("Ingrese la capacidad de pasajeros del avión:");
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            n=Integer.parseInt(ver);
                            com.add(new Comercial(nombre, n));
                            for (Comercial co: com){
                                System.out.println("El avion "+co.getNombre()+" tiene una capacidad de "+co.getPuestos());
                            }
                            break;
                        case (2):
                            b=true;
                            System.out.println("Ingrese el nombre del avion:");
                            nombre=sca.next();
                            System.out.println("Ingrese la capacidad de carga del avión:");
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            n=Integer.parseInt(ver);
                            car.add(new Carga(nombre, n));
                            for (Carga co: car){
                                System.out.println("El avion "+co.getNombre()+" tiene una capacidad de "+co.getCapacidad());
                            }
                            break;
                        case (3):
                            b=true;
                            System.out.println("Ingrese el nombre del avion:");
                            nombre=sca.next();
                            System.out.println("Ingrese la capacidad de pasajeros del avión:");
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            n=Integer.parseInt(ver);
                            pri.add(new Privado(nombre, n));
                            for (Privado co: pri){
                                System.out.println("El avion "+co.getNombre()+" tiene una capacidad de "+co.getPuestos());
                            }
                            break;
                    }
                case (2):
                    break;
                default:
                    System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                    break;
            }
            Scanner sc=new Scanner(System.in);
            boolean d=true;
            String preg;
            while(d){
                System.out.println("Desea continuar (S/N)");
                preg=sc.next();
                switch (preg){
                    case "S":
                        a=true;
                        d=false;
                        break;
                    case "s":
                        a=true;
                        d=false;
                        break;
                    case "N":
                        System.out.println("Cerrando el programa");
                        a=false;
                        d=false;
                        break;
                    case "n":
                        System.out.println("Cerrando el programa");
                        a=false;
                        d=false;
                        break;
                    default:
                        System.err.println("Opción ingresada no válida, por favor intente de nuevo");
                        d=true;
                }
            }
        }
//        Text t=new text();
        Funciones.guardarComercial(com);
        Funciones.guardarCarga(car);
        Funciones.guardarPrivado(pri);
    }
}