/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
public class Ahorcado_Johan {
	
    public static boolean checar(CharSequence l, String palabra){
        boolean chec;
        chec = palabra.contains(l);
        return chec;
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        Random ran = new Random();
        String[] wordList = {"OBJECTS","TURING","COMPUTER","IMITATION",
            "SCREEN","MEMORY","INTERNET","DIGITAL",
            "BINARY","BITE"};
        int r = ran.nextInt(wordList.length);
        String palabra = wordList[r];
        int error = 0;
        String letra = "";
        char l;
        char []psecreta = palabra.toCharArray();
        int aciertos=0;
        System.out.println("Tamaño de la palabra es " + palabra.length());
        char []aux=new char[palabra.length()];
        for (int i=0;i<palabra.length();i++){
            aux[i]='_';
        }
        while(error != 7){
            for (int i=0;i<palabra.length();i++)
            System.out.print(aux[i]);
            System.out.print("Ingrese una letra ");
            switch(error){
                case 1: System.out.println("\n Muñeco: q");
                break;
                case 2: System.out.println("\n Muñeco: q(");
                break;
                case 3: System.out.println("\n Muñeco: q(X");
                break;
                case 4: System.out.println("\n Muñeco: q(X_");
                break;
                case 5: System.out.println("\n Muñeco: q(X_X");
                break;
                case 6: System.out.println("\n Muñeco: q(X_X)");
                break;
                default: System.out.println("");
            }
            letra=t.next();
            l=letra.toCharArray()[0];
            if(checar(letra, palabra)){
                for (int i=0;i<palabra.length();i++){
                    if(psecreta[i]==l)
                    {
                        aciertos++;
                        aux[i]=l;
                    }
                }
            }else{
                error++;
                if(error == 7){
                    System.out.println(" q(X_X)p");
                    System.out.println("Perdiste! La palabra era "+palabra.toUpperCase());
                    break;
                }
            }

            if(aciertos == palabra.length()){
                System.out.println("Ganaste!!! La palabra era " + palabra.toUpperCase());				
                break;
            }
        }
    }
}