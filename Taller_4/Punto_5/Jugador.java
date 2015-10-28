public class Jugador {
    String nombre;
    String apellido;
    int GUID;
    int velocidad;
    int precision;
    int fuerza;
    
    public Jugador (String nombre, String apellido, int numero, int vel, int pres, int fue){
        this.nombre=nombre;
        this.apellido=apellido;
        this.GUID=numero;
        this.velocidad=vel;
        this.precision=pres;
        this.fuerza=fue;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getGUID(){
        return GUID;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public int getPrecicion(){
        return precision;
    }
    public int getFuerza(){
        return fuerza;
    }
}
