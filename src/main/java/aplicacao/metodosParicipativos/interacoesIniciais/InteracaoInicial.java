package aplicacao.metodosParicipativos.interacoesIniciais;

import aplicacao.metodosParicipativos.aplicacaoAdmin.AplicacaoAdmin;
import aplicacao.metodosParicipativos.aplicacaoUsuario.AplicacaoUsuario;

import java.util.Scanner;

public class InteracaoInicial {

    private Scanner scanner = new Scanner(System.in);
    public UserViewInicial userViewInicial;

    public InteracaoInicial(){
        userViewInicial = new UserViewInicial();
    }

    public void realizaEntradaNoSistema() {

        final int FAZER_LOGIN = 1;
        final int ENTRAR_COMO_USUARIO = 2;

        int escolhaDoUsuario;

        userViewInicial.printaOpcoesDoUsuario();
        escolhaDoUsuario = scanner.nextInt();

        if (escolhaDoUsuario == FAZER_LOGIN) {

        }

    }





    public static void aplicacaoAdminOuUsuario(){

        boolean admin = false;

        if (admin == true){

            AplicacaoAdmin.aplicacaoAdmin();

        }
        else{

            AplicacaoUsuario.aplicacaoUsuario();

        }
    }
}
