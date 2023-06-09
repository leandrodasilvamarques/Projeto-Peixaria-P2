package aplicacao;

import classes.setores.recursosHumanos.Gerente;

import javax.swing.*;

public class MetodoMain {

    static UserView UI = new UserView();
    static boolean escolhaSair = false;

    public static void main(String[] args) {

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
}