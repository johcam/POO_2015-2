public class Pasajero extends Persona{
    boolean vip;
    boolean clienteFrecuente;
    
    public Pasajero(String nombre,int id,boolean vip, boolean cliFrec, int volado){
        this.nombre=nombre;
        this.id=id;
        this.vip=vip;
        this.clienteFrecuente=cliFrec;
        this.volado=volado;
    }
    public boolean getVip(){
        return vip;
    }
    public boolean getClienteFrecuente(){
        return clienteFrecuente;
    }
}
