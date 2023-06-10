package classes.setores.recursosHumanos;

import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Funcionario;

public class Pescador extends Funcionario {

    //construtores
    public Pescador(String nome, String cpf) {
        super(nome, cpf, "Pescador");
        Pescaria.SETOR_RECURSOS_HUMANOS.adicionarFuncionario(this);
    }
    //
}
