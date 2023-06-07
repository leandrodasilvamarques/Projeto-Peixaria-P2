package classes;

import classes.setores.SetorEmbarcacao;
import controladores.Pescaria;

import java.util.Objects;

public class Barco {

    private int id;
    private RegistroDePesca registro;


    public Barco(int id) {
    }

    public RegistroDePesca getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroDePesca registro) {
        this.registro = registro;
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
        return id == barco.id && Objects.equals(registro, barco.registro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registro, id);
    }

    @Override
    public String toString() {
        return "Barco{" + "id=" + id + ", registro=" + registro + '}';
    }
}
