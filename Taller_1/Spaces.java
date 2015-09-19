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

public class Spaces {
    @SuppressWarnings("empty-statement")
    public static void main (String[] args){
        Scanner rd=new Scanner(System.in);
        int num;
        String A;
        String B;
        char ver;
        inicio:
        System.out.println("Escriba un número aquí:");
        A=rd.next();
        //ver=Integer.parseInt(A);
        //if(Character.isDigit(ver)!=true){
            num=A.length();
            System.out.println(num);
            System.out.println(A);
            int D=1;
            int E=1;
            
            for (int C=0; num!=C;C++) {
                ver=A.substring(D-1,D).charAt(0);
                if(Character.isDigit(ver)==true){
                    System.out.printf(A.substring(D-1,D)+"   ");
                }else{
                    Bng:
                    System.out.println("Existe un caracter invalido, por favor intente nuevamente");
                    break;
                    //continue Bng;
                }
                D++;
            }
            System.out.println("");
        //}
    }
}
