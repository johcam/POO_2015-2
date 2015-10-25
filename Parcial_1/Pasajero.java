public class Pasajero extends Persona{
    
    public Pasajero(String nombre, int id, String rol){
        this.nombre=nombre;
        this.id=id;
        this.rol=rol;
    }
    public int getVolado(){
        return volado;
    }
}
