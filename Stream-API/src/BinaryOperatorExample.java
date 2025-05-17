import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        //Lista de números inteiros...
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 10, 20, 40, 80);

//        BinaryOperator com lambda para soma de dois números...
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);
//                .reduce(0, (n1, n2) -> n1 + n2); OU
//                .reduce(0, somar); OU
//        .reduce(0, new BinaryOperator<Integer>() {    OU
//            @Override
//            public Integer apply(Integer n1, Integer n2) {
//                return n1 + n2;
//            }
//        });

        System.out.println("A soma dos números é: " + resultado);
    }
}
