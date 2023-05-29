package pescariaApi.classesSucessoras;

import pescariaApi.interfaces.Funcionario;

public class Pessoa implements Funcionario {
 String nome;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
     return "nome: " + nome;
 }

    @Override
    public double getSalario() {
        return 0;
    }
}
