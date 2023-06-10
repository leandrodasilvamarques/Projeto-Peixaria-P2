package classes.setores.recursosHumanos;

import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Funcionario;
import classes.setores.registro.Pesca;
import classes.setores.registro.SetorRegistro;

public class Pescador extends Funcionario {

    //atributos
    public SetorRegistro registroPescador =  new SetorRegistro();
    //

    //construtores
    public Pescador(String nome, String cpf) {
        super(nome, cpf, "Pescador");
        Pescaria.SETOR_RECURSOS_HUMANOS.adicionarFuncionario(this);
        Pescaria.SETOR_REGISTRO.adicionarHistoricoDePescador(registroPescador);
    }
    //

    //metodos para aplicação
    public void adicinarPescaAoRegistro(Pesca pesca){
        registroPescador.adicionarPesca(pesca);

    }
    //
}
