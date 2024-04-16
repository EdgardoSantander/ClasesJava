package recursos;
public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    public void mostrarDepartamento(){
        System.out.println("Departamento: "+this.departamento);
    }
    


}
