
//Sergio Danilo Lopez Sierra


package promedio;
//Hallar el promedio de una cantidad 'x' numeros.


import java.util.*;
import javax.swing.JOptionPane;

	class Promedio{
	 public static void main(String arg[]){
		  Scanner in = new Scanner(System.in);
		  
		  int suma=0;
                  int clicker=-1;
		  int promedio;
                  int contador, abaco;
                  
                  do{
		  System.out.println("Escriba un numero entero (9999 para salir)");
                  contador= in.nextInt();
                  suma+=contador;
                  abaco= suma-9999;
                  clicker++;
                          }
                  while (contador != 9999);
                  {
                      promedio= abaco/clicker;
                     System.out.println("el valor promedio es "+promedio);
                       
                  }
       }
	 }
		  
