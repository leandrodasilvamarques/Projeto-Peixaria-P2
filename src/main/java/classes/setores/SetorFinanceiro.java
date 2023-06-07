package classes.setores;

import classes.RegistroDePesca;
import classes.Valores;

import java.util.ArrayList;

public class SetorFinanceiro {

    public static ArrayList<RegistroDePesca> todosRegistros = new ArrayList<>();
    public static Valores valores = new Valores();

    public static void adicionarRegistro(RegistroDePesca registro){
        todosRegistros.add(registro);
    }

}
