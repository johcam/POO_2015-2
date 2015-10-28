import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author X45C
 */
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
    public int checkHabilidad(int n){
        boolean a=true;
        Scanner sc = new Scanner (System.in);
        while (a){
            if(n>10||n<1){
                System.err.println("Parametro no valido, intente de nuevo");
                String num=sc.next();
                while (Check(num)){
                    num=sc.next();
                }
                n=Integer.parseInt(num);
            }else{
                a=false;
            }
        }
        return n;
    }
    
    public int checkJugadores(int e){
        Funciones fs=new Funciones();
        ArrayList<Jugador>jug=new ArrayList();
        jug=fs.leerJugador();
        ArrayList<Equipo>equ=new ArrayList();
        equ=fs.leerEquipo();
        Scanner sc = new Scanner(System.in);
        boolean a=true;
        while (a){
            if (e!=0&&e<=jug.size()){
                int []j=new int [5];
                int m=equ.size();
                for(int i=0;i<m;i++){
                    a=true;
                    j[0]=equ.get(i).getJugador1()-1;
                    j[1]=equ.get(i).getJugador2()-1;
                    j[2]=equ.get(i).getJugador3()-1;
                    j[3]=equ.get(i).getJugador4()-1;
                    j[4]=equ.get(i).getJugador5()-1;
                    for (int h=0;h<5;h++){
                        if ((e-1)==(j[h])){
                            System.err.println("El jugador "+jug.get(e-1).getNombre()+" "+jug.get(e-1).getApellido()+" ya pertenece a otro equipo. GUID: "+e);                        
                            String ver=sc.next();
                            while (Funciones.Check(ver)){
                                ver=sc.next();
                            }
                            e=Integer.parseInt(ver);
                        }else{
                            a=false;
                        }
                    }
                }
            }else{
                System.err.println("El GUID "+e+" es invalido, intente de nuevo");
                String ver=sc.next();
                while (Funciones.Check(ver)){
                    ver=sc.next();
                }
                e=Integer.parseInt(ver);
            }
        }
        return e;
    }
    
    public void guardarJugador (ArrayList<Jugador>jug){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\Taller 4\\src\\Punto_5\\Jugador.txt");
        Charset cs=StandardCharsets.UTF_8;
        try(BufferedWriter wr=Files.newBufferedWriter(path, cs)){
            for (Jugador ju:jug){
                wr.write(ju.getNombre()+";"+ju.getApellido()+";"+ju.getGUID()+";"+ju.getVelocidad()+";"+ju.getPrecicion()+";"+ju.getFuerza()+"\n");
            }
        }catch(Exception e){
            System.err.println("No se ha creado el archivo");
        }
    }
    public void guardarEquipo (ArrayList<Equipo>equ){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\Taller 4\\src\\Punto_5\\Equipo.txt");
        Charset cs=StandardCharsets.UTF_8;
        try(BufferedWriter wr=Files.newBufferedWriter(path, cs)){
            for (Equipo eq:equ){
                wr.write(eq.getNombre()+";"+eq.getJugador1()+";"+eq.getJugador2()+";"+eq.getJugador3()+";"+eq.getJugador4()+";"+eq.getJugador5()+";"+eq.getGUID()+";"+eq.getPuntos()+"\n");
            }
        }catch(Exception e){
            System.err.println("No se ha creado el archivo");
        }
    }
    
    public ArrayList<Jugador>leerJugador(){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\Taller 4\\src\\Punto_5\\Jugador.txt");
        Charset cs=StandardCharsets.UTF_8;
        String s;
        ArrayList<Jugador>jug = new ArrayList();
        try(BufferedReader rd=Files.newBufferedReader(path, cs)){
            while ((s=rd.readLine())!=null){
                String[] sSplit = s.split(";");
                Jugador ju = new Jugador(sSplit[0],sSplit[1],Integer.parseInt(sSplit[2]),Integer.parseInt(sSplit[3]),Integer.parseInt(sSplit[4]),Integer.parseInt(sSplit[5]));
                jug.add(ju);
            }
        }catch(Exception e){
            System.err.println("No se ha encontrado el archivo");
        }
        return jug;
    }
    public ArrayList<Equipo>leerEquipo(){
        Path path =Paths.get("C:\\Users\\X45C\\Documents\\NetBeansProjects\\Taller 4\\src\\Punto_5\\Equipo.txt");
        Charset cs=StandardCharsets.UTF_8;
        String s;
        ArrayList<Equipo>equ = new ArrayList();
        try(BufferedReader rd=Files.newBufferedReader(path, cs)){
            while ((s=rd.readLine())!=null){
                String[] sSplit = s.split(";");
                Equipo ju = new Equipo(sSplit[0],Integer.parseInt(sSplit[1]),Integer.parseInt(sSplit[2]),Integer.parseInt(sSplit[3]),Integer.parseInt(sSplit[4]),Integer.parseInt(sSplit[5]),Integer.parseInt(sSplit[6]),Integer.parseInt(sSplit[7]));
                equ.add(ju);
            }
        }catch(Exception e){
            System.err.println("No se ha encontrado el archivo");
        }
        return equ;
    }
    public void mostrarJugadores(int n){
        Funciones fs=new Funciones();
        ArrayList<Jugador>jug=new ArrayList();
        jug=fs.leerJugador();
        ArrayList<Equipo>equ=new ArrayList();
        equ=fs.leerEquipo();
        System.out.println("Los jugadores en el equipo "+equ.get(n-1).getNombre()+" son:");
        int []j=new int [5];
        j[0]=equ.get(n-1).getJugador1()-1;
        j[1]=equ.get(n-1).getJugador2()-1;
        j[2]=equ.get(n-1).getJugador3()-1;
        j[3]=equ.get(n-1).getJugador4()-1;
        j[4]=equ.get(n-1).getJugador5()-1;
        for (int i=0;i<j.length;i++){
            System.out.println((i+1)+". "+jug.get((j[i])).getNombre()+" "+jug.get((j[i])).getApellido());
        }
    }
}
