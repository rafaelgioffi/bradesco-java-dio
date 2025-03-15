package exercicio2;

public record Saude_BemEstar(double valor) implements Tributos {
    @Override
    public String calcularTributos() {
        return "Valor SEM TRIBUTOS: R$" + String.format("%.2f", valor) +
        "\nValor do Tributo (1,5%): R$" + String.format("%.2f", (valor * 0.015)) +
                "\nValor COM TRIBUTOS: R$" + String.format("%.2f", (valor + (valor * 0.015)));
    }
}
