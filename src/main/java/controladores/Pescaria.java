package controladores;

import classes.Barco;
import classes.setores.SetorFinanceiro;
import classes.setores.SetorRecursosHumanos;
import classes.setores.SetorEmbarcacao;

public class Pescaria {

    private static SetorEmbarcacao setorEmbarcacao;
    public static final SetorFinanceiro financeiro = new SetorFinanceiro();
    public static final SetorRecursosHumanos funcionarios = new SetorRecursosHumanos();

    public static void adicionarBarco(Barco barco){
        setorEmbarcacao.listasBarcos.add(barco);
    }

}
