import br.com.dio.util.BoardTemplate;
import br.com.dio.util.model.Board;
import br.com.dio.util.model.Space;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static br.com.dio.util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.*;
import static java.util.stream.Collectors.*;

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
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> viewGame();
                case 5 -> statusGame();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private static void startGame(final Map<String, String> positions) {
        if (nonNull(board)) {
            System.out.println("O jogo já foi iniciado.");
            return;
        }

        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                var positionConfig = positions.get("%s,%s".formatted(i, j));
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        board = new Board(spaces);
        System.out.println("O jogo está pronto para começar! Boa sorte!");
    }

    private static void inputNumber() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado...");
            return;
        }

        System.out.print("Informe a COLUNA que deseja inserir o número: ");
        var col = runUntilGetValidNumber(0, BOARD_LIMIT - 1);
        System.out.print("Informe a LINHA que deseja inserir o número: ");
        var row = runUntilGetValidNumber(0, BOARD_LIMIT - 1);

        System.out.printf("Informe o NÚMERO que será inserido na posição [%s]X[%s]: ", col, row);
        var value = runUntilGetValidNumber(1, BOARD_LIMIT - 1);

        if (!board.changeValue(col, row, value)) {
            System.out.printf("A posição [%s]X[%s] tem um valor fixo, favor selecionar outra posição...", col, row);
            return;
        }
    }

    private static void removeNumber() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado...");
            return;
        }

        System.out.print("Informe a COLUNA que deseja inserir o número: ");
        var col = runUntilGetValidNumber(0, BOARD_LIMIT - 1);
        System.out.print("Informe a LINHA que deseja inserir o número: ");
        var row = runUntilGetValidNumber(0, BOARD_LIMIT - 1);

        if (!board.clearValue(col, row)) {
            System.out.printf("A posição [%s]X[%s] tem um valor fixo, favor selecionar outra posição...", col, row);
            return;
        }
    }

    private static void viewGame() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado...");
            return;
        }

        var args = new Object[81];
        var argPos = 0;

        for (int i = 0; i < BOARD_LIMIT; i++) {
            for (var col: board.getSpaces()) {
                args[argPos ++] = " " + ((isNull(col.get(i).getActual())) ? " " : col.get(i).getActual());
            }
        }
        System.out.println("Seu jogo se encontra da seguinte forma");
        System.out.printf((BOARD_TEMPLATE) + "\n", args);
    }

    private static void statusGame() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado...");
            return;
        }

        System.out.printf("O jogo atualmente se encontra no status %s\n", board.getStatus().getLabel());

        if (board.hasErrors()) {
            System.out.println("O jogo contém erros...");
        }
        else {
            System.out.println("Jogo não contém erros.");
        }
    }

    private static void clearGame() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado...");
            return;
        }

        System.out.println("Tem certeza que deseja limpar o jogo? Todo progresso será perdido! (S/N)");
        var confirm = sc.next();
        while (!confirm.equalsIgnoreCase("s") && !confirm.equalsIgnoreCase("n")) {
            System.out.println("Resposta inválida!\nDigite 's' para Sim ou\n'n' para Não");
            confirm = sc.next();
        }

        if (confirm.equalsIgnoreCase("s")) {
            board.reset();
            System.out.println("O jogo foi limpo com sucesso!");
        }
    }

    private static void finishGame() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado...");
            return;
        }

        if (board.gameIsFinished()) {
            System.out.println("Parabéns! Você concluiu o jogo!");
            viewGame();
            board = null;
        }
        else if (board.hasErrors()) {
            System.out.println("O jogo não contém erros! Verifique e ajuste antes de finalizar.");
        }
        else {
            System.out.println("O jogo ainda não pode ser encerrado... Favor preencha todos os espaços!");
        }
    }

    private static int runUntilGetValidNumber(final int min, final int max) {
        var current = sc.nextInt();
        while (current < min || current > max) {
            System.out.printf("Número inválido! Escolha um número entre %s e %s... Tente novamente.", min, max);
            current = sc.nextInt();
        }
        return current;
    }

}