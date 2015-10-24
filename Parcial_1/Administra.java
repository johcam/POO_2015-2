import java.util.ArrayList;
import java.util.Scanner;

public class Administra {
    
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
        Scanner sca=new Scanner(System.in);
        boolean a=true;
        String ver="";
        int eleccion;
        String nombre;
        int id;
        int pass;
        while (a){
            System.out.println("SISTEMA ADMINISTRATIVO AEROLINEA");
            System.out.println("Bienvenidos al Sistema Administrativo, seleccione una de las siguientes opciones");
            System.out.println("1. Nuevo usuario     2. Usuario antiguo");
            ver=sca.next();
            while (Check(ver)){
                ver=sca.next();
            }
            eleccion=Integer.parseInt(ver);
            switch (eleccion){
                case (1):
                    System.out.print("Ingrese el nombre del usuario: ");
                    nombre=sca.next();
                    System.out.print("Ingrese el id del usuario: ");
                    ver=sca.next();
                    while (Check(ver)){
                        ver=sca.next();
                    }
                    id=Integer.parseInt(ver);
                    Admin admin=new Admin(nombre,id,"Admin");
                    admin.setPassword(id);
                    System.out.println("Usuario "+admin.getNombre()+" creado exitosamente con el ID "+admin.getID());
                    break;
                case (2):
                    Admin juan = new Admin ("Juan", 123, "Admin");
                    System.out.println("Ingrese su id de usuario");
                    ver=sca.next();
                    while (Check(ver)){
                        ver=sca.next();
                    }
                    id=Integer.parseInt(ver);
                    pass=juan.getPassword();
                    if (0000==pass){
                        System.out.println("Su contraseña es por defecto 0000, por favor ingrese una contraseña personalizada");                        
                        ver=sca.next();
                        while (Check(ver)){
                            ver=sca.next();
                        }
                        pass=Integer.parseInt(ver);
                        juan.setPassword(pass);
                        System.out.println("Contraseña actualizada correctamente");
                        System.out.println("Contraseña ingresada "+juan.getPassword());
                    }
                    break;
                default:
                    System.out.println("Opción ingresada no válida, por favor intente de nuevo");
                    break;
            }
        }
    }
}
