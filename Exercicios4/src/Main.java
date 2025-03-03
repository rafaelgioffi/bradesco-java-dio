import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        Gerente gerente = new Gerente();

        while (opcao != 0) {
            System.out.println("############################################################");
            System.out.println("# Bem vindo ao SGdC - Sistema de Gerenciamento de Cinemas! #");
            System.out.println("############################################################");
            System.out.println("# 1 -> Área Gerencial > Exibir Dados                       #");
            System.out.println("# 2 -> Área Gerencial > Alterar Dados                      #");
            System.out.println("#                                                          #");
            System.out.println("# 0 -> Encerrar Acesso                                     #");
            System.out.println("#                                                          #");
            System.out.println("############################################################");
            System.out.print("# Escolha a opção >> ");
            opcao = sc.nextInt();
            System.out.println("############################################################");

            switch (opcao) {
                case 1 -> gerente.exibirDados(gerente);
                case 2 -> gerente.alterarDados(gerente);
                case 0 -> System.out.println("Obrigado por utilizar o sistema!");
            }
        }

    }
}
