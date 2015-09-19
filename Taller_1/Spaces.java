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
        int larg;
        String A="";
        String B;
        char ver;
        boolean check=true;
        while (check){
            System.out.println("Escriba un número aquí: ");
            B=rd.nextLine();
            larg=B.length();
            int D=1;
            int E=0;
            for (int C=0; larg!=C;C++) {
                ver=B.substring(D-1,D).charAt(0);
                if(Character.isDigit(ver)==false){                
                    E=1;
                }
                D++;
            }
            if (E==1){
                System.out.println("Su numero es invalido, intente nuevamente");                    
            }else{
                check=false;
                A=B;
            }
        }
        num=A.length();
        int D=1;
        for (int C=0; num!=C;C++) {
                System.out.printf(A.substring(D-1,D)+"   ");            
            D++;
        }
        System.out.println("");
    }
}
