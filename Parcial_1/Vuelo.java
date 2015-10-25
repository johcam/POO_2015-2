import java.util.ArrayList;
import java.util.Scanner;

public class Vuelo {
    public Vuelo(Ruta ruta, int idPiloto, int n){
        Funciones fs = new Funciones();
        int distancia=ruta.getDistancia();
        Scanner sca=new Scanner(System.in);
        String ver;
        boolean a=true;
        ArrayList<Piloto>pil=new ArrayList();
        pil=fs.leerPiloto();
        ArrayList<Pasajero>pas=new ArrayList();
        pas=fs.leerPasajero();
        pil.get(idPiloto-1).setVolado(distancia);
        pil.get(idPiloto-1).setEstado(true);
        System.out.println("El piloto "+pil.get(idPiloto-1).getNombre()+" tendra "+pil.get(idPiloto-1).getVolado()+" millas voladas");       
        int m=n-1;
        pas.get(m).setVolado(distancia);
        pas.get(m).setEstado(true);
        System.out.println("El pasajero "+pas.get(m).getNombre()+" tendra "+pas.get(m).getVolado()+" millas voladas");                      
        fs.guardarPasajero(pas);
        fs.guardarPiloto(pil);
    }
}
