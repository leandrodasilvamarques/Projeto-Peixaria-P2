package pescariaApi.embarcacao;
import pescariaApi.classesSucessoras.Estoque;
import pescariaApi.classesSucessoras.TamanhoEnum;
import java.util.ArrayList;

public class Barco {

    private ArrayList<Pescador> pescadorArrayList;
    private int numDeRedes;
    //private TamanhoEnum tamanhoDoBarco;
    private String nomeDoBarco;
    private double valorManutencao;
    private Estoque estoqueDoBarco;

    public ArrayList<Pescador> getPescadorArrayList() {
        return pescadorArrayList;
    }

    public void setPescadorArrayList(ArrayList<Pescador> pescadorArrayList) {
        this.pescadorArrayList = pescadorArrayList;
    }

    public int getNumDeRedes() {
        return numDeRedes;
    }

    public void setNumDeRedes(int numDeRedes) {
        this.numDeRedes = numDeRedes;
    }

    public TamanhoEnum getTamanhoDoBarco() {
        return tamanhoDoBarco;
    }

    public void setTamanhoDoBarco(TamanhoEnum tamanhoDoBarco) {
        this.tamanhoDoBarco = tamanhoDoBarco;
    }

    public String getNomeDoBarco() {
        return nomeDoBarco;
    }

    public void setNomeDoBarco(String nomeDoBarco) {
        this.nomeDoBarco = nomeDoBarco;
    }

    public double getValorManutencao() {
        return valorManutencao;
    }

    public void setValorManutencao(double valorManutencao) {
        this.valorManutencao = valorManutencao;
    }

    public Estoque getEstoqueDoBarco() {
        return estoqueDoBarco;
    }

    public void setEstoqueDoBarco(Estoque estoqueDoBarco) {
        this.estoqueDoBarco = estoqueDoBarco;
    }
}
