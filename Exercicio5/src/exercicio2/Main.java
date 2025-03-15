package exercicio2;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        Tributos imp = null;

        while (option >= 0) {
            System.out.println("Escolha a categoria de produto para calcular seu tributo");
            System.out.println("1 - Alimentação");
            System.out.println("2 - Saúde e Bem Estar");
            System.out.println("3 - Vestuário");
            System.out.println("4 - Cultura");
            System.out.println("5 - Sair");
            System.out.print("Opção ==> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    imp = calcAlimentacao();
                    System.out.println(imp.calcularTributos());
                }
                case 2 -> {
                    imp = calcSaudeBE();
                    System.out.println(imp.calcularTributos());
                }
                case 3 -> {
                    imp = calcVestuario();
                    System.out.println(imp.calcularTributos());
                }
                case 4 -> {
                    imp = calcCultura();
                    System.out.println(imp.calcularTributos());
                }
                case 5 -> {
                    System.out.println("Obrigado por usar o sistema!");
                    option = -1;
                }
                default -> {
                    System.out.println("Opção inválida!");
                    option = 0;
                }
            }
            System.out.println(" ");
        }
    }

        private static Tributos calcAlimentacao() {
            System.out.print("Informe o valor do alimento: R$");
            var alim = sc.nextDouble();

            return new Alimentacao(alim);
        }

        private static Tributos calcSaudeBE() {
            System.out.print("Informe o valor do item de Saúde/Bem Estar: R$");
            var saudBe = sc.nextDouble();

            return new Saude_BemEstar(saudBe);
        }

        private static Tributos calcVestuario() {
            System.out.print("Informe o valor do item de vestuário: R$");
            var vestuario = sc.nextDouble();

            return new Vestuario(vestuario);
        }

        private static Tributos calcCultura() {
            System.out.print("Informe o valor do item de cultura: R$");
            var cultura = sc.nextDouble();

            return new Cultura(cultura);
        }

}
