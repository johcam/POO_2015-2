public class Persona{
    protected String nombre;
    protected int volado;
    protected int id;
    protected boolean volando;
    
    public void setNombre(String name){
        this.nombre=name;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getID(){
        return id;
    }
    public void setEstado(boolean volando){
        this.volando=volando;
    }
    public boolean getEstado(){
        return volando;
    }
    public void setVolado(int volado){
        this.volado=this.volado+volado;
    }
    public int getVolado(){
        return volado;
    }
}