import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // parte 1
        byte idade = 123;
        short ano = 2025;
        int cep = 21070333;
        double salarioMinimo = 1503;

        // parte 2
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;  // Um tipo maior sendo convertido para um de precisão maior causa erro no Java, é necessário fazer cast para garantir que o valor dará certo...

        int numero = 5;
        numero = 10;
        System.err.println(numero);

        final double VALOR_DE_PI = 3.14;    // const em java é final!
        
        // parte 3
        Date dataNascimento = new Date();
        System.err.println(dataNascimento);

        double modulo = 10 % 3;
        System.err.println("Módulo: " + modulo);

        // Concatenação
        String concat = "?";

        concat = 1 + 1 + 1 + "1";
        System.err.println(concat);
        
        concat = 1 + "1" + 1 + 1;
        System.err.println(concat);

    }
}
