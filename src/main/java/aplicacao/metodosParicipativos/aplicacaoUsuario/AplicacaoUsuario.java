package aplicacao.metodosParicipativos.aplicacaoUsuario;

import classes.setores.registro.SetorRegistro;

import java.util.Scanner;

public class AplicacaoUsuario {
    private static Scanner input = new Scanner(System.in);

    public static int recebeInt(){
        int opcao = input.nextInt();
        input.nextLine();
        return opcao;
    }
    public static double recebeDouble(){
        double opcao = input.nextDouble();
        input.nextLine();
        return opcao;
    }

    public static void aplicacaoUsuario() {

        UserViewUsuario.printOpcoesUsuario();
        decisaoOpcoesAdmin(recebeInt());

    }

    public static void decisaoOpcoesAdmin(int opcao){

        final int REALIZAR_COMPRAS = 1;
        final int VISUALIZAR_PRECOS = 2;
        final int SIMULAR_DESCONTO = 3;

        switch (opcao){
            case REALIZAR_COMPRAS ->{
                System.out.println("Quantos quilos: ");
                double subtracaoDeQuilos = recebeDouble();

                SetorRegistro.getTotalDeQuilosDeTodasAsPescas() - subtracaoDeQuilos;
            }


            case VISUALIZAR_PRECOS->{

            }

            case SIMULAR_DESCONTO->{

            }

            default -> throw new IllegalStateException("Unexpected value: " + opcao);

        }
}

}
