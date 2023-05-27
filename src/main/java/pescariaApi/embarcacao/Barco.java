package pescariaApi.embarcacao;

import pescariaApi.classesSucessoras.TamanhoEnum;

import java.util.ArrayList;

public class Barco {

    private String nome;
    private ArrayList<Pescador> listaDePescadores;
    private Rede[] redes;
    private TamanhoEnum tamanho;
    private double valorManutencao;

    public Barco() {

    }

    // pensei em quando instanciarmos um barco, ele receber o nome, a quantidade de redes, o tamanho
    public Barco(String nome, int numeroDeRedes, TamanhoEnum tamanho) {
        this.nome = nome;
        this.redes = new Rede[numeroDeRedes];
        this.tamanho = tamanho;
    }


    public Rede[] getRedes() {
        return redes;
    }

    public void setRedes(Rede[] redes) {
        this.redes = redes;
    }

    public ArrayList<Pescador> getListaDePescadores() {
        return listaDePescadores;
    }

    public void setListaDePescadores(ArrayList<Pescador> listaDePescadores) {
        this.listaDePescadores = listaDePescadores;
    }


    public TamanhoEnum getTamanho() {
        return tamanho;
    }

    public void setTamanho(TamanhoEnum tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorManutencao() {
        return valorManutencao;
    }

    public void setValorManutencao(double valorManutencao) {
        this.valorManutencao = valorManutencao;
    }


}

