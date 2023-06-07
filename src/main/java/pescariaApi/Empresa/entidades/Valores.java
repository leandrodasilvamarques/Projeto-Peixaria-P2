package pescariaApi.Empresa.entidades;

public class Valores {

    //Valor caixa inicial
     private static double dinheiro = 1000;
     private static double precoPescador = 150.00;
     private static double valorDoQuiloDaSardinha = 3.0;

    public static double getDinheiro() {
        return dinheiro;
    }

    public static double getPrecoPescador() {
        return precoPescador;
    }
    public static double getValorDoQuiloDaSardinha() {
        return valorDoQuiloDaSardinha;
    }

    public static void setPrecoPescador(double precoPescador) {
        Valores.precoPescador = precoPescador;
    }

    public static void setValorDoQuiloDaSardinha(double valorDoQuiloDaSardinha) {
        Valores.valorDoQuiloDaSardinha = valorDoQuiloDaSardinha;
    }

    public static void incrementarDinheiro(double valor){
        Valores.dinheiro+=valor;
    }
}
