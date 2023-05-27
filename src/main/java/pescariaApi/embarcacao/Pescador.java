package pescariaApi.embarcacao;

import pescariaApi.classesSucessoras.ExperienciaEnum;
import pescariaApi.classesSucessoras.Pessoa;
import pescariaApi.interfaces.Funcionario;

public class Pescador extends Pessoa implements Funcionario {

    ExperienciaEnum experiencia;
    Barco barco;

    public ExperienciaEnum getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(ExperienciaEnum experiencia) {
        this.experiencia = experiencia;
    }

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
