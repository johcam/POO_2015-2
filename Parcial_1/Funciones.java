import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;

public class Funciones {
    
    public static boolean Check (String num){
        boolean a=true;
        int larg;
        char ver;
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
                System.err.println("Opcion ingresada no valida, por favor intente de nuevo");
                return true;
            }else{
                if (larg<10){
                    a=false;
                }else{
                    System.err.println("Opcion ingresada no valida, por favor intente de nuevo");
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void guardarComercial (ArrayList<Comercial>com){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\aerolinea\\src\\aerolinea\\Comercial.txt");
        Charset cs=StandardCharsets.UTF_8;
        try(BufferedWriter wr=Files.newBufferedWriter(path, cs)){
            for (Comercial co:com){
                wr.write(co.getNombre()+";"+co.getPuestos()+"\n");
            }
        }catch(Exception e){
            System.out.println("No se ha creado el archivo");
        }
    }
    public static void guardarCarga (ArrayList<Carga>car){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\aerolinea\\src\\aerolinea\\Carga.txt");
        Charset cs=StandardCharsets.UTF_8;
        try(BufferedWriter wr=Files.newBufferedWriter(path, cs)){
            for (Carga co:car){
                wr.write(co.getNombre()+";"+co.getCapacidad()+"\n");
            }
        }catch(Exception e){
            System.out.println("No se ha creado el archivo");
        }
    }
    public static void guardarPrivado (ArrayList<Privado>com){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\aerolinea\\src\\aerolinea\\Privado.txt");
        Charset cs=StandardCharsets.UTF_8;
        try(BufferedWriter wr=Files.newBufferedWriter(path, cs)){
            for (Privado co:com){
                wr.write(co.getNombre()+";"+co.getPuestos()+"\n");
            }
        }catch(Exception e){
            System.out.println("No se ha creado el archivo");
        }
    }
    
    public ArrayList<Comercial>leerComercial(){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\aerolinea\\src\\aerolinea\\Comercial.txt");
        Charset cs=StandardCharsets.UTF_8;
        String s;
        ArrayList<Comercial>com = new ArrayList();
        try(BufferedReader rd=Files.newBufferedReader(path, cs)){
            while ((s=rd.readLine())!=null){
                String[] sSplit = s.split(";");
                Comercial co = new Comercial(sSplit[0],Integer.parseInt(sSplit[1]));
                com.add(co);
            }
        }catch(Exception e){
            System.err.println("No se ha creado el archivo");
        }
        return com;
    }
    public ArrayList<Carga>leerCarga(){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\aerolinea\\src\\aerolinea\\Carga.txt");
        Charset cs=StandardCharsets.UTF_8;
        String s;
        ArrayList<Carga>com = new ArrayList();
        try(BufferedReader rd=Files.newBufferedReader(path, cs)){
            while ((s=rd.readLine())!=null){
                String[] sSplit = s.split(";");
                Carga co = new Carga(sSplit[0],Integer.parseInt(sSplit[1]));
                com.add(co);
            }
        }catch(Exception e){
            System.err.println("No se ha creado el archivo");
        }
        return com;
    }
    public ArrayList<Privado>leerPrivado(){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\aerolinea\\src\\aerolinea\\Privado.txt");
        Charset cs=StandardCharsets.UTF_8;
        String s;
        ArrayList<Privado>pri = new ArrayList();
        try(BufferedReader rd=Files.newBufferedReader(path, cs)){
            while ((s=rd.readLine())!=null){
                String[] sSplit = s.split(";");
                Privado co = new Privado(sSplit[0],Integer.parseInt(sSplit[1]));
                pri.add(co);
            }
        }catch(Exception e){
            System.err.println("No se ha creado el archivo");
        }
        return pri;
    }
    
    public void restarPasajerosComerciales(ArrayList<Comercial>com,int a){
        Scanner sca=new Scanner(System.in);
        String ver;
        int n;
        boolean c=true;
        System.out.println("Usted ha elegido el avion "+a);
        if (com.get(a-1).getPuestos()>0){
            System.out.println("Ingrese la cantidad de pasajeros a transportar (Asientos disponibles: "+com.get(a-1).getPuestos()+")");
            while (c){
                ver=sca.next();
                while (Funciones.Check(ver)){
                    ver=sca.next();
                }
                n=Integer.parseInt(ver);
                if (n>com.get(a-1).getPuestos()){
                    System.err.println("La cantidad de pasajeros ingresada es mayor a nuestra capacidad, intente nuevamente");
                }else{
                    c=false;
                    com.get(a-1).pasajeros(n);
                }
            }
        }else{
            System.err.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
        }
    }
    public void restarCarga(ArrayList<Carga>com,int a){
        Scanner sca=new Scanner(System.in);
        String ver;
        int n;
        boolean c=true;
        System.out.println("Usted ha elegido el avion "+a);
        if (com.get(a-1).getCapacidad()>0){
            System.out.println("Ingrese la cantidad de carga a transportar (Capacidad disponibles: "+com.get(a-1).getCapacidad()+")");
            while (c){
                ver=sca.next();
                while (Funciones.Check(ver)){
                    ver=sca.next();
                }
                n=Integer.parseInt(ver);
                if (n>com.get(a-1).getCapacidad()){
                    System.err.println("La cantidad de carga ingresada es mayor a nuestra capacidad, intente nuevamente");
                }else{
                    c=false;
                    com.get(a-1).cargado(n);
                }
            }
        }else{
            System.err.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
        }
    }
    public void restarPasajerosPrivados(ArrayList<Privado>pri,int a){
        Scanner sca=new Scanner(System.in);
        String ver;
        int n;
        boolean c=true;
        System.out.println("Usted ha elegido el avion "+a);
        if (pri.get(a-1).getPuestos()>0){
            System.out.println("Ingrese la cantidad de pasajeros a transportar (Asientos disponibles: "+pri.get(a-1).getPuestos()+")");
            while (c){
                ver=sca.next();
                while (Funciones.Check(ver)){
                    ver=sca.next();
                }
                n=Integer.parseInt(ver);
                if (n>pri.get(a-1).getPuestos()){
                    System.err.println("La cantidad de pasajeros ingresada es mayor a nuestra capacidad, intente nuevamente");
                }else{
                    c=false;
                    pri.get(a-1).pasajero(n);
                }
            }
        }else{
            System.err.println("No hay disponibilidad de asientos en este vuelo, le invitamos a explorar otras opciones");
        }
    }
}