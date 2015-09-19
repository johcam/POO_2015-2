/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Johan
 */
public class Integers {
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int larg;
        String num3;
        String num4;
        char ver;
        boolean check=true;
        Scanner rd = new Scanner (System.in);
//        while (rd.hasNext()){
            while (check){
                System.out.println("Escriba el primer numero: ");
                num3=rd.nextLine();
                larg=num3.length();
                int D=1;
                int E=0;
                for (int C=0; larg!=C;C++) {
                    ver=num3.substring(D-1,D).charAt(0);
                    if(Character.isDigit(ver)==false){                
                        E=1;
//                    }else{
//                        E=1;
                    }
                    D++;
                }
                if (E==1){
                    System.out.println("Su numero es invalido, intente nuevamente");                    
                }else{
                    check=false;
                    num1=Integer.parseInt(num3);
                }
            }
            System.out.println("Num1: "+num1);
            check=true;
            //ver=0;
            while (check){
                System.out.println("Escriba el segundo numero: ");
                num4=rd.nextLine();
                larg=num4.length();
                int D=1;
                int E=0;
                for (int C=0; larg!=C;C++) {
                    ver=num4.substring(D-1,D).charAt(0);
                    if(Character.isDigit(ver)==false){                
                        E=1;
//                    }else{
//                        E=1;
                    }
                    D++;
                }
                if (E==1){
                    System.out.println("Su numero es invalido, intente nuevamente");                    
                }else{
                    check=false;            
                    num2=Integer.parseInt(num4);
                }
            }
            System.out.println("Num2: "+num2);
            if ((num1%2)==0){
                System.out.println("El numero "+num1+" es par");
            }else if ((num1%2)!=0){
                System.out.println("El numero "+num1+" es impar");
            }
            if ((num2%2)==0){
                System.out.println("El número "+num2+" es par");
            }else if ((num2%2)!=0){
                System.out.println("El numero "+num2+" es impar");
            }
            if (num1>num2){
                System.out.println("El numero "+num1+" es mayor que el numero "+num2);
                if ((num1%num2)==0){
                    System.out.println("El número "+num1+" es multiplo de "+num2);
                }else{
                    System.out.println("Los numeros no son multiplos");
                }
            }else if (num1<num2){
                System.out.println("El numero "+num1+" es menor que el numero "+num2);
                if ((num2%num1)==0){
                    System.out.println("El número "+num2+" es multiplo de "+num1);
                }else{
                    System.out.println("Los numeros no son multiplos");
                }
            }else if (num1==num2){
                System.out.println("Los dos números ingresados son iguales");
            }
//            break;
//        }
    }
}
