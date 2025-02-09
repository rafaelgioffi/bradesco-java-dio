import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente, saldoFormat;
        float saldo;
        NumberFormat format;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.forLanguageTag("pt-BR"));

        System.err.print("Qual número da conta? ");
        numero = sc.nextInt();
        
        System.out.print("Qual número da agência (com dígito)? ");
        agencia = sc.next();
        
        System.out.print("Qual seu nome? ");
        nomeCliente = sc.next();
        
        System.out.print("Quanto deseja depositar inicialmente? ");
        saldo = sc.nextFloat();

        format = NumberFormat.getNumberInstance(new Locale("pt","BR"));
        saldoFormat = format.format(saldo);

        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        System.err.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldoFormat + " já está disponível para saque.");
    }
}
