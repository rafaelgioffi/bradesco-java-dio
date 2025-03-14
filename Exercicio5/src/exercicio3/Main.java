package exercicio3;

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        GeometricForm geometricForm = null;

        while (option >= -1) {
            System.out.println("Escolha a forma geométrica: ");
            System.out.println("1 - Quadrado: ");
            System.out.println("2 - Circulo: ");
            System.out.println("3 - Retângulo: ");
            System.out.println("4 - Sair: ");
            option = sc.nextInt();

            switch (option) {
                case 1 ->  {
                    geometricForm = createSquare();
                    System.out.println("Resultado: " + geometricForm.getArea() + "m²");
                }
                case 2 -> {
                    geometricForm = createCircle();
                    System.out.println("Círculo com " + geometricForm.getArea() + "m de circunferência");
                }
                case 3 -> {
                    geometricForm = createRectangle();
                    System.out.println("Área de " + geometricForm.getArea() + "m²");
                }
                case 4 -> {
                    System.out.println("Obrigado por usar o programa!");
                    option = -2;
                }
                default -> System.out.println("Opção inválida...");
            }
            System.out.println(" ");
        }
    }

    private static GeometricForm createSquare() {
        System.out.print("Digite os tamanhos dos lados: ");

        return new Square(sc.nextDouble());
    }

    private static GeometricForm createRectangle() {
        System.out.print("Digite a BASE: ");
        var base = sc.nextDouble();
        System.out.print("Digite a ALTURA: ");
        var height = sc.nextDouble();

        return new Rectangle(height, base);
    }

    private static GeometricForm createCircle() {
        System.out.print("Digite o raio: ");
        var radius = sc.nextDouble();

        return new Circle(radius);
    }

}
