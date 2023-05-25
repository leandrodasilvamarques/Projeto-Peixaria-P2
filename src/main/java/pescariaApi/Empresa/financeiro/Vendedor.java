package pescariaApi.Empresa.financeiro;

import pescariaApi.classesSucessoras.ExperienciaEnum;
import pescariaApi.classesSucessoras.Pessoa;

public class Vendedor{


    private Pessoa pessoa;
    private ExperienciaEnum experiencia;
    public double vendaPorDia;
    public double salario;

    // Construtor
    public Vendedor(Pessoa pessoa, ExperienciaEnum experiencia, double vendaPorDia, double salario) {
        this.pessoa = pessoa;
        this.experiencia = experiencia;
        this.vendaPorDia = vendaPorDia;
        this.salario = salario;
    }

    // Getters e Setters
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ExperienciaEnum getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(ExperienciaEnum experiencia) {
        this.experiencia = experiencia;
    }

    public double getVendaPorDia() {
        return vendaPorDia;
    }

    public void setVendaPorDia(double vendaPorDia) {
        this.vendaPorDia = vendaPorDia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
