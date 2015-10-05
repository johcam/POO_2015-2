package punto3;

public class Quadrilateral {

	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	public Point getP3() {
		return p3;
	}

	public void setP3(Point p3) {
		this.p3 = p3;
	}

	public Point getP4() {
		return p4;
	}

	public void setP4(Point p4) {
		this.p4 = p4;
	}
	
	/*
	 * Encuentra el valor maximo en el eje x
	 */
	public double yMin(){
		double min = p1.getY();
		if(p2.getY() < min){
			min = p2.getY();
		}
		if (p3.getY() < min){
			min = p3.getY();
		}
		if (p4.getY() < min){
			min = p4.getY();
		}
		return min;
	}
	/*
	 * Encuentra el valor maximo en el eje y
	 */
	public double yMax(){
		double max = p1.getY();
		if(p2.getY() > max){
			max = p2.getY();
		}
		if (p3.getY() > max){
			max = p3.getY();
		}
		if (p4.getY() > max){
			max = p4.getY();
		}
		return max;
	}
	/*
	 * Retorna la altura de cualquier cuadrilatero
	 */
	public double getHeigh(){
		return yMax()-yMin();
	}
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);
		p4 = new Point(x4, y4);		
	}

	@Override
	public String toString(){
		String exit ;
		exit = "(" + p1.getX() + "," + p1.getY() + ")"+ ", "  +"(" + p2.getX() + "," + p2.getY() + ")"+ ", "  +"(" + p3.getX() + "," + p3.getY() + ")"+ ", "  +"(" + p4.getX() + "," + p4.getY() + ")";
		return exit;
				
	}

}
