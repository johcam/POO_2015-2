public class comercial extends Aviones{
    int puestos;
    int pasajeros;

public comercial(int n,int b){
    this.puestos=n;
    this.pasajeros=b;
}
        
    public int pasajeros(int n){
        this.pasajeros=this.pasajeros+n;
        return this.puestos-this.pasajeros;
    }
        
}
