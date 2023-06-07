package classes;

import java.util.Objects;

public class Barco {

    private int id;
    private RegistroDePesca registroDePescas;


    public Barco(int id) {
    }

    public RegistroDePesca getRegistroDePescas() {
        return registroDePescas;
    }

    public void setRegistroDePescas(RegistroDePesca registroDePescas) {
        this.registroDePescas = registroDePescas;
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
        return id == barco.id && Objects.equals(registroDePescas, barco.registroDePescas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registroDePescas, id);
    }

    @Override
    public String toString() {
        return "Barco{" + "id=" + id + ", registro=" + registroDePescas + '}';
    }
}
