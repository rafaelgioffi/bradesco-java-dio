package exercicio1;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = 0;
        Messages msg = null;

        while (option >= 0) {
            System.out.println("Escolha o tipo de mensagem");
            System.out.println("1 - SMS");
            System.out.println("2 - E-mail");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair");
            System.out.print("Opção ==> ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> {
                    msg = sendSms();
                    System.out.println("SMS enviado: " + msg);
                }
                case 5 -> {
                    System.out.println("Obrigado por usar o programa!");
                    option = -1;
                }
            }
                System.out.println(" ");
        }

    }
        private static Messages sendSms() {
            System.out.print("Informe a mensagem: ");

            return new Sms(sc.nextLine());
        }
}
