import java.util.Random;
import java.util.Scanner;

public class Phone {
    private static Scanner sc = new Scanner(System.in);
    private String number;  //definido como string pois como int pode estourar a capacidade

    public static String call() {
        System.out.print("\nPara qual número deseja ligar? ");
        String callNumber = sc.next();

        return "\nLigando para " + callNumber + "...\n";
        }

        public static String awnser() {
            Random rand = new Random();
            int fictionalDdd = rand.nextInt(11, 99);
            int fictionalNumber = rand.nextInt(11111111, 999999999);
            String generatedNumber = Integer.toString(fictionalNumber);
//            Se tiver 8 caracteres, ou seja, se gerar um número fixo..
            if(generatedNumber.length() == 8) {
                if (generatedNumber.substring(0) != "2" || generatedNumber.substring(0) != "3") {
                    generatedNumber.substring(0).replace()
                }
            }
            String fictionalFinal = "(" + Integer.toString(fictionalDdd) + ") " + Integer.toString(fictionalNumber);
            String msg = null;

            System.out.print("Deseja atender a ligação do número " + fictionalFinal + "? 'S' para Sim ou 'N' para Não ");
            char option = Character.toLowerCase(sc.next().charAt(0));

            while (option != 's' && option != 'n') {
                System.out.println("Opção inválida! Utilize 'S' para 'Sim' ou 'N' para 'Não'." );
            }
            if (option == 's') {
                msg = "\nAtendendo a ligação de " + fictionalFinal + "...";
            }
            else if (option == 'n') {
                msg = "\nLigação de '" + fictionalFinal + "' rejeitada...";
            }
            return msg;
        }

    }