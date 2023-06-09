package aplicacao.metodosParicipativos.interacoesIniciais;

// classe User Interface, com os métodos para printar na tela


import javax.swing.*;

public class UserViewInicial {

    public static void printaTelaPrincipal(){
        JOptionPane.showInputDialog(null, "[1]\n" +
                "[2]\n" +
                "[3]\n" +
                "[4]\n" +
                "[5]\n");
    }

    public static void printMensagemDeErroNoLogin() {
        JOptionPane.showMessageDialog(null, "Tentativa de Login cancelada. Reinicie o programa!");
    }

    public static void printTenteNovamente() {
        JOptionPane.showMessageDialog(null, "Tentativa de Login cancelada. Tente novamente!");
    }

    public static void printOpcoesUsuario(){

        System.out.println("[1]\n" +
                "[2]\n" +
                "[3]\n" +
                "[4]\n" +
                "[5]\n");

    }

}
