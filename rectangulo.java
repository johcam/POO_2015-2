
package rectangulo;

public class Rectangulo 
{
    private double base;
    private double altura;
    private double área;
    private double perimetro;
   
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getÁrea() {
        return área;
    }
    public void setÁrea(double área) {
        this.área = área;
    }
    public double getPerimetro() {
        return perimetro;
    }
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    public void Captura(){
        System.out.println("BASE:");
        
        
        System.out.println("ALTURA:");
    }
    public void CalcularArea() {
     área=(base*altura);
    }
    public void CalcularPerimetro(){
     perimetro=base+base+altura+altura;
    }
    public void Imprimir(){  
    System.out.println("EL ÁREA ES: "+área+"\n EL PERÍMETRO ES: "+perimetro);
    }
public static void main(String[] args) {
        // TODO code application logic here
    }
}
