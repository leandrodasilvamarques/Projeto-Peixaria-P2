package pescariaApi.Empresa.entidades.Financeiro.Resgistros;

import ClassesLogin.Login;
import pescariaApi.classesAbstratas.Funcionario;

public class Gerente extends Funcionario implements Login {

    private String emailParaLogin = "admin";
    private String senhaParaLogin = "123";
    public Gerente() {
    }

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getEmailParaLogin() {
        return emailParaLogin;
    }

    public void setEmailParaLogin(String emailParaLogin) {
        this.emailParaLogin = emailParaLogin;
    }

    public String getSenhaParaLogin() {
        return senhaParaLogin;
    }

    public void setSenhaParaLogin(String senhaParaLogin) {
        this.senhaParaLogin = senhaParaLogin;
    }

    @Override
    public boolean autenticar(String emailParaLogin, String senhaParaLogin) {
        return this.emailParaLogin.equals(emailParaLogin) && this.senhaParaLogin.equals(senhaParaLogin);
    }
}
