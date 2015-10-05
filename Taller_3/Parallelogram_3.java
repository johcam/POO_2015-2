package punto3;

public class Parallelogram_3 extends Quadrilateral {

	public Parallelogram_3(double x1, double y1, double x2, double y2, double x3, double y3,double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double width(){
		return getP2().getX() - getP1().getX(); 
	}
	/*
	 * Calcula el area de un Parallelogram 
	 */
	public double area(){
		double h = super.getHeigh();
		double b = width();
		return h*b;
	}
	
	@Override
	public String toString(){
		String exit="";
		//exit = "Coordinates of parallelogram \n";
		exit += super.toString();
		exit += "\nWidth is: " + width();
		exit += "\nHeight is: " + super.getHeigh() + "\nArea is: " + area();
		
		return exit;
	}

}
