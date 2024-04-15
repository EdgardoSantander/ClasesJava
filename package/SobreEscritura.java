public class SobreEscritura{

    private int primerVariable = 0;
    private String segundaVariable = null;
    
    public SobreEscritura(){
        this.primerVariable = 1;
        this.segundaVariable = "dos";
    }

    public void MostrarVariables(){
        System.out.println("Estas son las variables contenidas en la clase..."+primerVariable+segundaVariable);
    }

}