public class Equipo {
    String nombre;
    int jugador1;
    int jugador2;
    int jugador3;
    int jugador4;
    int jugador5;
    int GUID;
    int puntos;
    
    public Equipo(String nombre, int jug1, int jug2, int jug3, int jug4, int jug5,int GUID,int puntos){
        this.nombre=nombre;
        this.jugador1=jug1;
        this.jugador2=jug2;
        this.jugador3=jug3;
        this.jugador4=jug4;
        this.jugador5=jug5;
        this.GUID=GUID;
        this.puntos=puntos;
    }
    public String getNombre(){
        return nombre;
    }
    public int getJugador1(){
        return jugador1;
    }
    public int getJugador2(){
        return jugador2;
    }
    public int getJugador3(){
        return jugador3;
    }
    public int getJugador4(){
        return jugador4;
    }
    public int getJugador5(){
        return jugador5;
    }
    public void setPuntos(int puntos){
        this.puntos=this.puntos+puntos;
    }
    public int getGUID(){
        return GUID;
    }
    public int getPuntos(){
        return puntos;
    }  
}
