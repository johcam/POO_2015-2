public class Comercial extends Avion{
    private int puestos;
    private int pasajeros;

    public Comercial(String nombre, int n){
        this.nombre=nombre;
        this.puestos=n;
    }

    public int pasajeros(int n){
        this.puestos=this.puestos-n;
        return this.puestos-this.pasajeros;
    }
    
    public int getPuestos(){
        return puestos;
    }
}