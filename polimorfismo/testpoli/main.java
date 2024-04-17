package polimorfismo.testpoli;

import polimorfismo.clases.ClasePolimorfa;
import polimorfismo.clases.ClasePolimorfaHija;

public class main {
    ClasePolimorfa polimorfa = new ClasePolimorfa("Pajaro", 1);
    ClasePolimorfaHija polimorfaHija = new ClasePolimorfaHija("canario", 2 , "pajaro");
}
