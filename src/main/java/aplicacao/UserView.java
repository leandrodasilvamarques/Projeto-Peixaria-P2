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

    public void printMensagemDeErroNoLogin() {
        JOptionPane.showMessageDialog(null, "Tentativa de Login cancelada. Reinicie o programa!");
    }

    public void printTenteNovamente() {
        JOptionPane.showMessageDialog(null, "Tentativa de Login cancelada. Tente novamente!");
    }
}
