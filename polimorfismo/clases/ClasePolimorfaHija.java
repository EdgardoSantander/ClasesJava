package polimorfismo.clases;

public class ClasePolimorfaHija extends ClasePolimorfa{
    private String papa;

    public ClasePolimorfaHija(String nombre, int edad, String papa){
        super(nombre, edad);
        this.papa = papa;
    }

    public String mostrarInfo(){
        return super.mostrarInfo()+", padre: "+papa;
    }
}
