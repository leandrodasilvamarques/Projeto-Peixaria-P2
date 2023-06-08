package classes.setores.registro;

import classes.setores.financeiro.SetorFinanceiro;

public enum Peixe {

    //opções de peixe
    SARDINHA(SetorFinanceiro.valores.getValorDoQuiloDaSardinha());
    //

    //atributo
    private double precoKg;
    //

    //constrtutor
    Peixe(double precoKg){
        this.precoKg = precoKg;
    }
    //

    //getters setters
    public double getPrecokg(){
        return precoKg;
    }
    //
}
