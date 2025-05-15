import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //Lista de números inteiros...
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Lambda para números pares...
        Consumer<Integer> pares = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        //ou usando Consumer...
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        //Consumer para imprimir pares no Stream...
        //numeros.stream().forEach(pares);
    }
}
