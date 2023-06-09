package aplicacao.metodosParicipativos.interacoesIniciais;

import aplicacao.metodosParicipativos.aplicacaoAdmin.AplicacaoAdmin;
import aplicacao.metodosParicipativos.aplicacaoUsuario.AplicacaoUsuario;
import classes.setores.recursosHumanos.Gerente;

import javax.swing.*;

public class InteracaoInicial {

    public static void login(){

        UserViewInicial UI = new UserViewInicial();
        boolean escolhaSair = false;

        do {
            String login = JOptionPane.showInputDialog(null, "Login:");
            String senha = JOptionPane.showInputDialog(null, "Senha:");
            int escolhaDoUsuarioNoLogin = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

            switch (escolhaDoUsuarioNoLogin){
                case 0 -> {
                    if (new Gerente().autenticar(login,senha)){
                        escolhaSair = true;
                    } else {
                        UI.printMensagemDeErroNoLogin();
                    }
                }
                case 1 -> {
                    UI.printTenteNovamente();
                }
                case 2 ->{
                    UI.printMensagemDeErroNoLogin();
                    escolhaSair = true;
                }
            }
        } while (!escolhaSair);

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
