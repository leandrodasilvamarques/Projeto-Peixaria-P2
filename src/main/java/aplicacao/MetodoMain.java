package aplicacao;

import classes.Gerente;
import classes.Pescaria;

import javax.swing.*;

public class MetodoMain {

    private static final Pescaria pescaria = new Pescaria();
    private static final int FAZER_LOGIN = 1;


    public static void main(String[] args) {

        String escolhaDeEntrada = JOptionPane.showInputDialog(null,"Seja Bem Vindo(a)!\n" +
                "[1] FAZER LOGIN\n" +
                "[2] SAIR\n");

        String emailParaLogin = JOptionPane.showInputDialog("Email: ");
        String senhaParaLogin = JOptionPane.showInputDialog("Senha: ");

       if(new Gerente().autenticar(emailParaLogin, senhaParaLogin)){
           JOptionPane.showMessageDialog(null,"Logado");
       }


    }
}
