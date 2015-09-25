

package rectangulo;
//package geometria;

public class Rectangulo //implements FiguraGeometrica
{
    private double base;
    private double altura;
    private double areaRectangulo;
    private double perimetro;

    public Rectangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }

    //@Override
    public void area() 
    {
        areaRectangulo = base * altura;
    }
    
    public double getperimetro() 
    {
        return perimetro;
    }

    //@Override
    public void perimetro() 
    {
        perimetro = (base*2) + (altura*2);
    }
    public static void main(String[] args) 
    {
        //probar clases cálculo áreas figuras geométricas        
        
        
        Rectangulo rectangulo = new Rectangulo(1, 1);
        rectangulo.area();
        rectangulo.perimetro();
        System.out.println("Área del rectángulo : " + 
                rectangulo.getAreaRectangulo());
        System.out.println("Perimetro del rectángulo: " + 
                rectangulo.getperimetro());

}

}

   
