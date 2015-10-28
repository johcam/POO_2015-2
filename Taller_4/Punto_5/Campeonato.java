public class Campeonato {
    public static void Partido(int eq1, int eq2, int gan){
        Funciones fs = new  Funciones();
        ArrayList<Jugador>jug=new ArrayList();
        jug=fs.leerJugador();
        ArrayList<Equipo>equ=new ArrayList();
        equ=fs.leerEquipo();
        if (gan==eq1){
            equ.get(eq1).setPuntos(3);
        }else if (gan==eq2){
            equ.get(eq2).setPuntos(3);
        }else{
            equ.get(eq1).setPuntos(1);
            equ.get(eq2).setPuntos(1);
        }
    }
}
