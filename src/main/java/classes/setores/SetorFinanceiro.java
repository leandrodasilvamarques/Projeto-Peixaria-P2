package classes.setores;

import classes.Valores;

import java.util.ArrayList;

public class SetorFinanceiro {

    public static ArrayList<SetorRegistro> todosRegistros = new ArrayList<>();
    public static Valores valores = new Valores();

    public static void adicionarRegistro(SetorRegistro registro){
        todosRegistros.add(registro);
    }

}
