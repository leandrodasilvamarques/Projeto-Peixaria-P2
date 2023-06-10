package aplicacao.metodosParicipativos.aplicacaoAdmin;

import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;
import classes.setores.financeiro.Valores;
import classes.setores.recursosHumanos.Funcionario;
import classes.setores.recursosHumanos.Pescador;
import classes.setores.registro.Peixe;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoAdmin {

    public static Scanner input = new Scanner(System.in);


    public static void aplicacaoAdmin() {

        UserViewAdmin.printOpcoesAdmin();
        decisaoOpcoesAdmin(recebeInt());

    }

    public static void decisaoOpcoesAdmin(int opcao){

        final int SETOR_EMBARCACAO = 1;
        final int SETOR_FINANCEIRO = 2;
        final int SETOR_RECURSOS_HUMANOS = 3;
        final int SETOR_DE_REGISTRO = 4;

        switch (opcao){
            case(SETOR_EMBARCACAO):

                UserViewAdmin.printOpcoesSetorEmbarcacao();
                decisaoOpcoesAdminEmbarcacao(recebeInt());

            break;

            case(SETOR_FINANCEIRO):

                UserViewAdmin.printOpcoesSetorFinanceiro();
                decisaoOpcoesSetorFinanceiro(recebeInt());

            break;

            case(SETOR_RECURSOS_HUMANOS):

                UserViewAdmin.printOpcoesSetorRecursosHumanos();
                decisaoOpcoesSetorRcursosHumanos(recebeInt());

            break;

            case(SETOR_DE_REGISTRO):



            break;
        }

    }

    public static void decisaoOpcoesAdminEmbarcacao(int opcao){

        final int MOSTRAR_BARCOS = 1;
        final int CADASTRAR_NOVO_BARCO = 2;
        final int CADASTRAR_NOVA_PESCA = 3;

        switch (opcao){

            case(MOSTRAR_BARCOS):

                System.out.println("todas embarcações: "+Pescaria.SETOR_EMBARCACAO.getListaDeBarcos());

            break;

            case(CADASTRAR_NOVO_BARCO):

                System.out.println("Digite ID do barco: ");
                int id = recebeInt();

                Pescaria.SETOR_EMBARCACAO.adicionaNovoBarco(new Barco(id));

            break;

            case(CADASTRAR_NOVA_PESCA):

                System.out.println("Digite o nome dos pescadores separados por espaço: ");
                ArrayList<Pescador> pescadores = inputPescadores();

                System.out.println("Tipo do peixe: ");
                Peixe tipoDoPeixe = recoebeTipoDoPeixe();

                System.out.println("Peso total da pesca em quilos: ");
                double quilosPesca = recebeDouble();

                System.out.println("ID do barco que ocorreu a pesca:");
                int idBarco = recebeInt();

                //tratar metodo getBarcoPorID caso nao exista barco com estre ID
                Barco barcoEncontrado = Pescaria.SETOR_EMBARCACAO.getBarcoPorId(idBarco);

                barcoEncontrado.adicionarNovaPesca(pescadores, tipoDoPeixe, quilosPesca);

            break;

        }
    }

    public static Peixe recoebeTipoDoPeixe(){

        String peixeString = input.nextLine().toUpperCase();

        //passivel de erro caso o string n for um tipo real de peixe da classe Enum
        Peixe tipoDoPeixe = (Peixe.valueOf(peixeString));
        return tipoDoPeixe;
    }

    public static ArrayList<Pescador> inputPescadores(){

        ArrayList<Pescador> pescadores = new ArrayList<>();

        String nomeStringPescadores = input.nextLine();

        String[] pescadoresString = nomeStringPescadores.split(" ");

        for (String stringPorString: pescadoresString){

            Pescador pescadorLocalizado =  Pescaria.SETOR_RECURSOS_HUMANOS.getPescadorPorNome(stringPorString);

            if(pescadorLocalizado == null){

                Pescador novoPescador = new Pescador(stringPorString, null);
                pescadores.add(novoPescador);

            }
            else{

                pescadores.add(pescadorLocalizado);

            }
        }

    return pescadores;
    }

    public static void decisaoOpcoesSetorFinanceiro(int opcao){

        final int PRECO_PESCAODR = 1;
        final int VALOR_QUILO_SARDINHA = 2;
        final int DEFINIR_NOVO_PRECO_PESCADOR = 3;
        final int DEFINIR_VALOR_QUILO_SARDINHA = 4;

        switch (opcao){

            case(PRECO_PESCAODR):

                System.out.println("Valor unitario base de pescador: R$" + Pescaria.SETOR_FINANCEIRO.valores.getPrecoPescador());

            break;

            case(VALOR_QUILO_SARDINHA):

                System.out.println("Valor quilo da Sardinha: R$"+ Pescaria.SETOR_FINANCEIRO.valores.getValorDoQuiloDaSardinha());

            break;

            case(DEFINIR_NOVO_PRECO_PESCADOR):

                System.out.println("Digite o novo valor da Sardinha: R$");
                double novoValor = recebeDouble();

                Pescaria.SETOR_FINANCEIRO.valores.setPrecoPescador(novoValor);

            break;

            case(DEFINIR_VALOR_QUILO_SARDINHA):

                System.out.println("Digite o novo valor do quilo da Sardinha R$");
                double novoPreco = recebeDouble();

                Pescaria.SETOR_FINANCEIRO.valores.setValorDoQuiloDaSardinha(novoPreco);

            break;

        }

    }

    private static void decisaoOpcoesSetorRcursosHumanos(int opcao) {

        final int EXIBIR_LISTA_DE_FUNCIONARIOS = 1;
        final int EXIBIR_LISTA_DE_PESCADORES = 2;
        final int FICHA_DE_FUNCIONARIO_POR_NOME = 3;
        final int BUSCAR_BONUS_DO_FUNCIONARIO_POR_NOME = 4;
        final int DAR_BONUS_AO_FUNCIONARIO = 5;
        final int BUSCA_DE_PARTICIAPAO_PESCADOR_POR_NOME = 6;
        final int CADASTRAR_NOVO_FUNCIONARIO = 7;

        switch (opcao){

            case(EXIBIR_LISTA_DE_FUNCIONARIOS):

                System.out.println("Lista de todos os funcinários da empresa: "+ Pescaria.SETOR_RECURSOS_HUMANOS.getTodosFuncionarios());

            break;

            case(EXIBIR_LISTA_DE_PESCADORES):

                System.out.println("Lista de todos os funcinários da empresa: "+ Pescaria.SETOR_RECURSOS_HUMANOS.getTodosPescadores());

                break;

            case(FICHA_DE_FUNCIONARIO_POR_NOME):

                System.out.println("Digite nome e sobrenome do funcionario: ");
                Funcionario funcionarioLocalizado = recebeFuncionario();

                System.out.println("Ficha de funcionario: "+ funcionarioLocalizado.toString());

            break;

            case(BUSCAR_BONUS_DO_FUNCIONARIO_POR_NOME):

                System.out.println("Digite nome e sobrenome do funcionario: ");
                funcionarioLocalizado = recebeFuncionario();

                System.out.println(funcionarioLocalizado.getBonus());

            break;

            case(DAR_BONUS_AO_FUNCIONARIO):

                System.out.println("Digite nome e sobrenome do funcionario: ");
                funcionarioLocalizado = recebeFuncionario();

                System.out.println("Digite o valor do bonûs para ser incrementado ao funcioanrio: ");
                double bonusAIncrementar = recebeDouble();

                funcionarioLocalizado.incrementarBonus(bonusAIncrementar);

            break;

            case(BUSCA_DE_PARTICIAPAO_PESCADOR_POR_NOME):

                System.out.println("Digite nome e sobrenome do pescador: ");
                Pescador pescadorLocalizado = Pescaria.SETOR_RECURSOS_HUMANOS.getPescadorPorNome(input.nextLine());

                System.out.println("Historico do pescador: "+pescadorLocalizado.registroPescador);

            break;

            case(CADASTRAR_NOVO_FUNCIONARIO):



            break;

        }

    }
    public static Funcionario recebeFuncionario(){

        System.out.println("Digite nome e sobrenome do funcionario");
        String nomeABuscar = input.nextLine();

        //tratar erro caso não seja encontrado funcionario
        Funcionario funcionarioLocalizado = Pescaria.SETOR_RECURSOS_HUMANOS.getFuncionarioPorNome(nomeABuscar);

        return funcionarioLocalizado;
    }

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

}