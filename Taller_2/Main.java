/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johan
 */
import java.util.Scanner;

public class Main {
    public static void main (String args []){
        Scanner rd=new Scanner (System.in);
        String A="";
        String B="";
        String C="";
        double s=0.0;
        int i=1;
        while (i!=5){
            System.out.println("A continuacion ingrese el primer nombre, el cargo y el salario del empleado "+i);
            System.out.println("Ingrese el nombre del empleado "+i+":");
            A=rd.next();
            System.out.println("Ingrese el cargo del empleado "+i+":");
            B=rd.next();
            System.out.println("Ingrese el salario del primer empleado"+i+": ");
            C=rd.next();
            s=Double.parseDouble(C);
            System.out.println(A+", "+B+", "+C+", "+s);
            Empleado[] empleado1 = new Empleado[5];
            empleado1[i].setNombre(A);
            empleado1[i].setCargo(B);
            empleado1[i].setSalario(s);
            empleado1[i].getSalario();
            System.out.println("El salario de "+empleado1[i].nombre+" es $"+empleado1[i].salario+" quien ocupa el cargo de "+empleado1[i].cargo);
            i++;
        }
    }
}
