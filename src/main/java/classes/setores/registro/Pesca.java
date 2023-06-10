package classes.setores.registro;

import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Pescador;

import java.util.ArrayList;
import java.util.Date;

public class Pesca {

    //atributos
    private double pesoEmQuilos;
    private Peixe tipoDoPeixe;
    private ArrayList<Pescador> funcionariosDaPesca = new ArrayList<>();
    private Date dataDaPesca = new Date();
    //

    //construtor
    public Pesca(ArrayList<Pescador>funcionariosDaPesca, Peixe tipoDoPeixe, double pesoEmQuilos) {
        this.tipoDoPeixe = tipoDoPeixe;
        this.pesoEmQuilos = pesoEmQuilos;
        Pescaria.SETOR_REGISTRO.adicionarPesca(this);
        this.funcionariosDaPesca.addAll(funcionariosDaPesca);
        adicionarHistoricoAosPescadores();
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
    public double getLucroPesca(){

        return getRendaBrutPesca() - getDespesaPesca();

    }
    public double getDespesaPesca(){

        return (Pescaria.SETOR_RECURSOS_HUMANOS.getPagamentoTotalPescadores(funcionariosDaPesca));

    }
    public double getRendaBrutPesca(){
        return tipoDoPeixe.getPrecokg() * pesoEmQuilos;
    }
    //

    //metodos para aplicação
    public void adicionarHistoricoAosPescadores(){

        for (Pescador funcionarios: funcionariosDaPesca){

            funcionarios.adicinarPescaAoRegistro(this);
        }
    }
    //

    @Override
    public String toString() {
        return "Pesca{" +
                "pesoEmQuilos=" + pesoEmQuilos +
                ", tipoDoPeixe=" + tipoDoPeixe +
                ", funcionariosDaPesca=" + funcionariosDaPesca +
                ", dataDaPesca=" + dataDaPesca +
                '}';
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
