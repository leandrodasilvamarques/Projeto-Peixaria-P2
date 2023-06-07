package classes.setores.registro;

import java.util.ArrayList;

public class SetorRegistro {

    public static ArrayList<Pesca> todoasPescas = new ArrayList<>();

    public static void adicionarPesca(Pesca pesca){
        todoasPescas.add(pesca);
    }
}
