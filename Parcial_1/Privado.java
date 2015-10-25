public class Privado extends Avion{
    private int puestos;
    private int pasajeros;
    
    public Privado (String nombre, int n){
        this.nombre=nombre;
        this.puestos=n;
    }


    public int pasajero(int n){
        this.puestos=this.puestos-n;
        return this.puestos-this.pasajeros;
    }
    
    public int getPuestos(){
        return puestos;
    }
}