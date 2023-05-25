package pescariaApi.embarcacao;

import pescariaApi.classesSucessoras.ExperienciaEnum;
import pescariaApi.classesSucessoras.Pessoa;
import pescariaApi.interfaces.Funcionario;

public class Pescador extends Pessoa implements Funcionario {
    ExperienciaEnum experiencia;

    public ExperienciaEnum getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(ExperienciaEnum experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public double getSalario() {
        return 0;
    }
}
