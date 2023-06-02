package pescariaApi.Empresa.entidades;

public enum Peixe {
    
    SARDINHA(Financeiro.VALOR_QUILO_DA_SARDINHA);

    private double precoKg;

    Peixe(double peso){
        this.precoKg = peso;
    }

    public double getPrecokg(){
        return precoKg;
    }
}
