public class Comercial extends Aviones{
    private int puestos;
    private int pasajeros;

    public Comercial(int n,int b){
        this.puestos=n;
        this.pasajeros=b;
    }

    public int pasajeros(int n){
        this.puestos=this.puestos-n;
        return this.puestos-this.pasajeros;
    }
    
    public int getPuestos(){
        return puestos;
    }
}
