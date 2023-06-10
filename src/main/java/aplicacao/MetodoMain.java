package aplicacao;

import java.util.Scanner;

public class MetodoMain {

    public static void PrintPainelInicial(){
        System.out.println("Digite uma das opções:\n" +
                "[1] Login como adminstador\n" +
                "[2] Login usuario");
    }
    public static int respostaPainelInicial(){
        Scanner input = new Scanner(System.in);

        int resposta = input.nextInt();
        input.nextLine();
        return resposta;
    }

    public static void decisaoPainelInicial(int resposta){
        switch (resposta){
            case (1) -> System.out.println("Login com admin");

            case (2) -> System.out.println("Login como usuario");
        }
    }
    public static void main(String[] args) {
        PrintPainelInicial();
        decisaoPainelInicial(respostaPainelInicial());
    }
}