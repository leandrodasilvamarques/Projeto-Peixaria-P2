package classes;

public enum Peixe {
    
    SARDINHA(Financeiro.valores.getValorDoQuiloDaSardinha());

    private double precoKg;

    Peixe(double precoKg){
        this.precoKg = precoKg;
    }

    public double getPrecokg(){
        return precoKg;
    }
}
