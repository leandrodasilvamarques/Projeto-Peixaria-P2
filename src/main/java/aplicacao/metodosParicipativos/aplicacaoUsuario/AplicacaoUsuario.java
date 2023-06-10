package aplicacao.metodosParicipativos.aplicacaoUsuario;

import java.util.Scanner;

public class AplicacaoUsuario {

    public static int recebeInt(){

        Scanner input = new Scanner(System.in);

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public static void AplicacaoUsuario() {

        UserViewUsuario.printOpcoesUsuario();
        decisaoOpcoesAdmin(recebeInt());

    }

    public static void decisaoOpcoesAdmin(int opcao){

        final int REALIZAR_COMPRAS = 1;
        final int VISUALIZAR_PRECOS = 2;
        final int SIMULAR_DESCONTO = 3;

        switch (opcao){
            case REALIZAR_COMPRAS ->{

            }


            case VISUALIZAR_PRECOS->{

            }

            case SIMULAR_DESCONTO->{

            }
        }
}

}
