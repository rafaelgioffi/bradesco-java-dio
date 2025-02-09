import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

            System.out.print("Digite seu nome: ");
            String nome = sc.next();

            System.out.print("Digite seu Sobrenome: ");
            String sobrenome = sc.next();
            
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "m.");
            
            sc.close();
        }
        catch (InputMismatchException ex) {
            System.err.println("Os campos Idade e Altura precisar ser numéricos!");
        }
    }
}
