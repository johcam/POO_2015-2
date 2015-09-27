/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author X45C
 */
import java.util.Scanner;

public class Main {
    public static void main (String args []){
        Scanner rd=new Scanner (System.in);
        String A;
        String B;
        String C;
        double s;
        System.out.println("A continuacion ingrese el primer nombre, el cargo y el salario del primer empleado");
        System.out.println("Ingrese el nombre del primer empleado: ");
        A=rd.next();
        System.out.println("Ingrese el cargo del primer empleado: ");
        B=rd.next();
        System.out.println("Ingrese el salario del primer empleado: ");
        C=rd.next();
        s=Double.parseDouble(C);
        Empleado empleado1 = new Empleado(A,B,s);
        System.out.println("El salario de "+empleado1.nombre+" es "+empleado1.salario+" quien ocupa el cargo de "+empleado1.cargo);
    }
}
