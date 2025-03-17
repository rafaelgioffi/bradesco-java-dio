import java.util.Random;
import java.util.Scanner;

public class Phone {
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();
    private String number;  //definido como string pois como int pode estourar a capacidade

    public static String call() {
        System.out.print("\nPara qual número deseja ligar? ");
        String callNumber = sc.next();

        return "\nLigando para " + callNumber + "...\n";
        }

        public static String awnser() {
            int fictitiousDdd = rand.nextInt(11, 99);
            int fictitiousNumber = rand.nextInt(11111111, 999999999);
            String generatedNumber = Integer.toString(fictitiousNumber);
            String firstNumber = generatedNumber.substring(0, 1);
//            Se tiver 8 caracteres, ou seja, gerou um número fixo..
            if(generatedNumber.length() == 8) {
//                se o primeiro dígito é diferente de 2 ou 3, troca para 2 ou 3 aleatoriamente...
                if (firstNumber != "2" || firstNumber != "3") {
                    generatedNumber.substring(0, 1).replace(firstNumber, Integer.toString(rand.nextInt(2, 3)));
                    fictitiousNumber = Integer.valueOf(generatedNumber);
                }
            }
//            se gerou com 9 dígitos, é um celular...
            else if (generatedNumber.length() == 9) {
//                Se o primeiro dígito for diferente de 9, troca para 9...
                if (firstNumber != "9") {
                    String newNumber = "9" + generatedNumber.substring(1);
                    fictitiousNumber = Integer.valueOf(newNumber);
                }
            }
            String fictitiousFinal = "(" + Integer.toString(fictitiousDdd) + ") " + Integer.toString(fictitiousNumber);
            String msg = null;

            System.out.print("Deseja atender a ligação do número " + fictitiousFinal + "? 'S' para Sim ou 'N' para Não ");
            char option = Character.toLowerCase(sc.next().charAt(0));

            while (option != 's' && option != 'n') {
                System.out.println("Opção inválida! Utilize 'S' para 'Sim' ou 'N' para 'Não'." );
            }
            if (option == 's') {
                msg = "\nAtendendo a ligação de " + fictitiousFinal + "...";
            }
            else if (option == 'n') {
                msg = "\nLigação de '" + fictitiousFinal + "' rejeitada...";
            }
            return msg;
        }

        public static String voiceMail() {
            System.out.println("\nBem vindo ao seu correio de voz!");
            int voice = rand.nextInt(0, 20);

            return "\nVocê tem " + Integer.toString(voice) + " mensagens de voz!\n";
        }

    }