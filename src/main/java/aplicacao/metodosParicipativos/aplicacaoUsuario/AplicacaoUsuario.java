package aplicacao.metodosParicipativos.aplicacaoUsuario;

import aplicacao.metodosParicipativos.aplicacaoAdmin.UserViewAdmin;
import aplicacao.metodosParicipativos.interacoesIniciais.UserViewInicial;
import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;

import java.util.Scanner;

public class AplicacaoUsuario {

    public static void AplicacaoUsuario() {

        UserViewUsuario.printOpcoes();
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





    public static int recebeInt(){

        Scanner input = new Scanner(System.in);

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }
}

}
