package pescariaApi.Empresa.entidades;

import pescariaApi.Empresa.entidades.Financeiro.Financeiro;
import pescariaApi.classesDeMetodos.MetodosAdminstrativos;
import pescariaApi.classesDeMetodos.MetodosUsuario;

import java.util.ArrayList;
import java.util.List;

public class Pescaria {

    private static ArrayList<Barco> barcos = new ArrayList<>();
    public static final  Financeiro financeiro = new Financeiro();
    public static final Funcionarios funcionarios = new Funcionarios();

    public static void adicionarBarco(Barco barco){
        barcos.add(barco);
    }

}
