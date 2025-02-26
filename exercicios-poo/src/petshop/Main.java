package petshop;

import java.util.Scanner;

public class Main {

    private final static Scanner sc = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static String petName = "";

    public static void main(String[] args) {
        sc.useDelimiter("\\n");
        var opcao = -1;

        do {
            System.out.println("*** Escolha uma opção ***");
            System.out.println("1 - Dar banho no Pet");
            System.out.println("2 - Colocar Água");
            System.out.println("3 - Colocar Shampoo");
            System.out.println("4 - Verificar nível da Água");
            System.out.println("5 - Verificar nível do Shampoo");
            System.out.println("6 - Verificar Status da Máquina");
            System.out.println("7 - Colocar Pet na Máquina");
            System.out.println("8 - Retirar Pet da Máquina");
            System.out.println("9 - Limpar Máquina");
            System.out.println("0 - Sair");
            System.out.print(">>> OPÇÃO: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0 -> {
                    clearConsole();
                    System.out.println("******************************************");
                    System.out.println("* Obrigado por utilizar nossos serviços! *");
                    System.out.println("******************************************");
                }
                case 1 -> petMachine.takeShowerInAPet();
                case 2 -> setWater();
                case 3 -> setShampoo();
                case 4 -> getWater();
                case 5 -> getShampoo();
                case 6 -> getCheckIfHasPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.throwPet();
                case 9 -> petMachine.cleanMachine();
                default -> System.out.println("Opção inválida! Tente novamente");
            }
    }
        while (opcao != 0);
    }

    private static void getCheckIfHasPetInMachine() {
        clearConsoleShort();
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "Tem pet na máquina!" : "Não tem pet na máquina...");
        System.out.println(" ");
    }

    public static void getWater() {
        System.out.println("** Nível atual de água: " + petMachine.getWater());
        System.out.println();
    }
public static void getShampoo() {
        System.out.println("** Nível atual de Shampoo: " + petMachine.getShampoo());
        System.out.println();
    }

    public static void setPetInMachine() {
        while (petName == null || petName.isEmpty()) {
            System.out.print("Informe o nome do Pet: ");
            petName = sc.next();
        }
        var pet = new Pet(petName);
        petMachine.setPet(pet);
        System.out.println("Pet " + pet.getName() + " colocado na máquina...");
    }

    private static void setWater() {
        System.out.println("Tentando colocar água na máquina, aguarde...");
        petMachine.addWater();
    }

    private static void setShampoo() {
        System.out.println("Tentando colocar shampoo na máquina, aguarde...");
        petMachine.addShampoo();
    }

    private static void clearConsole() {
        for( int i = 0; i < 50; i++ ) {
            System.out.println(" ");
        }
    }

    private static void clearConsoleShort() {
        for( int i = 0; i < 5; i++ ) {
            System.out.println(" ");
        }
    }

}
