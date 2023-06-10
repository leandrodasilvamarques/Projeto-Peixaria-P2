package aplicacao.metodosParicipativos.aplicacaoAdmin;

public class UserViewAdmin {

    public static void printOpcoesAdmin(){

        System.out.println("[1] Setor Embarcação\n" +
                "[2]Setor Financeiro\n" +
                "[3]Setor Recursos Humanos\n" +
                "[4]Setor de Registros\n");

    }

    public static void printOpcoesSetorEmbarcacao(){

        System.out.println("[1] Mostrar Barcos\n" +
                "[2]Cadastrar Novo Barco\n +" +
                "[3]Cadastrar Nova Pesca");

    }

    public static void printOpcoesSetorFinanceiro(){

        System.out.println("[1]Dinheiro em caixa\n" +
                "[2]Preco de um pescador\n" +
                "[3]Valor do quilo da sardinha\n" +
                "[4]Definir novo preço por pescaodr\n" +
                "[5]Definir Valor do quilo da Sardinha");

    }

    public static void printOpcoesSetorRecursosHumanos() {

        System.out.println("[1]Lista de todos os funcionarios\n" +
                "[2]Ficha de funcionario por nome\n" +
                "[3]Busca de bonûs do funcionario por nome\n" +
                "[4]Busca de participação do funcionario por nome\n+" +
                "[5]Cadastrar novo funcionario");

    }
}
