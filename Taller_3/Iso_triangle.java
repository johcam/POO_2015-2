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
public class Iso_triangle extends Shapes{
    double base;
    void isoTriangle (double lenght, double base){
        this.lenght=lenght;
        this.base=base;
        double are;
        double per;
        are=lenght*base;
        this.area=are;
        per=(2*lenght)+(2*base);
        this.perimeter=per;
    }
    
    double getArea(){
        double are;
        are=(lenght*base)/2;
        area=are;
        return area;
    }
    
    double getPerimeter(){
        double per;
        per=(2*lenght)+(2*base);
        perimeter=per;
        return perimeter;
    }
}
