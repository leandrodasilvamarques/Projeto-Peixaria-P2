package pescariaApi.Empresa.entidades.Financeiro;

import pescariaApi.Empresa.entidades.Financeiro.Resgistros.Registro;
import pescariaApi.Empresa.entidades.Valores;

import java.lang.module.ResolutionException;
import java.util.ArrayList;

public class Financeiro {
    public static ArrayList<Registro> todosRegistros = new ArrayList<>();
    public static Valores valores = new Valores();

    public static void adicionarRegistro(Registro registro){
        todosRegistros.add(registro);
    }

}
