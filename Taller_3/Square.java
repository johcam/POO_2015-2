package punto3;

public class Square extends Quadrilateral  {

	public Square(double x1, double y1, double x2, double y2, double x3,
			double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double getSide (){
		return getP2().getX() - getP1().getX();
	}
	
	public double getArea(){
		double a = getSide();
		return a*a;
	}
	
	 @Override
	 public String toString(){
		 return super.toString() + "\nSide is: " + getSide() + "\nArea is: " +  getArea();
	}
}
