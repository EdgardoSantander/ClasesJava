package test;
import recursos.*;

public class TestEmpleado {
    public static void main(String [] args){
        Gerente gerente = new Gerente("Edgardo",1500,"Desarrollo");


        System.out.println(gerente.obtenerDetalles());
        gerente.mostrarDepartamento();
    }
}
