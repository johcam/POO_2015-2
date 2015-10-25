public class Privada extends Aviones{
    private int puestos;
    private int pasajeros;
    
    public Privada (int puestos, int pasajeros){
        this.puestos=puestos;
        this.pasajeros=pasajeros;
    }

    public int pasajero(int n){
        this.puestos=this.puestos-n;
        return this.puestos-this.pasajeros;
    }
    
    public int getPuestos(){
        return puestos;
    }
}
