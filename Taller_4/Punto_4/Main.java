import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static boolean check (String num3){
        boolean b=true;
        int larg;
        char ver;
        Scanner rd = new Scanner (System.in);
        while (b){
            larg=num3.length();
            int D=1;
            int E=0;
            for (int C=0; larg!=C;C++) {
                ver=num3.substring(D-1,D).charAt(0);
                if(Character.isDigit(ver)==false){                
                    E=1;
                }
                D++;
            }
            if (E==1){
                System.out.println("Invalid option, please try again");
                return true;
            }else{
                b=false;
            }
        }
        return false;
    }
    public static void main (String args []){
        double lenght;
        double base;
        double width;
        double area;
        double perimeter;
        int quest;
        String ver;
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
        question:
        ver=sc.next();
        while (check(ver)){
            ver=sc.next();
        }
        quest=Integer.parseInt(ver);
        if (quest<1){
            System.out.println("Invalid option, please try again");
//            continue question;
        } else if (quest>4) {
            System.out.println("Invalid option, please try again");
//            continue question;
            }
            switch(quest){
                case (1):
                    System.out.println("Write the lenght of the rectangle");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    lenght=Double.parseDouble(ver);
                    System.out.println("Write the widht of the rectangle");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    width=Double.parseDouble(ver);
                    Rectangle rectan = new Rectangle();
                    rectan.lenght=lenght;
                    rectan.width=width;
                    System.out.println("The area of the rectangle is "+rectan.getArea());
                    System.out.println("The perimeter of the rectangle is "+rectan.getPerimeter());
                    break;
                case (2):
                    System.out.println("Write the lenght of the triangle");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    lenght=Double.parseDouble(ver);
                    System.out.println("Write the widht of the triangle");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    width=Double.parseDouble(ver);
                    Rec_triangle triangle1 = new Rec_triangle();
                    triangle1.lenght=lenght;
                    triangle1.base=width;
                    System.out.println("The area of the triangle is "+triangle1.getArea());
                    System.out.println("The perimeter of the triangle is "+triangle1.getPerimeter());
                    break;
                case (3):
                    System.out.println("Write the lenght of the triangle");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    lenght=Double.parseDouble(ver);
                    System.out.println("Write the widht of the triangle");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    width=Double.parseDouble(ver);
                    Iso_triangle triangle2 = new Iso_triangle();
                    triangle2.lenght=lenght;
                    triangle2.base=width;
                    System.out.println("The area of the triangle is "+triangle2.getArea());
                    System.out.println("The perimeter of the triangle is "+triangle2.getPerimeter());
                    break;
                case (4):
                    System.out.println("Write the lenght of the parallelogram");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    lenght=Double.parseDouble(ver);
                    System.out.println("Write the widht of the parallelogram");
                    ver=sc.next();
                    while (check(ver)){
                        ver=sc.next();
                    }
                    width=Double.parseDouble(ver);
                    Parallelogram paralel = new Parallelogram();
                    paralel.lenght=lenght;
                    paralel.width=width;
                    System.out.println("The area of the parallelogram is "+paralel.getArea());
                    System.out.println("The perimeter of the parallelogram is "+paralel.getPerimeter());
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