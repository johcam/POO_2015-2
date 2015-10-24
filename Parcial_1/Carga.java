public class Carga extends Aviones{
    int capacidad;
    int carga;
    
    public Carga(int capacidad, int carga){
        this.capacidad=capacidad;
        this.carga=carga;
    }
    public int cargado(int carga){
        this.capacidad=this.capacidad-carga;
        return this.capacidad-this.carga;
    }
}
