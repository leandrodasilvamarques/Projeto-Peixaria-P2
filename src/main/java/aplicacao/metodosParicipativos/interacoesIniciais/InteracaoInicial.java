package aplicacao.metodosParicipativos.interacoesIniciais;

import aplicacao.metodosParicipativos.aplicacaoAdmin.AplicacaoAdmin;
import aplicacao.metodosParicipativos.aplicacaoUsuario.AplicacaoUsuario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteracaoInicial {

    private Scanner scanner = new Scanner(System.in);
    public UserViewInicial userViewInicial;

    public InteracaoInicial() {
        userViewInicial = new UserViewInicial();
    }

    private int realizaEntradaNoSistema() {
        userViewInicial.printaOpcoesDoUsuario();
        int escolhaDoUsuario = 0;

        try{
            escolhaDoUsuario = scanner.nextInt();
            testaEntradaDoLogin(escolhaDoUsuario);
        } catch (InputMismatchException e){
            System.out.println("Entrada inválida. Escolha uma das opções acima, por favor!");
        }


        return escolhaDoUsuario;
    }


    //esse metodo so testa a entrada do login.
    private void testaEntradaDoLogin(int escolhaDoUsuario) throws InputMismatchException {
        final int FAZER_LOGIN = 1;
        final int ENTRAR_COMO_USUARIO = 2;

        if (escolhaDoUsuario != FAZER_LOGIN &&
                escolhaDoUsuario != ENTRAR_COMO_USUARIO){
        }

    }

    public void aplicacaoAdminOuUsuario() {

        if (realizaEntradaNoSistema() == 1) {

            AplicacaoAdmin.sistemaAdmin();

        } else {

            AplicacaoUsuario.aplicacaoUsuario();

        }
    }

}
