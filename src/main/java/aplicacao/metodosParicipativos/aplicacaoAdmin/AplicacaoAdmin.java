package aplicacao.metodosParicipativos.aplicacaoAdmin;

import aplicacao.metodosParicipativos.interacoesIniciais.UserViewInicial;

import java.util.Scanner;

public class AplicacaoAdmin {


    public static void aplicacaoAdmin() {

        UserViewInicial.printOpcoesAdmin();
        decisaoOpcoesAdmin(recebeOpcoesAdmin());

    }

    public static void decisaoOpcoesAdmin(int opcao){

        final int SETOR_EMBARCACAO = 1;
        final int SETOR_FINANCEIRO = 2;
        final int SETOR_RECURSOS_HUMANOS = 3;
        final int SETOR_DE_REGISTRO = 4;

        switch (opcao){
            case(SETOR_EMBARCACAO):



            break;

            case(SETOR_FINANCEIRO):

            break;

            case(SETOR_RECURSOS_HUMANOS):

            break;

            case(SETOR_DE_REGISTRO):

            break;
        }

    }

    public static int recebeOpcoesAdmin(){

        Scanner input = new Scanner(System.in);

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }
}
