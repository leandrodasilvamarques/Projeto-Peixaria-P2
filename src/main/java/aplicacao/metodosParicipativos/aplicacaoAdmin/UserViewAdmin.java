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
                "[2]Cadastrar Novo Barco\n");

    }

    public static void printOpcoesSetorFinanceiro(){

        System.out.println("[1]Dinheiro em caixa\n" +
                "[2]Preco de um pescador\n" +
                "[3]Valor do quilo da sardinha\n" +
                "[4]Definir novo preço por pescaodr\n" +
                "[5]Definir Valor do quilo da Sardinha");

    }

}
