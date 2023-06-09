package aplicacao;

import classes.setores.recursosHumanos.Gerente;

import javax.swing.*;

public class UserInteration {

    public static void aplicacaoUsuario(){

    }

    public static void aplicacaoAdmin(){

    }

    public static void login(){

        UserView UI = new UserView();
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

            aplicacaoAdmin();

        }
        else{

            aplicacaoUsuario();

        }

    }

}
