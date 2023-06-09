package aplicacao;

// classe User Interface, com os métodos para printar na tela

import javax.swing.*;
import java.util.Scanner;

public class UserView {

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
}
