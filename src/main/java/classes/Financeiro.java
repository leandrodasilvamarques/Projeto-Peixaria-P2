package classes;

import java.util.ArrayList;

public class Financeiro {
    public static ArrayList<Registro> todosRegistros = new ArrayList<>();
    public static Valores valores = new Valores();

    public static void adicionarRegistro(Registro registro){
        todosRegistros.add(registro);
    }

}
