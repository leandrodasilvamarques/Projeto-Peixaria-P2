package classes.setores;

import classes.Registro;
import classes.Valores;

import java.util.ArrayList;

public class SetorFinanceiro {

    public static ArrayList<Registro> todosRegistros = new ArrayList<>();
    public static Valores valores = new Valores();

    public static void adicionarRegistro(Registro registro){
        todosRegistros.add(registro);
    }

}
