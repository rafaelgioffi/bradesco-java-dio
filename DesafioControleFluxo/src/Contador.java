import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.print("Informe o 1º parametro: ");        
            int param1 = terminal.nextInt();
            
            System.out.print("Informe o 2º parametro: ");        
            int param2 = terminal.nextInt();
            
            contar(param1, param2);
        } 
        catch (ParametrosInvalidosException ex) {
            System.out.println("O parametro 1 não pode ser maior que o parametro 2!");
        }
    }

    static void contar(int param1, int param2) throws ParametrosInvalidosException {
        if (param1 > param2) {
            throw new ParametrosInvalidosException();
        }
        else {
            int result = param2 - param1;
            for (int posicao = 1; posicao <= result; posicao++) {
                System.out.println("Imprimindo o número " + posicao);
            }
        }
    }
}
