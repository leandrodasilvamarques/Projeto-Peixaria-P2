package classes.setores.embarcacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SetorEmbarcacao {

    private List<Barco> listaDeBarcos;

    public SetorEmbarcacao(){
        listaDeBarcos = new ArrayList<>();
    }

    public List<Barco> getListaDeBarcos() {
        return listaDeBarcos;
    }

    public void setListaDeBarcos(List<Barco> listaDeBarcos) {
        this.listaDeBarcos = listaDeBarcos;
    }

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

    public void adicionaNovoBarco(Barco barco){
        listaDeBarcos.add(barco);
    }

    public Barco barcoDeId(int id){
        for (Barco barco : listaDeBarcos) {
            if (barco.getId() == id){
                return barco;
            }
        }
        return null;
    }

}
