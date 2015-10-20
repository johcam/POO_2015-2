public class carga extends Aviones{
    int capacidad;
    int carga;
    
    public carga(int capacidad, int carga){
        this.capacidad=capacidad;
        this.carga=carga;
    }
    public int cargado(int carga){
        this.capacidad=this.capacidad-carga;        
        return this.capacidad-this.carga;
    }
}
