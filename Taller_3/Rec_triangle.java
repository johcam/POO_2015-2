/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;
import static java.lang.Math.pow;
/**
 *
 * @author Johan
 */    
public class Rec_triangle extends Shapes{
    double base=1;
    void recTriangle (double lenght, double base){
        this.lenght=lenght;
        this.base=base;
    }
    
    double getArea(){
        double are;
        are=(lenght*base)/2;
        area=are;
        return area;
    }
    
    double getPerimeter(){
        double a;
        double b;
        double c;
        double per;
        a=Math.pow(lenght, 2);
        b=Math.pow(base, 2);
        c=a+b;
        per=Math.pow(c,0.5);
        perimeter=per;
        return perimeter;
    }
}
