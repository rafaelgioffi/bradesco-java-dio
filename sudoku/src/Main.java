import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //Matriz 9x9
    public static final String VERDE = "\u001B[32m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[][] jogo = new int[9][9];

        // Percorre toda matriz e gera números aleatórios
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int numAleat = rd.nextInt(10);
                if (numAleat < 4) { numAleat = 0; } //40% de gerar 0...
                if (numAleat == 0) {
                    continue;
                } else {
                   jogo[i][j] = numAleat;
                }
            }
        }
        //Imprime a matriz
        System.out.println("|---|---|---|---|---|---|---|---|---|");
        System.out.print("| ");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (jogo[i][j] > 0) {
                    System.out.print(VERDE + jogo[i][j] + RESET + " | ");
                }
                else {
                System.out.print(jogo[i][j] + " | ");
                }
            }
            if (i < 8) {
        System.out.print("\n|---|---|---|---|---|---|---|---|---|");

                System.out.print("\n| ");
            }
        }
        System.out.println("\n|---|---|---|---|---|---|---|---|---|");
    }
}