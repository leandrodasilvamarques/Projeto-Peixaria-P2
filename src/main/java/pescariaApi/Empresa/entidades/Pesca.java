package pescariaApi.Empresa.entidades;

import pescariaApi.interfaces.Peixe;

public class Pesca {

    private int numeroDePescadores;
    private Peixe tipoDoPeixe;
    private double quiloPescado;
    public Pesca(int numeroDePescadores, Peixe tipoDoPeixe, double quiloPescado) {
        this.numeroDePescadores = numeroDePescadores;
        this.tipoDoPeixe = tipoDoPeixe;
        this.quiloPescado = quiloPescado;
    }
    public double getLucroPesca(int numeroDePescadores, double quiloPescado, Peixe tipoDoPeixe){
        double lucro = quiloPescado * tipoDoPeixe.getPrecoQuilo() - numeroDePescadores* Financeiro.PRECO_PESCADOR;
        return lucro;
    }
}
