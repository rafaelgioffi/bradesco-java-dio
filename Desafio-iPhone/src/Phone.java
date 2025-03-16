import java.util.Random;
import java.util.Scanner;

public class Phone {
    private static Scanner sc = new Scanner(System.in);
    private String number;  //definido como string pois como int pode estourar a capacidade

    public static String call() {
        System.out.print("\nPara qual número deseja ligar? ");
        var callNumber = sc.next();

        return "\nLigando para " + sc.next();
        }

        public static String awser() {
            Random rand = new Random();
            int fictionalNumber = rand.nextInt(11111111, 999999999);

            System.out.println("Deseja atender a ligação do número " + (String)fictionalNumber + "?";
        }

    }

