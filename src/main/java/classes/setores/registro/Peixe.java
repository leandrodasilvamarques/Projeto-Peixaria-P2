package classes;

import classes.setores.SetorFinanceiro;

public enum Peixe {
    
    SARDINHA(SetorFinanceiro.valores.getValorDoQuiloDaSardinha());

    private double precoKg;

    Peixe(double precoKg){
        this.precoKg = precoKg;
    }

    public double getPrecokg(){
        return precoKg;
    }
}
