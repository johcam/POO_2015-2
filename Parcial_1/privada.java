public class privada extends Aviones{
    int puestos;
    int pasajeros;
    
    public privada (int puestos, int pasajeros){
        this.puestos=puestos;
        this.pasajeros=pasajeros;
    }

    public int pasajero(int n){
        this.puestos=this.puestos-n;
        return this.puestos-this.pasajeros;
    }    
}
