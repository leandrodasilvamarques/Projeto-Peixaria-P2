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
                    }
                }
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Tentativa de Login cancelada. Tente novamente!");
                }
                case 2 ->{
                    escolhaSair = true;
                }
            }
        } while (!escolhaSair);
    }
}