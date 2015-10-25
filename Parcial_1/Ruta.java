public class Ruta {
    String ciudadOrigen;
    String ciudadDestino;
    int distancia;
    int codigo;
    
    public Ruta (String ciOr,String ciDest,int dist,int id){
        this.ciudadOrigen=ciOr;
        this.ciudadDestino=ciDest;
        this.distancia=dist;
        this.codigo=id;
    }
    public String getOrigen(){
        return ciudadOrigen;
    }
    public String getDestino(){
        return ciudadDestino;
    }
    public int getDistancia(){
        return distancia;
    }
    public int getCodigo(){
        return codigo;
    }
}
