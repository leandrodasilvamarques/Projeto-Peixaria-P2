package aplicacao;

// classe User Interface, com os métodos para printar na tela

import classes.setores.recursosHumanos.Gerente;

import javax.swing.*;
import java.util.Scanner;

public class UserInterface {

    public void printaTelaPrincipal(){
        JOptionPane.showInputDialog(null, "[1]\n" +
                "[2]\n" +
                "[3]\n" +
                "[4]\n" +
                "[5]\n");
    }

    public int respostaPainelInicial(){
        Scanner input = new Scanner(System.in);

        int resposta = input.nextInt();
        input.nextLine();
        return resposta;
    }

    public void decisaoPainelInicial(int resposta){
        switch (resposta){
            case (1) -> System.out.println("Login com admin");

            case (2) -> System.out.println("Login como usuario");
        }
    }

    public void autenticadorDeUsuario(UserInterface UI){
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
