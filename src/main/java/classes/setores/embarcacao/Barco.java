package classes.setores.embarcacao;

import classes.setores.registro.Pesca;
import classes.setores.empresa.Pescaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Barco {

    private int id;
    private List<Pesca> listaPescas;


    public Barco(int id) {
        this.id = id;
        this.listaPescas = new ArrayList<>();
        Pescaria.SETOR_EMBARCACAO.adicionaNovoBarco(this);
    }

    public List<Pesca> getListaPescas() {
        return listaPescas;
    }

    public void setListaPescas(List<Pesca> listaPescas) {
        this.listaPescas = listaPescas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Barco barco = (Barco) o;

        if (id != barco.id) return false;
        return Objects.equals(listaPescas, barco.listaPescas);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (listaPescas != null ? listaPescas.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Barco #" + getId();
    }
}
