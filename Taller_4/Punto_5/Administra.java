import java.util.ArrayList;
import java.util.Scanner;

public class Administra {    
    public static void main(String[] args) {
        Funciones fs = new  Funciones();
        Scanner sca=new Scanner(System.in);
        boolean a=true;
        boolean b=true;
        String ver="";
        int eleccion;
        String nombre="";
        String apellido;
        int numero;
        int vel;
        int prec;
        int fuer;
        int n;
        ArrayList<Jugador>jug=new ArrayList();
        jug=fs.leerJugador();
        ArrayList<Equipo>equ=new ArrayList();
        equ=fs.leerEquipo();
//        ArrayList<Carga>car=new ArrayList();
//        car=fs.leerCarga();
//        ArrayList<Privado>pri=new ArrayList();
//        pri=fs.leerPrivado();
//        ArrayList<Pasajero>pas=new ArrayList();
//        pas=fs.leerPasajero();
//        ArrayList<Piloto>pil=new ArrayList();
//        pil=fs.leerPiloto();
//        ArrayList<Ruta>rut=new ArrayList();
//        rut=fs.leerRuta();
        while (a){
            System.out.println("SISTEMA ADMINISTRATIVO BANQUITAS-UN");
            System.out.println("Bienvenidos al Sistema Administrativo, seleccione una de las siguientes opciones");
            System.out.println("1. Opciones de jugador     2. Opciones de equipo     3. Opciones de marcador");
            ver=sca.next();
            while (Funciones.Check(ver)){
                ver=sca.next();
            }
            eleccion=Integer.parseInt(ver);
            switch (eleccion){
                case (1):
                    System.out.println("OPCIONES DE JUGADOR");
                    System.out.println("1. Añadir un nuevo jugador     2. Cambiar el nombre del jugador");
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    eleccion=Integer.parseInt(ver);
                    switch (eleccion){
                        case (1):
                            System.out.println("Ingrese el nombre del jugador:");
                            nombre=sca.next();
                            System.out.println("Ingrese el apellido del jugador:");
                            apellido=sca.next();
                            System.out.println("Ingrese la velocidad del jugador:");
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            vel=Integer.parseInt(ver);
                            vel=fs.checkHabilidad(vel);
                            System.out.println("Ingrese la precision del jugador:");
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            prec=Integer.parseInt(ver);
                            prec=fs.checkHabilidad(prec);
                            System.out.println("Ingrese la fuerza del jugador:");
                            ver=sca.next();
                            while (Funciones.Check(ver)){
                                ver=sca.next();
                            }
                            fuer=Integer.parseInt(ver);
                            fuer=fs.checkHabilidad(fuer);
                            numero=jug.size()+1;
                            jug.add(new Jugador(nombre, apellido,numero,vel, prec,fuer));
                            for (Jugador ju: jug){
                                System.out.println("El jugador "+ju.getNombre()+" "+ju.getApellido()+" tiene un GUID de "+ju.getGUID());
                            }
                            fs.guardarJugador(jug);
                            break;
                        case (2):
                            System.out.println("Ingrese el GUID del jugador a renombrar");
                            while (b){
                                ver=sca.next();
                                while (Funciones.Check(ver)){
                                    ver=sca.next();
                                }
                                n=Integer.parseInt(ver);
                                if(n!=0&&n<jug.size()){
                                    System.out.println("Ingrese el nuevo nombre del jugador "+n);
                                    nombre=sca.next();
                                    System.out.println("Ingrese el nuevo apellido del jugador "+n);
                                    apellido=sca.next();
                                    jug.get(n).setNombre(nombre);
                                    jug.get(n).setApellido(apellido);
                                    System.out.println("El nuevo nombre del jugador "+n+" es "+jug.get(n).getNombre()+" "+jug.get(n).getApellido());
                                    b=false;
                                }else{
                                    System.err.println("El jugador con el GUID "+n+" no existe, intente nuevamente");
                                    b=true;
                                }
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case (2):
                    System.out.println("OPCIONES DE EQUIPO");
                    System.out.println("1. Añadir un nuevo equipo     2. Ver jugadores del equipo     3. Renombrar equipo");
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    eleccion=Integer.parseInt(ver);
                    switch (eleccion){
                        case (1):
                            if ((equ.size()+1)<=(jug.size()/5)){
                                System.out.println("Ingrese el nombre del equipo");
                                String nom=sca.next();
                                int i=0;
                                int[] j=new int[5];
                                while (i<5){
                                    System.out.println("Ingrese el GUID del jugador "+(i+1));
                                    ver=sca.next();
                                    while (Funciones.Check(ver)){
                                        ver=sca.next();
                                    }
                                    n=Integer.parseInt(ver);
                                    j[i]=fs.checkJugadores(n);
                                    i++;
                                }
                                equ.add(new Equipo(nom, j[0],j[1],j[2],j[3],j[4],(equ.size()+1),0));
                                for (Equipo eq: equ){
                                    System.out.println("El jugador "+eq.getNombre()+" tiene un GUID de "+eq.getGUID());
                                }
                            }else{
                                System.err.println("No hay suficientes integrantes para crear un nuevo equipo");
                                break;
                            }
                            fs.guardarEquipo(equ);
                            break;
                        case (2):
                            b=true;
                                System.out.println("Ingrese el GUID del equipo para ver sus jugadores");
                                for (int i=0;i<equ.size();i++){
                                    System.out.println((i+1)+". Equipo "+equ.get(i).getNombre());
                                }
                            while (b){
                                ver=sca.next();
                                while (Funciones.Check(ver)){
                                    ver=sca.next();
                                }
                                n=Integer.parseInt(ver);
                                if(n>equ.size()||n<1){
                                    System.err.println("El equipo "+n+" no existe, intente nuevamente");
                                }else{
                                    fs.mostrarJugadores(n);
                                    b=false;
                                }
                            }
                            break;
                    }
                    break;
                case (3):
                    System.out.println("Ingrese el GUID del primer equipo");
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    int eq1=(Integer.parseInt(ver)-1);
                    System.out.println("Ingrese el GUID del segundo equipo");
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    int eq2=(Integer.parseInt(ver)-1);
                    System.out.println("Ingrese el GUID del equipo ganador (Cualquier otro digito para empate)");
                    System.out.println((eq1+1)+". equipo "+equ.get(eq1).getNombre());
                    System.out.println((eq2+1)+". equipo "+equ.get(eq2).getNombre());
                    ver=sca.next();
                    while (Funciones.Check(ver)){
                        ver=sca.next();
                    }
                    int gan=(Integer.parseInt(ver)-1);
                    Campeonato.Partido(eq1, eq2, gan);
                    for(int i=0;i<equ.size();i++){
                        System.out.println("El equipo "+equ.get(i).getNombre()+" tiene "+equ.get(i).getPuntos());
                    }
                    fs.guardarEquipo(equ);
                    break;
                default:
                    System.out.println("Opcion ingresada no valida, por favor intente de nuevo");
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
        fs.guardarJugador(jug);
        fs.guardarEquipo(equ);
    }
}