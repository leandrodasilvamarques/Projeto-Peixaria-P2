package classes.setores.financeiro;

public class Valores {

    //atributos
     private static double dinheiroEmCaixa = 1000;
     private static double precoPescador = 150.00;
     private static double valorDoQuiloDaSardinha = 3.0;
    //

    //getters setters
    public  double getDinheiroEmCaixa() {
        return dinheiroEmCaixa;
    }
    public  double getPrecoPescador() {
        return precoPescador;
    }
    public  double getValorDoQuiloDaSardinha() {
        return valorDoQuiloDaSardinha;
    }
    public  void setPrecoPescador(double precoPescador) {
        Valores.precoPescador = precoPescador;
    }
    public  void setValorDoQuiloDaSardinha(double valorDoQuiloDaSardinha) {
        Valores.valorDoQuiloDaSardinha = valorDoQuiloDaSardinha;
    }
    //

    //metodos para aplicação
    public static void incrementarDinheiro(double valor){
        Valores.dinheiroEmCaixa +=valor;
    }
    //
}
