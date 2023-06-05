package pescariaApi.Empresa.entidades;

public class Valores {

    //Valor caixa inicial
     public double dinheiro = 1000;
     public double precoPescador = 150.00;
     public double valorDoQuiloDaSardinha = 3.0;

    public double getDinheiro() {
        return dinheiro;
    }

    public double getPrecoPescador() {
        return precoPescador;
    }
    public double getValorDoQuiloDaSardinha() {
        return valorDoQuiloDaSardinha;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public void setPrecoPescador(double precoPescador) {
        this.precoPescador = precoPescador;
    }

    public void setValorDoQuiloDaSardinha(double valorDoQuiloDaSardinha) {
        this.valorDoQuiloDaSardinha = valorDoQuiloDaSardinha;
    }
}
