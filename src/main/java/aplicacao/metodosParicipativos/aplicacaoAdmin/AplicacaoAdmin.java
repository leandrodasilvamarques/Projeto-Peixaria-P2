package aplicacao.metodosParicipativos.aplicacaoAdmin;

import classes.setores.embarcacao.Barco;
import classes.setores.empresa.Pescaria;
import classes.setores.recursosHumanos.Funcionario;
import classes.setores.recursosHumanos.Pescador;
import classes.setores.registro.Peixe;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoAdmin {

    public static Scanner input = new Scanner(System.in);

    //entrada gerenica de dados
    private static int recebeInt(){

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }
    private static double recebeDouble(){

        double opcao = input.nextDouble();
        input.nextLine();

        return opcao;

    }
    //

    //coração da aplicação
    public static void aplicacaoAdmin() {

        decisaoOpcoesAdmin(recebeInt());

    }
    public static void decisaoOpcoesAdmin(int opcao){

        boolean sairOpcoesAdmin = false;

        do {

            UserViewAdmin.printOpcoesAdmin();

            final int SETOR_EMBARCACAO = 1;
            final int SETOR_FINANCEIRO = 2;
            final int SETOR_RECURSOS_HUMANOS = 3;
            final int SETOR_DE_REGISTRO = 4;
            final int SAIR = 5;

            switch (opcao) {
                case (SETOR_EMBARCACAO):

                    decisaoOpcoesAdminEmbarcacao(recebeInt());

                    break;

                case (SETOR_FINANCEIRO):

                    decisaoOpcoesSetorFinanceiro(recebeInt());

                    break;

                case (SETOR_RECURSOS_HUMANOS):

                    decisaoOpcoesSetorRcursosHumanos(recebeInt());

                    break;

                case (SETOR_DE_REGISTRO):

                    decisaoOpcoesSetorRegistro(recebeInt());

                    break;

                case (SAIR):

                    sairOpcoesAdmin = true;

                break;
            }
        }while(sairOpcoesAdmin == false);
    }
    //

    //embarcação
    public static void decisaoOpcoesAdminEmbarcacao(int opcao){

        boolean voltarOpcoresEmbarcacao = false;

        do {

            UserViewAdmin.printOpcoesSetorEmbarcacao();

            final int MOSTRAR_BARCOS = 1;
            final int CADASTRAR_NOVO_BARCO = 2;
            final int CADASTRAR_NOVA_PESCA = 3;
            final int VOLTAR = 4;

            switch (opcao) {

                case (MOSTRAR_BARCOS):

                    System.out.println("todas embarcações: " + Pescaria.SETOR_EMBARCACAO.getListaDeBarcos());

                    break;

                case (CADASTRAR_NOVO_BARCO):

                    System.out.println("Digite ID do barco: ");
                    int id = recebeInt();

                    new Barco(id);

                    break;

                case (CADASTRAR_NOVA_PESCA):

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

                case (VOLTAR):

                    voltarOpcoresEmbarcacao = true;

                    break;

            }
        }while(voltarOpcoresEmbarcacao == false);
    }
    //entrada de dados da embarcação
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
    public static Peixe recoebeTipoDoPeixe(){

        String peixeString = input.nextLine().toUpperCase();

        //passivel de erro caso "String" recebido não for um tipo real de peixe da classe Enum
        Peixe tipoDoPeixe = (Peixe.valueOf(peixeString));
        return tipoDoPeixe;
    }
    //

    //setor financeiro
    public static void decisaoOpcoesSetorFinanceiro(int opcao){

        boolean voltarOpcoesFinancneiro = false;

        do {

            UserViewAdmin.printOpcoesSetorFinanceiro();

            final int PRECO_BASE_FUNCIONARIO = 1;
            final int DEFINIR_VALOR_BASE_FUNCIONARIO = 2;
            final int VALOR_QUILO_SARDINHA = 3;
            final int DEFINIR_VALOR_QUILO_SARDINHA = 4;
            final int EXIBIR_DINHEIRO_EM_CAIXA = 5;
            final int EXIBIR_RENDA_LIQUIDA = 6;
            final int EXIBIR_DESPESAS_TOTAIS = 7;
            final int EXIBIR_RENDA_BRUTA = 8;
            final int EXIBIR_RELATORIO_ENTRE_DATAS = 9;
            final int VOLTAR = 10;

            switch (opcao) {

                case (PRECO_BASE_FUNCIONARIO):

                    System.out.println("Salário base Funcionário: R$" + Pescaria.SETOR_FINANCEIRO.valores.getPrecoBaseFuncionario());

                    break;

                case (DEFINIR_VALOR_BASE_FUNCIONARIO):

                    System.out.println("Digite o novo valor base para os funcionários: ");
                    double novoSalarioBase = recebeDouble();

                    Pescaria.SETOR_FINANCEIRO.valores.setPrecoBaseFuncionario(novoSalarioBase);

                    break;

                case (VALOR_QUILO_SARDINHA):

                    System.out.println("Valor quilo da Sardinha: R$" + Pescaria.SETOR_FINANCEIRO.valores.getValorDoQuiloDaSardinha());

                    break;

                case (DEFINIR_VALOR_QUILO_SARDINHA):

                    System.out.println("Digite o novo valor do quilo da Sardinha R$");
                    double novoPreco = recebeDouble();

                    Pescaria.SETOR_FINANCEIRO.valores.setValorDoQuiloDaSardinha(novoPreco);

                    break;

                case (EXIBIR_DINHEIRO_EM_CAIXA):

                    System.out.println("Dinheiro em caixa: R$" + Pescaria.SETOR_FINANCEIRO.valores.getDinheiroEmCaixa());

                    break;

                case (EXIBIR_RENDA_LIQUIDA):

                    System.out.println("Renda liquida total: R$" + Pescaria.SETOR_REGISTRO.getRendaLiquidaTotal());

                    break;

                case (EXIBIR_DESPESAS_TOTAIS):

                    System.out.println("De");

                    break;

                case (EXIBIR_RENDA_BRUTA):

                    System.out.println("Renda bruta das pescas: R$" + Pescaria.SETOR_REGISTRO.getRendaBrutaTotal());

                    break;

                case (EXIBIR_RELATORIO_ENTRE_DATAS):

                    break;

                case (VOLTAR):

                    voltarOpcoesFinancneiro = true;

                break;
            }
        }while(voltarOpcoesFinancneiro == false);
    }
    //

    //setor recursos humanos
    private static void decisaoOpcoesSetorRcursosHumanos(int opcao) {

        boolean voltarOpcoesRecursosHumanos = false;

        do {

            UserViewAdmin.printOpcoesSetorRecursosHumanos();

            final int EXIBIR_LISTA_DE_FUNCIONARIOS = 1;
            final int EXIBIR_LISTA_DE_PESCADORES = 2;
            final int FICHA_DE_FUNCIONARIO_POR_NOME = 3;
            final int SALARIO_BASE_FUNCIONARIOS = 4;
            final int DEFINIR_SALARIO_BASE_FUNCIONARIO = 5;
            final int BUSCAR_BONUS_DO_FUNCIONARIO_POR_NOME = 6;
            final int DAR_BONUS_AO_FUNCIONARIO = 7;
            final int BUSCA_DE_PARTICIAPAO_PESCADOR_POR_NOME = 8;
            final int CADASTRAR_NOVO_FUNCIONARIO = 9;
            final int VOLTAR = 10;

            switch (opcao) {

                case (EXIBIR_LISTA_DE_FUNCIONARIOS):

                    System.out.println("Lista de todos os funcinários da empresa: " + Pescaria.SETOR_RECURSOS_HUMANOS.getTodosFuncionarios());

                    break;

                case (EXIBIR_LISTA_DE_PESCADORES):

                    System.out.println("Lista de todos os funcinários da empresa: " + Pescaria.SETOR_RECURSOS_HUMANOS.getTodosPescadores());

                    break;

                case (FICHA_DE_FUNCIONARIO_POR_NOME):

                    System.out.println("Digite nome e sobrenome do funcionario: ");
                    Funcionario funcionarioLocalizado = recebeFuncionario();

                    System.out.println("Ficha de funcionario: " + funcionarioLocalizado.toString());

                    break;

                case (SALARIO_BASE_FUNCIONARIOS):

                    System.out.println("Salário base Funcionário: R$" + Pescaria.SETOR_FINANCEIRO.valores.getPrecoBaseFuncionario());

                    break;

                case (DEFINIR_SALARIO_BASE_FUNCIONARIO):

                    System.out.println("Digite o novo valor base para os funcionários: ");
                    double novoSalarioBase = recebeDouble();

                    Pescaria.SETOR_FINANCEIRO.valores.setPrecoBaseFuncionario(novoSalarioBase);

                    break;

                case (BUSCAR_BONUS_DO_FUNCIONARIO_POR_NOME):

                    System.out.println("Digite nome e sobrenome do funcionario: ");
                    funcionarioLocalizado = recebeFuncionario();

                    System.out.println(funcionarioLocalizado.getBonus());

                    break;

                case (DAR_BONUS_AO_FUNCIONARIO):

                    System.out.println("Digite nome e sobrenome do funcionario: ");
                    funcionarioLocalizado = recebeFuncionario();

                    System.out.println("Digite o valor do bonûs para ser incrementado ao funcioanrio: ");
                    double bonusAIncrementar = recebeDouble();

                    funcionarioLocalizado.incrementarBonus(bonusAIncrementar);

                    break;

                case (BUSCA_DE_PARTICIAPAO_PESCADOR_POR_NOME):

                    System.out.println("Digite nome e sobrenome do pescador: ");
                    Pescador pescadorLocalizado = recebePescador();

                    System.out.println("Historico do pescador: " + pescadorLocalizado.registroPescador);

                    break;

                case (CADASTRAR_NOVO_FUNCIONARIO):

                    System.out.println("Digte nome e sobrenome do novo funcionario: ");
                    String nomoNovoFuncionario = input.nextLine();

                    System.out.println("Digite o CPF do funcionario: ");
                    String cpf = input.nextLine();

                    System.out.println("Cargo do funcionario: ");
                    String cargoNovoFuncionario = input.nextLine();

                    if (cargoNovoFuncionario.equalsIgnoreCase("pescador")) {

                        new Pescador(nomoNovoFuncionario, cpf);
                    } else {
                        new Funcionario(nomoNovoFuncionario, cpf, cargoNovoFuncionario);
                    }
                    break;

                case(VOLTAR):

                    voltarOpcoesRecursosHumanos = true;

                break;
            }
        }while(voltarOpcoesRecursosHumanos == false);
    }
    //entrada setor recursos humanos
    private static Pescador recebePescador(){

        String nomePescador = input.nextLine();

        return Pescaria.SETOR_RECURSOS_HUMANOS.getPescadorPorNome(nomePescador);

    }
    private static Funcionario recebeFuncionario(){

    String nomeABuscar = input.nextLine();

    //tratar erro caso não seja encontrado funcionario
    Funcionario funcionarioLocalizado = Pescaria.SETOR_RECURSOS_HUMANOS.getFuncionarioPorNome(nomeABuscar);

    return funcionarioLocalizado;
}
    //

    //setor registro
    private static void decisaoOpcoesSetorRegistro(int opcao) {

        boolean voltarOpcoesSetorRegistro = false;

        do {

            UserViewAdmin.printOpcoesSetorRegistro();

            final int HISTORICO_TOTAL_PEIXARIA = 1;
            final int PESCAS_DE_DATA = 2;
            final int PESCAS_ENTRE_DATAS = 3;
            final int VOLTAR = 4;

            switch (opcao) {

                case (HISTORICO_TOTAL_PEIXARIA):

                    System.out.println("Histórico total das pescas: " + Pescaria.SETOR_REGISTRO.getRegistros());

                    break;


                case (PESCAS_DE_DATA):


                    break;


                case (PESCAS_ENTRE_DATAS):


                    break;

                case (VOLTAR):

                    voltarOpcoesSetorRegistro = true;

                break;
            }
        }while(voltarOpcoesSetorRegistro == false);
    }
    //






}