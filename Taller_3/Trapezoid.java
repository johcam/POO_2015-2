package punto3;

import java.io.ObjectInputStream.GetField;

public class Trapezoid extends Quadrilateral {

	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1,y1,x2,y2,x3,y3,x4,y4);
	}
	
	
	@Override
	public String toString(){
		return super.toString() + "\nHeigh is: " + super.getHeigh() + "\nArea is: " + area();
	}
	
	public double area(){
		
		double b1 = getP3().getX() -getP4().getX(); 
		double b2 = getP2().getX() -getP1().getX(); 
		double high = getP4().getY() - getP1().getY();

		return (b1+b2)*(high/2);
	}
	
}
