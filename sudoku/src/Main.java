import br.com.dio.util.model.Board;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";
    static Scanner sc = new Scanner(System.in);

    private static Board board;
    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        final var positions = Stream.of(args)
                .collect(toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));

        var option = -1;
        while (true) {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Iniciar Novo jogo");
            System.out.println("2 - Inserir número");
            System.out.println("3 - Remover Número");
            System.out.println("4 - Visualizar Jogo Atual");
            System.out.println("5 - Verificar Status do Jogo");
            System.out.println("6 - Limpar Jogo");
            System.out.println("7 - Finalizar Jogo");
            System.out.println("0 - Sair");

            option = sc.nextInt();

            switch (option) {
                case 1 -> StartGame(positions);
                case 2 -> InputNumber();
                case 3 -> RemoveNumber();
                case 4 -> ViewGame();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}