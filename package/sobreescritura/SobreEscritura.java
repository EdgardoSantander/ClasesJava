public class SobreEscritura{

    private int primerVariable;
    private String segundaVariable;
    
    public SobreEscritura(){
        this.primerVariable = 1;
        this.segundaVariable = "dos";
    }

    public void MostrarVariables(){
        System.out.println("Estas son las variables contenidas en la clase..."+primerVariable+segundaVariable);
    }

}