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

    public static void printOpcoesAdmin(){

        System.out.println("[1] Setor Embarcação\n" +
                "[2]Setor Financeiro\n" +
                "[3]Setor Recursos Humanos\n" +
                "[4]Setor de Registros\n");

    }

    public static void printOpcoesUsuario(){

        System.out.println("[1]\n" +
                "[2]\n" +
                "[3]\n" +
                "[4]\n" +
                "[5]\n");

    }

}
