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
        ArrayList<Pasajero>pas=new ArrayList();
        pas=fs.leerPasajero();
        ArrayList<Piloto>pil=new ArrayList();
        pil=fs.leerPiloto();
        ArrayList<Ruta>rut=new ArrayList();
        rut=fs.leerRuta();
        while (a){
            System.out.println("SISTEMA ADMINISTRATIVO AEROLINEA");
            System.out.println("Bienvenidos al Sistema Administrativo, seleccione una de las siguientes opciones");
            System.out.println("1. Nuevo avion     2. Nueva persona     3. Nueva ruta");
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
                    break;
                case (2):
                    System.out.println("Ha elegido crear una nueva persona\nSeleccione el tipo de persona a crear:");
                    System.out.println("1. Pasajero     2. Piloto");
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    eleccion=Integer.parseInt(ver);
                    switch (eleccion){
                        case (1):
                            boolean vip=false;
                            boolean cliFrec=false;
                            String s;
                            System.out.println("Ingrese el nombre del pasajero:");
                            nombre=sca.next();
                            System.out.println("Es usuario VIP? (S/N):");
                            s=sca.next();
                            vip=fs.verBool(s);
                            System.out.println("Es Cliente Frecuente? (S/N):");
                            s=sca.next();
                            cliFrec=fs.verBool(s);
                            pas.add(new Pasajero(nombre,(pas.size()+1), vip, cliFrec,0));
                            for (Pasajero pa: pas){
                                System.out.println("El pasajero "+pa.getNombre()+" tiene un ID de "+pa.getID());
                            }
                            break;
                        case (2):                            
                            System.out.println("Ingrese el nombre del piloto:");
                            nombre=sca.next();
                            pil.add(new Piloto(nombre,(pil.size()+1),0));
                            for (Piloto pi: pil){
                                System.out.println("El piloto "+pi.getNombre()+" tiene un ID de "+pi.getID());
                            }
                            break;
                    }
                    break;
                case (3):
                    String origen;
                    String destino;
                    System.out.println("Ingrese la ciudad de origen:");
                    origen=sca.next();
                    System.out.println("Ingrese la ciudad de destino:");
                    destino=sca.next();
                    System.out.println("Ingrese la distancia entre las dos ciudades:");
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    n=Integer.parseInt(ver);
                    rut.add(new Ruta(origen,destino,n,(rut.size()+1)));
                    for (Ruta ru: rut){
                        System.out.println("La ruta "+ru.getOrigen()+" - "+ru.getDestino()+ " tiene una distancia de "+ru.getDistancia()+"; Codigo de ruta: "+ru.getCodigo());
                    }
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
        fs.guardarComercial(com);
        fs.guardarCarga(car);
        fs.guardarPrivado(pri);
        fs.guardarPasajero(pas);
        fs.guardarPiloto(pil);
        fs.guardarRuta(rut);
    }
}