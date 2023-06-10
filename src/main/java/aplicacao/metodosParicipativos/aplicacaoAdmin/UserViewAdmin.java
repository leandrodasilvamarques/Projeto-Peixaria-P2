package aplicacao.metodosParicipativos.aplicacaoAdmin;

public class UserViewAdmin {

    public static void printOpcoesAdmin(){

        System.out.println("[1]Setor Embarcação\n" +
                "[2]Setor Financeiro\n" +
                "[3]Setor Recursos Humanos\n" +
                "[4]Setor de Registros\n");

    }

    public static void printOpcoesSetorEmbarcacao(){

        System.out.println("[1] Mostrar Barcos\n" +
                "[2]Cadastrar Novo Barco\n" +
                "[3]Cadastrar Nova Pesca");

    }

    public static void printOpcoesSetorFinanceiro(){

        System.out.println(
                "[1]Salário base de um funcionario\n" +
                "[2]Definir novo salário base funcionário\n" +
                "[3]Exibir Valor do quilo da sardinha\n" +
                "[4]Definir Valor do quilo da Sardinha\n" +
                "[5]Exibir dinheiro em caixa\n" +
                "[6]Exibir Renda liquida\n" +
                "[7]Exibir despesas totais\n" +
                "[8]Exibir Renda Bruta\n"+
                "[8]Exibir relatório entre datas | formato DIA/MES/ANO");

    }

    public static void printOpcoesSetorRecursosHumanos() {

        System.out.println("[1]Exibir Lista de todos os funcionarios\n" +
                "[2]Exibir lista de pescadores\n" +
                "[3]Ficha de funcionario por nome\n" +
                "[4]Exibir salário base dos funcionaios\n" +
                "[5]Definir salário base dos funcionaios\n" +
                "[6]Exibir bonûs de funcionario\n" +
                "[7]Bonificar funcionário\n" +
                "[8]Buscar historico de funcionário" +
                "[9]Cadastrar novo funcionario");
    }

    public static void printOpcoesSetorRegistro(){

        System.out.println(
                "[1]Historico total da peixaria: \n" +
                "[2]Pescas de uma determinada data dia/mes/ano\n" +
                "[3]Pescas ocorridas entre duas datas");
    }
}
