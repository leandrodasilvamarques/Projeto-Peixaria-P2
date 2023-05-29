package pescariaApi.embarcacao;
import pescariaApi.classesSucessoras.Pessoa;

public class Pescador extends Pessoa {

    Barco barco;

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public double getSalario() {
        return 0;
    }
}
