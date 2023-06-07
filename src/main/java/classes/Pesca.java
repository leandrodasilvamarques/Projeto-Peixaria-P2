package classes;

import classes.setores.SetorFinanceiro;

import java.util.List;

public class Pesca {

    private double pesoEmQuilos;
    private Peixe tipoDoPeixe;

    public Pesca(Peixe tipoDoPeixe, double pesoEmQuilos) {
        this.tipoDoPeixe = tipoDoPeixe;
        this.pesoEmQuilos = pesoEmQuilos;
    }

    public double getPesoEmQuilos() {
        return pesoEmQuilos;
    }

    public void setPesoEmQuilos(double pesoEmQuilos) {
        this.pesoEmQuilos = pesoEmQuilos;
    }

    public Peixe getTipoDoPeixe() {
        return tipoDoPeixe;
    }

    public void setTipoDoPeixe(Peixe tipoDoPeixe) {
        this.tipoDoPeixe = tipoDoPeixe;
    }


    @Override
    public String toString() {
        return "Pesca{" + "pesoEmQuilos=" + pesoEmQuilos + ", tipoDoPeixe=" + tipoDoPeixe + '}';
    }
}
