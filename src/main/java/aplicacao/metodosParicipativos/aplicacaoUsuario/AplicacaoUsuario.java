package aplicacao.metodosParicipativos.aplicacaoUsuario;

import classes.setores.empresa.Pescaria;
import classes.setores.financeiro.Valores;

import java.util.Scanner;

public class AplicacaoUsuario {
    private static double valorTotalDaCompra = 0;
    private static Scanner input = new Scanner(System.in);

    public static int recebeInt() {
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }

    public static double recebeDouble() {
        double opcao = input.nextDouble();
        input.nextLine();
        return opcao;
    }

    public static void case1RealizarCompras() {
        System.out.println("Quantos quilos: ");
        double subtracaoDeQuilos = recebeDouble();

        Pescaria.SETOR_REGISTRO.subtracaoDeQuilosDePeixe(subtracaoDeQuilos);
        System.out.println("Compra realizada e estoque subtraido...");
    }

    public static void case2VisualizarPreco() {
        System.out.println(Pescaria.SETOR_FINANCEIRO.valores.getValorDoQuiloDaSardinha());
    }

    public static double case3SimularDesconto() {
        System.out.println("Quantos quilos: ");
        double quilosAComprarPeloUsuario = recebeDouble();

        Pescaria.SETOR_REGISTRO.simulacaoSubtracaoDeQuilosDePeixe(quilosAComprarPeloUsuario);

        System.out.println("Valor total: " + valorTotalDaCompra);
        System.out.println("Compra realizada e estoque subtraido...");

        valorTotalDaCompra = 0;
        return quilosAComprarPeloUsuario;
    }

    public static void decisaoDoUsuario(int opcao) {

        final int REALIZAR_COMPRAS = 1;
        final int VISUALIZAR_PRECOS = 2;
        final int SIMULAR_DESCONTO = 3;

        switch (opcao) {
            case REALIZAR_COMPRAS -> {
                case1RealizarCompras();
            }

            case VISUALIZAR_PRECOS -> {
                case2VisualizarPreco();
            }

            case SIMULAR_DESCONTO -> {
                case3SimularDesconto();
            }

            default -> throw new IllegalStateException("Unexpected value: " + opcao);

        }
    }
    public static void aplicacaoUsuario() {

        UserViewUsuario.printOpcoesUsuario();
        decisaoDoUsuario(recebeInt());

    }
}
