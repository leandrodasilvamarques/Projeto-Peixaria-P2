package pescariaApi.Empresa.entidades.Financeiro.Resgistros;

import pescariaApi.Empresa.entidades.Barco;
import pescariaApi.Empresa.entidades.Financeiro.Financeiro;
import pescariaApi.Empresa.entidades.Pescador;
import pescariaApi.Empresa.entidades.Valores;
import pescariaApi.classesAbstratas.Peixe;

import java.util.List;

public class Pesca {

    private List<Pescador> pescadores;
    private Peixe tipoDoPeixe;
    private double quiloPescado;
    private Barco barco;

    public Pesca(List<Pescador> pescadores, Peixe tipoDoPeixe, double quiloPescado, Barco barco) {
        this.pescadores = pescadores;
        this.tipoDoPeixe = tipoDoPeixe;
        this.quiloPescado = quiloPescado;
        this.barco = barco;
        barco.registro.adicionarPesca(this);
        Valores.incrementarDinheiro(getLucroPesca());
    }

    public double getLucroPesca(){
        return quiloPescado * tipoDoPeixe.getPrecokg() - pescadores.size() * Financeiro.valores.getPrecoPescador();
    }

    @Override
    public String toString() {
        return "Pesca{" +
                "pescadores=" + pescadores +
                ", tipoDoPeixe=" + tipoDoPeixe +
                ", quiloPescado=" + quiloPescado +
                ", barco=" + barco +
                '}';
    }
}
