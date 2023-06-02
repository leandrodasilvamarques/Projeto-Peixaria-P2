package pescariaApi.classesAbstratas;

import pescariaApi.Empresa.entidades.Financeiro.Financeiro;

public enum Peixe {
    
    SARDINHA(Financeiro.VALOR_QUILO_DA_SARDINHA);

    private double precoKg;

    Peixe(double precoKg){
        this.precoKg = precoKg;
    }

    public double getPrecokg(){
        return precoKg;
    }
}
