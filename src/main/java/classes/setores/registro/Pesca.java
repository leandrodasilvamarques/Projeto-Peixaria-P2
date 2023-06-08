package classes.setores.registro;

import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Funcionario;

import java.util.ArrayList;
import java.util.Date;

public class Pesca {

    //atributos
    private double pesoEmQuilos;
    private Peixe tipoDoPeixe;
    private ArrayList<Funcionario> funcionariosDaPesca = new ArrayList<>();
    private Date dataDaPesca = new Date();
    //

    //construtor
    public Pesca(ArrayList<Funcionario>
            funcionariosDaPesca, Peixe tipoDoPeixe, double pesoEmQuilos) {
        this.tipoDoPeixe = tipoDoPeixe;
        this.pesoEmQuilos = pesoEmQuilos;
        Pescaria.SETOR_REGISTRO.adicionarPesca(this);
        this.funcionariosDaPesca.addAll(funcionariosDaPesca);
    }
    //

    //getters setters
    public Date getDataDaPesca() {
        return dataDaPesca;
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
    //

    public String toStringDataDaPesca() {
        return "Data da pesca: " + dataDaPesca;
    }

    //overrriders
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
    //
}
