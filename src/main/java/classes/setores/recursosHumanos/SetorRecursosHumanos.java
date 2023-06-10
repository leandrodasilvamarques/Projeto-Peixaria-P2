package classes.setores.recursosHumanos;

import java.util.ArrayList;

public class SetorRecursosHumanos {

    //atributos
    ArrayList<Funcionario> todosFuncionarios;
    ArrayList<Pescador> todosPescadores;
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
    public ArrayList<Funcionario> getTodosFuncionarios() {
        return todosFuncionarios;
    }
    public void setTodosFuncionarios(ArrayList<Funcionario> todosFuncionarios) {
        this.todosFuncionarios = todosFuncionarios;
    }
    public ArrayList<Pescador> getTodosPescadores() {
        return todosPescadores;
    }
    public void setTodosPescadores(ArrayList<Pescador> todosPescadores) {
        this.todosPescadores = todosPescadores;
    }
    public Pescador getPescadorPorNome(String nome){

        for(Pescador pescador: todosPescadores) {

            if (pescador.getNome().equalsIgnoreCase(nome)) {
                return pescador;
            }
        }
        return null;

    }
    //

    //metodos para aplicação
    public void adicionarFuncionario(Funcionario funcionario){
        todosFuncionarios.add(funcionario);
    }
    public void adicionarPescador(Pescador pescador){
        todosPescadores.add(pescador);
    }
    //
}
