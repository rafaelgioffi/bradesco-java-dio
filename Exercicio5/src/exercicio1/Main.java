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
                    if (msg.sendMessage() == null) {
                        System.out.println("Número inválido!");
                    } else {
                        System.out.println("SMS enviado com sucesso!\n" + msg.sendMessage());
                    }
                }
                case 2 -> {
                    msg = sendMail();
                    System.out.println("E-Mail enviado com sucesso!\n" + msg.sendMessage());
                }
                case 3 -> {
                    msg = socialMedia();
                    System.out.println("Mensagem enviada com sucesso!\n" + msg.sendMessage());
                }
                case 4 -> {
                    msg = sendWhatsApp();
                    if (msg.sendMessage() == null) {
                        System.out.println("Número inválido!");
                    }
                    else {
                        System.out.println("WhatsApp enviado com sucesso!\n" + msg.sendMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Obrigado por usar o programa!");
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
        private static Messages sendSms() {
            System.out.print("Informe o número (DDD + Número), sem espaços, parenteses e traços: ");
            var num = sc.next();
            sc.nextLine();
            System.out.print("Informe a mensagem: ");
            var message = sc.nextLine();

            return new Sms(num, message);
        }

        private static Messages sendMail() {
            sc.nextLine();
            System.out.print("Informe para quem enviar o email: ");
            var para = sc.nextLine();
            System.out.print("Informe o assunto do e-mail: ");
            var assunto = sc.nextLine();
            System.out.print("Informe o corpo do e-mail: ");
            var corpo = sc.nextLine();

            return new Email(para, assunto, corpo);
        }

        private static Messages socialMedia() {
            System.out.print("Para quem enviar? @");
            var para = sc.next();
            sc.nextLine();
            System.out.print("Informe a mensagem: ");
            var msg = sc.nextLine();

            return new SocialMedia(para, msg);
        }

        private static Messages sendWhatsApp() {
            System.out.print("Para quem enviar? (DDD + Número), sem espaços, parenteses e traços: ");
            String num = sc.next();
            sc.nextLine();
            System.out.print("Informe a mensagem: ");
            var msg = sc.nextLine();

            return new WhatsApp(num, msg);
        }
}
