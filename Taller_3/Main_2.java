/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;

/**
 *
 * @author Johan
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main_2 {
    public static void main (String args []){
        double lenght;
        double base;
        double width;
        double area;
        double perimeter;
        int quest;
        Scanner sc =new Scanner (System.in);
//        Begin:
//        Tried to make this "Begin" label for "Continue" instruction at "catch"
        try{
//        question:
//        Tried to make this "cuestion" label for "Continue" instruction at "default" in "switch"
        System.out.println("Shoose the shape you want to calculate. Write");
        System.out.println("1- Rectangle");
        System.out.println("2- Rectangle Triangle");
        System.out.println("3- Isoceles Triangle");
        System.out.println("4- Parallelogram");
        quest=sc.nextInt();
            switch(quest){
                case (1):
                    System.out.println("Write the lenght of the rectangle");
                    lenght=sc.nextDouble();
                    System.out.println("Write the widht of the rectangle");
                    width=sc.nextDouble();
                    Rectangle rectan = new Rectangle();
                    rectan.lenght=lenght;
                    rectan.width=width;
                    System.out.println("The area of the rectangle is "+rectan.getArea());
                    System.out.println("The perimeter of the rectangle is "+rectan.getPerimeter());
                    break;
                case (2):
                    System.out.println("Write the lenght of the rectangle");
                    lenght=sc.nextDouble();
                    System.out.println("Write the widht of the rectangle");
                    width=sc.nextDouble();
                    Rec_triangle triangle1 = new Rec_triangle();
                    triangle1.lenght=lenght;
                    triangle1.base=width;
                    System.out.println("The area of the rectangle is "+triangle1.getArea());
                    System.out.println("The perimeter of the rectangle is "+triangle1.getPerimeter());
                    break;
                case (3):
                    System.out.println("Write the lenght of the rectangle");
                    lenght=sc.nextDouble();
                    System.out.println("Write the widht of the rectangle");
                    width=sc.nextDouble();
                    Iso_triangle triangle2 = new Iso_triangle();
                    triangle2.lenght=lenght;
                    triangle2.base=width;
                    System.out.println("The area of the rectangle is "+triangle2.getArea());
                    System.out.println("The perimeter of the rectangle is "+triangle2.getPerimeter());
                    break;
                case (4):
                    System.out.println("Write the lenght of the rectangle");
                    lenght=sc.nextDouble();
                    System.out.println("Write the widht of the rectangle");
                    width=sc.nextDouble();
                    Parallelogram paralel = new Parallelogram();
                    paralel.lenght=lenght;
                    paralel.width=width;
                    System.out.println("The area of the rectangle is "+paralel.getArea());
                    System.out.println("The perimeter of the rectangle is "+paralel.getPerimeter());
                    break;
                default:
                    System.out.println("Invalid option, please try again");
                    break;
//                    continue question;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid option, please try again");
//            continue Begin;
        }
        catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
