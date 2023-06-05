package pescariaApi.Empresa.entidades.Financeiro.Resgistros;

import ClassesLogin.Login;
import pescariaApi.classesAbstratas.Funcionario;

public class Gerente extends Funcionario implements Login {

    private String emailParaLogin;
    private String senhaParaLogin;
    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public boolean autenticar(String emailParaLogin, String senhaParaLogin) {
        return this.emailParaLogin.equals(emailParaLogin) && this.senhaParaLogin.equals(senhaParaLogin);
    }
}
