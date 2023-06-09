package aplicacao;

// classe User Interface, com os métodos para printar na tela


import javax.swing.*;

public class UserView {

    public void printaTelaPrincipal(){
        JOptionPane.showInputDialog(null, "[1]\n" +
                "[2]\n" +
                "[3]\n" +
                "[4]\n" +
                "[5]\n");
    }
}
