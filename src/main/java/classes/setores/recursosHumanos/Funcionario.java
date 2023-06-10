package classes.setores.recursosHumanos;

public abstract class Funcionario {

    //atributos
    private String nome;
    private String cpf;
    private String cargo;
    //

    //construtor
    public Funcionario(String nome, String cpf, String cargo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }
    public Funcionario(){
    }
    //

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
    //
}
