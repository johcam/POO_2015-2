public class Rectangle extends Shapes{
    double width;
    void Rectangle (double lenght, double width){
        this.lenght=lenght;
        this.width=width;
    }
    
    double getArea(){
        double are;
        are=lenght*width;
        area=are;
        return area;
    }
    
    double getPerimeter(){
        double per;
        per=(2*lenght)+(2*width);
        perimeter=per;
        return perimeter;
    }
}