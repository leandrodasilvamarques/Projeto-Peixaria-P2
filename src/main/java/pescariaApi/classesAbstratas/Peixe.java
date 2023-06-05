package pescariaApi.classesAbstratas;

import pescariaApi.Empresa.entidades.Financeiro.Financeiro;
import pescariaApi.Empresa.entidades.Valores;

public enum Peixe {
    
    SARDINHA(Valores.VALOR_QUILO_DA_SARDINHA);

    private double precoKg;

    Peixe(double precoKg){
        this.precoKg = precoKg;
    }

    public double getPrecokg(){
        return precoKg;
    }
}
