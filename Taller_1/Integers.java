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
        int num1;
        int num2;
        Scanner rd = new Scanner (System.in);
        String num3;
        String num4;
        System.out.println("Escriba el primer numero: ");
        while (rd.hasNext()){
            num3=rd.nextLine();
            System.out.println("Escriba el segundo numero: ");
            num4=rd.nextLine();
            num1=Integer.parseInt(num3);
            num2=Integer.parseInt(num4);
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
            break;
        }
    }
}
