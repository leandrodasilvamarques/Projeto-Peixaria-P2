package classes.setores.recursosHumanos;

import java.util.ArrayList;

public class SetorRecursosHumanos {

    //atributos
    ArrayList<Funcionario> todosFuncionarios;
    //

    //getters setters
    public Funcionario getFuncionarioPorNome(String nome){

        for(Funcionario funcionario: todosFuncionarios) {

            if (funcionario.getNome().equalsIgnoreCase(nome)) {
                return funcionario;
            }
        }
        return null;
    }
    //

    //metodos para aplicação
    public void adicionarFuncionario(Funcionario funcionario){
        todosFuncionarios.add(funcionario);
    }
    //
}
