package punto3;

public class Main_3 {

    public static void main(String[] args) {
            Quadrilateral qua = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);
            Trapezoid trap = new Trapezoid(0, 0, 10, 0, 8, 5, 3.3, 5);
            Parallelogram_3 par = new Parallelogram_3(5, 5, 11, 5, 12, 20, 6, 20);
            Rectangle_3 rec = new Rectangle_3(17, 14, 30, 14,30,28,17,28);
            Square squ = new Square(4, 0, 8, 0, 8, 4, 4, 4);

            System.out.println("Coordinates of Quadrilatel are:\n" + qua + "\n");
            System.out.println("Coordinates of Trapezoid are:\n" + trap + "\n");
            System.out.println("Coordinates of Parallelogram are:\n" + par + "\n");
            System.out.println("Coordinates of Rectangle are:\n" + rec + "\n");
            System.out.println("Coordinates of Square are:\n" + squ + "\n");

    }

}
