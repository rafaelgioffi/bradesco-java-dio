package exercicio2;

public record Alimentacao(double valor) implements Tributos {

    @Override
    public String calcularTributos() {
        return "Valor SEM TRIBUTOS: R$" + String.format("%.2f", valor) +
        "\nValor do Tributo (1%): R$" + String.format("%.2f",(valor * 0.01)) +
                "\nValor COM TRIBUTOS: R$" + String.format("%.2f",(valor + (valor * 0.01)));
    }
}
