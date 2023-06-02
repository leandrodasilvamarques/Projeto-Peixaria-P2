package pescariaApi.Empresa.entidades;

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
        return quiloPescado * tipoDoPeixe.getPrecokg() - numeroDePescadores * Financeiro.PRECO_PESCADOR;
    }

    @Override
    public String toString() {
        return "Pesca{" +
                "numeroDePescadores=" + numeroDePescadores +
                ", tipoDoPeixe=" + tipoDoPeixe +
                ", quiloPescado=" + quiloPescado +
                '}';
    }
}
