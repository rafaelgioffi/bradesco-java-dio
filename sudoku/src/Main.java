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
    Scanner sc = new Scanner(System.in);

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

        }
    }
}