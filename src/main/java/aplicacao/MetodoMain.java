package aplicacao;

import javax.swing.*;

public class MetodoMain {
    private static final int FAZER_LOGIN = 1;

    public static void main(String[] args) {

        String escolhaDeEntrada = JOptionPane.showInputDialog(null,"Seja Bem Vindo(a)!\n" +
                "[1] FAZER LOGIN\n" +
                "[2] SAIR\n");

        switch (Integer.parseInt(escolhaDeEntrada)){
            case FAZER_LOGIN -> {

            }

        }
    }
}
