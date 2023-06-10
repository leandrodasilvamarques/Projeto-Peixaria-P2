package classes.setores.recursosHumanos;

import classes.setores.empresa.Pescaria;

public class Funcionario {

    //atributos
    private String nome;
    private String cpf;
    private String cargo;
    private double salario = Pescaria.SETOR_FINANCEIRO.valores.getPrecoBaseFuncionario();
    private double bonus = 0;
    //

    //construtor
    public Funcionario(String nome, String cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        Pescaria.SETOR_RECURSOS_HUMANOS.adicionarFuncionario(this);
    }
    public Funcionario(){
    }
    //

    //getters setters

    //getters setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario + bonus;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //

    //metodos para aplicação
    public void incrementarBonus(double bonus){
        this.bonus+=bonus;
    }
    //

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=R$" + salario +
                ", bonus=R$" + bonus +
                '}';
    }
}
