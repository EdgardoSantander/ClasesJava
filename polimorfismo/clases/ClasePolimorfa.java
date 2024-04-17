package polimorfismo.clases;

public class ClasePolimorfa {
    protected String nombre;
    protected int edad;


    public ClasePolimorfa(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String mostrarInfo(){
        return "Nombre: "+this.nombre+", edad: "+this.edad;
    }
}
