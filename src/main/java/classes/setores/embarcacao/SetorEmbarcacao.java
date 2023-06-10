package classes.setores.embarcacao;

import classes.setores.registro.Pesca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SetorEmbarcacao {

    //atributos
    private List<Barco> listaDeBarcos;
    //

    //construtor
    public SetorEmbarcacao(){
        listaDeBarcos = new ArrayList<>();
    }
    //

    //getters setters
    public List<Barco> getListaDeBarcos() {
        return listaDeBarcos;
    }
    public void setListaDeBarcos(List<Barco> listaDeBarcos) {
        this.listaDeBarcos = listaDeBarcos;
    }
    public Barco getBarcoPorId(int id){
        for (Barco barco : listaDeBarcos) {
            if (barco.getId() == id){
                return barco;
            }
        }
        return null;
    }
    public Barco getBarcoPorPesca(Pesca pesca){
        for(Barco barco: listaDeBarcos){
            if (barco.getListaPescas().contains(pesca)){
                return barco;
            }
        }
        return null;
    }
    //

    //metodos para aplicação
    public void adicionaNovoBarco(Barco barco){
        listaDeBarcos.add(barco);
    }
    //

    //overriders
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SetorEmbarcacao that = (SetorEmbarcacao) o;

        return Objects.equals(listaDeBarcos, that.listaDeBarcos);
    }
    @Override
    public int hashCode() {
        return listaDeBarcos != null ? listaDeBarcos.hashCode() : 0;
    }
    @Override
    public String toString() {
        return "SetorEmbarcacao{" + "listaBarcos=" + getListaDeBarcos() + '}';
    }
}
