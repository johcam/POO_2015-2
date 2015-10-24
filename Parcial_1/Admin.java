public class Admin extends Personas{
    int pass=0000;
    public Admin (String nombre, int id, String rol){        
        this.nombre=nombre;
        this.id=id;
        this.rol=rol;
    }
    public void setPassword(int pass){
        this.pass=pass;
    }
    public int getPassword(){
        return pass;
    }
}
