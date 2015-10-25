//la clase aviones es la clase padre de los aviones comerciales, los de carga y los aviones privados

public class Avion {
    int distRec;
    int id;
    String nombre;
    boolean volando;
    public int pasajeros1(int n){
        return n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setVolando(boolean volando){
        this.volando=volando;
    }
    public boolean getVolando(){
        return volando;
    }
}
