package aplicacao;

import classes.setores.recursosHumanos.Gerente;

import javax.swing.*;

public class MetodoMain {

    static UserInterface UI = new UserInterface();

    public static void main(String[] args) {

        boolean autenticado = false;
        do {
            String login = JOptionPane.showInputDialog(null, "Login:");
            String senha = JOptionPane.showInputDialog(null, "Senha:");

            if (new Gerente().autenticar(login, senha)) {
                autenticado = true;
                UI.printaTelaPrincipal();
            } else {
                JOptionPane.showMessageDialog(null, "Login ou senha inválidos. Tente novamente.");
            }

        } while (!autenticado);
    }
}