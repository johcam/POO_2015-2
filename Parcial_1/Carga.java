public class Carga extends Avion{
    int capacidad;
    int carga;
    
    public Carga(String nombre, int capacidad){
        this.nombre=nombre;
        this.capacidad=capacidad;
    }
    public int cargado(int carga){
        this.capacidad=this.capacidad-carga;
        return this.capacidad-this.carga;
    }
    public int getCapacidad(){
        return capacidad;
    }
}