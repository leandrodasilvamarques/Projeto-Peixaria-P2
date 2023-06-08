package classes.setores.recursosHumanos;

import classes.setores.recursosHumanos.Funcionario;
import controladores.Login;
import controladores.MetodosAdminstrativos;

public class
Gerente extends Funcionario implements Login {

    //atributos
    private String emailParaLogin = "admin";
    private String senhaParaLogin = "123";
    public MetodosAdminstrativos metodosAdminstrativos = new MetodosAdminstrativos();
    //

    //construtor
    public Gerente() {
    }
    public Gerente(String nome, String cpf) {
        super(nome, cpf, "Gerente");
    }
    //

    //getters setters
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
    //

    //overriders
    @Override
    public boolean autenticar(String emailParaLogin, String senhaParaLogin) {
        return this.emailParaLogin.equals(emailParaLogin) && this.senhaParaLogin.equals(senhaParaLogin);
    }
    //
}
