
package rectangulo;


public class Rectangulo 
{
    private double base;
    private double altura;
    private double areaRectangulo;
    private double perimetro;

    public Rectangulo(double base, double altura) 
    {
        
        if (base >20 || altura>20){
            System.out.println("Los valores deben estar entre (0 , 20]");
                    
        }else{
            if (base <=0 || altura <=0){
                 System.out.println("Los valores deben estar entre (0 y 20]");
                 
            }else{
            
                this.base = base;
                this.altura = altura;
            }
        
        }
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

   
    public void area() 
    {
        areaRectangulo = base * altura;
    }
    
    public double getperimetro() 
    {
        return perimetro;
    }

    
    public void perimetro() 
    {
        perimetro = (base*2) + (altura*2);
    }
    public static void main(String[] args) 
    {
               
        
        
        Rectangulo rectangulo = new Rectangulo(80, 15);
        
      
            rectangulo.area();
            rectangulo.perimetro();
           rectangulo.getperimetro();
     
           if (rectangulo.getperimetro()!= 0){
           System.out.println("Área del rectángulo : " +
                    rectangulo.getAreaRectangulo());
            System.out.println("Perimetro del rectángulo: " +
                    rectangulo.getperimetro());
           } 
            
            
