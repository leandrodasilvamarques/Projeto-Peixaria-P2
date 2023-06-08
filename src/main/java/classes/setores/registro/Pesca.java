package classes.setores.registro;

import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Funcionario;

import java.util.ArrayList;

public class Pesca {

    private double pesoEmQuilos;
    private Peixe tipoDoPeixe;
    private ArrayList<Funcionario> funcionariosDaPesca = new ArrayList<>();

    public Pesca(ArrayList<Funcionario> funcionariosDaPesca, Peixe tipoDoPeixe, double pesoEmQuilos) {
        this.tipoDoPeixe = tipoDoPeixe;
        this.pesoEmQuilos = pesoEmQuilos;
        Pescaria.SETOR_REGISTRO.adicionarPesca(this);
        this.funcionariosDaPesca.addAll(funcionariosDaPesca);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pesca pesca = (Pesca) o;

        if (Double.compare(pesca.pesoEmQuilos, pesoEmQuilos) != 0) return false;
        return tipoDoPeixe == pesca.tipoDoPeixe;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(pesoEmQuilos);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (tipoDoPeixe != null ? tipoDoPeixe.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pesca{" +
                "pesoEmQuilos=" + pesoEmQuilos +
                ", tipoDoPeixe=" + tipoDoPeixe +
                ", funcionariosDaPesca=" + funcionariosDaPesca +
                '}';
    }
}
